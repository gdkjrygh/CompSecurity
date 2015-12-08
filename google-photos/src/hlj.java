// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hlj
    implements omb, opn, opv
{

    public hli a;
    public hgz b;
    public mtj c;
    public mmr d;
    public ekq e;
    public Context f;

    public hlj(opd opd1)
    {
        opd1.a(this);
    }

    public final hlj a(olm olm1)
    {
        olm1.a(hlj, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = context;
        c = (mtj)olm1.a(mtj);
        d = (mmr)olm1.a(mmr);
        e = ((ejz)olm1.a(ejz)).b();
        a = (hli)olm1.a(hli);
    }

    public final void c()
    {
        if (b != null)
        {
            b.b(a);
        }
    }
}
