// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public final class KeyboardStateType extends Enum
    implements Serializable
{

    private static final KeyboardStateType $VALUES[];
    public static final KeyboardStateType HIDDEN_FALSE;
    public static final KeyboardStateType HIDDEN_TRUE;
    public static final KeyboardStateType UNDEFINED;
    private int value;

    private KeyboardStateType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static KeyboardStateType valueOf(String s)
    {
        return (KeyboardStateType)Enum.valueOf(com/ibm/eo/model/KeyboardStateType, s);
    }

    public static KeyboardStateType[] values()
    {
        return (KeyboardStateType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        HIDDEN_FALSE = new KeyboardStateType("HIDDEN_FALSE", 0, 0);
        HIDDEN_TRUE = new KeyboardStateType("HIDDEN_TRUE", 1, 1);
        UNDEFINED = new KeyboardStateType("UNDEFINED", 2, 2);
        $VALUES = (new KeyboardStateType[] {
            HIDDEN_FALSE, HIDDEN_TRUE, UNDEFINED
        });
    }
}
