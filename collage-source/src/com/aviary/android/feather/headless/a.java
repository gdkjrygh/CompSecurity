// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless;


public class a extends Exception
{

    private int a;

    public a(String s, int i)
    {
        super(s);
        a = i;
    }

    public static a a(int i)
    {
        switch (i)
        {
        default:
            return new a("Unknown error", 11);

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return new a("File not found", 1);

        case 2: // '\002'
            return new a("File too large", 2);

        case 3: // '\003'
            return new a("File not loaded", 3);

        case 4: // '\004'
            return new a("Invalid Context", 4);

        case 5: // '\005'
            return new a("File already loaded", 5);

        case 6: // '\006'
            return new a("Decoder not found for the specified file", 6);

        case 7: // '\007'
            return new a("Encoder not found for the specified file", 7);

        case 8: // '\b'
            return new a("Decode error", 8);

        case 9: // '\t'
            return new a("Encode error", 9);
        }
    }

    public int a()
    {
        return a;
    }
}
