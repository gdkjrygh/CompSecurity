// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ga;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

class yJ
    implements eDeletedResult
{

    final Status yJ;
    final yJ yM;

    public int getStateKey()
    {
        return yM.;
    }

    public Status getStatus()
    {
        return yJ;
    }

    nit>(nit> nit>, Status status)
    {
        yM = nit>;
        yJ = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.b
    {

        final int yK;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ga)a1);
        }

        protected void a(ga ga1)
        {
            ga1.a(this, yK);
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
                yK = i;
                super(null);
            }
    }

}
