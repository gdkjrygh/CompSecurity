// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;


// Referenced classes of package com.pandora.android.eureka.dialog:
//            f

public static final class b extends Enum
{

    public static final a a;
    private static final a c[];
    private int b;

    public static b a(int i)
    {
        b ab[] = values();
        int k = ab.length;
        for (int j = 0; j < k; j++)
        {
            b b1 = ab[j];
            if (b1.b == i)
            {
                return b1;
            }
        }

        return null;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/pandora/android/eureka/dialog/f$a, s);
    }

    public static b[] values()
    {
        return (b[])c.clone();
    }

    static 
    {
        a = new <init>("BEEP_SPEAKER", 0, 0);
        c = (new c[] {
            a
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        b = j;
    }
}
