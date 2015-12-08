// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ntl
{

    public static int a = -1;
    private static final String c = ntn.a(ntl);
    private static int d[] = {
        3, 4
    };
    private static int e[] = {
        2
    };
    private static ntl f;
    public final Context b;

    private ntl(Context context)
    {
        b = context;
    }

    public static int a(nqx nqx1)
    {
        switch (ntm.b[nqx1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 3;

        case 3: // '\003'
            return 1;
        }
    }

    public static ntl a(Context context)
    {
        ntl;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new ntl(context);
        }
        context = f;
        ntl;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static int[] a(nqk nqk1)
    {
        switch (ntm.a[nqk1.ordinal()])
        {
        default:
            String s = c;
            nqk1 = String.valueOf(nqk1);
            ntn.d(s, (new StringBuilder(String.valueOf(nqk1).length() + 24)).append("Unknown fetch category: ").append(nqk1).toString());
            return d;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return e;
        }
    }

    public final String a()
    {
        return ((nqz)olm.a(b, nqz)).a();
    }

}
