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
import com.facebook.common.e.h;
import com.facebook.common.e.m;
import com.facebook.common.e.n;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.ab;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.ui.d.a;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentBase, ao, v, an, 
//            n

public class LoginApprovalFragment extends AuthFragmentBase
    implements d, ao
{

    private BlueServiceFragment a;
    private String c;
    private v d;
    private h e;

    public LoginApprovalFragment()
    {
    }

    private void Q()
    {
        T();
    }

    private void T()
    {
        d.b();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
    }

    public static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("orca:authparam:email", s);
        return bundle;
    }

    static void a(LoginApprovalFragment loginapprovalfragment)
    {
        loginapprovalfragment.Q();
    }

    static void a(LoginApprovalFragment loginapprovalfragment, ServiceException serviceexception)
    {
        loginapprovalfragment.a(serviceexception);
    }

    private void a(ServiceException serviceexception)
    {
        int i = 0;
        if (serviceexception.a() == t.API_ERROR)
        {
            i = ((ApiErrorResult)serviceexception.b().i()).a();
        }
        e.a(m.a("MESSENGER_LOGIN_ERROR", (new StringBuilder()).append("login approval error: ").append(i).toString()).a(serviceexception).a(1000).g());
        ((a)S().a(com/facebook/ui/d/a)).a(serviceexception).a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return a(com/facebook/auth/login/ao, viewgroup);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        d = (v)S().a(com/facebook/auth/login/v);
        e = (h)S().a(com/facebook/common/e/h);
        a = BlueServiceFragment.a(this, "authenticateOperation");
        a.a(new an(this));
        c = k().getString("orca:authparam:email");
    }

    public void a(String s, ab ab)
    {
        if (a.a())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("passwordCredentials", new PasswordCredentials(c, s));
            a.a(ab);
            a.a(n.b, bundle);
            return;
        }
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.LOGIN_APPROVAL_ACTIVITY_NAME;
    }
}
