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

        private final i abA;
        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks aby;
        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener abz;
        private final Context mContext;

        public PlusClient build()
        {
            return new PlusClient(new e(mContext, aby, abz, abA.kj()));
        }

        public Builder clearScopes()
        {
            abA.ki();
            return this;
        }

        public Builder setAccountName(String s)
        {
            abA.bz(s);
            return this;
        }

        public transient Builder setActions(String as[])
        {
            abA.f(as);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            abA.e(as);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            aby = connectioncallbacks;
            abz = onconnectionfailedlistener;
            abA = new i(mContext);
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


    final e abt;

    PlusClient(e e1)
    {
        abt = e1;
    }

    public void clearDefaultAccount()
    {
        abt.clearDefaultAccount();
    }

    public void connect()
    {
        abt.connect();
    }

    public void disconnect()
    {
        abt.disconnect();
    }

    public String getAccountName()
    {
        return abt.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return abt.getCurrentPerson();
    }

    public boolean isConnected()
    {
        return abt.isConnected();
    }

    public boolean isConnecting()
    {
        return abt.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return abt.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return abt.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    e jS()
    {
        return abt;
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        abt.k(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener abu;
            final PlusClient abv;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                abu.onMomentsLoaded(loadmomentsresult.getStatus().eR(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public volatile void a(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abu = onmomentsloadedlistener;
                super();
            }
        });
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        abt.a(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener abu;
            final PlusClient abv;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                abu.onMomentsLoaded(loadmomentsresult.getStatus().eR(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public volatile void a(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abu = onmomentsloadedlistener;
                super();
            }
        }, i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        abt.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abv;
            final OnPeopleLoadedListener abw;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abw.onPeopleLoaded(loadpeopleresult.getStatus().eR(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abw = onpeopleloadedlistener;
                super();
            }
        }, collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        abt.d(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abv;
            final OnPeopleLoadedListener abw;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abw.onPeopleLoaded(loadpeopleresult.getStatus().eR(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abw = onpeopleloadedlistener;
                super();
            }
        }, as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        abt.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abv;
            final OnPeopleLoadedListener abw;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abw.onPeopleLoaded(loadpeopleresult.getStatus().eR(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abw = onpeopleloadedlistener;
                super();
            }
        }, i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        abt.r(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abv;
            final OnPeopleLoadedListener abw;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abw.onPeopleLoaded(loadpeopleresult.getStatus().eR(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abv = PlusClient.this;
                abw = onpeopleloadedlistener;
                super();
            }
        }, s);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        abt.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        abt.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        abt.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        abt.m(new com.google.android.gms.common.api.a.d(onaccessrevokedlistener) {

            final PlusClient abv;
            final OnAccessRevokedListener abx;

            public void a(Object obj)
            {
                al((Status)obj);
            }

            public void al(Status status)
            {
                abx.onAccessRevoked(status.getStatus().eR());
            }

            
            {
                abv = PlusClient.this;
                abx = onaccessrevokedlistener;
                super();
            }
        });
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        abt.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        abt.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        abt.a(null, moment);
    }
}
