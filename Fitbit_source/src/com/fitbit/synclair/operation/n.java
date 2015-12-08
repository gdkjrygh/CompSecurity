// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.synclair.SynclairError;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public class n extends BaseSynclairOperation
{

    private static final String a = "SendSelectedExercisesOperation";
    private final String e;
    private final Object f;

    public n(String s, Object obj)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.n);
        e = s;
        f = obj;
    }

    protected void o()
    {
        if (e != null)
        {
            a(new _cls1());
            return;
        } else
        {
            a(SynclairError.i);
            return;
        }
    }

    protected String p()
    {
        return "SendSelectedExercisesOperation";
    }

    /* member class not found */
    class _cls1 {}

}
