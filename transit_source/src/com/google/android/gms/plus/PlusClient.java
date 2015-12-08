// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fo;
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

        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener ir;
        private final Context mContext;
        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks rc;
        private final fo rd;

        public PlusClient build()
        {
            return new PlusClient(new fl(mContext, rd.dh(), rc, ir));
        }

        public Builder clearScopes()
        {
            rd.dg();
            return this;
        }

        public Builder setAccountName(String s)
        {
            rd.Z(s);
            return this;
        }

        public transient Builder setActions(String as[])
        {
            rd.e(as);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            rd.d(as);
            return this;
        }

        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            rc = connectioncallbacks;
            ir = onconnectionfailedlistener;
            rd = new fo(mContext);
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


    final fl rb;

    PlusClient(fl fl1)
    {
        rb = fl1;
    }

    fl cR()
    {
        return rb;
    }

    public void clearDefaultAccount()
    {
        rb.clearDefaultAccount();
    }

    public void connect()
    {
        rb.connect();
    }

    public void disconnect()
    {
        rb.disconnect();
    }

    public String getAccountName()
    {
        return rb.getAccountName();
    }

    public Person getCurrentPerson()
    {
        return rb.getCurrentPerson();
    }

    public boolean isConnected()
    {
        return rb.isConnected();
    }

    public boolean isConnecting()
    {
        return rb.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return rb.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return rb.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener)
    {
        rb.loadMoments(onmomentsloadedlistener);
    }

    public void loadMoments(OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        rb.loadMoments(onmomentsloadedlistener, i, s, uri, s1, s2);
    }

    public void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        rb.a(onpeopleloadedlistener, collection);
    }

    public transient void loadPeople(OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        rb.a(onpeopleloadedlistener, as);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        rb.loadVisiblePeople(onpeopleloadedlistener, i, s);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        rb.loadVisiblePeople(onpeopleloadedlistener, s);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        rb.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        rb.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeMoment(String s)
    {
        rb.removeMoment(s);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onaccessrevokedlistener)
    {
        rb.revokeAccessAndDisconnect(onaccessrevokedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        rb.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        rb.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void writeMoment(Moment moment)
    {
        rb.writeMoment(moment);
    }
}
