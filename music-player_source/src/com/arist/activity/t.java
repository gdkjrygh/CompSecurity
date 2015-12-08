// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import com.ijoysoft.appwall.AppWallView;
import com.ijoysoft.appwall.c;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class t
    implements c
{

    final MainActivity a;
    private final AppWallView b;

    t(MainActivity mainactivity, AppWallView appwallview)
    {
        a = mainactivity;
        b = appwallview;
        super();
    }

    public final void a(String s)
    {
        if (b != null)
        {
            b.a(s);
        }
    }
}
