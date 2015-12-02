// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.auth.login.PasswordCredentialsFragment;
import com.facebook.base.fragment.e;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.orca.server.aq;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.login:
//            ap, ao

public class an
{

    private static final Class a = com/facebook/orca/login/an;
    private ap b;
    private String c;
    private BlueServiceFragment d;

    public an()
    {
    }

    private void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.c(a, "User lookup succeeded. Redirecting to login screen...");
        operationresult = (User)operationresult.i();
        a(c, operationresult.h(), operationresult.q());
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("User lookup failed with error ").append(serviceexception.getMessage()).toString());
        if (serviceexception.a() == t.API_ERROR)
        {
            int i = ((ApiErrorResult)serviceexception.b().i()).a();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("API error code: ").append(i).toString());
        }
        a(null, null, null);
    }

    static void a(an an1, OperationResult operationresult)
    {
        an1.a(operationresult);
    }

    static void a(an an1, ServiceException serviceexception)
    {
        an1.a(serviceexception);
    }

    private void a(String s, String s1, String s2)
    {
        Intent intent = (new e(com/facebook/auth/login/PasswordCredentialsFragment)).a().c();
        if (s != null)
        {
            intent.putExtras(PasswordCredentialsFragment.a(s, s1, s2));
        }
        b.c(intent);
    }

    public void a(Fragment fragment)
    {
        d = BlueServiceFragment.a(fragment, "userLookupOperation");
        d.a(new ao(this));
    }

    public void a(ap ap1)
    {
        b = ap1;
    }

    public void a(String s, String s1)
    {
        com.facebook.debug.log.b.d(a, "This number already belongs to a full Facebook account.");
        c = s1;
        s1 = new Bundle();
        s1.putString("uid", s);
        d.a(aq.d, s1);
    }

}
