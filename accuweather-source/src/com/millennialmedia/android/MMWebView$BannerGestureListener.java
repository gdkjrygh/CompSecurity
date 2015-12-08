// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView, MMAdView

private static class webRef extends android.view.istener
{

    WeakReference webRef;

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        motionevent = (MMWebView)webRef.get();
        if (motionevent != null)
        {
            motionevent = motionevent.getMMAdView();
            if (motionevent != null)
            {
                webRef(((MMAdView) (motionevent)).adImpl);
            }
        }
        return false;
    }

    public A(MMWebView mmwebview)
    {
        webRef = new WeakReference(mmwebview);
    }
}
