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
//            hc, hn, gd, hj, 
//            ga

public final class gb extends hc
{
    private static final class a extends ga
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void b(int i, int j)
        {
            Status status = new Status(i);
            yO.a(new b(status, j));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            yO = (com.google.android.gms.common.api.a.d)hn.b(d1, "Result holder must not be null");
        }
    }

    private static final class b
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        private final int yP;
        private final Status yw;

        public int getStateKey()
        {
            return yP;
        }

        public Status getStatus()
        {
            return yw;
        }

        public b(Status status, int i)
        {
            yw = status;
            yP = i;
        }
    }

    private static final class c extends ga
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void a(DataHolder dataholder)
        {
            yO.a(new d(dataholder));
        }

        public c(com.google.android.gms.common.api.a.d d1)
        {
            yO = (com.google.android.gms.common.api.a.d)hn.b(d1, "Result holder must not be null");
        }
    }

    private static final class d extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        private final AppStateBuffer yQ;

        public AppStateBuffer getStateBuffer()
        {
            return yQ;
        }

        public d(DataHolder dataholder)
        {
            super(dataholder);
            yQ = new AppStateBuffer(dataholder);
        }
    }

    private static final class e extends ga
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void a(int i, DataHolder dataholder)
        {
            yO.a(new f(i, dataholder));
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            yO = (com.google.android.gms.common.api.a.d)hn.b(d1, "Result holder must not be null");
        }
    }

    private static final class f extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private final int yP;
        private final AppStateBuffer yQ;

        private boolean dR()
        {
            return yw.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (dR())
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
            if (dR())
            {
                f1 = null;
            }
            return f1;
        }

        public byte[] getLocalData()
        {
            if (yQ.getCount() == 0)
            {
                return null;
            } else
            {
                return yQ.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (yQ.getCount() == 0)
            {
                return null;
            } else
            {
                return yQ.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (yQ.getCount() == 0)
            {
                return null;
            } else
            {
                return yQ.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return yP;
        }

        public void release()
        {
            yQ.close();
        }

        public f(int i, DataHolder dataholder)
        {
            super(dataholder);
            yP = i;
            yQ = new AppStateBuffer(dataholder);
        }
    }

    private static final class g extends ga
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void dO()
        {
            Status status = new Status(0);
            yO.a(status);
        }

        public g(com.google.android.gms.common.api.a.d d1)
        {
            yO = (com.google.android.gms.common.api.a.d)hn.b(d1, "Holder must not be null");
        }
    }


    private final String yN;

    public gb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        yN = (String)hn.f(s);
    }

    protected gd D(IBinder ibinder)
    {
        return gd.a.F(ibinder);
    }

    public void a(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((gd)fo()).a(new c(d1));
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
            ((gd)fo()).b(new a(d1), i);
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
            ((gd)fo()).a(new e(d1), i, s, abyte0);
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
            ((gd)fo()).a(d1, i, abyte0);
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

    protected void a(hj hj1, hc.e e1)
        throws RemoteException
    {
        hj1.a(e1, 0x4d7808, getContext().getPackageName(), yN, fn());
    }

    public void b(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((gd)fo()).b(new g(d1));
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
            ((gd)fo()).a(new e(d1), i);
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

        hn.a(flag, String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    protected String bp()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public int dP()
    {
        int i;
        try
        {
            i = ((gd)fo()).dP();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int dQ()
    {
        int i;
        try
        {
            i = ((gd)fo()).dQ();
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
