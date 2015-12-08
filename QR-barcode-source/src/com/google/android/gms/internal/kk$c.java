// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.internal:
//            kk

public static abstract class tus extends tus
{

    protected Result c(Status status)
    {
        return d(status);
    }

    protected Status d(Status status)
    {
        boolean flag;
        if (!status.isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.K(flag);
        return status;
    }

    public tus()
    {
    }
}
