// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            CpuFeatures

public static final class h extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g j[];
    private int h;
    private g i;

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/skype/android/util/CpuFeatures$Feature, s);
    }

    public static h[] values()
    {
        return (h[])j.clone();
    }

    public final int a()
    {
        return h;
    }

    public final h b()
    {
        return i;
    }

    static 
    {
        a = new <init>("ARM_FEATURE_ARMv7", 0, , 1);
        b = new <init>("ARM_FEATURE_VFPv3", 1, , 2);
        c = new <init>("ARM_FEATURE_NEON", 2, , 4);
        d = new <init>("ARM_FEATURE_LDREX_STREX", 3, , 8);
        e = new <init>("X86_FEATURE_SSSE3", 4, , 1);
        f = new <init>("X86_FEATURE_POPCNT", 5, , 2);
        g = new <init>("X86_FEATURE_MOVBE", 6, , 4);
        j = (new j[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int k,  , int l)
    {
        super(s, k);
        i = ;
        h = l;
    }
}
