// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.i;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.ab;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentBase, v, n, bf, 
//            AuthStateMachineConfig, bg

public class LogoutFragment extends AuthFragmentBase
    implements d
{

    public static String a = "delete_account_flag";
    private BlueServiceFragment c;
    private ab d;
    private v e;

    public LogoutFragment()
    {
    }

    private void T()
    {
        e.d();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"));
    }

    private void U()
    {
        b();
    }

    static void a(LogoutFragment logoutfragment)
    {
        logoutfragment.T();
    }

    static void b(LogoutFragment logoutfragment)
    {
        logoutfragment.U();
    }

    public void Q()
    {
        if (c.a())
        {
            return;
        }
        Bundle bundle = new Bundle();
        c.a(d);
        if (l().getIntent().getBooleanExtra(a, false))
        {
            c.a(com.facebook.auth.login.n.d, bundle);
            return;
        } else
        {
            c.a(n.c, bundle);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        e = (v)S().a(com/facebook/auth/login/v);
        c = BlueServiceFragment.a(this, "authLogout");
        c.a(new bf(this));
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        d = c().a().a;
        Q();
    }

    public a g_()
    {
        return a.ORCA_LOGOUT_ACTIVITY;
    }

}
