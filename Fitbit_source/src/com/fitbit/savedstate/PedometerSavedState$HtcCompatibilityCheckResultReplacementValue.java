// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            PedometerSavedState

public static final class code extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];
    private final int code;

    public static code a(int j)
    {
        code acode[] = values();
        int l = acode.length;
        for (int k = 0; k < l; k++)
        {
            code code1 = acode[k];
            if (code1.a() == j)
            {
                return code1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/savedstate/PedometerSavedState$HtcCompatibilityCheckResultReplacementValue, s);
    }

    public static a[] values()
    {
        return (a[])i.clone();
    }

    public int a()
    {
        return code;
    }

    static 
    {
        a = new <init>("UNCHANGED", 0, 0);
        b = new <init>("COMPATIBLE", 1, 1);
        c = new <init>("ERROR_HSP_NOT_SUPPORTED", 2, 2);
        d = new <init>("ERROR_HSP_NOT_INSTALLED", 3, 3);
        e = new <init>("HSP_UPDATE_REQUIRED", 4, 4);
        f = new <init>("HMS_APP_UPDATE_REQUIRED", 5, 5);
        g = new <init>("ERROR_HSP_NOT_ENABLED", 6, 6);
        h = new <init>("ERROR_UNKNOWN", 7, 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        code = k;
    }
}
