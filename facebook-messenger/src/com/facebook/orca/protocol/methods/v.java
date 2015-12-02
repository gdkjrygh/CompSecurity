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

public class v
    implements f
{

    public v()
    {
    }

    public volatile n a(Object obj)
    {
        return a((Void)obj);
    }

    public n a(Void void1)
    {
        void1 = hq.a();
        void1.add(new BasicNameValuePair("format", "json"));
        void1.add(new BasicNameValuePair("viewed", "1"));
        return new n("markFolderSeen", "POST", "me/threads/inbox", void1, t.STRING);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Void)obj, r1);
    }

    public Void a(Void void1, r r1)
    {
        r1.f();
        return null;
    }
}
