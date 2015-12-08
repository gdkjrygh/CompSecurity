// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.logging.Logger;

public class MethodTrace
{

    public static final Logger a = Logger.getLogger("SkypePerf");
    private Logger b;
    private String c;
    private String d;
    private long e;

    public MethodTrace(Object obj, String s)
    {
        this(obj.getClass().getSimpleName(), s);
        a();
    }

    public MethodTrace(String s, String s1)
    {
        b = a;
        d = s;
        c = s1;
        a();
    }

    public final void a()
    {
        b.entering(d, c);
        e = System.currentTimeMillis();
    }

    public final long b()
    {
        b.exiting(d, c);
        long l = System.currentTimeMillis() - e;
        b.info((new StringBuilder()).append(d).append(".").append(c).append(" ").append(l).append("ms").toString());
        return l;
    }

}
