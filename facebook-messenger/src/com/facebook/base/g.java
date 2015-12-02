// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base;


// Referenced classes of package com.facebook.base:
//            f

public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g NFC;
    public static final g NFD;
    public static final g NFKC;
    public static final g NFKD;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static java.text.Normalizer.Form unwrap(g g1)
    {
        switch (f.a[g1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return java.text.Normalizer.Form.NFC;

        case 2: // '\002'
            return java.text.Normalizer.Form.NFD;

        case 3: // '\003'
            return java.text.Normalizer.Form.NFKC;

        case 4: // '\004'
            return java.text.Normalizer.Form.NFKD;
        }
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/base/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        NFC = new g("NFC", 0);
        NFD = new g("NFD", 1);
        NFKC = new g("NFKC", 2);
        NFKD = new g("NFKD", 3);
        $VALUES = (new g[] {
            NFC, NFD, NFKC, NFKD
        });
    }
}
