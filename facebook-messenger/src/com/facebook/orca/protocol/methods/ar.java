// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.m;
import com.facebook.orca.server.NewMessageResult;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            as, au, at

public class ar
{

    private au a;
    private at b;
    private int c;
    private Exception d;
    private NewMessageResult e;

    private ar(au au1, at at1, int i, Exception exception, NewMessageResult newmessageresult)
    {
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = true;
        flag3 = true;
        super();
        as.a[au1.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 76
    //                   2 139
    //                   3 183;
           goto _L1 _L2 _L3 _L4
_L1:
        a = au1;
        b = at1;
        c = i;
        d = exception;
        e = newmessageresult;
        return;
_L2:
        boolean flag;
        if (at1 == at.NONE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (exception == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (newmessageresult != null)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        continue; /* Loop/switch isn't completed */
_L3:
        boolean flag1;
        if (at1 != at.NONE)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        if (newmessageresult == null)
        {
            flag1 = flag4;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        continue; /* Loop/switch isn't completed */
_L4:
        boolean flag2;
        if (at1 != at.NONE)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2);
        if (newmessageresult == null)
        {
            flag2 = flag5;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static ar a(at at1)
    {
        return new ar(au.SKIPPED, at1, 0, null, null);
    }

    public static ar a(at at1, int i)
    {
        return new ar(au.FAILED, at1, i, null, null);
    }

    public static ar a(NewMessageResult newmessageresult)
    {
        return new ar(au.SUCCEEDED, at.NONE, 0, null, newmessageresult);
    }

    public static ar a(Exception exception, int i)
    {
        return new ar(au.FAILED, at.SEND_FAILED_UNKNOWN_EXCEPTION, i, exception, null);
    }

    public au a()
    {
        return a;
    }

    public NewMessageResult b()
    {
        boolean flag;
        if (a == au.SUCCEEDED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return e;
    }

    public String c()
    {
        boolean flag;
        if (a == au.SKIPPED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return b.message;
    }

    public String d()
    {
        boolean flag;
        if (a == au.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (b == at.SEND_FAILED_UNKNOWN_EXCEPTION)
        {
            return m.a(b.message, new Object[] {
                d
            });
        } else
        {
            return b.message;
        }
    }

    public int e()
    {
        boolean flag;
        if (a == au.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return c;
    }
}
