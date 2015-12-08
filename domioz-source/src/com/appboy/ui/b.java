// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.view.q;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

final class b
    implements android.view.View.OnTouchListener
{

    final AppboyFeedFragment a;

    b(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return AppboyFeedFragment.c(a).a(motionevent);
    }
}
