// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.a;

import com.facebook.auth.f.b;
import com.facebook.user.ChatContext;
import com.facebook.user.LastActive;
import com.facebook.user.UserKey;
import com.google.common.a.hy;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class c
    implements b
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;

    public c()
    {
        a = (new hy()).b(600L, TimeUnit.SECONDS).b(2000).n();
        b = (new hy()).b(600L, TimeUnit.SECONDS).b(100).n();
    }

    public LastActive a(UserKey userkey)
    {
        return (LastActive)a.get(userkey);
    }

    public void a()
    {
        a.clear();
        b.clear();
    }

    public void a(UserKey userkey, LastActive lastactive)
    {
        a.put(userkey, lastactive);
    }

    public void a(Map map)
    {
        b.putAll(map);
    }

    public ChatContext b(UserKey userkey)
    {
        return (ChatContext)b.get(userkey);
    }

    public void d()
    {
        a();
    }
}
