// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nmr
{

    final Context a;
    String b;
    String c;
    String d;
    nmt e;
    public nnb f;
    nlw g;

    public nmr(Context context)
    {
        e = nmp.c();
        f = nnb.d;
        g = nlw.a;
        p.b(context, "context must be non-null");
        a = context;
    }

    public final nmp a()
    {
        p.a(b, "must specify an accountName");
        p.a(c, "must specify an accountGaiaId");
        return new nmp(this);
    }

    public final nmr a(int i)
    {
        mmx mmx1 = ((mmv)olm.a(a, mmv)).a(i);
        b = mmx1.b("account_name");
        c = mmx1.b("gaia_id");
        d = mmx1.b("effective_gaia_id");
        return this;
    }

    public final nmr a(nmt nmt)
    {
        p.b(nmt, "progressListener must be non-null");
        e = nmt;
        return this;
    }
}
