// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.m;
import com.fitbit.synclair.SynclairError;
import java.util.List;

// Referenced classes of package com.fitbit.synclair.operation:
//            s

public class j extends s
{

    private static final String a = "SearchTrackerForPairingOperation";
    private final GalileoTrackerType e;

    public j(a a1, GalileoTrackerType galileotrackertype)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.c, a1);
        e = galileotrackertype;
    }

    Object a(f f)
    {
        return b((m)f);
    }

    protected void a(m m1)
    {
        int i = m1.t().size();
        if (i == 0)
        {
            a(SynclairError.a);
            return;
        }
        if (i == 1)
        {
            a(b(m1));
            return;
        } else
        {
            a(SynclairError.b);
            return;
        }
    }

    GalileoTracker b(m m1)
    {
        return (GalileoTracker)m1.t().get(0);
    }

    protected void b(f f)
    {
        a((m)f);
    }

    protected String p()
    {
        return "SearchTrackerForPairingOperation";
    }

    m q()
    {
        return new m(e);
    }

    f r()
    {
        return q();
    }
}
