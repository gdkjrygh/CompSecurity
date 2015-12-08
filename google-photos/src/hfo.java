// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hfo
    implements nug, omb, opn, opp, opr, opv
{

    final ar a;
    noz b;
    private nwm c;
    private mwx d;
    private dsx e;
    private boolean f;
    private boolean g;

    public hfo(ar ar, opd opd1)
    {
        a = ar;
        opd1.a(this);
    }

    private void d()
    {
        am am;
label0:
        {
            am = c.b();
            if (am != null && !(am instanceof dsw) && f)
            {
                if (!g)
                {
                    break label0;
                }
                g = false;
            }
            return;
        }
        d.a(new hfp(this, am));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (nwm)olm1.a(nwm);
        c.a().a(this, false);
        e = (dsx)olm1.a(dsx);
        d = (mwx)olm1.a(mwx);
        b = noz.a(context, 2, "ImpressionOnPrimary", new String[0]);
    }

    public final void al_()
    {
        f = true;
        g = e.a;
        d();
    }

    public final void am_()
    {
        f = false;
    }

    public final void b_(Object obj)
    {
        d();
    }

    public final void c()
    {
        c.a().a(this);
    }
}
