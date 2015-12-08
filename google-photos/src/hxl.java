// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hxl
    implements dir, hpo
{

    final hyg a;
    private final Context b;
    private final hru c;

    hxl(Context context, int i, int j, boolean flag, hru hru1)
    {
        b = context;
        a = new hyg();
        a.a = Integer.valueOf(i);
        a.b = Integer.valueOf(j);
        a.c = Boolean.valueOf(flag);
        c = hru1;
    }

    hxl(Context context, hyg hyg1)
    {
        b = context;
        a = hyg1;
        c = new hru(context);
    }

    public final nxx a()
    {
        hsh hsh1 = new hsh(b, a.a.intValue(), a.b.intValue());
        int i;
        if (a.c.booleanValue())
        {
            i = 2;
        } else
        {
            i = 1;
        }
        hsh1.c = i;
        return hsh1.a();
    }

    public final String ao_()
    {
        return "com.google.android.apps.photos.search.suggestions.people-hiding-action";
    }

    public final din b()
    {
        c.a(a.a.intValue(), a.b.intValue(), a.c.booleanValue());
        return din.a(null);
    }

    public final diq c()
    {
        return diq.a((hsg)((hpp)olm.a(b, hpp)).a(this).a);
    }

    public final boolean d()
    {
        hru hru1 = c;
        int i = a.a.intValue();
        int j = a.b.intValue();
        boolean flag;
        if (!a.c.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hru1.a(i, j, flag);
        return true;
    }
}
