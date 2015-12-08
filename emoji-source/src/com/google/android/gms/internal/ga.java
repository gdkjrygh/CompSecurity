// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.internal:
//            hb, hm, gc, hi, 
//            fz

public final class ga extends hb
{
    private static final class a extends fz
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void b(int i, int j)
        {
            Status status = new Status(i);
            yR.a(new b(status, j));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            yR = (com.google.android.gms.common.api.a.d)hm.b(d1, "Result holder must not be null");
        }
    }

    private static final class b
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        private final int yS;
        private final Status yz;

        public int getStateKey()
        {
            return yS;
        }

        public Status getStatus()
        {
            return yz;
        }

        public b(Status status, int i)
        {
            yz = status;
            yS = i;
        }
    }

    private static final class c extends fz
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void a(DataHolder dataholder)
        {
            yR.a(new d(dataholder));
        }

        public c(com.google.android.gms.common.api.a.d d1)
        {
            yR = (com.google.android.gms.common.api.a.d)hm.b(d1, "Result holder must not be null");
        }
    }

    private static final class d extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        private final AppStateBuffer yT;

        public AppStateBuffer getStateBuffer()
        {
            return yT;
        }

        public d(DataHolder dataholder)
        {
            super(dataholder);
            yT = new AppStateBuffer(dataholder);
        }
    }

    private static final class e extends fz
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void a(int i, DataHolder dataholder)
        {
            yR.a(new f(i, dataholder));
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            yR = (com.google.android.gms.common.api.a.d)hm.b(d1, "Result holder must not be null");
        }
    }

    private static final class f extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private final int yS;
        private final AppStateBuffer yT;

        private boolean dW()
        {
            return yz.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (dW())
            {
                return this;
            } else
            {
                return null;
            }
        }

        public com.google.android.gms.appstate.AppStateManager.StateLoadedResult getLoadedResult()
        {
            f f1 = this;
            if (dW())
            {
                f1 = null;
            }
            return f1;
        }

        public byte[] getLocalData()
        {
            if (yT.getCount() == 0)
            {
                return null;
            } else
            {
                return yT.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (yT.getCount() == 0)
            {
                return null;
            } else
            {
                return yT.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (yT.getCount() == 0)
            {
                return null;
            } else
            {
                return yT.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return yS;
        }

        public void release()
        {
            yT.close();
        }

        public f(int i, DataHolder dataholder)
        {
            super(dataholder);
            yS = i;
            yT = new AppStateBuffer(dataholder);
        }
    }

    private static final class g extends fz
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void dT()
        {
            Status status = new Status(0);
            yR.a(status);
        }

        public g(com.google.android.gms.common.api.a.d d1)
        {
            yR = (com.google.android.gms.common.api.a.d)hm.b(d1, "Holder must not be null");
        }
    }


    private final String yQ;

    public ga(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        yQ = (String)hm.f(s);
    }

    protected gc D(IBinder ibinder)
    {
        return gc.a.F(ibinder);
    }

    public void a(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((gc)ft()).a(new c(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i)
    {
        try
        {
            ((gc)ft()).b(new a(d1), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i, String s, byte abyte0[])
    {
        try
        {
            ((gc)ft()).a(new e(d1), i, s, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i, byte abyte0[])
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        d1 = null;
_L1:
        try
        {
            ((gc)ft()).a(d1, i, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
        break MISSING_BLOCK_LABEL_43;
        d1 = new e(d1);
          goto _L1
    }

    protected void a(hi hi1, hb.e e1)
        throws RemoteException
    {
        hi1.a(e1, 0x4da6e8, getContext().getPackageName(), yQ, fs());
    }

    public void b(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((gc)ft()).b(new g(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, int i)
    {
        try
        {
            ((gc)ft()).a(new e(d1), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    protected transient void b(String as[])
    {
        int i = 0;
        boolean flag = false;
        for (; i < as.length; i++)
        {
            if (as[i].equals("https://www.googleapis.com/auth/appstate"))
            {
                flag = true;
            }
        }

        hm.a(flag, String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    protected String bu()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public int dU()
    {
        int i;
        try
        {
            i = ((gc)ft()).dU();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int dV()
    {
        int i;
        try
        {
            i = ((gc)ft()).dV();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    protected IInterface x(IBinder ibinder)
    {
        return D(ibinder);
    }
}
