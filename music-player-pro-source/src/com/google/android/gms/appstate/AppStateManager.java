// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateBuffer

public final class AppStateManager
{
    public static interface StateConflictResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract String getResolvedVersion();

        public abstract byte[] getServerData();

        public abstract int getStateKey();
    }

    public static interface StateDeletedResult
        extends Result
    {

        public abstract int getStateKey();
    }

    public static interface StateListResult
        extends Result
    {

        public abstract AppStateBuffer getStateBuffer();
    }

    public static interface StateLoadedResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract int getStateKey();
    }

    public static interface StateResult
        extends Releasable, Result
    {

        public abstract StateConflictResult getConflictResult();

        public abstract StateLoadedResult getLoadedResult();
    }

    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(AppStateManager.DQ, googleapiclient);
        }
    }

    private static abstract class b extends a
    {

        b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class c extends a
    {

        public Result c(Status status)
        {
            return g(status);
        }

        public StateListResult g(Status status)
        {
            return new StateListResult(this, status) {

                final Status DS;
                final c DY;

                public AppStateBuffer getStateBuffer()
                {
                    return new AppStateBuffer(null);
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                DY = c1;
                DS = status;
                super();
            }
            };
        }

        public c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class d extends a
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        public d(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class e extends a
    {

        public Result c(Status status)
        {
            return h(status);
        }

        public StateResult h(Status status)
        {
            return AppStateManager.e(status);
        }

        public e(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public static final Api API;
    static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static final Scope SCOPE_APP_STATE;

    private AppStateManager()
    {
    }

    public static ib a(GoogleApiClient googleapiclient)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "GoogleApiClient parameter is required.");
        jx.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (ib)googleapiclient.a(DQ);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    private static StateResult d(Status status)
    {
        return new StateResult(status) {

            final Status DS;

            public StateConflictResult getConflictResult()
            {
                return null;
            }

            public StateLoadedResult getLoadedResult()
            {
                return null;
            }

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                DS = status;
                super();
            }
        };
    }

    public static PendingResult delete(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.b(new b(googleapiclient, i) {

            final int DT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, DT);
            }

            public Result c(Status status)
            {
                return f(status);
            }

            public StateDeletedResult f(Status status)
            {
                return new StateDeletedResult(this, status) {

                    final Status DS;
                    final _cls5 DV;

                    public int getStateKey()
                    {
                        return DV.DT;
                    }

                    public Status getStatus()
                    {
                        return DS;
                    }

            
            {
                DV = _pcls5;
                DS = status;
                super();
            }
                };
            }

            
            {
                DT = i;
                super(googleapiclient);
            }
        });
    }

    static StateResult e(Status status)
    {
        return d(status);
    }

    public static int getMaxNumKeys(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient).fM();
    }

    public static int getMaxStateSize(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient).fL();
    }

    public static PendingResult list(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c(googleapiclient) {

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this);
            }

        });
    }

    public static PendingResult load(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.a(new e(googleapiclient, i) {

            final int DT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.b(this, DT);
            }

            
            {
                DT = i;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult resolve(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        return googleapiclient.b(new e(googleapiclient, i, s, abyte0) {

            final int DT;
            final String DW;
            final byte DX[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, DT, DW, DX);
            }

            
            {
                DT = i;
                DW = s;
                DX = abyte0;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new d(googleapiclient) {

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.b(this);
            }

        });
    }

    public static void update(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        googleapiclient.b(new e(googleapiclient, i, abyte0) {

            final int DT;
            final byte DU[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(null, DT, DU);
            }

            
            {
                DT = i;
                DU = abyte0;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult updateImmediate(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        return googleapiclient.b(new e(googleapiclient, i, abyte0) {

            final int DT;
            final byte DU[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, DT, DU);
            }

            
            {
                DT = i;
                DU = abyte0;
                super(googleapiclient);
            }
        });
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return b(context, looper, jg1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ib b(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new ib(context, looper, connectioncallbacks, onconnectionfailedlistener, jg1.hm(), (String[])jg1.ho().toArray(new String[0]));
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        API = new Api(DR, DQ, new Scope[] {
            SCOPE_APP_STATE
        });
    }
}
