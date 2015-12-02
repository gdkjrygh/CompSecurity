// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.AddMembersParams;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            ad

public class a
    implements f
{

    private final ad a;

    public a(ad ad1)
    {
        a = ad1;
    }

    public n a(AddMembersParams addmembersparams)
    {
        java.util.ArrayList arraylist = hq.a();
        JsonNode jsonnode = a.a(addmembersparams.b());
        arraylist.add(new BasicNameValuePair("id", addmembersparams.a()));
        arraylist.add(new BasicNameValuePair("to", jsonnode.toString()));
        return new n("addMembers", "POST", "/participants", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((AddMembersParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((AddMembersParams)obj, r1);
    }

    public Void a(AddMembersParams addmembersparams, r r1)
    {
        r1.f();
        return null;
    }
}
