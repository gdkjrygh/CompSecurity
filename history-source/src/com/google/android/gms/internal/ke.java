// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kd, kb, kg, ki

public final class ke
    implements kd
{
    private static class a extends kb
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void aI(int i)
            throws RemoteException
        {
            Ea.b(new Status(i));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            Ea = b;
        }
    }


    public ke()
    {
    }

    public PendingResult c(GoogleApiClient googleapiclient)
    {
        return (new kf.a(googleapiclient) {

            final ke Nv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kg)a1);
            }

            protected void a(kg kg1)
                throws RemoteException
            {
                ((ki)kg1.hw()).a(new a(this));
            }

            
            {
                Nv = ke.this;
                super(googleapiclient);
            }
        }).gE();
    }
}
