// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nativejpeg;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a GIF;
    public static final a JPEG;
    public static final a PNG;
    public static final a UNKNOWN;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/nativejpeg/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        JPEG = new a("JPEG", 0);
        PNG = new a("PNG", 1);
        GIF = new a("GIF", 2);
        UNKNOWN = new a("UNKNOWN", 3);
        $VALUES = (new a[] {
            JPEG, PNG, GIF, UNKNOWN
        });
    }
}
