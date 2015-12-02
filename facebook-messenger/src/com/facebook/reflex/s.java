// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class s extends Enum
{

    private static final s $VALUES[];
    public static final s Longpress;
    public static final s Pan;
    public static final s Tap;

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/facebook/reflex/s, s1);
    }

    public static s[] values()
    {
        return (s[])$VALUES.clone();
    }

    static 
    {
        Tap = new s("Tap", 0);
        Pan = new s("Pan", 1);
        Longpress = new s("Longpress", 2);
        $VALUES = (new s[] {
            Tap, Pan, Longpress
        });
    }
}
