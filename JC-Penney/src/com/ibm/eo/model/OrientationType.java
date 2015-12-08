// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public final class OrientationType extends Enum
    implements Serializable
{

    private static final OrientationType $VALUES[];
    public static final OrientationType LANDSCAPE;
    public static final OrientationType PORTRAIT;
    public static final OrientationType SQUARE;
    public static final OrientationType UNDEFINED;
    private int value;

    private OrientationType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static OrientationType valueOf(String s)
    {
        return (OrientationType)Enum.valueOf(com/ibm/eo/model/OrientationType, s);
    }

    public static OrientationType[] values()
    {
        return (OrientationType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        LANDSCAPE = new OrientationType("LANDSCAPE", 0, 0);
        PORTRAIT = new OrientationType("PORTRAIT", 1, 1);
        SQUARE = new OrientationType("SQUARE", 2, 2);
        UNDEFINED = new OrientationType("UNDEFINED", 3, 3);
        $VALUES = (new OrientationType[] {
            LANDSCAPE, PORTRAIT, SQUARE, UNDEFINED
        });
    }
}
