// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.contacts.server.DeleteContactClaimParams;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class e
    implements f
{

    public e()
    {
    }

    public n a(DeleteContactClaimParams deletecontactclaimparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("contact_id", deletecontactclaimparams.b()));
        arraylist.add(new BasicNameValuePair("field_type", "PHONE"));
        return new n("deleteContactClaim", "DELETE", deletecontactclaimparams.a(), arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((DeleteContactClaimParams)obj);
    }

    public Boolean a(DeleteContactClaimParams deletecontactclaimparams, r r1)
    {
        return Boolean.valueOf(com.facebook.common.w.e.g(r1.c()));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((DeleteContactClaimParams)obj, r1);
    }
}
