// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a HIGH;
    public static final a IGNORE;
    public static final a LOW;
    public static final a MEDIUM;
    private final int confidenceValue;

    private a(String s, int i, int j)
    {
        super(s, i);
        confidenceValue = j;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(edu/umd/cs/findbugs/annotations/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public int getConfidenceValue()
    {
        return confidenceValue;
    }

    static 
    {
        HIGH = new a("HIGH", 0, 1);
        MEDIUM = new a("MEDIUM", 1, 2);
        LOW = new a("LOW", 2, 3);
        IGNORE = new a("IGNORE", 3, 5);
        $VALUES = (new a[] {
            HIGH, MEDIUM, LOW, IGNORE
        });
    }
}
