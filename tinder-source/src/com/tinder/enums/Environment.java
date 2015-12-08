// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class Environment extends Enum
{

    private static final Environment $VALUES[];
    public static final Environment DEV;
    public static final Environment PROD;
    public static final Environment PRODTEST;
    public static final Environment SANDBOX;

    private Environment(String s, int i)
    {
        super(s, i);
    }

    public static Environment valueOf(String s)
    {
        return (Environment)Enum.valueOf(com/tinder/enums/Environment, s);
    }

    public static Environment[] values()
    {
        return (Environment[])$VALUES.clone();
    }

    static 
    {
        PROD = new Environment("PROD", 0);
        PRODTEST = new Environment("PRODTEST", 1);
        DEV = new Environment("DEV", 2);
        SANDBOX = new Environment("SANDBOX", 3);
        $VALUES = (new Environment[] {
            PROD, PRODTEST, DEV, SANDBOX
        });
    }
}
