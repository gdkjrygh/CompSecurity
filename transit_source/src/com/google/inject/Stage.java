// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;


public final class Stage extends Enum
{

    private static final Stage $VALUES[];
    public static final Stage DEVELOPMENT;
    public static final Stage PRODUCTION;
    public static final Stage TOOL;

    private Stage(String s, int i)
    {
        super(s, i);
    }

    public static Stage valueOf(String s)
    {
        return (Stage)Enum.valueOf(com/google/inject/Stage, s);
    }

    public static Stage[] values()
    {
        return (Stage[])$VALUES.clone();
    }

    static 
    {
        TOOL = new Stage("TOOL", 0);
        DEVELOPMENT = new Stage("DEVELOPMENT", 1);
        PRODUCTION = new Stage("PRODUCTION", 2);
        $VALUES = (new Stage[] {
            TOOL, DEVELOPMENT, PRODUCTION
        });
    }
}
