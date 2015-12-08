// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class c
    implements c
{

    private float a;
    private int b;
    private int c;
    private bq d;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(aA);
        bp1.a(a, b, c, i);
    }

    public final String toString()
    {
        String s = String.valueOf(aA);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    (bq bq1, float f, int i, int j)
    {
        d = bq1;
        a = f;
        b = i;
        c = j;
        super();
    }
}
