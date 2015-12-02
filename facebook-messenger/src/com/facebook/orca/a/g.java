// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g INITIALIZED;
    public static final g INITIALIZING;
    public static final g UNINITIALIZED;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/orca/a/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new g("UNINITIALIZED", 0);
        INITIALIZING = new g("INITIALIZING", 1);
        INITIALIZED = new g("INITIALIZED", 2);
        $VALUES = (new g[] {
            UNINITIALIZED, INITIALIZING, INITIALIZED
        });
    }
}
