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

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks ali;
        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener alj;
        private final i alk;
        private final Context mContext;

        public PlusClient build()
        {
            return new PlusClient(new e(mContext, ali, alj, alk.nq()));
        }

        public Builder clearScopes()
        {
            alk.np();
            return this;
        }

        public Builder setAccountName(String s)
        {
            alk.ch(s);
            return this;
        }

        public transient Builder setActions(String as[])
        {
            alk.h(as);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            alk.g(as);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            ali = connectioncallbacks;
            alj = onconnectionfailedlistener;
            alk = new i(mContext);
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


    final e ald;

    PlusClient(e e1)
    {
        ald = e1;
    }

    public void clearDefaultAccount()
    {
        ald.clearDefaultAccount();
    }

    public void connect()
    {
        ald.connect();
    }

    public void disconnect()
    {
        ald.disconnect();
    }

    public String getAccountName()
    {
        return ald.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return ald.getCurrentPerson();
    }

    public boolean isConnected()
    {
        return ald.isConnected();
    }

    public boolean isConnecting()
    {
        return ald.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return ald.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return ald.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        ald.k(new com.google.android.gms.common.api.BaseImplementation.b(onmomentsloadedlistener) {

            final OnMomentsLoadedListener ale;
            final PlusClient alf;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                ale.onMomentsLoaded(loadmomentsresult.getStatus().gt(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public void b(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                alf = PlusClient.this;
                ale = onmomentsloadedlistener;
                super();
            }
        });
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        ald.a(new com.google.android.gms.common.api.BaseImplementation.b(onmomentsloadedlistener) {

            final OnMomentsLoadedListener ale;
            final PlusClient alf;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                ale.onMomentsLoaded(loadmomentsresult.getStatus().gt(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public void b(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                alf = PlusClient.this;
                ale = onmomentsloadedlistener;
                super();
            }
        }, i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        ald.a(new com.google.android.gms.common.api.BaseImplementation.b(onpeopleloadedlistener) {

            final PlusClient alf;
            final OnPeopleLoadedListener alg;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                alg.onPeopleLoaded(loadpeopleresult.getStatus().gt(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                alf = PlusClient.this;
                alg = onpeopleloadedlistener;
                super();
            }
        }, collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        ald.d(new com.google.android.gms.common.api.BaseImplementation.b(onpeopleloadedlistener) {

            final PlusClient alf;
            final OnPeopleLoadedListener alg;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                alg.onPeopleLoaded(loadpeopleresult.getStatus().gt(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                alf = PlusClient.this;
                alg = onpeopleloadedlistener;
                super();
            }
        }, as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        ald.a(new com.google.android.gms.common.api.BaseImplementation.b(onpeopleloadedlistener) {

            final PlusClient alf;
            final OnPeopleLoadedListener alg;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                alg.onPeopleLoaded(loadpeopleresult.getStatus().gt(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                alf = PlusClient.this;
                alg = onpeopleloadedlistener;
                super();
            }
        }, i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        ald.r(new com.google.android.gms.common.api.BaseImplementation.b(onpeopleloadedlistener) {

            final PlusClient alf;
            final OnPeopleLoadedListener alg;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                alg.onPeopleLoaded(loadpeopleresult.getStatus().gt(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public void b(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                alf = PlusClient.this;
                alg = onpeopleloadedlistener;
                super();
            }
        }, s);
    }

    e mZ()
    {
        return ald;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ald.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ald.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        ald.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        ald.m(new com.google.android.gms.common.api.BaseImplementation.b(onaccessrevokedlistener) {

            final PlusClient alf;
            final OnAccessRevokedListener alh;

            public void aA(Status status)
            {
                alh.onAccessRevoked(status.getStatus().gt());
            }

            public void b(Object obj)
            {
                aA((Status)obj);
            }

            
            {
                alf = PlusClient.this;
                alh = onaccessrevokedlistener;
                super();
            }
        });
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ald.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ald.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        ald.a(null, moment);
    }
}
