// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.Set;

public final class nws
    implements nwm, nwp, ooi, opv
{

    private final ar a;
    private final nwn b;
    private final nud c = new ntz(this);
    private am d;
    private nwo e;
    private am f;

    public nws(ar ar, opd opd1, nwn nwn1)
    {
        a = ar;
        b = nwn1;
        e = new nwo(this);
        opd1.a(this);
    }

    private void b(am am)
    {
        if (Log.isLoggable("PrimaryFragment", 3))
        {
            String.format(Locale.US, "onPrimaryFragmentActivated fragment=%s", new Object[] {
                am
            });
        }
        f = null;
        d = am;
        c.b();
    }

    public final nud a()
    {
        return c;
    }

    public final nws a(olm olm1)
    {
        olm1.a(nwm, this);
        olm1.a(nwo, e);
        return this;
    }

    public final void a(am am)
    {
        if (am == f)
        {
            b(f);
        }
    }

    public final olm ai_()
    {
        return olm.a(a, d);
    }

    public final am b()
    {
        return d;
    }

    public final void b_(Bundle bundle)
    {
        c();
    }

    public final void c()
    {
        am am = b.u();
        am am1 = null;
        while (am1 != am && am != null) 
        {
            am am2;
            if (am instanceof nwn)
            {
                am1 = ((nwn)am).u();
            } else
            {
                am1 = null;
            }
            am2 = am1;
            am1 = am;
            am = am2;
        }
        if (am1 != d)
        {
            if (e.b.contains(am1))
            {
                b(am1);
            } else
            {
                f = am1;
            }
            if (Log.isLoggable("PrimaryFragment", 3))
            {
                String.format(Locale.US, "invalidate() fragment=%s", new Object[] {
                    am1
                });
                return;
            }
        }
    }
}
