// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b HIGH;
    public static final b IGNORE;
    public static final b LOW;
    public static final b MEDIUM;
    private final int priorityValue;

    private b(String s, int i, int j)
    {
        super(s, i);
        priorityValue = j;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(edu/umd/cs/findbugs/annotations/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public int getPriorityValue()
    {
        return priorityValue;
    }

    static 
    {
        HIGH = new b("HIGH", 0, 1);
        MEDIUM = new b("MEDIUM", 1, 2);
        LOW = new b("LOW", 2, 3);
        IGNORE = new b("IGNORE", 3, 5);
        $VALUES = (new b[] {
            HIGH, MEDIUM, LOW, IGNORE
        });
    }
}
