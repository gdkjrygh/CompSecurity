// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


final class ak extends Enum
{

    private static final ak $VALUES[];
    public static final ak FINDING_LOCATION;
    public static final ak HAS_LOCATION;
    public static final ak INIT;
    public static final ak LOCATION_ERROR;
    public static final ak NO_LOCATION;

    private ak(String s, int i)
    {
        super(s, i);
    }

    public static ak valueOf(String s)
    {
        return (ak)Enum.valueOf(com/facebook/orca/compose/ak, s);
    }

    public static ak[] values()
    {
        return (ak[])$VALUES.clone();
    }

    static 
    {
        INIT = new ak("INIT", 0);
        HAS_LOCATION = new ak("HAS_LOCATION", 1);
        FINDING_LOCATION = new ak("FINDING_LOCATION", 2);
        NO_LOCATION = new ak("NO_LOCATION", 3);
        LOCATION_ERROR = new ak("LOCATION_ERROR", 4);
        $VALUES = (new ak[] {
            INIT, HAS_LOCATION, FINDING_LOCATION, NO_LOCATION, LOCATION_ERROR
        });
    }
}
