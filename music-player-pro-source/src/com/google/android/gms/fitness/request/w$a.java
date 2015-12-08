// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            w

public static class 
{

    private Session TQ;

    static Session a( )
    {
        return .TQ;
    }

    public  b(Session session)
    {
        boolean flag;
        if (session.getEndTime(TimeUnit.MILLISECONDS) == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Cannot start a session which has already ended");
        TQ = session;
        return this;
    }

    public w kk()
    {
        return new w(this, null);
    }

    public ()
    {
    }
}
