// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public final class KeyboardType extends Enum
    implements Serializable
{

    private static final KeyboardType $VALUES[];
    public static final KeyboardType NO_KEYS;
    public static final KeyboardType QWERTY;
    public static final KeyboardType TWELVE_KEYS;
    public static final KeyboardType UNDEFINED;
    private int value;

    private KeyboardType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static KeyboardType valueOf(String s)
    {
        return (KeyboardType)Enum.valueOf(com/ibm/eo/model/KeyboardType, s);
    }

    public static KeyboardType[] values()
    {
        return (KeyboardType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        TWELVE_KEYS = new KeyboardType("TWELVE_KEYS", 0, 0);
        NO_KEYS = new KeyboardType("NO_KEYS", 1, 1);
        QWERTY = new KeyboardType("QWERTY", 2, 2);
        UNDEFINED = new KeyboardType("UNDEFINED", 3, 3);
        $VALUES = (new KeyboardType[] {
            TWELVE_KEYS, NO_KEYS, QWERTY, UNDEFINED
        });
    }
}
