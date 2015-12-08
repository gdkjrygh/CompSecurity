// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mobileads:
//            AdAlertGestureListener

public class ViewGestureDetector extends GestureDetector
{

    private final View a;
    private AdAlertGestureListener b;
    private UserClickListener c;

    public ViewGestureDetector(Context context, View view, AdReport adreport)
    {
        this(context, view, new AdAlertGestureListener(view, adreport));
    }

    private ViewGestureDetector(Context context, View view, AdAlertGestureListener adalertgesturelistener)
    {
        super(context, adalertgesturelistener);
        b = adalertgesturelistener;
        a = view;
        setIsLongpressEnabled(false);
    }

    public void sendTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        View view;
        boolean flag;
        switch (motionevent.getAction())
        {
        default:
            return;

        case 1: // '\001'
            if (c != null)
            {
                c.onUserClick();
            } else
            {
                MoPubLog.d("View's onUserClick() is not registered.");
            }
            b.a();
            return;

        case 0: // '\0'
            onTouchEvent(motionevent);
            return;

        case 2: // '\002'
            view = a;
            flag = flag1;
            break;
        }
        if (motionevent != null)
        {
            if (view == null)
            {
                flag = flag1;
            } else
            {
                float f = motionevent.getX();
                float f1 = motionevent.getY();
                flag = flag1;
                if (f >= 0.0F)
                {
                    flag = flag1;
                    if (f <= (float)view.getWidth())
                    {
                        flag = flag1;
                        if (f1 >= 0.0F)
                        {
                            flag = flag1;
                            if (f1 <= (float)view.getHeight())
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        if (flag)
        {
            onTouchEvent(motionevent);
            return;
        } else
        {
            b.b();
            return;
        }
    }

    public void setUserClickListener(UserClickListener userclicklistener)
    {
        c = userclicklistener;
    }

    private class UserClickListener
    {

        public abstract void onResetUserClick();

        public abstract void onUserClick();

        public abstract boolean wasClicked();
    }

}
