// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Session;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            w

public static class 
{

    private Session St;

    static Session a( )
    {
        return .St;
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
        o.b(flag, "Cannot start a session which has already ended");
        St = session;
        return this;
    }

    public w jA()
    {
        return new w(this, null);
    }

    public ()
    {
    }
}
