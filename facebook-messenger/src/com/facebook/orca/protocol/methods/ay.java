// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.ModifyThreadParams;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class ay
    implements f
{

    public ay()
    {
    }

    public n a(ModifyThreadParams modifythreadparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("tid", modifythreadparams.a()));
        arraylist.add(new BasicNameValuePair("name", modifythreadparams.c()));
        return new n("setThreadName", "POST", "method/messaging.setthreadname", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((ModifyThreadParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((ModifyThreadParams)obj, r1);
    }

    public Void a(ModifyThreadParams modifythreadparams, r r1)
    {
        r1.f();
        return null;
    }
}
