// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            CpuFeatures

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private int d;

    public static d a(int i)
    {
        switch (i)
        {
        default:
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/skype/android/util/CpuFeatures$Family, s);
    }

    public static c[] values()
    {
        return (c[])e.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0, 0);
        b = new <init>("ARM", 1, 1);
        c = new <init>("X86", 2, 2);
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
