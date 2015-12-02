// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.view.View;
import com.facebook.widget.d.c;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            TitleBar

class r
    implements android.view.View.OnClickListener
{

    final TitleBar a;

    r(TitleBar titlebar)
    {
        a = titlebar;
        super();
    }

    public void onClick(View view)
    {
        if (com.facebook.orca.common.ui.titlebar.TitleBar.c(a) != null)
        {
            view = new c(TitleBar.d(a), com.facebook.orca.common.ui.titlebar.TitleBar.c(a));
            view.a(-3);
            view.a();
        }
    }
}
