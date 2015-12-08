// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

class bzs extends mtf
{

    private final bzo a;
    private final String b;
    private final String c;
    private final String j;
    private final boolean k;

    bzs(Context context, bzo bzo1, String s, String s1, String s2, boolean flag)
    {
        super(context, bzo.a);
        a = bzo1;
        b = s;
        c = s1;
        j = s2;
        k = flag;
    }

    protected final mue a()
    {
        a.a(b, c, j, k);
        return new mue(true);
    }
}
