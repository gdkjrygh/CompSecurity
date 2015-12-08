// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.Fitness;

// Referenced classes of package com.google.android.gms.internal:
//            kp

public interface kk
    extends com.google.android.gms.common.api.Api.a
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a()
        {
            super(Fitness.CU);
        }
    }

    public static class b extends kt.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void k(Status status)
        {
            De.b(status);
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    public static abstract class c extends a
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

        public c()
        {
        }
    }


    public abstract Context getContext();

    public abstract kp jb();
}
