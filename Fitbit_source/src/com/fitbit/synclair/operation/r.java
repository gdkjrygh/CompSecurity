// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.os.Bundle;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.synclair.SynclairError;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public abstract class r extends BaseSynclairOperation
{

    AirlinkCommand a;

    public r(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        super(synclairoperationtype);
        a = null;
    }

    protected void a(Bundle bundle)
    {
        bundle = com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b(AirlinkCommand.b, bundle);
        if (bundle == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.a)
        {
            k();
            return;
        }
        if (bundle == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.e)
        {
            a(SynclairError.h);
            return;
        }
        if (bundle == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.h)
        {
            a(SynclairError.c);
            return;
        }
        if (bundle == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.i)
        {
            a(SynclairError.f);
            return;
        }
        if (bundle == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.j)
        {
            a(SynclairError.e);
            return;
        } else
        {
            a(SynclairError.d);
            return;
        }
    }

    protected void b(Object obj)
    {
        a(obj);
    }

    protected void l()
    {
        if (a != null)
        {
            a.stopLoading();
            a = null;
        }
        k();
    }

    protected final void o()
    {
        a = q();
        if (a != null)
        {
            a.registerListener(0, new _cls1());
            a.startLoading();
            r();
            return;
        } else
        {
            a(SynclairError.i);
            return;
        }
    }

    protected abstract AirlinkCommand q();

    protected void r()
    {
    }

    protected void s()
    {
    }

    /* member class not found */
    class _cls1 {}

}
