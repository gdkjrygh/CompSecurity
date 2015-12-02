// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class ae
    implements f
{

    public ae()
    {
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("event_info", "device_received"));
        arraylist.add(new BasicNameValuePair("event_time", String.valueOf(System.currentTimeMillis())));
        arraylist.add(new BasicNameValuePair("trace_info", s));
        return new n("pushTraceInfoConfirmation", "POST", "method/user.tracePush", arraylist, t.STRING);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }

    public Void a(String s, r r1)
    {
        r1.f();
        return null;
    }
}
