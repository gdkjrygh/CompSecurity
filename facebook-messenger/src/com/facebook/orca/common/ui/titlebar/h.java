// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.facebook.orca.contacts.divebar.z;
import com.facebook.ui.touch.SwipableLinearLayout;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            a, i

class h
    implements z
{

    final a a;

    h(a a1)
    {
        a = a1;
        super();
    }

    public void a()
    {
        if (com.facebook.orca.common.ui.titlebar.a.m(a))
        {
            com.facebook.orca.common.ui.titlebar.a.a(a).postDelayed(new i(this), 250L);
            com.facebook.orca.common.ui.titlebar.a.a(a, false);
        }
    }

    public void b()
    {
        com.facebook.orca.common.ui.titlebar.a.n(a);
    }
}
