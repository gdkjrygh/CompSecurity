// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;

// Referenced classes of package com.afollestad.materialdialogs.internal:
//            MDRootLayout

class c
    implements android.view.r.OnPreDrawListener
{

    final View a;
    final boolean b;
    final boolean c;
    final MDRootLayout d;

    public boolean onPreDraw()
    {
        if (a.getMeasuredHeight() != 0)
        {
            if (!MDRootLayout.a((WebView)a))
            {
                if (b)
                {
                    MDRootLayout.a(d, false);
                }
                if (c)
                {
                    MDRootLayout.b(d, false);
                }
            } else
            {
                MDRootLayout.a(d, (ViewGroup)a, b, c);
            }
            a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }

    (MDRootLayout mdrootlayout, View view, boolean flag, boolean flag1)
    {
        d = mdrootlayout;
        a = view;
        b = flag;
        c = flag1;
        super();
    }
}
