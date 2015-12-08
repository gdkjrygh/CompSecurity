// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nyg
{

    public final String a;
    public final String b;
    public final boolean c;
    public final nxq d;
    public final boolean e;
    public final nxy f;

    public nyg(Context context, int i)
    {
        this(context, i, null, false, null);
    }

    private nyg(Context context, int i, nxq nxq, boolean flag, nxy nxy)
    {
        context = ((mmv)olm.a(context, mmv)).a(i);
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Account id %s not found", new Object[] {
            Integer.valueOf(i)
        });
        a = context.b("account_name");
        b = context.b("effective_gaia_id");
        d = null;
        e = false;
        f = null;
        c = false;
    }

    public nyg(String s, String s1)
    {
        this(s, s1, null, false, null, false);
    }

    public nyg(String s, String s1, nxq nxq, boolean flag, nxy nxy)
    {
        this(s, s1, null, flag, null, false);
    }

    private nyg(String s, String s1, nxq nxq, boolean flag, nxy nxy, boolean flag1)
    {
        a = (String)p.b(s, "accountName");
        b = s1;
        d = nxq;
        e = flag;
        f = nxy;
        c = false;
    }

    nyg(nyh nyh1)
    {
        a = nyh1.a;
        b = nyh1.b;
        d = nyh1.d;
        e = nyh1.e;
        f = nyh1.f;
        boolean flag;
        if (nyh1.c && nyh1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
