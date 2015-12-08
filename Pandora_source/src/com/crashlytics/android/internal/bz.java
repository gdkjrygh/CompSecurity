// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.crashlytics.android.internal:
//            cd, cb, cc, cf

public class bz
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final cf d;
    private final cd e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;

    public bz(cf cf)
    {
        this(cf, "default");
    }

    public bz(cf cf, String s)
    {
        this(cf, s, cd.a);
    }

    private bz(cf cf, String s, cd cd1)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        f = new cb(this);
        g = new cc(this);
        h = new HashMap();
        d = cf;
        c = s;
        e = cd1;
    }

    public String toString()
    {
        return (new StringBuilder("[Bus \"")).append(c).append("\"]").toString();
    }
}
