// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            HardcodedSynclairSavedState

public static final class code extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    private final int code;

    static int a(code code1)
    {
        return code1.code;
    }

    public static code a(int i)
    {
        code acode[] = values();
        int k = acode.length;
        for (int j = 0; j < k; j++)
        {
            code code1 = acode[j];
            if (code1.a() == i)
            {
                return code1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/savedstate/HardcodedSynclairSavedState$SynclairDebugConfigType, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    public int a()
    {
        return code;
    }

    static 
    {
        a = new <init>("UNCHANGED", 0, 0);
        b = new <init>("SURGE", 1, 1);
        c = new <init>("CHARGE_HR", 2, 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
