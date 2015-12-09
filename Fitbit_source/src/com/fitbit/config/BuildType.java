// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.config;


public final class BuildType extends Enum
{

    public static final BuildType a;
    public static final BuildType b;
    public static final BuildType c;
    public static final BuildType d;
    public static final BuildType e;
    public static final BuildType f;
    public static final BuildType g;
    public static final BuildType h;
    private static final BuildType i[];
    public final boolean internal;

    private BuildType(String s, int j)
    {
        this(s, j, false);
    }

    private BuildType(String s, int j, boolean flag)
    {
        super(s, j);
        internal = flag;
    }

    public static BuildType valueOf(String s)
    {
        return (BuildType)Enum.valueOf(com/fitbit/config/BuildType, s);
    }

    public static BuildType[] values()
    {
        return (BuildType[])i.clone();
    }

    public boolean a()
    {
        return internal;
    }

    public boolean b()
    {
        return !internal;
    }

    static 
    {
        a = new BuildType("RELEASE", 0);
        b = new BuildType("BETA", 1, true);
        c = new BuildType("BETA_GOOGLE", 2);
        d = new BuildType("ALPHA_GOOGLE", 3);
        e = new BuildType("DEBUG", 4, true);
        f = new BuildType("GOOGLE_CONFIDENTIAL", 5, true);
        g = new BuildType("DEVBIT", 6, true);
        h = new BuildType("UNKNOWN", 7);
        i = (new BuildType[] {
            a, b, c, d, e, f, g, h
        });
    }
}
