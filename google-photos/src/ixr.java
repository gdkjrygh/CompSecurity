// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Set;

public final class ixr
    implements omb, opt, opu, opv
{

    private final am a;
    private final int b;
    private ixs c;

    public ixr(am am1, opd opd1, int i)
    {
        a = am1;
        b = i;
        opd1.a(this);
    }

    public final void V_()
    {
        ixs ixs1 = c;
        bz bz = a.k();
        int i = b;
        ixs1.a.remove(new ixt(bz, i));
    }

    public final void X_()
    {
        ixs ixs1 = c;
        bz bz = a.k();
        int i = b;
        ixs1.a.add(new ixt(bz, i));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (ixs)olm1.a(ixs);
    }
}
