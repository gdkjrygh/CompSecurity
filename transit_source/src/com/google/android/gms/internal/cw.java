// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.OnSignOutCompleteListener;
import com.google.android.gms.appstate.OnStateDeletedListener;
import com.google.android.gms.appstate.OnStateListLoadedListener;
import com.google.android.gms.appstate.OnStateLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            de, dm, cy, dj, 
//            cv

public final class cw extends de
{
    final class a extends cv
    {

        private final OnStateDeletedListener iA;
        final cw iB;

        public void onStateDeleted(int i, int j)
        {
            iB.a(iB. new b(iA, i, j));
        }

        public a(OnStateDeletedListener onstatedeletedlistener)
        {
            iB = cw.this;
            super();
            iA = (OnStateDeletedListener)dm.a(onstatedeletedlistener, "Listener must not be null");
        }
    }

    final class b extends de.b
    {

        final cw iB;
        private final int iC;
        private final int iD;

        public void a(OnStateDeletedListener onstatedeletedlistener)
        {
            onstatedeletedlistener.onStateDeleted(iC, iD);
        }

        public volatile void a(Object obj)
        {
            a((OnStateDeletedListener)obj);
        }

        protected void aF()
        {
        }

        public b(OnStateDeletedListener onstatedeletedlistener, int i, int j)
        {
            iB = cw.this;
            super(cw.this, onstatedeletedlistener);
            iC = i;
            iD = j;
        }
    }

    final class c extends cv
    {

        final cw iB;
        private final OnStateListLoadedListener iE;

        public void a(com.google.android.gms.common.data.d d1)
        {
            iB.a(iB. new d(iE, d1));
        }

        public c(OnStateListLoadedListener onstatelistloadedlistener)
        {
            iB = cw.this;
            super();
            iE = (OnStateListLoadedListener)dm.a(onstatelistloadedlistener, "Listener must not be null");
        }
    }

    final class d extends de.c
    {

        final cw iB;

        public void a(OnStateListLoadedListener onstatelistloadedlistener, com.google.android.gms.common.data.d d1)
        {
            onstatelistloadedlistener.onStateListLoaded(d1.getStatusCode(), new AppStateBuffer(d1));
        }

        public volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnStateListLoadedListener)obj, d1);
        }

        public d(OnStateListLoadedListener onstatelistloadedlistener, com.google.android.gms.common.data.d d1)
        {
            iB = cw.this;
            super(cw.this, onstatelistloadedlistener, d1);
        }
    }

    final class e extends cv
    {

        final cw iB;
        private final OnStateLoadedListener iF;

        public void a(int i, com.google.android.gms.common.data.d d1)
        {
            iB.a(iB. new f(iF, i, d1));
        }

        public e(OnStateLoadedListener onstateloadedlistener)
        {
            iB = cw.this;
            super();
            iF = (OnStateLoadedListener)dm.a(onstateloadedlistener, "Listener must not be null");
        }
    }

    final class f extends de.c
    {

        final cw iB;
        private final int iD;

        public void a(OnStateLoadedListener onstateloadedlistener, com.google.android.gms.common.data.d d1)
        {
            byte abyte0[];
            AppStateBuffer appstatebuffer;
            abyte0 = null;
            appstatebuffer = new AppStateBuffer(d1);
            if (appstatebuffer.getCount() <= 0) goto _L2; else goto _L1
_L1:
            byte abyte1[];
            String s;
            abyte0 = appstatebuffer.get(0);
            s = abyte0.getConflictVersion();
            abyte1 = abyte0.getLocalData();
            abyte0 = abyte0.getConflictData();
_L4:
            appstatebuffer.close();
            int i = d1.getStatusCode();
            if (i == 2000)
            {
                onstateloadedlistener.onStateConflict(iD, s, abyte1, abyte0);
                return;
            } else
            {
                onstateloadedlistener.onStateLoaded(i, iD, abyte1);
                return;
            }
            onstateloadedlistener;
            appstatebuffer.close();
            throw onstateloadedlistener;
_L2:
            abyte1 = null;
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnStateLoadedListener)obj, d1);
        }

        public f(OnStateLoadedListener onstateloadedlistener, int i, com.google.android.gms.common.data.d d1)
        {
            iB = cw.this;
            super(cw.this, onstateloadedlistener, d1);
            iD = i;
        }
    }

    final class g extends cv
    {

        final cw iB;
        private final OnSignOutCompleteListener iG;

        public void onSignOutComplete()
        {
            iB.a(iB. new h(iG));
        }

        public g(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            iB = cw.this;
            super();
            iG = (OnSignOutCompleteListener)dm.a(onsignoutcompletelistener, "Listener must not be null");
        }
    }

    final class h extends de.b
    {

        final cw iB;

        public void a(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            onsignoutcompletelistener.onSignOutComplete();
        }

        public volatile void a(Object obj)
        {
            a((OnSignOutCompleteListener)obj);
        }

        protected void aF()
        {
        }

        public h(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            iB = cw.this;
            super(cw.this, onsignoutcompletelistener);
        }
    }


    private final String it;

    public cw(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, as);
        it = (String)dm.e(s);
    }

    public void a(OnStateLoadedListener onstateloadedlistener, int i, byte abyte0[])
    {
        if (onstateloadedlistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        onstateloadedlistener = null;
_L1:
        try
        {
            ((cy)bd()).a(onstateloadedlistener, i, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStateLoadedListener onstateloadedlistener)
        {
            Log.w("AppStateClient", "service died");
        }
        break MISSING_BLOCK_LABEL_44;
        onstateloadedlistener = new e(onstateloadedlistener);
          goto _L1
    }

    protected void a(dj dj1, de.d d1)
        throws RemoteException
    {
        dj1.a(d1, 0x3d8024, getContext().getPackageName(), it, aY());
    }

    protected transient void a(String as[])
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

        dm.a(flag, String.format("AppStateClient requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    protected String ag()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public void deleteState(OnStateDeletedListener onstatedeletedlistener, int i)
    {
        try
        {
            ((cy)bd()).b(new a(onstatedeletedlistener), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStateDeletedListener onstatedeletedlistener)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public int getMaxNumKeys()
    {
        int i;
        try
        {
            i = ((cy)bd()).getMaxNumKeys();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int getMaxStateSize()
    {
        int i;
        try
        {
            i = ((cy)bd()).getMaxStateSize();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public void listStates(OnStateListLoadedListener onstatelistloadedlistener)
    {
        try
        {
            ((cy)bd()).a(new c(onstatelistloadedlistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStateListLoadedListener onstatelistloadedlistener)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void loadState(OnStateLoadedListener onstateloadedlistener, int i)
    {
        try
        {
            ((cy)bd()).a(new e(onstateloadedlistener), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStateLoadedListener onstateloadedlistener)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    protected IInterface p(IBinder ibinder)
    {
        return r(ibinder);
    }

    protected cy r(IBinder ibinder)
    {
        return cy.a.t(ibinder);
    }

    public void resolveState(OnStateLoadedListener onstateloadedlistener, int i, String s, byte abyte0[])
    {
        try
        {
            ((cy)bd()).a(new e(onstateloadedlistener), i, s, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStateLoadedListener onstateloadedlistener)
        {
            Log.w("AppStateClient", "service died");
        }
    }

    public void signOut(OnSignOutCompleteListener onsignoutcompletelistener)
    {
        if (onsignoutcompletelistener != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        onsignoutcompletelistener = null;
_L1:
        try
        {
            ((cy)bd()).b(onsignoutcompletelistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnSignOutCompleteListener onsignoutcompletelistener)
        {
            Log.w("AppStateClient", "service died");
        }
        break MISSING_BLOCK_LABEL_42;
        onsignoutcompletelistener = new g(onsignoutcompletelistener);
          goto _L1
    }
}
