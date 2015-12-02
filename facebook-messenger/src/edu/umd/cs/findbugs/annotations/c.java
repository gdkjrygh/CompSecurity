// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c ANYTIME;
    public static final c FIRST;
    public static final c LAST;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(edu/umd/cs/findbugs/annotations/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        FIRST = new c("FIRST", 0);
        ANYTIME = new c("ANYTIME", 1);
        LAST = new c("LAST", 2);
        $VALUES = (new c[] {
            FIRST, ANYTIME, LAST
        });
    }
}
