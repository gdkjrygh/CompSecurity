// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ei;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

class wz
    implements eDeletedResult
{

    final wz wC;
    final Status wz;

    public int getStateKey()
    {
        return wC.;
    }

    public Status getStatus()
    {
        return wz;
    }

    nit>(nit> nit>, Status status)
    {
        wC = nit>;
        wz = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.b
    {

        final int wA;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ei)a1);
        }

        protected void a(ei ei1)
        {
            ei1.a(this, wA);
        }

        public AppStateManager.StateDeletedResult c(Status status)
        {
            return new AppStateManager._cls5._cls1(this, status);
        }

        public Result d(Status status)
        {
            return c(status);
        }

            
            {
                wA = i;
                super(null);
            }
    }

}
