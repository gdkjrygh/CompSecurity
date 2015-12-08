// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nrm extends nzc
{

    private qqj a;

    nrm(Context context, int i, qqj qqj)
    {
        super(context, new nyg(context, i), "gnsfetchnotifications", new pbp(), new pbq());
        a = qqj;
    }

    protected final void a(qlw qlw)
    {
        ((pbp)qlw).a = a;
    }

    final qqk c()
    {
        pbq pbq1 = (pbq)t();
        if (pbq1 != null)
        {
            return pbq1.a;
        } else
        {
            return null;
        }
    }

    static 
    {
        ntn.a("FetchNotOperation");
    }
}
