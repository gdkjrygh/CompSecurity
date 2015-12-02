// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.view.View;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            z, TitleBar

class u
    implements android.view.View.OnClickListener
{

    final int a;
    final TitleBar b;

    u(TitleBar titlebar, int i)
    {
        b = titlebar;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        TitleBar.a(b, (z)view, a);
    }
}
