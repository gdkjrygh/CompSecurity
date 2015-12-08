// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class hli extends aep
    implements opl, ops, opv
{

    public boolean a;

    public hli(opd opd1)
    {
        a = false;
        opd1.a(this);
    }

    public final hli a(olm olm1)
    {
        olm1.a(hli, this);
        return this;
    }

    public final void a(int i, int j, int k)
    {
        a = true;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getBoolean("reorder_performed");
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("reorder_performed", a);
    }
}
