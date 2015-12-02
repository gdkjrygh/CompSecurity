// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;


// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

public static final class a extends Enum
{

    public static final EXTRA_THIN EXTRA_THIN;
    public static final EXTRA_THIN REGULAR;
    public static final EXTRA_THIN THIN;
    private static final EXTRA_THIN b[];
    private final int a;

    static int a(a a1)
    {
        return a1.a;
    }

    protected static a a(int i)
    {
        switch (i)
        {
        default:
            return THIN;

        case 3: // '\003'
            return REGULAR;

        case 2: // '\002'
            return THIN;

        case 1: // '\001'
            return EXTRA_THIN;
        }
    }

    public static EXTRA_THIN valueOf(String s)
    {
        return (EXTRA_THIN)Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$Stroke, s);
    }

    public static EXTRA_THIN[] values()
    {
        return (EXTRA_THIN[])b.clone();
    }

    static 
    {
        REGULAR = new <init>("REGULAR", 0, 3);
        THIN = new <init>("THIN", 1, 2);
        EXTRA_THIN = new <init>("EXTRA_THIN", 2, 1);
        b = (new b[] {
            REGULAR, THIN, EXTRA_THIN
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
