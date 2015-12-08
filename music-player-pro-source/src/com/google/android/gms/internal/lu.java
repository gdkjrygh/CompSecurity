// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;

// Referenced classes of package com.google.android.gms.internal:
//            lz, jx

public interface lu
    extends com.google.android.gms.common.api.Api.a
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(Fitness.DQ, googleapiclient);
        }
    }

    public static class b extends md.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void j(Status status)
        {
            Ea.b(status);
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    public static abstract class c extends a
    {

        protected Status b(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.L(flag);
            return status;
        }

        protected Result c(Status status)
        {
            return b(status);
        }

        c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public abstract Context getContext();

    public abstract lz jM()
        throws DeadObjectException;
}
