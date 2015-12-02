// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.orca.server.GraphUserPostParams;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class t
    implements f
{

    public t()
    {
    }

    public n a(GraphUserPostParams graphuserpostparams)
    {
        java.util.ArrayList arraylist = hq.a();
        if (graphuserpostparams.a() != null)
        {
            arraylist.add(new BasicNameValuePair("firstname", graphuserpostparams.a()));
        }
        if (graphuserpostparams.b() != null)
        {
            arraylist.add(new BasicNameValuePair("lastname", graphuserpostparams.b()));
        }
        return new n("graphUserPost", "POST", "me", arraylist, com.facebook.http.protocol.t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((GraphUserPostParams)obj);
    }

    public Boolean a(GraphUserPostParams graphuserpostparams, r r1)
    {
        return Boolean.valueOf(r1.c().asBoolean());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((GraphUserPostParams)obj, r1);
    }
}
