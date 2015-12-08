// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nnp
    implements ngo
{

    private static final int a;
    private final Context b;
    private final nnj c;

    public nnp(Context context)
    {
        b = context;
        c = (nnj)olm.a(context, nnj);
    }

    static int b()
    {
        return a;
    }

    public final int a()
    {
        return ngr.a;
    }

    public final ngp a(mmx mmx1, boolean flag)
    {
        while (mmx1.c("is_managed_account") && !c.b() || !c.a() || mmx1.b("gaia_id") != null) 
        {
            return null;
        }
        return new nnq(this, b);
    }

    static 
    {
        a = qmb.b(qrq.a.b);
    }
}
