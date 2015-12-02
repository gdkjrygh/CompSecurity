// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class af extends Enum
{

    private static final af $VALUES[];
    public static final af HIGH;
    public static final af LOW;
    public static final af MEDIUM;
    public static final af UNKNOWN;
    public static final af VERY_LOW;

    private af(String s, int i)
    {
        super(s, i);
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/facebook/contacts/server/af, s);
    }

    public static af[] values()
    {
        return (af[])$VALUES.clone();
    }

    static 
    {
        HIGH = new af("HIGH", 0);
        MEDIUM = new af("MEDIUM", 1);
        LOW = new af("LOW", 2);
        VERY_LOW = new af("VERY_LOW", 3);
        UNKNOWN = new af("UNKNOWN", 4);
        $VALUES = (new af[] {
            HIGH, MEDIUM, LOW, VERY_LOW, UNKNOWN
        });
    }
}
