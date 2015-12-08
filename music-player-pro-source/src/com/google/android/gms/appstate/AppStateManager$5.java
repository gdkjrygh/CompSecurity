// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ib;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int DT;

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((ib)nit>);
    }

    protected void a(ib ib1)
    {
        ib1.a(this, DT);
    }

    public Result c(Status status)
    {
        return f(status);
    }

    public ateDeletedResult f(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final Status DS;
            final AppStateManager._cls5 DV;

            public int getStateKey()
            {
                return DV.DT;
            }

            public Status getStatus()
            {
                return DS;
            }

            
            {
                DV = AppStateManager._cls5.this;
                DS = status;
                super();
            }
        };
    }

    _cls1.DS(GoogleApiClient googleapiclient, int i)
    {
        DT = i;
        super(googleapiclient);
    }
}
