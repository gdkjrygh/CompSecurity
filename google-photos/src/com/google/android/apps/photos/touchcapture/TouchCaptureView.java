// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.touchcapture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.photos.insetview.WindowInsetsView;
import iwe;
import java.util.ArrayList;
import java.util.List;

public class TouchCaptureView extends WindowInsetsView
{

    public boolean a;
    private final List b;
    private iwe c;

    public TouchCaptureView(Context context)
    {
        super(context);
        b = new ArrayList();
        a = true;
    }

    public TouchCaptureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
        a = true;
    }

    public TouchCaptureView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
        a = true;
    }

    public final void a(iwe iwe1)
    {
        b.add(iwe1);
    }

    public final void b(iwe iwe1)
    {
        b.remove(iwe1);
        if (c == iwe1)
        {
            c = null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (!a)
        {
            return super.dispatchTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 0)
        {
            c = null;
        }
        if (c != null)
        {
            c.a(motionevent);
            return true;
        }
        for (int i = 0; i < b.size(); i++)
        {
            iwe iwe1 = (iwe)b.get(i);
            if (iwe1.a(motionevent))
            {
                c = iwe1;
                motionevent = MotionEvent.obtain(motionevent);
                motionevent.setAction(3);
                for (i = ((flag) ? 1 : 0); i < b.size(); i++)
                {
                    iwe iwe2 = (iwe)b.get(i);
                    if (c != iwe2)
                    {
                        iwe2.a(motionevent);
                    }
                }

                super.dispatchTouchEvent(motionevent);
                return true;
            }
        }

        return super.dispatchTouchEvent(motionevent);
    }
}
