// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.synclair.SynclairError;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public abstract class s extends BaseSynclairOperation
{

    private final a a;
    private GalileoTaskExecutor e;

    public s(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype, a a1)
    {
        super(synclairoperationtype);
        e = null;
        a = a1;
    }

    abstract Object a(f f);

    protected void b(f f)
    {
        a(a(f));
    }

    protected void c(f f)
    {
        a(SynclairError.h);
    }

    protected void d(f f)
    {
        k();
    }

    protected void l()
    {
        if (e != null)
        {
            e.a(false);
            e = null;
        }
        super.l();
    }

    protected void o()
    {
        if (a == null)
        {
            a("Invalid bluetooth context");
            a(SynclairError.i);
        } else
        {
            f f = r();
            if (f == null)
            {
                a("Invalid task");
                a(SynclairError.i);
                return;
            }
            e = new _cls1(f, a, null, f);
            if (!e.g())
            {
                a("Could not execute task");
                a(SynclairError.i);
                return;
            }
        }
    }

    abstract f r();

    /* member class not found */
    class _cls1 {}

}
