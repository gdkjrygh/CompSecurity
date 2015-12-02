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
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.base.fragment.e;
import com.facebook.common.e.h;
import com.facebook.common.e.m;
import com.facebook.common.e.n;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.ab;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.o;
import com.facebook.ui.d.a;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentBase, bj, v, LoginApprovalFragment, 
//            bi, bh, n

public class PasswordCredentialsFragment extends AuthFragmentBase
    implements d, bj
{

    private com.facebook.auth.b.d a;
    private BlueServiceFragment c;
    private PasswordCredentials d;
    private v e;
    private h f;

    public PasswordCredentialsFragment()
    {
    }

    private void T()
    {
        U();
    }

    private void U()
    {
        e.b();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
    }

    private void V()
    {
        d((new e(com/facebook/auth/login/LoginApprovalFragment)).a().c().putExtras(com.facebook.auth.login.LoginApprovalFragment.a(d.a())));
    }

    public static Bundle a(String s, String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putString("orca:authparam:phone", s);
        bundle.putString("orca:authparam:name", s1);
        bundle.putString("orca:authparam:photourl", s2);
        return bundle;
    }

    private void a(int i, Throwable throwable)
    {
        f.a(m.a("MESSENGER_LOGIN_ERROR", (new StringBuilder()).append("login error: ").append(i).toString()).a(throwable).a(1000).g());
    }

    static void a(PasswordCredentialsFragment passwordcredentialsfragment)
    {
        passwordcredentialsfragment.T();
    }

    static void a(PasswordCredentialsFragment passwordcredentialsfragment, ServiceException serviceexception)
    {
        passwordcredentialsfragment.a(serviceexception);
    }

    private void a(ServiceException serviceexception)
    {
        int i;
label0:
        {
            i = 0;
            if (serviceexception.a() != t.API_ERROR)
            {
                break label0;
            }
            int j = ((ApiErrorResult)serviceexception.b().i()).a();
            if (j == 406)
            {
                V();
                return;
            }
            if (j != 400)
            {
                i = j;
                if (j != 401)
                {
                    break label0;
                }
            }
            a(j, ((Throwable) (serviceexception)));
            ((a)S().a(com/facebook/ui/d/a)).b(o.login_failed_message).a();
            return;
        }
        a(i, ((Throwable) (serviceexception)));
        ((a)S().a(com/facebook/ui/d/a)).a(serviceexception).a();
    }

    public void A()
    {
        super.A();
        if (a.a() != null)
        {
            U();
        }
    }

    public void Q()
    {
        Bundle bundle = k();
        if (bundle != null)
        {
            bundle.remove("orca:authparam:phone");
            bundle.remove("orca:authparam:name");
            bundle.remove("orca:authparam:photourl");
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(com/facebook/auth/login/bj, viewgroup);
        viewgroup = (bi)layoutinflater;
        bundle = k();
        if (bundle != null && bundle.get("orca:authparam:phone") != null)
        {
            viewgroup.setUser(bundle.getString("orca:authparam:phone"), bundle.getString("orca:authparam:name"), bundle.getString("orca:authparam:photourl"));
        }
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        Object obj = S();
        e = (v)((com.facebook.inject.t) (obj)).a(com/facebook/auth/login/v);
        f = (h)((com.facebook.inject.t) (obj)).a(com/facebook/common/e/h);
        obj = (com.facebook.auth.b.a)((com.facebook.inject.t) (obj)).a(com/facebook/auth/b/a);
        Preconditions.checkState(obj instanceof com.facebook.auth.b.d, "Must use LoggedInUserSessionManager to use com.facebook.auth auth");
        a = (com.facebook.auth.b.d)obj;
        c = BlueServiceFragment.a(this, "authenticateOperation");
        c.a(new bh(this));
        if (bundle != null)
        {
            d = (PasswordCredentials)bundle.getParcelable("passwordCredentials");
        }
    }

    public void a(PasswordCredentials passwordcredentials, ab ab)
    {
        if (c.a())
        {
            return;
        } else
        {
            d = passwordcredentials;
            a.h();
            Bundle bundle = new Bundle();
            bundle.putParcelable("passwordCredentials", passwordcredentials);
            c.a(ab);
            c.a(n.b, bundle);
            return;
        }
    }

    public void c(Intent intent)
    {
        d(intent);
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        e.a();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("passwordCredentials", d);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.LOGIN_SCREEN_ACTIVITY_NAME;
    }
}
