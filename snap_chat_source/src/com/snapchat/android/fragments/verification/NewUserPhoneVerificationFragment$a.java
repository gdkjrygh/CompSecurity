// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;


// Referenced classes of package com.snapchat.android.fragments.verification:
//            NewUserPhoneVerificationFragment

static final class h extends Enum
{

    public static final d a;
    private static d b;
    private static d c;
    private static d d;
    private static final d i[];
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    static int a(h h1)
    {
        return h1.e;
    }

    public static e a(int j)
    {
        switch (j)
        {
        default:
            return a;

        case 0: // '\0'
            return b;

        case 1: // '\001'
            return c;

        case 2: // '\002'
            return d;
        }
    }

    static boolean b(d d1)
    {
        return d1.f;
    }

    static boolean c(f f1)
    {
        return f1.g;
    }

    static boolean d(g g1)
    {
        return g1.h;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/snapchat/android/fragments/verification/NewUserPhoneVerificationFragment$a, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    static 
    {
        a = new <init>("NOT_SELECTED", 0, -1, false, false, false);
        b = new <init>("CONTROL", 1, 0, true, false, false);
        c = new <init>("TREATMENT1", 2, 1, true, true, false);
        d = new <init>("TREATMENT2", 3, 2, true, true, true);
        i = (new i[] {
            a, b, c, d
        });
    }

    private (String s, int j, int k, boolean flag, boolean flag1, boolean flag2)
    {
        super(s, j);
        e = k;
        f = flag;
        g = flag1;
        h = flag2;
    }
}
