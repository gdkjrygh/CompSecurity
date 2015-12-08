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
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
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

    public static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public a()
        {
            super(AppStateManager.yH);
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

                final Status yJ;
                final c yP;

                public AppStateBuffer getStateBuffer()
                {
                    return new AppStateBuffer(null);
                }

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                yP = c1;
                yJ = status;
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
    public static final Scope SCOPE_APP_STATE;
    static final com.google.android.gms.common.api.Api.c yH;
    private static final com.google.android.gms.common.api.Api.b yI;

    private AppStateManager()
    {
    }

    public static ga a(GoogleApiClient googleapiclient)
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
        hm.b(flag, "GoogleApiClient parameter is required.");
        hm.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (ga)googleapiclient.a(yH);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public static PendingResult delete(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.b(new b(i) {

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

            public StateDeletedResult g(Status status)
            {
                return new StateDeletedResult(this, status) {

                    final Status yJ;
                    final _cls5 yM;

                    public int getStateKey()
                    {
                        return yM.yK;
                    }

                    public Status getStatus()
                    {
                        return yJ;
                    }

            
            {
                yM = _pcls5;
                yJ = status;
                super();
            }
                };
            }

            
            {
                yK = i;
                super();
            }
        });
    }

    private static StateResult e(Status status)
    {
        return new StateResult(status) {

            final Status yJ;

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
                return yJ;
            }

            public void release()
            {
            }

            
            {
                yJ = status;
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
        return a(googleapiclient).dV();
    }

    public static int getMaxStateSize(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient).dU();
    }

    public static PendingResult list(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c() {

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.a(this);
            }

        });
    }

    public static PendingResult load(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.a(new e(i) {

            final int yK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.b(this, yK);
            }

            
            {
                yK = i;
                super();
            }
        });
    }

    public static PendingResult resolve(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        return googleapiclient.b(new e(i, s, abyte0) {

            final int yK;
            final String yN;
            final byte yO[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.a(this, yK, yN, yO);
            }

            
            {
                yK = i;
                yN = s;
                yO = abyte0;
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
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.b(this);
            }

        });
    }

    public static void update(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        googleapiclient.b(new e(i, abyte0) {

            final int yK;
            final byte yL[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.a(null, yK, yL);
            }

            
            {
                yK = i;
                yL = abyte0;
                super();
            }
        });
    }

    public static PendingResult updateImmediate(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        return googleapiclient.b(new e(i, abyte0) {

            final int yK;
            final byte yL[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ga)a1);
            }

            protected void a(ga ga1)
            {
                ga1.a(this, yK, yL);
            }

            
            {
                yK = i;
                yL = abyte0;
                super();
            }
        });
    }

    static 
    {
        yH = new com.google.android.gms.common.api.Api.c();
        yI = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return b(context, looper, gy1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ga b(Context context, Looper looper, gy gy1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new ga(context, looper, connectioncallbacks, onconnectionfailedlistener, gy1.fj(), (String[])gy1.fl().toArray(new String[0]));
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        API = new Api(yI, yH, new Scope[] {
            SCOPE_APP_STATE
        });
    }
}
