// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.auth.e.a;
import com.facebook.common.w.e;
import com.facebook.fbservice.c.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.ConfirmPhoneAndRegisterPartialAccountParams;
import com.facebook.orca.server.ConfirmPhoneAndRegisterPartialAccountResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class d
    implements f
{

    private com.facebook.prefs.shared.d a;

    public d(com.facebook.prefs.shared.d d1)
    {
        a = d1;
    }

    public n a(ConfirmPhoneAndRegisterPartialAccountParams confirmphoneandregisterpartialaccountparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("phone", confirmphoneandregisterpartialaccountparams.a()));
        if (confirmphoneandregisterpartialaccountparams.b() != null)
        {
            arraylist.add(new BasicNameValuePair("country_code", confirmphoneandregisterpartialaccountparams.b()));
        }
        arraylist.add(new BasicNameValuePair("code", confirmphoneandregisterpartialaccountparams.c()));
        arraylist.add(new BasicNameValuePair("full_name", confirmphoneandregisterpartialaccountparams.d()));
        arraylist.add(new BasicNameValuePair("first_name", confirmphoneandregisterpartialaccountparams.e()));
        arraylist.add(new BasicNameValuePair("last_name", confirmphoneandregisterpartialaccountparams.f()));
        if (confirmphoneandregisterpartialaccountparams.g() != null)
        {
            arraylist.add(new BasicNameValuePair("machine_id", confirmphoneandregisterpartialaccountparams.g()));
        }
        if (confirmphoneandregisterpartialaccountparams.h() != null)
        {
            arraylist.add(new BasicNameValuePair("generate_machine_id", confirmphoneandregisterpartialaccountparams.h()));
        }
        arraylist.add(new BasicNameValuePair("reg_instance", a.a(a.p, null)));
        return new n("confirmPhoneAndRegisterPartialAccount", "POST", "method/user.confirmPhoneAndRegisterPartialAccount", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((ConfirmPhoneAndRegisterPartialAccountParams)obj);
    }

    public ConfirmPhoneAndRegisterPartialAccountResult a(ConfirmPhoneAndRegisterPartialAccountParams confirmphoneandregisterpartialaccountparams, r r1)
    {
        boolean flag1 = false;
        confirmphoneandregisterpartialaccountparams = r1.c();
        r1 = confirmphoneandregisterpartialaccountparams.get("session_key").asText();
        String s = e.a(confirmphoneandregisterpartialaccountparams.get("uid"), null);
        String s1 = confirmphoneandregisterpartialaccountparams.get("access_token").asText();
        if (confirmphoneandregisterpartialaccountparams.has("machine_id"))
        {
            confirmphoneandregisterpartialaccountparams.get("machine_id").asText();
        }
        boolean flag = flag1;
        if (confirmphoneandregisterpartialaccountparams.has("confirmed"))
        {
            flag = flag1;
            if (confirmphoneandregisterpartialaccountparams.get("confirmed") != null)
            {
                flag = confirmphoneandregisterpartialaccountparams.get("confirmed").asBoolean(false);
            }
        }
        return new ConfirmPhoneAndRegisterPartialAccountResult(b.FROM_SERVER, r1, s, s1, null, flag, System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((ConfirmPhoneAndRegisterPartialAccountParams)obj, r1);
    }
}
