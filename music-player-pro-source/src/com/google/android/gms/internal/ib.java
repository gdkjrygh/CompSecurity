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
//            jl, jx, id, jt, 
//            ia

public final class ib extends jl
{
    private static final class a extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void e(int i, int j)
        {
            Status status = new Status(i);
            Ea.b(new b(status, j));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Result holder must not be null");
        }
    }

    private static final class b
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        private final Status Eb;
        private final int Ec;

        public int getStateKey()
        {
            return Ec;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public b(Status status, int i)
        {
            Eb = status;
            Ec = i;
        }
    }

    private static final class c extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(DataHolder dataholder)
        {
            Ea.b(new d(dataholder));
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Result holder must not be null");
        }
    }

    private static final class d extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        private final AppStateBuffer Ed;

        public AppStateBuffer getStateBuffer()
        {
            return Ed;
        }

        public d(DataHolder dataholder)
        {
            super(dataholder);
            Ed = new AppStateBuffer(dataholder);
        }
    }

    private static final class e extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(int i, DataHolder dataholder)
        {
            Ea.b(new f(i, dataholder));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Result holder must not be null");
        }
    }

    private static final class f extends com.google.android.gms.common.api.b
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private final int Ec;
        private final AppStateBuffer Ed;

        private boolean fN()
        {
            return Eb.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (fN())
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
            if (fN())
            {
                f1 = null;
            }
            return f1;
        }

        public byte[] getLocalData()
        {
            if (Ed.getCount() == 0)
            {
                return null;
            } else
            {
                return Ed.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (Ed.getCount() == 0)
            {
                return null;
            } else
            {
                return Ed.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (Ed.getCount() == 0)
            {
                return null;
            } else
            {
                return Ed.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return Ec;
        }

        public void release()
        {
            Ed.release();
        }

        public f(int i, DataHolder dataholder)
        {
            super(dataholder);
            Ec = i;
            Ed = new AppStateBuffer(dataholder);
        }
    }

    private static final class g extends ia
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void fK()
        {
            Status status = new Status(0);
            Ea.b(status);
        }

        public g(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }


    private final String DZ;

    public ib(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        DZ = (String)jx.i(s);
    }

    protected id H(IBinder ibinder)
    {
        return id.a.J(ibinder);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((id)hw()).a(new c(b1));
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
            ((id)hw()).b(new a(b1), i);
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
            ((id)hw()).a(new e(b1), i, s, abyte0);
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
            ((id)hw()).a(b1, i, abyte0);
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

    protected void a(jt jt1, jl.e e1)
        throws RemoteException
    {
        jt1.a(e1, 0x648278, getContext().getPackageName(), DZ, hv());
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((id)hw()).b(new g(b1));
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
            ((id)hw()).a(new e(b1), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    protected String bK()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
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

        jx.a(flag, String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    public int fL()
    {
        int i;
        try
        {
            i = ((id)hw()).fL();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int fM()
    {
        int i;
        try
        {
            i = ((id)hw()).fM();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    protected IInterface l(IBinder ibinder)
    {
        return H(ibinder);
    }
}
