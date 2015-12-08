// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.view.ViewGroup;
import android.webkit.WebView;

// Referenced classes of package com.afollestad.materialdialogs.internal:
//            MDRootLayout, MDButton

class c
    implements android.view.r.OnScrollChangedListener
{

    final ViewGroup a;
    final boolean b;
    final boolean c;
    final MDRootLayout d;

    public void onScrollChanged()
    {
        MDButton amdbutton[];
        int i;
        int j;
        amdbutton = MDRootLayout.a(d);
        j = amdbutton.length;
        i = 0;
_L3:
        MDButton mdbutton;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        mdbutton = amdbutton[i];
        if (mdbutton == null || mdbutton.getVisibility() == 8) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (a instanceof WebView)
        {
            MDRootLayout.a(d, (WebView)a, b, c, flag);
        } else
        {
            MDRootLayout.a(d, a, b, c, flag);
        }
        d.invalidate();
        return;
_L2:
        i++;
          goto _L3
        flag = false;
          goto _L4
    }

    (MDRootLayout mdrootlayout, ViewGroup viewgroup, boolean flag, boolean flag1)
    {
        d = mdrootlayout;
        a = viewgroup;
        b = flag;
        c = flag1;
        super();
    }
}
