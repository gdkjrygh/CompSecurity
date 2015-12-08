// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class ixv
    implements dhp, iwy, omb, opn, opv
{

    private ekb a;
    private iwx b;

    public ixv(opd opd1)
    {
        opd1.a(this);
    }

    public ixv(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final void a()
    {
        hyw hyw1 = new hyw(a.a());
        b.a(hyw1);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (ekb)olm1.a(ekb);
        b = (iwx)olm1.a(iwx);
        b.a(this);
    }

    public final void a(hyw hyw1)
    {
        a.b();
    }

    public final void c()
    {
        b.b(this);
    }
}
