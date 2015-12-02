// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class ag extends Enum
{

    private static final ag $VALUES[];
    public static final ag Inertial;
    public static final ag Paginated;

    private ag(String s, int i)
    {
        super(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/facebook/reflex/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])$VALUES.clone();
    }

    static 
    {
        Inertial = new ag("Inertial", 0);
        Paginated = new ag("Paginated", 1);
        $VALUES = (new ag[] {
            Inertial, Paginated
        });
    }
}
