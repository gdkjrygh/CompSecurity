// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.i.c;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            a

class g
    implements android.view.View.OnClickListener
{

    final a a;

    g(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        c.a(com.facebook.orca.common.ui.titlebar.a.l(a)).a("tap_outside");
        a.j();
    }
}
