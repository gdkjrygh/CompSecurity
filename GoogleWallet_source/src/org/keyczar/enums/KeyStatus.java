// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.enums;


public final class KeyStatus extends Enum
{

    private static final KeyStatus $VALUES[];
    public static final KeyStatus ACTIVE;
    public static final KeyStatus INACTIVE;
    public static final KeyStatus PRIMARY;
    private String name;
    private int value;

    private KeyStatus(String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        name = s1;
    }

    public static KeyStatus valueOf(String s)
    {
        return (KeyStatus)Enum.valueOf(org/keyczar/enums/KeyStatus, s);
    }

    public static KeyStatus[] values()
    {
        return (KeyStatus[])$VALUES.clone();
    }

    static 
    {
        PRIMARY = new KeyStatus("PRIMARY", 0, 0, "primary");
        ACTIVE = new KeyStatus("ACTIVE", 1, 1, "active");
        INACTIVE = new KeyStatus("INACTIVE", 2, 2, "inactive");
        $VALUES = (new KeyStatus[] {
            PRIMARY, ACTIVE, INACTIVE
        });
    }
}
