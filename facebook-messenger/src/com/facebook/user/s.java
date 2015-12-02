// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;


public final class s extends Enum
{

    private static final s $VALUES[];
    public static final s EMAIL;
    public static final s FBID;
    public static final s PHONE;

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/facebook/user/s, s1);
    }

    public static s[] values()
    {
        return (s[])$VALUES.clone();
    }

    static 
    {
        EMAIL = new s("EMAIL", 0);
        PHONE = new s("PHONE", 1);
        FBID = new s("FBID", 2);
        $VALUES = (new s[] {
            EMAIL, PHONE, FBID
        });
    }
}
