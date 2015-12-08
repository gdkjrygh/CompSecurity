// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

class btt extends mtf
{

    private static String a = btt.getSimpleName();
    private final bty b;
    private final String c;
    private final String j;
    private final String k;
    private final long l;
    private final String m;

    btt(String s, Context context, bty bty1, String s1, String s2, String s3, long l1, String s4)
    {
        String s5 = a;
        super(context, (new StringBuilder(String.valueOf(s5).length() + 1 + String.valueOf(s).length())).append(s5).append("|").append(s).toString());
        b = bty1;
        c = s1;
        j = s2;
        k = s3;
        l = l1;
        m = s4;
    }

    protected final mue a()
    {
        b.a(c, j, k, l, m);
        return new mue(true);
    }

}
