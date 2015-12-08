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
//            lu, lz

public class mn
    implements SessionsApi
{
    private static class a extends mb.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(SessionReadResult sessionreadresult)
            throws RemoteException
        {
            Ea.b(sessionreadresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }

    }

    private static class b extends mc.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(SessionStopResult sessionstopresult)
        {
            Ea.b(sessionstopresult);
        }

        private b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }

    }


    public mn()
    {
    }

    private PendingResult a(final GoogleApiClient final_googleapiclient, String s, String s1)
    {
        return final_googleapiclient.b(new lu.a(s, s1) {

            final mn Vw;
            final String Vx;
            final String val$name;

            protected SessionStopResult A(Status status)
            {
                return SessionStopResult.H(status);
            }

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                b b1 = new b(this);
                String s2 = lu1.getContext().getPackageName();
                lu1.jM().a((new com.google.android.gms.fitness.request.y.a()).bx(name).by(Vx).kl(), b1, s2);
            }

            protected Result c(Status status)
            {
                return A(status);
            }

            
            {
                Vw = mn.this;
                name = s;
                Vx = s1;
                super(final_googleapiclient);
            }
        });
    }

    public PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest)
    {
        return googleapiclient.a(new lu.c(googleapiclient, sessioninsertrequest) {

            final mn Vw;
            final SessionInsertRequest Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vy, b1, s);
            }

            
            {
                Vw = mn.this;
                Vy = sessioninsertrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
    {
        return googleapiclient.a(new lu.a(googleapiclient, sessionreadrequest) {

            final mn Vw;
            final SessionReadRequest Vz;

            protected SessionReadResult B(Status status)
            {
                return SessionReadResult.G(status);
            }

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vz, a1, s);
            }

            protected Result c(Status status)
            {
                return B(status);
            }

            
            {
                Vw = mn.this;
                Vz = sessionreadrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new lu.c(googleapiclient, pendingintent) {

            final PendingIntent VA;
            final mn Vw;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                u u1 = new u(VA);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(u1, b1, s);
            }

            
            {
                Vw = mn.this;
                VA = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult startSession(GoogleApiClient googleapiclient, Session session)
    {
        return googleapiclient.b(new lu.c(googleapiclient, session) {

            final Session Vv;
            final mn Vw;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a((new com.google.android.gms.fitness.request.w.a()).b(Vv).kk(), b1, s);
            }

            
            {
                Vw = mn.this;
                Vv = session;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopSession(GoogleApiClient googleapiclient, String s)
    {
        return a(googleapiclient, null, s);
    }

    public PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new lu.c(googleapiclient, pendingintent) {

            final PendingIntent VA;
            final mn Vw;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                aa aa1 = new aa(VA);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(aa1, b1, s);
            }

            
            {
                Vw = mn.this;
                VA = pendingintent;
                super(googleapiclient);
            }
        });
    }
}
