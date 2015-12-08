// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ehy
{

    private static final ayt b;
    private static final ayt c;
    private static final ayt d;
    final int a;
    private final ayt e;

    ehy(Context context, int i)
    {
        e = (ayt)((ayt)((ayt)b.a(eht.a(esm.d))).a(context)).c();
        a = i;
    }

    static ayt a(ehy ehy1, esm esm1)
    {
        switch (ehv.a[esm1.ordinal()])
        {
        default:
            return d;

        case 1: // '\001'
            return ehy1.e;

        case 2: // '\002'
            return c;
        }
    }

    static 
    {
        ayt ayt1 = (ayt)((ayt)(new ayt()).b()).c();
        b = ayt1;
        c = (ayt)((ayt)ayt1.a(eht.a(esm.c))).c();
        d = (ayt)((ayt)b.a(eht.a(esm.b))).c();
    }
}
