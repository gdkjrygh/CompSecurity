// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;


final class n extends Enum
{

    private static final n $VALUES[];
    public static final n Grow;
    public static final n Move;
    public static final n None;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/orca/camera/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        None = new n("None", 0);
        Move = new n("Move", 1);
        Grow = new n("Grow", 2);
        $VALUES = (new n[] {
            None, Move, Grow
        });
    }
}
