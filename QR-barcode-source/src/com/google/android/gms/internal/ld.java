// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.aa;
import com.google.android.gms.fitness.request.u;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

// Referenced classes of package com.google.android.gms.internal:
//            kk, kp

public class ld
    implements SessionsApi
{
    private static class a extends kr.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(SessionReadResult sessionreadresult)
            throws RemoteException
        {
            De.b(sessionreadresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }

    }

    private static class b extends ks.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(SessionStopResult sessionstopresult)
        {
            De.b(sessionstopresult);
        }

        private b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }

    }


    public ld()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, final String name, String s)
    {
        return googleapiclient.b(new kk.a(s) {

            final ld TZ;
            final String Ua;
            final String val$name;

            protected SessionStopResult B(Status status)
            {
                return SessionStopResult.I(status);
            }

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                b b1 = new b(this);
                String s1 = kk1.getContext().getPackageName();
                kk1.jb().a((new com.google.android.gms.fitness.request.y.a()).bu(name).bv(Ua).jB(), b1, s1);
            }

            protected Result c(Status status)
            {
                return B(status);
            }

            
            {
                TZ = ld.this;
                name = s;
                Ua = s1;
                super();
            }
        });
    }

    public PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest)
    {
        return googleapiclient.a(new kk.c(sessioninsertrequest) {

            final ld TZ;
            final SessionInsertRequest Ub;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(Ub, b1, s);
            }

            
            {
                TZ = ld.this;
                Ub = sessioninsertrequest;
                super();
            }
        });
    }

    public PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
    {
        return googleapiclient.a(new kk.a(sessionreadrequest) {

            final ld TZ;
            final SessionReadRequest Uc;

            protected SessionReadResult C(Status status)
            {
                return SessionReadResult.H(status);
            }

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(Uc, a1, s);
            }

            protected Result c(Status status)
            {
                return C(status);
            }

            
            {
                TZ = ld.this;
                Uc = sessionreadrequest;
                super();
            }
        });
    }

    public PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new kk.c(pendingintent) {

            final ld TZ;
            final PendingIntent Ud;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                u u1 = new u(Ud);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(u1, b1, s);
            }

            
            {
                TZ = ld.this;
                Ud = pendingintent;
                super();
            }
        });
    }

    public PendingResult startSession(GoogleApiClient googleapiclient, Session session)
    {
        return googleapiclient.b(new kk.c(session) {

            final Session TY;
            final ld TZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a((new com.google.android.gms.fitness.request.w.a()).b(TY).jA(), b1, s);
            }

            
            {
                TZ = ld.this;
                TY = session;
                super();
            }
        });
    }

    public PendingResult stopSession(GoogleApiClient googleapiclient, String s)
    {
        return a(googleapiclient, null, s);
    }

    public PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new kk.c(pendingintent) {

            final ld TZ;
            final PendingIntent Ud;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                aa aa1 = new aa(Ud);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(aa1, b1, s);
            }

            
            {
                TZ = ld.this;
                Ud = pendingintent;
                super();
            }
        });
    }
}
