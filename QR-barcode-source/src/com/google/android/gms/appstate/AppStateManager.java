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
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.ib;
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

        public a()
        {
            super(AppStateManager.CU);
        }
    }

    private static abstract class b extends a
    {

        private b()
        {
        }

    }

    private static abstract class c extends a
    {

        public Result c(Status status)
        {
            return h(status);
        }

        public StateListResult h(Status status)
        {
            return new StateListResult(this, status) {

                final Status CW;
                final c Dc;

                public AppStateBuffer getStateBuffer()
                {
                    return new AppStateBuffer(null);
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                Dc = c1;
                CW = status;
                super();
            }
            };
        }

        private c()
        {
        }

    }

    private static abstract class d extends a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private d()
        {
        }

    }

    private static abstract class e extends a
    {

        public Result c(Status status)
        {
            return i(status);
        }

        public StateResult i(Status status)
        {
            return AppStateManager.f(status);
        }

        private e()
        {
        }

    }


    public static final Api API;
    static final com.google.android.gms.common.api.Api.c CU;
    private static final com.google.android.gms.common.api.Api.b CV;
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
        o.b(flag, "GoogleApiClient parameter is required.");
        o.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (ib)googleapiclient.a(CU);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public static PendingResult delete(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.b(new b(i) {

            final int CX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, CX);
            }

            public Result c(Status status)
            {
                return g(status);
            }

            public StateDeletedResult g(Status status)
            {
                return new StateDeletedResult(this, status) {

                    final Status CW;
                    final _cls5 CZ;

                    public int getStateKey()
                    {
                        return CZ.CX;
                    }

                    public Status getStatus()
                    {
                        return CW;
                    }

            
            {
                CZ = _pcls5;
                CW = status;
                super();
            }
                };
            }

            
            {
                CX = i;
                super();
            }
        });
    }

    private static StateResult e(Status status)
    {
        return new StateResult(status) {

            final Status CW;

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
                return CW;
            }

            public void release()
            {
            }

            
            {
                CW = status;
                super();
            }
        };
    }

    static StateResult f(Status status)
    {
        return e(status);
    }

    public static int getMaxNumKeys(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient).fr();
    }

    public static int getMaxStateSize(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient).fq();
    }

    public static PendingResult list(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c() {

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
        return googleapiclient.a(new e(i) {

            final int CX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.b(this, CX);
            }

            
            {
                CX = i;
                super();
            }
        });
    }

    public static PendingResult resolve(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        return googleapiclient.b(new e(i, s, abyte0) {

            final int CX;
            final String Da;
            final byte Db[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, CX, Da, Db);
            }

            
            {
                CX = i;
                Da = s;
                Db = abyte0;
                super();
            }
        });
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new d() {

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
        googleapiclient.b(new e(i, abyte0) {

            final int CX;
            final byte CY[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(null, CX, CY);
            }

            
            {
                CX = i;
                CY = abyte0;
                super();
            }
        });
    }

    public static PendingResult updateImmediate(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        return googleapiclient.b(new e(i, abyte0) {

            final int CX;
            final byte CY[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ib)a1);
            }

            protected void a(ib ib1)
            {
                ib1.a(this, CX, CY);
            }

            
            {
                CX = i;
                CY = abyte0;
                super();
            }
        });
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        CV = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return b(context, looper, clientsettings, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ib b(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new ib(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings.getAccountNameOrDefault(), (String[])clientsettings.getScopes().toArray(new String[0]));
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        API = new Api(CV, CU, new Scope[] {
            SCOPE_APP_STATE
        });
    }
}
