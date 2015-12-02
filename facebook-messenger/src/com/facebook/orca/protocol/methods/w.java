// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ai;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class w
    implements f
{

    public w()
    {
    }

    public n a(MarkThreadParams markthreadparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("id", markthreadparams.a()));
        arraylist.add(new BasicNameValuePair("name", markthreadparams.b().getApiName()));
        String s;
        if (markthreadparams.c())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new BasicNameValuePair("state", s));
        arraylist.add(new BasicNameValuePair("action_id", String.valueOf(markthreadparams.d())));
        arraylist.add(new BasicNameValuePair("format", "json"));
        return new n("markThread", "POST", "tags", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((MarkThreadParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((MarkThreadParams)obj, r1);
    }

    public Void a(MarkThreadParams markthreadparams, r r1)
    {
        r1.f();
        return null;
    }
}
