// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public class PlusClient
    implements GooglePlayServicesClient
{

    final e ant;

    public void clearDefaultAccount()
    {
        ant.clearDefaultAccount();
    }

    public void connect()
    {
        ant.connect();
    }

    public void disconnect()
    {
        ant.disconnect();
    }

    public String getAccountName()
    {
        return ant.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return ant.getCurrentPerson();
    }

    public boolean isConnected()
    {
        return ant.isConnected();
    }

    public boolean isConnecting()
    {
        return ant.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return ant.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return ant.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        ant.j(new _cls1(onmomentsloadedlistener));
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        ant.a(new _cls2(onmomentsloadedlistener), i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        ant.a(new _cls5(onpeopleloadedlistener), collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        ant.d(new _cls6(onpeopleloadedlistener), as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        ant.a(new _cls3(onpeopleloadedlistener), i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        ant.q(new _cls4(onpeopleloadedlistener), s);
    }

    e os()
    {
        return ant;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ant.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ant.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        ant.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        ant.l(new _cls7(onaccessrevokedlistener));
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ant.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ant.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        ant.a(null, moment);
    }

    private class _cls1
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final OnMomentsLoadedListener anu;
        final PlusClient anv;

        public void a(Moments.LoadMomentsResult loadmomentsresult)
        {
            anu.onMomentsLoaded(loadmomentsresult.getStatus().gQ(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
        }

        public void b(Object obj)
        {
            a((Moments.LoadMomentsResult)obj);
        }

        _cls1(OnMomentsLoadedListener onmomentsloadedlistener)
        {
            anv = PlusClient.this;
            anu = onmomentsloadedlistener;
            super();
        }

        private class OnMomentsLoadedListener
        {

            public abstract void onMomentsLoaded(ConnectionResult connectionresult, MomentBuffer momentbuffer, String s, String s1);
        }

    }


    private class _cls2
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final OnMomentsLoadedListener anu;
        final PlusClient anv;

        public void a(Moments.LoadMomentsResult loadmomentsresult)
        {
            anu.onMomentsLoaded(loadmomentsresult.getStatus().gQ(), loadmomentsresult.getMomentBuffer(), loadmomentsresult.getNextPageToken(), loadmomentsresult.getUpdated());
        }

        public void b(Object obj)
        {
            a((Moments.LoadMomentsResult)obj);
        }

        _cls2(OnMomentsLoadedListener onmomentsloadedlistener)
        {
            anv = PlusClient.this;
            anu = onmomentsloadedlistener;
            super();
        }
    }


    private class _cls5
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final PlusClient anv;
        final OnPeopleLoadedListener anw;

        public void a(People.LoadPeopleResult loadpeopleresult)
        {
            anw.onPeopleLoaded(loadpeopleresult.getStatus().gQ(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
        }

        public void b(Object obj)
        {
            a((People.LoadPeopleResult)obj);
        }

        _cls5(OnPeopleLoadedListener onpeopleloadedlistener)
        {
            anv = PlusClient.this;
            anw = onpeopleloadedlistener;
            super();
        }

        private class OnPeopleLoadedListener
        {

            public abstract void onPeopleLoaded(ConnectionResult connectionresult, PersonBuffer personbuffer, String s);
        }

    }


    private class _cls6
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final PlusClient anv;
        final OnPeopleLoadedListener anw;

        public void a(People.LoadPeopleResult loadpeopleresult)
        {
            anw.onPeopleLoaded(loadpeopleresult.getStatus().gQ(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
        }

        public void b(Object obj)
        {
            a((People.LoadPeopleResult)obj);
        }

        _cls6(OnPeopleLoadedListener onpeopleloadedlistener)
        {
            anv = PlusClient.this;
            anw = onpeopleloadedlistener;
            super();
        }
    }


    private class _cls3
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final PlusClient anv;
        final OnPeopleLoadedListener anw;

        public void a(People.LoadPeopleResult loadpeopleresult)
        {
            anw.onPeopleLoaded(loadpeopleresult.getStatus().gQ(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
        }

        public void b(Object obj)
        {
            a((People.LoadPeopleResult)obj);
        }

        _cls3(OnPeopleLoadedListener onpeopleloadedlistener)
        {
            anv = PlusClient.this;
            anw = onpeopleloadedlistener;
            super();
        }
    }


    private class _cls4
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final PlusClient anv;
        final OnPeopleLoadedListener anw;

        public void a(People.LoadPeopleResult loadpeopleresult)
        {
            anw.onPeopleLoaded(loadpeopleresult.getStatus().gQ(), loadpeopleresult.getPersonBuffer(), loadpeopleresult.getNextPageToken());
        }

        public void b(Object obj)
        {
            a((People.LoadPeopleResult)obj);
        }

        _cls4(OnPeopleLoadedListener onpeopleloadedlistener)
        {
            anv = PlusClient.this;
            anw = onpeopleloadedlistener;
            super();
        }
    }


    private class _cls7
        implements com.google.android.gms.common.api.BaseImplementation.b
    {

        final PlusClient anv;
        final OnAccessRevokedListener anx;

        public void az(Status status)
        {
            anx.onAccessRevoked(status.getStatus().gQ());
        }

        public void b(Object obj)
        {
            az((Status)obj);
        }

        _cls7(OnAccessRevokedListener onaccessrevokedlistener)
        {
            anv = PlusClient.this;
            anx = onaccessrevokedlistener;
            super();
        }

        private class OnAccessRevokedListener
        {

            public abstract void onAccessRevoked(ConnectionResult connectionresult);
        }

    }

}
