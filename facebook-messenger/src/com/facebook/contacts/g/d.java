// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.server.CreateContactClaimParams;
import com.facebook.contacts.server.PrivacyParam;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class d
    implements f
{

    public d()
    {
    }

    public n a(CreateContactClaimParams createcontactclaimparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("field", createcontactclaimparams.c()));
        arraylist.add(new BasicNameValuePair("privacy", createcontactclaimparams.d().a()));
        return new n("createContactClaim", "POST", (new StringBuilder()).append(createcontactclaimparams.b()).append("/contactfields").toString(), arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((CreateContactClaimParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((CreateContactClaimParams)obj, r1);
    }

    public String a(CreateContactClaimParams createcontactclaimparams, r r1)
    {
        return e.b(r1.c().get("id"));
    }
}
