// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ib;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

class CW
    implements eDeletedResult
{

    final Status CW;
    final CW CZ;

    public int getStateKey()
    {
        return CZ.;
    }

    public Status getStatus()
    {
        return CW;
    }

    nit>(nit> nit>, Status status)
    {
        CZ = nit>;
        CW = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.b
    {

        final int CX;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ib)a1);
        }

        protected void a(ib ib1)
        {
            ib1.a(this, CX);
        }

        public Result c(Status status)
        {
            return g(status);
        }

        public AppStateManager.StateDeletedResult g(Status status)
        {
            return new AppStateManager._cls5._cls1(this, status);
        }

            
            {
                CX = i;
                super(null);
            }
    }

}
