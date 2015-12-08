// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.data.bl.dg;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public abstract class t extends BaseSynclairOperation
{

    protected final dg a = dg.d();
    private a e;

    public t(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        super(synclairoperationtype);
    }

    protected abstract void a(com.fitbit.data.bl.h.a a1);

    protected void l()
    {
        if (e != null)
        {
    /* block-local class not found */
    class a {}

            e.b();
            e = null;
        }
        super.l();
    }

    protected final void o()
    {
        e = new a(null);
        a(e);
    }
}
