// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.view.View;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            TitleBar

class t
    implements android.view.View.OnClickListener
{

    final TitleBar a;

    t(TitleBar titlebar)
    {
        a = titlebar;
        super();
    }

    public void onClick(View view)
    {
        TitleBar.f(a);
    }
}
