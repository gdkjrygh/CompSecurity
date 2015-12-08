// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView

private static class webRef
    implements android.view.bTouchListener
{

    WeakReference webRef;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            view = (MMWebView)webRef.get();
            boolean flag;
            boolean flag1;
            if (motionevent.getAction() == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (view != null)
            {
                if (!flag || !view.canScroll())
                {
                    break label0;
                }
                flag1 = true;
            }
            return flag1;
        }
        return false;
    }

    (MMWebView mmwebview)
    {
        webRef = new WeakReference(mmwebview);
    }
}
