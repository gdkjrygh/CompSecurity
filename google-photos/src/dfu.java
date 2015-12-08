// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class dfu
    implements omb, ops, opv
{

    public boolean a;
    private final ar b;
    private final am c;
    private mmr d;
    private dgk e;

    public dfu(am am1, opd opd1)
    {
        c = am1;
        b = null;
        opd1.a(this);
    }

    public dfu(ar ar1, opd opd1)
    {
        c = null;
        b = ar1;
        opd1.a(this);
    }

    public final void a()
    {
        Resources resources = b().getResources();
        String s = d.g().b("account_name");
        dgg dgg1 = new dgg(e);
        dgg1.d = resources.getString(b.iB, new Object[] {
            s
        });
        dgg1.a().c();
        a = true;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getBoolean("has_shown_toast");
        }
        d = (mmr)olm1.a(mmr);
        e = (dgk)olm1.a(dgk);
    }

    public ar b()
    {
        if (b != null)
        {
            return b;
        } else
        {
            return c.O_();
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("has_shown_toast", a);
    }
}
