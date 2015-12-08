// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.internal.i;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public class PlusClient
    implements GooglePlayServicesClient
{
    public static class Builder
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks TQ;
        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener TR;
        private final i TS;
        private final Context mContext;

        public PlusClient build()
        {
            return new PlusClient(new e(mContext, TQ, TR, TS.iZ()));
        }

        public Builder clearScopes()
        {
            TS.iY();
            return this;
        }

        public Builder setAccountName(String s)
        {
            TS.bh(s);
            return this;
        }

        public transient Builder setActions(String as[])
        {
            TS.f(as);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            TS.e(as);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            TQ = connectioncallbacks;
            TR = onconnectionfailedlistener;
            TS = new i(mContext);
        }
    }

    public static interface OnAccessRevokedListener
    {

        public abstract void onAccessRevoked(ConnectionResult connectionresult);
    }

    public static interface OnMomentsLoadedListener
    {

        public abstract void onMomentsLoaded(ConnectionResult connectionresult, MomentBuffer momentbuffer, String s, String s1);
    }

    public static interface OnPeopleLoadedListener
    {

        public abstract void onPeopleLoaded(ConnectionResult connectionresult, PersonBuffer personbuffer, String s);
    }

    public static interface OrderBy
    {

        public static final int ALPHABETICAL = 0;
        public static final int BEST = 1;
    }


    final e TL;

    PlusClient(e e1)
    {
        TL = e1;
    }

    public void clearDefaultAccount()
    {
        TL.clearDefaultAccount();
    }

    public void connect()
    {
        TL.connect();
    }

    public void disconnect()
    {
        TL.disconnect();
    }

    public String getAccountName()
    {
        return TL.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return TL.getCurrentPerson();
    }

    e iI()
    {
        return TL;
    }

    public boolean isConnected()
    {
        return TL.isConnected();
    }

    public boolean isConnecting()
    {
        return TL.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return TL.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return TL.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        TL.l(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener TM;
            final PlusClient TN;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                TM.onMomentsLoaded(loadmomentsresult.getStatus().eq(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public void b(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TM = onmomentsloadedlistener;
                super();
            }
        });
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        TL.a(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener TM;
            final PlusClient TN;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                TM.onMomentsLoaded(loadmomentsresult.getStatus().eq(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public void b(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TM = onmomentsloadedlistener;
                super();
            }
        }, i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        TL.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient TN;
            final OnPeopleLoadedListener TO;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                TO.onPeopleLoaded(loadpeopleresult.getStatus().eq(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TO = onpeopleloadedlistener;
                super();
            }
        }, collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        TL.d(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient TN;
            final OnPeopleLoadedListener TO;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                TO.onPeopleLoaded(loadpeopleresult.getStatus().eq(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TO = onpeopleloadedlistener;
                super();
            }
        }, as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        TL.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient TN;
            final OnPeopleLoadedListener TO;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                TO.onPeopleLoaded(loadpeopleresult.getStatus().eq(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TO = onpeopleloadedlistener;
                super();
            }
        }, i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        TL.o(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient TN;
            final OnPeopleLoadedListener TO;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                TO.onPeopleLoaded(loadpeopleresult.getStatus().eq(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                TN = PlusClient.this;
                TO = onpeopleloadedlistener;
                super();
            }
        }, s);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        TL.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        TL.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        TL.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        TL.n(new com.google.android.gms.common.api.a.d(onaccessrevokedlistener) {

            final PlusClient TN;
            final OnAccessRevokedListener TP;

            public void Y(Status status)
            {
                TP.onAccessRevoked(status.getStatus().eq());
            }

            public void b(Object obj)
            {
                Y((Status)obj);
            }

            
            {
                TN = PlusClient.this;
                TP = onaccessrevokedlistener;
                super();
            }
        });
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        TL.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        TL.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        TL.a(null, moment);
    }
}
