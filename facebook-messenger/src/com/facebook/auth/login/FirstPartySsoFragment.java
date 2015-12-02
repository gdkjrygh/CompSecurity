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
import com.facebook.auth.annotations.IsWildfireRegEnabled;
import com.facebook.auth.credentials.b;
import com.facebook.base.fragment.e;
import com.facebook.common.w.n;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.ab;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.google.common.base.Preconditions;
import javax.inject.a;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentBase, ac, bm, v, 
//            PasswordCredentialsFragment, ab, aa, n

public class FirstPartySsoFragment extends AuthFragmentBase
    implements d, ac
{

    private com.facebook.auth.b.d a;
    private BlueServiceFragment c;
    private b d;
    private bm e;
    private v f;
    private a g;
    private com.facebook.auth.login.ab h;

    public FirstPartySsoFragment()
    {
    }

    private boolean T()
    {
        if (R())
        {
            return true;
        }
        if (a.a() != null)
        {
            V();
            return true;
        }
        if (!e.a(n()))
        {
            Q();
            return true;
        }
        d = e.a();
        if (d == null)
        {
            Q();
            return true;
        } else
        {
            return false;
        }
    }

    private void U()
    {
        V();
    }

    private void V()
    {
        f.b();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
    }

    private Intent W()
    {
        if (!e.c(l()) && ((Boolean)g.b()).booleanValue())
        {
            return new Intent("com.facebook.orca.login.AuthStateMachineMonitor.EXIT_TO_WILDFIRE_REGISTRATION");
        }
        e e1 = new e(com/facebook/auth/login/PasswordCredentialsFragment);
        if (e.a(n()))
        {
            e1.a();
        }
        return e1.c();
    }

    static void a(FirstPartySsoFragment firstpartyssofragment)
    {
        firstpartyssofragment.U();
    }

    static void a(FirstPartySsoFragment firstpartyssofragment, ServiceException serviceexception)
    {
        firstpartyssofragment.a(serviceexception);
    }

    private void a(ServiceException serviceexception)
    {
        serviceexception = W();
        if (d != null)
        {
            String s = d.a();
            serviceexception.putExtras(com.facebook.auth.login.PasswordCredentialsFragment.a(s, d.b(), n.a("https://graph.facebook.com/%s/picture?type=large", new Object[] {
                s
            })));
        }
        d(serviceexception);
    }

    public void A()
    {
        super.A();
        f.a();
        T();
    }

    public void Q()
    {
        d(W());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (R())
        {
            return null;
        } else
        {
            layoutinflater = a(com/facebook/auth/login/ac, viewgroup);
            h = (com.facebook.auth.login.ab)layoutinflater;
            return layoutinflater;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        e = (bm)bundle.a(com/facebook/auth/login/bm);
        f = (v)bundle.a(com/facebook/auth/login/v);
        g = bundle.b(java/lang/Boolean, com/facebook/auth/annotations/IsWildfireRegEnabled);
        bundle = (com.facebook.auth.b.a)bundle.a(com/facebook/auth/b/a);
        Preconditions.checkState(bundle instanceof com.facebook.auth.b.d, "Must use LoggedInUserSessionManager to use com.facebook.auth auth");
        a = (com.facebook.auth.b.d)bundle;
        c = BlueServiceFragment.a(this, "authenticateOperation");
        c.a(new aa(this));
        if (c() != null && b != null)
        {
            T();
        }
    }

    public void a(ab ab1)
    {
        if (c.a())
        {
            return;
        } else
        {
            a.h();
            Bundle bundle = new Bundle();
            bundle.putString("accessToken", d.c());
            c.a(ab1);
            c.a(com.facebook.auth.login.n.a, bundle);
            return;
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        T();
        if (d != null && h != null)
        {
            h.setSsoSessionInfo(d);
        }
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.FIRST_PARTY_SSO_ACTIVITY_NAME;
    }
}
