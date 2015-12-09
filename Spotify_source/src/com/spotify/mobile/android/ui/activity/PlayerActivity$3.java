// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import fyw;
import gdo;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PlayerActivity

final class a
    implements Runnable
{

    private PlayerActivity a;

    public final void run()
    {
        if (a.g)
        {
            return;
        } else
        {
            android.support.v4.app.Fragment fragment = a.a_().a("player");
            fyw.a(fragment, PlayerActivity.a(a));
            gdo.a(a, fragment);
            return;
        }
    }

    (PlayerActivity playeractivity)
    {
        a = playeractivity;
        super();
    }
}
