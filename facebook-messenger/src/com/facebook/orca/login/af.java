// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.b.d;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.e.a;
import com.facebook.auth.login.am;
import com.facebook.auth.login.v;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.nux.h;
import com.facebook.orca.server.ConfirmPhoneAndRegisterPartialAccountResult;
import com.facebook.orca.server.aq;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.login:
//            b, ah, ag

public class af
{

    private static final Class a = com/facebook/orca/login/af;
    private ah b;
    private final av c;
    private final d d;
    private final v e;
    private final com.facebook.prefs.shared.d f;
    private final h g;
    private final com.facebook.orca.login.b h;
    private final am i;
    private final com.facebook.user.a.h j;
    private String k;
    private BlueServiceFragment l;

    public af(d d1, av av1, v v1, com.facebook.prefs.shared.d d2, h h1, com.facebook.orca.login.b b1, am am1, 
            com.facebook.user.a.h h2)
    {
        d = d1;
        c = av1;
        e = v1;
        f = d2;
        g = h1;
        h = b1;
        i = am1;
        j = h2;
    }

    private void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.c(a, "Registration succeeded");
        operationresult = (ConfirmPhoneAndRegisterPartialAccountResult)operationresult.i();
        i.c();
        d.a(new FacebookCredentials(operationresult.a(), operationresult.b(), 0L), true);
        c.a(h.a(k, "registration_success").b("user_id", operationresult.a()));
        f.b().a(a.p).a(com.facebook.push.b.a.a, true).a();
        g.a();
        e.b();
        b.T();
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Registration failed with error ").append(serviceexception.getMessage()).toString());
        c.a(h.a("registration_failure", serviceexception));
        b.b(serviceexception);
    }

    static void a(af af1, OperationResult operationresult)
    {
        af1.a(operationresult);
    }

    static void a(af af1, ServiceException serviceexception)
    {
        af1.a(serviceexception);
    }

    public void a(Fragment fragment)
    {
        l = BlueServiceFragment.a(fragment, "registerPartialAccountOperation");
        l.a(new ag(this));
    }

    public void a(ah ah1)
    {
        b = ah1;
    }

    public void a(String s)
    {
        k = s;
    }

    public void a(String s, String s1, String s2, String s3, String s4)
    {
        String s5 = j.a(s, s1);
        Bundle bundle = new Bundle();
        bundle.putString("phone", s2);
        bundle.putString("countryCode", s3);
        bundle.putString("confirmationCode", s4);
        bundle.putString("fullName", s5);
        bundle.putString("firstName", s);
        bundle.putString("lastName", s1);
        l.a(aq.c, bundle);
    }

    public boolean a()
    {
        return l.b() != j.INIT;
    }

}
