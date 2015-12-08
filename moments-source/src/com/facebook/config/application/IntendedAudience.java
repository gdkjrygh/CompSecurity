// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.application;


public final class IntendedAudience extends Enum
{

    private static final IntendedAudience $VALUES[];
    public static final IntendedAudience DEVELOPMENT;
    public static final IntendedAudience FACEBOOK;
    public static final IntendedAudience PUBLIC;

    private IntendedAudience(String s, int i)
    {
        super(s, i);
    }

    public static IntendedAudience valueOf(String s)
    {
        return (IntendedAudience)Enum.valueOf(com/facebook/config/application/IntendedAudience, s);
    }

    public static IntendedAudience[] values()
    {
        return (IntendedAudience[])$VALUES.clone();
    }

    static 
    {
        PUBLIC = new IntendedAudience("PUBLIC", 0);
        FACEBOOK = new IntendedAudience("FACEBOOK", 1);
        DEVELOPMENT = new IntendedAudience("DEVELOPMENT", 2);
        $VALUES = (new IntendedAudience[] {
            PUBLIC, FACEBOOK, DEVELOPMENT
        });
    }
}
