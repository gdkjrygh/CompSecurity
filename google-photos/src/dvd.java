// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class dvd
    implements dup, dvi, dvq, efp, omb, opn, opr
{

    private final am a;
    private dvf b;
    private duo c;
    private efd d;

    dvd(am am1)
    {
        a = am1;
    }

    private void e()
    {
        if (b != null)
        {
            c.a(b);
        }
    }

    public final hgo a(dum dum)
    {
        if (b == null)
        {
            b = new dvf(this, dum);
            b.b = d.b;
        }
        return b;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (efd)olm1.a(efd);
        d.a(this);
        d.a(true);
        c = (duo)olm1.a(duo);
    }

    public final void a(eey eey)
    {
        if (b != null)
        {
            b.b = d.b;
        }
        e();
    }

    public final void a(olm olm1)
    {
        olm1.a(dvq, this);
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (flag || flag1)
        {
            d.c();
            return;
        } else
        {
            dvp.a(a.h());
            return;
        }
    }

    public final void al_()
    {
        e();
    }

    public final hhg b()
    {
        return new dvm();
    }

    public final void c()
    {
        d.b(this);
    }

    public final void d()
    {
        e();
    }
}
