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

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks abv;
        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener abw;
        private final i abx;
        private final Context mContext;

        public PlusClient build()
        {
            return new PlusClient(new e(mContext, abv, abw, abx.ke()));
        }

        public Builder clearScopes()
        {
            abx.kd();
            return this;
        }

        public Builder setAccountName(String s)
        {
            abx.bz(s);
            return this;
        }

        public transient Builder setActions(String as[])
        {
            abx.f(as);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            abx.e(as);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            abv = connectioncallbacks;
            abw = onconnectionfailedlistener;
            abx = new i(mContext);
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


    final e abq;

    PlusClient(e e1)
    {
        abq = e1;
    }

    public void clearDefaultAccount()
    {
        abq.clearDefaultAccount();
    }

    public void connect()
    {
        abq.connect();
    }

    public void disconnect()
    {
        abq.disconnect();
    }

    public String getAccountName()
    {
        return abq.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return abq.getCurrentPerson();
    }

    public boolean isConnected()
    {
        return abq.isConnected();
    }

    public boolean isConnecting()
    {
        return abq.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return abq.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return abq.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    e jN()
    {
        return abq;
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        abq.k(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener abr;
            final PlusClient abs;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                abr.onMomentsLoaded(loadmomentsresult.getStatus().eM(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public volatile void a(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abr = onmomentsloadedlistener;
                super();
            }
        });
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        abq.a(new com.google.android.gms.common.api.a.d(onmomentsloadedlistener) {

            final OnMomentsLoadedListener abr;
            final PlusClient abs;

            public void a(Moments.LoadMomentsResult loadmomentsresult)
            {
                abr.onMomentsLoaded(loadmomentsresult.getStatus().eM(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
            }

            public volatile void a(Object obj)
            {
                a((Moments.LoadMomentsResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abr = onmomentsloadedlistener;
                super();
            }
        }, i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        abq.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abs;
            final OnPeopleLoadedListener abt;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abt.onPeopleLoaded(loadpeopleresult.getStatus().eM(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abt = onpeopleloadedlistener;
                super();
            }
        }, collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        abq.d(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abs;
            final OnPeopleLoadedListener abt;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abt.onPeopleLoaded(loadpeopleresult.getStatus().eM(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abt = onpeopleloadedlistener;
                super();
            }
        }, as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        abq.a(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abs;
            final OnPeopleLoadedListener abt;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abt.onPeopleLoaded(loadpeopleresult.getStatus().eM(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abt = onpeopleloadedlistener;
                super();
            }
        }, i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        abq.r(new com.google.android.gms.common.api.a.d(onpeopleloadedlistener) {

            final PlusClient abs;
            final OnPeopleLoadedListener abt;

            public void a(People.LoadPeopleResult loadpeopleresult)
            {
                abt.onPeopleLoaded(loadpeopleresult.getStatus().eM(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
            }

            public volatile void a(Object obj)
            {
                a((People.LoadPeopleResult)obj);
            }

            
            {
                abs = PlusClient.this;
                abt = onpeopleloadedlistener;
                super();
            }
        }, s);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        abq.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        abq.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        abq.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        abq.m(new com.google.android.gms.common.api.a.d(onaccessrevokedlistener) {

            final PlusClient abs;
            final OnAccessRevokedListener abu;

            public void a(Object obj)
            {
                al((Status)obj);
            }

            public void al(Status status)
            {
                abu.onAccessRevoked(status.getStatus().eM());
            }

            
            {
                abs = PlusClient.this;
                abu = onaccessrevokedlistener;
                super();
            }
        });
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        abq.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        abq.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        abq.a(null, moment);
    }
}
