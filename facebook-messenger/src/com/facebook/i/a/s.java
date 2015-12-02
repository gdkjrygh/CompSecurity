// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;


public final class s extends Enum
{

    private static final s $VALUES[];
    public static final s Incoming;
    public static final s Outgoing;

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/facebook/i/a/s, s1);
    }

    public static s[] values()
    {
        return (s[])$VALUES.clone();
    }

    static 
    {
        Incoming = new s("Incoming", 0);
        Outgoing = new s("Outgoing", 1);
        $VALUES = (new s[] {
            Incoming, Outgoing
        });
    }
}
