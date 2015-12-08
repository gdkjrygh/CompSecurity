// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.synclair.SynclairError;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public class m extends BaseSynclairOperation
{

    private static final String a = "SendGreetingOperation";
    private final String e;
    private final String f;

    public m(String s, String s1)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.n);
        e = s;
        f = s1;
    }

    static String a(m m1)
    {
        return m1.f;
    }

    static String b(m m1)
    {
        return m1.e;
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
        return "SendGreetingOperation";
    }

    /* member class not found */
    class _cls1 {}

}
