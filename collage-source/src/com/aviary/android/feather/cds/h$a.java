// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;


// Referenced classes of package com.aviary.android.feather.cds:
//            h

public static final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  a(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 4: // '\004'
        case 16: // '\020'
            return j;

        case 1: // '\001'
        case 2: // '\002'
            return i;

        case 8: // '\b'
            return k;
        }
    }

    public static boolean a(k k1)
    {
        return k1 != null && (k1 == e || k1 == f);
    }

    public static boolean b(f f1)
    {
        switch (a[f1.ordinal()])
        {
        default:
            return false;

        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    public static boolean c(ordinal ordinal)
    {
        switch (a[ordinal.ordinal()])
        {
        default:
            return false;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return true;
        }
    }

    public static ordinal valueOf(String s)
    {
        return (ordinal)Enum.valueOf(com/aviary/android/feather/cds/h$a, s);
    }

    public static ordinal[] values()
    {
        return (ordinal[])l.clone();
    }

    static 
    {
        a = new <init>("PURCHASE", 0);
        b = new <init>("FREE", 1);
        c = new <init>("INSTALL", 2);
        d = new <init>("RESTORE", 3);
        e = new <init>("OWNED", 4);
        f = new <init>("UNINSTALL", 5);
        g = new <init>("PACK_OPTION_BEING_DETERMINED", 6);
        h = new <init>("ERROR", 7);
        i = new <init>("DOWNLOADING", 8);
        j = new <init>("DOWNLOAD_ERROR", 9);
        k = new <init>("DOWNLOAD_COMPLETE", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
