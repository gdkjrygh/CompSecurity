// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class heg
    implements gkj, omb, opt, opu, opv
{

    ehr a;
    private final heh b;
    private boolean c;
    private gll d;

    public heg(opd opd1, heh heh1)
    {
        b = heh1;
        opd1.a(this);
    }

    public final void V_()
    {
        c = false;
        if (a != null)
        {
            d.b(a, this);
        }
    }

    public final void X_()
    {
        c = true;
        a();
    }

    void a()
    {
        if (c && a != null)
        {
            d.a(a, this);
            b(-1, -1);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (gll)olm1.a(gll);
    }

    public final gki b(int i, int j)
    {
        Integer integer = d.b(a);
        ekp ekp1 = (ekp)d.b(a, 0);
        if (integer != null && ekp1 != null)
        {
            b.a(integer.intValue(), ekp1);
        }
        return null;
    }

    public final int d()
    {
        return 0;
    }
}
