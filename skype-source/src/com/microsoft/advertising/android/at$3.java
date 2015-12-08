// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            at, v

final class c
    implements android.view.reeObserver.OnGlobalLayoutListener
{

    final at a;
    private final String b;
    private final LinearLayout c;

    public final void onGlobalLayout()
    {
        v v1 = v.a(a.getContext(), b, 15, 12, a.getHeight(), false, 2);
        c.addView(v1);
        v1.setTextColor(-1);
        v1.setGravity(17);
        c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ayoutListener(at at1, String s, LinearLayout linearlayout)
    {
        a = at1;
        b = s;
        c = linearlayout;
        super();
    }
}
