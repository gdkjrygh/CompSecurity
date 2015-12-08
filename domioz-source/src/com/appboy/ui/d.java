// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

final class d
    implements android.view.View.OnTouchListener
{

    final AppboyFeedFragment a;

    d(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return view.getVisibility() == 0;
    }
}
