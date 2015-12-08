// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            ChinaStoreUtilsSavedState

public static final class code extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final int code;

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

    static String a(a a1)
    {
        return a1.b();
    }

    private String b()
    {
        return (new StringBuilder()).append("ChinaStoreUtilsSavedState.").append(toString()).toString();
    }

    public static toString valueOf(String s)
    {
        return (toString)Enum.valueOf(com/fitbit/savedstate/ChinaStoreUtilsSavedState$ConfirmationScope, s);
    }

    public static toString[] values()
    {
        return (toString[])e.clone();
    }

    public int a()
    {
        return code;
    }

    static 
    {
        a = new <init>("BLUETOOTH", 0, 0);
        b = new <init>("NETWORK", 1, 1);
        c = new <init>("CONTACTS", 2, 2);
        d = new <init>("SENSITIVE_DATA", 3, 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
