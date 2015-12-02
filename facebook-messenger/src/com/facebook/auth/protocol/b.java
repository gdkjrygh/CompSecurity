// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;

public class b
    implements f
{

    public b()
    {
    }

    public volatile n a(Object obj)
    {
        return a((Void)obj);
    }

    public n a(Void void1)
    {
        return new n("logout", "POST", "method/auth.expireSession", hq.a(), t.STRING);
    }

    public volatile Object a(Object obj, r r)
    {
        return a((Void)obj, r);
    }

    public Void a(Void void1, r r)
    {
        return null;
    }
}
