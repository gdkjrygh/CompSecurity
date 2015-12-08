// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class exi
    implements omb, opt, opv
{

    public ekq a;
    public ekw b;
    private final eyz c;
    private exm d;

    public exi(opd opd1, eyz eyz)
    {
        c = eyz;
        opd1.a(this);
    }

    public final void X_()
    {
        d.a(a, b, c);
    }

    public final exh a()
    {
        p.b(a, "must initialize before getting lookup");
        return d.a(a, b, c);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (exm)olm.a(context, exm);
    }
}
