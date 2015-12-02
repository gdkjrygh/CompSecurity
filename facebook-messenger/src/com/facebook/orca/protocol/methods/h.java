// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.DeleteThreadParams;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class h
    implements f
{

    public h()
    {
    }

    public n a(DeleteThreadParams deletethreadparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("id", deletethreadparams.a()));
        arraylist.add(new BasicNameValuePair("format", "json"));
        return new n("deleteThread", "DELETE", "", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((DeleteThreadParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((DeleteThreadParams)obj, r1);
    }

    public Void a(DeleteThreadParams deletethreadparams, r r1)
    {
        r1.f();
        return null;
    }
}
