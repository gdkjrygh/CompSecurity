// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;


public final class ar extends Enum
{

    private static final ar $VALUES[];
    public static final ar FILTERED;
    public static final ar FILTERING;
    public static final ar NONE;
    public static final ar UNFILTERED;

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/facebook/contacts/picker/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])$VALUES.clone();
    }

    static 
    {
        NONE = new ar("NONE", 0);
        UNFILTERED = new ar("UNFILTERED", 1);
        FILTERING = new ar("FILTERING", 2);
        FILTERED = new ar("FILTERED", 3);
        $VALUES = (new ar[] {
            NONE, UNFILTERED, FILTERING, FILTERED
        });
    }
}
