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
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.internal:
//            id, ia

public final class ib extends com.google.android.gms.common.internal.e
{
    private static final class a extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void e(int i, int k)
        {
            Status status = new Status(i);
            De.b(new b(status, k));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = (com.google.android.gms.common.api.BaseImplementation.b)o.b(b1, "Result holder must not be null");
        }
    }

    private static final class b
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        private final Status CM;
        private final int Df;

        public int getStateKey()
        {
            return Df;
        }

        public Status getStatus()
        {
            return CM;
        }

        public b(Status status, int i)
        {
            CM = status;
            Df = i;
        }
    }

    private static final class c extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(DataHolder dataholder)
        {
            De.b(new d(dataholder));
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = (com.google.android.gms.common.api.BaseImplementation.b)o.b(b1, "Result holder must not be null");
        }
    }

    private static final class d extends com.google.android.gms.common.api.a
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        private final AppStateBuffer Dg;

        public AppStateBuffer getStateBuffer()
        {
            return Dg;
        }

        public d(DataHolder dataholder)
        {
            super(dataholder);
            Dg = new AppStateBuffer(dataholder);
        }
    }

    private static final class e extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(int i, DataHolder dataholder)
        {
            De.b(new f(i, dataholder));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = (com.google.android.gms.common.api.BaseImplementation.b)o.b(b1, "Result holder must not be null");
        }
    }

    private static final class f extends com.google.android.gms.common.api.a
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private final int Df;
        private final AppStateBuffer Dg;

        private boolean fs()
        {
            return CM.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (fs())
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
            if (fs())
            {
                f1 = null;
            }
            return f1;
        }

        public byte[] getLocalData()
        {
            if (Dg.getCount() == 0)
            {
                return null;
            } else
            {
                return Dg.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (Dg.getCount() == 0)
            {
                return null;
            } else
            {
                return Dg.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (Dg.getCount() == 0)
            {
                return null;
            } else
            {
                return Dg.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return Df;
        }

        public void release()
        {
            Dg.close();
        }

        public f(int i, DataHolder dataholder)
        {
            super(dataholder);
            Df = i;
            Dg = new AppStateBuffer(dataholder);
        }
    }

    private static final class g extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void fp()
        {
            Status status = new Status(0);
            De.b(status);
        }

        public g(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = (com.google.android.gms.common.api.BaseImplementation.b)o.b(b1, "Holder must not be null");
        }
    }


    private final String Dd;

    public ib(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Dd = (String)o.i(s);
    }

    protected id I(IBinder ibinder)
    {
        return id.a.K(ibinder);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((id)gS()).a(new c(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i)
    {
        try
        {
            ((id)gS()).b(new a(b1), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, String s, byte abyte0[])
    {
        try
        {
            ((id)gS()).a(new e(b1), i, s, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, byte abyte0[])
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        b1 = null;
_L1:
        try
        {
            ((id)gS()).a(b1, i, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
        break MISSING_BLOCK_LABEL_43;
        b1 = new e(b1);
          goto _L1
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.a(e1, 0x5e2978, getContext().getPackageName(), Dd, gR());
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((id)gS()).b(new g(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, int i)
    {
        try
        {
            ((id)gS()).a(new e(b1), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    protected transient void c(String as[])
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

        o.a(flag, String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    public int fq()
    {
        int i;
        try
        {
            i = ((id)gS()).fq();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int fr()
    {
        int i;
        try
        {
            i = ((id)gS()).fr();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return I(ibinder);
    }
}
