// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.RequestSmsConfirmationCodeParams;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class ag
    implements f
{

    public ag()
    {
    }

    public n a(RequestSmsConfirmationCodeParams requestsmsconfirmationcodeparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("country", requestsmsconfirmationcodeparams.a()));
        arraylist.add(new BasicNameValuePair("phone_number", requestsmsconfirmationcodeparams.b()));
        if (requestsmsconfirmationcodeparams.c() != null)
        {
            arraylist.add(new BasicNameValuePair("marker", requestsmsconfirmationcodeparams.c()));
        }
        if (requestsmsconfirmationcodeparams.d() != null)
        {
            arraylist.add(new BasicNameValuePair("flow", requestsmsconfirmationcodeparams.d()));
        }
        if (requestsmsconfirmationcodeparams.e() != null)
        {
            arraylist.add(new BasicNameValuePair("reg_instance", requestsmsconfirmationcodeparams.e()));
        }
        return new n("requestSmsConfirmationCode", "POST", "method/mobile.sendPhoneConfirmationCode", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((RequestSmsConfirmationCodeParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((RequestSmsConfirmationCodeParams)obj, r1);
    }

    public Void a(RequestSmsConfirmationCodeParams requestsmsconfirmationcodeparams, r r1)
    {
        r1.f();
        return null;
    }
}
