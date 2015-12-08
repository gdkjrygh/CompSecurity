// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mopub.mobileads:
//            BaseHtmlWebView, ViewGestureDetector

final class k
    implements android.view.View.OnTouchListener
{

    final boolean a;
    final BaseHtmlWebView b;

    k(BaseHtmlWebView basehtmlwebview, boolean flag)
    {
        b = basehtmlwebview;
        a = flag;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        BaseHtmlWebView.a(b).sendTouchEvent(motionevent);
        return motionevent.getAction() == 2 && !a;
    }
}
