// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentBase, bb, v, c, 
//            bl

public class SilentLoginFragment extends AuthFragmentBase
    implements d
{

    private com.facebook.auth.b.d a;
    private v c;
    private BlueServiceFragment d;

    public SilentLoginFragment()
    {
    }

    private boolean Q()
    {
        if (R())
        {
            return true;
        }
        if (a.b())
        {
            U();
            return true;
        } else
        {
            return false;
        }
    }

    private void T()
    {
        Bundle bundle = new Bundle();
        d.a(com.facebook.auth.login.bb.a, bundle);
    }

    private void U()
    {
        c.c();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"));
    }

    private void V()
    {
        a.g();
        P();
    }

    static void a(SilentLoginFragment silentloginfragment)
    {
        silentloginfragment.U();
    }

    static void b(SilentLoginFragment silentloginfragment)
    {
        silentloginfragment.V();
    }

    public void A()
    {
        super.A();
        while (Q() || d.a()) 
        {
            return;
        }
        if (a.a() != null)
        {
            T();
            return;
        } else
        {
            P();
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (R())
        {
            return null;
        } else
        {
            return a(com/facebook/auth/login/c, viewgroup);
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        c = (v)bundle.a(com/facebook/auth/login/v);
        a = (com.facebook.auth.b.d)bundle.a(com/facebook/auth/b/d);
        d = BlueServiceFragment.a(this, "loginOperation");
        d.a(new bl(this));
        if (b != null)
        {
            Q();
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Q();
    }

    public a g_()
    {
        return a.SILENT_LOGIN_ACTIVITY_NAME;
    }
}
