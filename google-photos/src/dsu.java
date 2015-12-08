// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class dsu
    implements omb, opr, opv
{

    Context a;
    private dsx b;
    private mwx c;
    private final Runnable d;

    public dsu(opd opd1)
    {
        d = new dsv(this);
        opd1.a(this);
    }

    public dsu(opd opd1, byte byte0)
    {
        d = new dsv(this);
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        c = (mwx)olm1.a(mwx);
        b = (dsx)olm1.a(dsx);
    }

    public final void al_()
    {
        if (!b.a)
        {
            c.a(d);
        }
    }
}
