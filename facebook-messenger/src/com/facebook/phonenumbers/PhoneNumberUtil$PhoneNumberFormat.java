// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.phonenumbers;


public final class A extends Enum
{

    private static final RFC3966 $VALUES[];
    public static final RFC3966 E164;
    public static final RFC3966 INTERNATIONAL;
    public static final RFC3966 NATIONAL;
    public static final RFC3966 RFC3966;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        E164 = new <init>("E164", 0);
        INTERNATIONAL = new <init>("INTERNATIONAL", 1);
        NATIONAL = new <init>("NATIONAL", 2);
        RFC3966 = new <init>("RFC3966", 3);
        $VALUES = (new .VALUES[] {
            E164, INTERNATIONAL, NATIONAL, RFC3966
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
