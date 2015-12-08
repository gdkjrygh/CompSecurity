// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

class yG
    implements eDeletedResult
{

    final Status yG;
    final yG yJ;

    public int getStateKey()
    {
        return yJ.;
    }

    public Status getStatus()
    {
        return yG;
    }

    nit>(nit> nit>, Status status)
    {
        yJ = nit>;
        yG = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.b
    {

        final int yH;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((gb)a1);
        }

        protected void a(gb gb1)
        {
            gb1.a(this, yH);
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
                yH = i;
                super(null);
            }
    }

}
