// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.mixpanel.f;
import com.fitbit.mixpanel.i;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.synclair.operation.BaseSynclairOperation;

// Referenced classes of package com.fitbit.synclair:
//            SynclairManager, c

protected class b
    implements com.fitbit.synclair.operation.ion.a
{

    final SynclairManager b;

    private BaseSynclairOperation i(BaseSynclairOperation basesynclairoperation)
    {
        BaseSynclairOperation basesynclairoperation1 = basesynclairoperation;
        if (com.fitbit.synclair.SynclairManager.a(b) != basesynclairoperation)
        {
            com.fitbit.e.a.a(b.m(), "%s is not a current operation", new Object[] {
                basesynclairoperation
            });
            basesynclairoperation1 = null;
        }
        return basesynclairoperation1;
    }

    protected void a(BaseSynclairOperation basesynclairoperation)
    {
        if (basesynclairoperation.c().equals(com.fitbit.synclair.operation.info.nfo.SynclairOperationType.i))
        {
            com.fitbit.synclair.SynclairManager.a(b, true);
            UISavedState.i();
        }
        if (SynclairManager.b(b) && basesynclairoperation.c().equals(com.fitbit.synclair.operation.info.nfo.SynclairOperationType.k))
        {
            com.fitbit.mixpanel.f.a(new i(com.fitbit.synclair.c.j().k().a()));
            com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.TS.e);
            com.fitbit.synclair.SynclairManager.a(b, false);
        }
        b.O();
        b.b(basesynclairoperation);
    }

    public final void b(BaseSynclairOperation basesynclairoperation)
    {
        basesynclairoperation = i(basesynclairoperation);
        if (basesynclairoperation != null)
        {
            f(basesynclairoperation);
        }
    }

    public final void c(BaseSynclairOperation basesynclairoperation)
    {
        basesynclairoperation = i(basesynclairoperation);
        if (basesynclairoperation != null)
        {
            a(basesynclairoperation);
        }
    }

    public final void d(BaseSynclairOperation basesynclairoperation)
    {
        basesynclairoperation = i(basesynclairoperation);
        if (basesynclairoperation != null)
        {
            g(basesynclairoperation);
        }
    }

    public final void e(BaseSynclairOperation basesynclairoperation)
    {
        basesynclairoperation = i(basesynclairoperation);
        if (basesynclairoperation != null)
        {
            h(basesynclairoperation);
        }
    }

    protected void f(BaseSynclairOperation basesynclairoperation)
    {
        b.O();
    }

    protected void g(BaseSynclairOperation basesynclairoperation)
    {
        b.O();
        b.b(basesynclairoperation);
    }

    protected void h(BaseSynclairOperation basesynclairoperation)
    {
        if (SynclairManager.c(b) == nclairManagerState.c)
        {
            b.a(nclairManagerState.d);
        }
        b.O();
        b.b(basesynclairoperation);
    }

    protected lairOperation(SynclairManager synclairmanager)
    {
        b = synclairmanager;
        super();
    }
}
