// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nsb extends nzc
{

    private qqp a;

    nsb(Context context, int i, qqp qqp)
    {
        super(context, new nyg(context, i), "gnssyncnotifications", new pbv(), new pbw());
        a = qqp;
    }

    protected final void a(qlw qlw)
    {
        ((pbv)qlw).a = a;
    }

    static 
    {
        ntn.a("SyncNotsOperation");
    }
}
