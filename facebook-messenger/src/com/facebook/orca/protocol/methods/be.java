// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.auth.e.a;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.UserValidateRegistrationDataParams;
import com.facebook.prefs.shared.d;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class be
    implements f
{

    private d a;

    public be(d d1)
    {
        a = d1;
    }

    public n a(UserValidateRegistrationDataParams uservalidateregistrationdataparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (uservalidateregistrationdataparams.a() != null)
        {
            arraylist.add(new BasicNameValuePair("firstname", uservalidateregistrationdataparams.a()));
        }
        if (uservalidateregistrationdataparams.b() != null)
        {
            arraylist.add(new BasicNameValuePair("lastname", uservalidateregistrationdataparams.b()));
        }
        if (uservalidateregistrationdataparams.c() != null)
        {
            arraylist.add(new BasicNameValuePair("email", uservalidateregistrationdataparams.c()));
        }
        if (uservalidateregistrationdataparams.d() != null)
        {
            arraylist.add(new BasicNameValuePair("phone", uservalidateregistrationdataparams.d()));
        }
        if (uservalidateregistrationdataparams.e() != null)
        {
            arraylist.add(new BasicNameValuePair("country_code", uservalidateregistrationdataparams.e()));
        }
        if (uservalidateregistrationdataparams.f() != null)
        {
            arraylist.add(new BasicNameValuePair("password", uservalidateregistrationdataparams.f()));
        }
        if (uservalidateregistrationdataparams.g() != null)
        {
            arraylist.add(new BasicNameValuePair("gender", uservalidateregistrationdataparams.g()));
        }
        if (uservalidateregistrationdataparams.h() != null)
        {
            arraylist.add(new BasicNameValuePair("birthday", uservalidateregistrationdataparams.h()));
        }
        arraylist.add(new BasicNameValuePair("reg_instance", a.a(a.p, null)));
        return new n("userValidateRegistrationData", "POST", "method/user.validateRegistrationData", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((UserValidateRegistrationDataParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UserValidateRegistrationDataParams)obj, r1);
    }

    public Void a(UserValidateRegistrationDataParams uservalidateregistrationdataparams, r r1)
    {
        r1.f();
        return null;
    }
}
