// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.qm;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.rn;
import com.google.android.gms.internal.sf;
import com.google.android.gms.internal.sh;

// Referenced classes of package com.google.android.gms.people:
//            GraphUpdate, Sync, Autocomplete, InteractionFeedback, 
//            a, ContactsSync, Notifications, Graph, 
//            Images

public final class People
{
    public static final class PeopleOptions1p
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        private final int aBH;

        static int a(PeopleOptions1p peopleoptions1p)
        {
            return peopleoptions1p.aBH;
        }

        private PeopleOptions1p(Builder builder)
        {
            aBH = builder.aBH;
        }

    }

    public static final class PeopleOptions1p.Builder
    {

        int aBH;

        public final PeopleOptions1p build()
        {
            boolean flag;
            if (aBH > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "Must provide valid client application ID!");
            return new PeopleOptions1p(this);
        }

        public final PeopleOptions1p.Builder setClientApplicationId(int i)
        {
            aBH = i;
            return this;
        }

        public PeopleOptions1p.Builder()
        {
        }
    }

    public static interface ReleasableResult
        extends Releasable, Result
    {
    }

    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(People.CLIENT_KEY_1P, googleapiclient);
        }
    }


    public static final Api API_1P;
    public static final Autocomplete AutocompleteApi = new Autocomplete();
    public static final com.google.android.gms.common.api.Api.c CLIENT_KEY_1P;
    public static final ContactsSync ContactsSyncApi = new ContactsSync();
    public static final Graph GraphApi = new sf();
    public static final GraphUpdate GraphUpdateApi = new GraphUpdate();
    public static final qm IdentityApi = new qv();
    public static final Images ImageApi = new sh();
    public static final InteractionFeedback InteractionFeedbackApi = new InteractionFeedback();
    public static final com.google.android.gms.people.a InternalApi = new com.google.android.gms.people.a();
    public static final Notifications NotificationApi = new Notifications();
    public static final int STATUS_INCOMPLETE = 100;
    public static final int STATUS_NOT_ALLOWED = 101;
    public static final Sync SyncApi = new Sync();
    public static final String TAG = "PeopleClient";
    static final com.google.android.gms.common.api.Api.b aBF;

    static 
    {
        CLIENT_KEY_1P = new com.google.android.gms.common.api.Api.c();
        aBF = new com.google.android.gms.common.api.Api.b() {

            private static rn a$1c8be97b(Context context, Looper looper, jw jw1, PeopleOptions1p peopleoptions1p, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                kn.b(peopleoptions1p, "Must provide valid PeopleOptions!");
                return new rn(context, looper, connectioncallbacks, onconnectionfailedlistener, String.valueOf(PeopleOptions1p.a(peopleoptions1p)), jw1.iJ());
            }

            public final volatile com.google.android.gms.common.api.Api.a a$28a3456d(Context context, Looper looper, jw jw1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a$1c8be97b(context, looper, jw1, (PeopleOptions1p)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API_1P = new Api(aBF, CLIENT_KEY_1P, new Scope[0]);
    }
}
