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
//            ff, fq, ek, fm, 
//            eh

public final class ei extends ff
{
    final class a extends eh
    {

        private final com.google.android.gms.common.api.a.d wH;
        final ei wI;

        public void b(int i, int j)
        {
            Status status = new Status(i);
            wI.a(wI. new b(wH, status, j));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            wI = ei.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Result holder must not be null");
        }
    }

    final class b extends ff.b
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        final ei wI;
        private final Status wJ;
        private final int wK;

        public void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        public void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public int getStateKey()
        {
            return wK;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public b(com.google.android.gms.common.api.a.d d1, Status status, int i)
        {
            wI = ei.this;
            super(ei.this, d1);
            wJ = status;
            wK = i;
        }
    }

    final class c extends eh
    {

        private final com.google.android.gms.common.api.a.d wH;
        final ei wI;

        public void a(DataHolder dataholder)
        {
            Status status = new Status(dataholder.getStatusCode());
            wI.a(wI. new d(wH, status, dataholder));
        }

        public c(com.google.android.gms.common.api.a.d d1)
        {
            wI = ei.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Result holder must not be null");
        }
    }

    final class d extends ff.d
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        final ei wI;
        private final Status wJ;
        private final AppStateBuffer wL;

        public void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        public volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public AppStateBuffer getStateBuffer()
        {
            return wL;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public d(com.google.android.gms.common.api.a.d d1, Status status, DataHolder dataholder)
        {
            wI = ei.this;
            super(ei.this, d1, dataholder);
            wJ = status;
            wL = new AppStateBuffer(dataholder);
        }
    }

    final class e extends eh
    {

        private final com.google.android.gms.common.api.a.d wH;
        final ei wI;

        public void a(int i, DataHolder dataholder)
        {
            wI.a(wI. new f(wH, i, dataholder));
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            wI = ei.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Result holder must not be null");
        }
    }

    final class f extends ff.d
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        final ei wI;
        private final Status wJ;
        private final int wK;
        private final AppStateBuffer wL;

        private boolean dy()
        {
            return wJ.getStatusCode() == 2000;
        }

        public void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        public volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (dy())
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
            if (dy())
            {
                f1 = null;
            }
            return f1;
        }

        public byte[] getLocalData()
        {
            if (wL.getCount() == 0)
            {
                return null;
            } else
            {
                return wL.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (wL.getCount() == 0)
            {
                return null;
            } else
            {
                return wL.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (wL.getCount() == 0)
            {
                return null;
            } else
            {
                return wL.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return wK;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public void release()
        {
            wL.close();
        }

        public f(com.google.android.gms.common.api.a.d d1, int i, DataHolder dataholder)
        {
            wI = ei.this;
            super(ei.this, d1, dataholder);
            wK = i;
            wJ = new Status(dataholder.getStatusCode());
            wL = new AppStateBuffer(dataholder);
        }
    }

    final class g extends eh
    {

        com.google.android.gms.common.api.a.d wH;
        final ei wI;

        public void du()
        {
            Status status = new Status(0);
            wI.a(wI. new h(wH, status));
        }

        public g(com.google.android.gms.common.api.a.d d1)
        {
            wI = ei.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class h extends ff.b
    {

        final ei wI;
        private final Status wJ;

        public void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        public void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(wJ);
        }

        protected void dx()
        {
        }

        public h(com.google.android.gms.common.api.a.d d1, Status status)
        {
            wI = ei.this;
            super(ei.this, d1);
            wJ = status;
        }
    }


    private final String wG;

    public ei(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        wG = (String)fq.f(s);
    }

    public void a(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((ek)eM()).a(new c(d1));
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
            ((ek)eM()).b(new a(d1), i);
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
            ((ek)eM()).a(new e(d1), i, s, abyte0);
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
            ((ek)eM()).a(d1, i, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            Log.w("AppStateClient", "service died");
        }
        break MISSING_BLOCK_LABEL_44;
        d1 = new e(d1);
          goto _L1
    }

    protected void a(fm fm1, ff.e e1)
        throws RemoteException
    {
        fm1.a(e1, 0x43eea0, getContext().getPackageName(), wG, eL());
    }

    public void b(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((ek)eM()).b(new g(d1));
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
            ((ek)eM()).a(new e(d1), i);
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

        fq.a(flag, String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    protected String bg()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public int dv()
    {
        int i;
        try
        {
            i = ((ek)eM()).dv();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int dw()
    {
        int i;
        try
        {
            i = ((ek)eM()).dw();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    protected IInterface r(IBinder ibinder)
    {
        return u(ibinder);
    }

    protected ek u(IBinder ibinder)
    {
        return ek.a.w(ibinder);
    }
}
