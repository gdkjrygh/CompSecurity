// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gxd
    implements grp, omb, opp, opr, opv
{

    boolean a;
    private gwu b;

    public gxd(gwu gwu1, opd opd1)
    {
        b = gwu1;
        super();
        opd1.a(this);
    }

    public final void a(am am)
    {
        a = false;
        if (am == b)
        {
            a = true;
            for (am = gwu.l(b).iterator(); am.hasNext(); ((gxs)am.next()).a()) { }
        } else
        {
            for (am = gwu.l(b).iterator(); am.hasNext(); ((gxs)am.next()).b()) { }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        ((grq)olm1.a(grq)).a(this);
    }

    public final void al_()
    {
        ((grq)gwu.p(b).a(grq)).a(this);
    }

    public final void am_()
    {
        ((grq)gwu.q(b).a(grq)).a.remove(this);
    }

    public final boolean c()
    {
        return gwu.o(b).c;
    }

    public final boolean d()
    {
        return a;
    }
}
