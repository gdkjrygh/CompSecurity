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

class DS
    implements eDeletedResult
{

    final Status DS;
    final DS DV;

    public int getStateKey()
    {
        return DV.;
    }

    public Status getStatus()
    {
        return DS;
    }

    nit>(nit> nit>, Status status)
    {
        DV = nit>;
        DS = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.b
    {

        final int DT;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ib)a1);
        }

        protected void a(ib ib1)
        {
            ib1.a(this, DT);
        }

        public Result c(Status status)
        {
            return f(status);
        }

        public AppStateManager.StateDeletedResult f(Status status)
        {
            return new AppStateManager._cls5._cls1(this, status);
        }

            
            {
                DT = i;
                super(googleapiclient);
            }
    }

}
