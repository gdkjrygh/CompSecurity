// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

final class ecz extends hgu
{

    private final dzi a = new dzi();
    private dwa b;
    private final dum c;

    public ecz(Context context, dum dum1)
    {
        context = noz.a(context, "SystemMessageAdapter", new String[0]);
        c = dum1;
        dzl dzl1 = (dzl)dum1.a(dzl);
        dum1 = a.a(dum1, dzl1);
        Object obj = dzl1.i.b.g;
        if (obj != null && ((pzr) (obj)).a != null)
        {
            String s = ((pzr) (obj)).a.b;
            obj = ((pzr) (obj)).a.a;
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s))
            {
                dum1.a(((String) (obj)), new eda(this, s, context), pws.m);
            }
        }
        b = dum1.a();
    }

    public final int a()
    {
        return b.a();
    }

    public final void a(afn afn)
    {
        b.a((dwk)afn);
    }

    public final long b()
    {
        return c.c;
    }
}
