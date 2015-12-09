// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;


public class DataCharacter
{

    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i, int j)
    {
        value = i;
        checksumPortion = j;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof DataCharacter)
        {
            if (value == ((DataCharacter) (obj = (DataCharacter)obj)).value && checksumPortion == ((DataCharacter) (obj)).checksumPortion)
            {
                return true;
            }
        }
        return false;
    }

    public final int getChecksumPortion()
    {
        return checksumPortion;
    }

    public final int getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        return value ^ checksumPortion;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(value).append("(").append(checksumPortion).append(')').toString();
    }
}
