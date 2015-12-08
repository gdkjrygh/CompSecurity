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
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.android.gms.people.internal.api.AutocompleteImpl;
import com.google.android.gms.people.internal.api.ContactsSyncImpl;
import com.google.android.gms.people.internal.api.GraphImpl;
import com.google.android.gms.people.internal.api.GraphUpdateImpl;
import com.google.android.gms.people.internal.api.ImagesImpl;
import com.google.android.gms.people.internal.api.InteractionFeedbackImpl;
import com.google.android.gms.people.internal.api.InternalApiImpl;
import com.google.android.gms.people.internal.api.NotificationsImpl;
import com.google.android.gms.people.internal.api.SyncImpl;

// Referenced classes of package com.google.android.gms.people:
//            Autocomplete, ContactsSync, Graph, GraphUpdate, 
//            Images, InteractionFeedback, InternalApi, Notifications, 
//            Sync

public final class People
{
    public static abstract class BasePeopleApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public BasePeopleApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(People.CLIENT_KEY_1P, googleapiclient);
        }
    }

    public static final class PeopleOptions1p
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        final int clientApplicationId;

        private PeopleOptions1p(Builder builder)
        {
            clientApplicationId = builder.clientApplicationId;
        }

        PeopleOptions1p(Builder builder, byte byte0)
        {
            this(builder);
        }
    }

    public static final class PeopleOptions1p.Builder
    {

        public int clientApplicationId;

        public final PeopleOptions1p build()
        {
            boolean flag;
            if (clientApplicationId >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Must provide valid client application ID!");
            return new PeopleOptions1p(this, (byte)0);
        }

        public PeopleOptions1p.Builder()
        {
            clientApplicationId = -1;
        }
    }

    public static interface ReleasableResult
        extends Releasable, Result
    {
    }


    public static final Api API_1P;
    public static final Autocomplete AutocompleteApi = new AutocompleteImpl();
    static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER_1P;
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY_1P;
    public static final ContactsSync ContactsSyncApi = new ContactsSyncImpl();
    public static final Graph GraphApi = new GraphImpl();
    public static final GraphUpdate GraphUpdateApi = new GraphUpdateImpl();
    public static final Images ImageApi = new ImagesImpl();
    public static final InteractionFeedback InteractionFeedbackApi = new InteractionFeedbackImpl();
    public static final InternalApi InternalApi = new InternalApiImpl();
    public static final Notifications NotificationApi = new NotificationsImpl();
    public static final Sync SyncApi = new SyncImpl();

    static 
    {
        CLIENT_KEY_1P = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER_1P = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                obj = (PeopleOptions1p)obj;
                Preconditions.checkNotNull(obj, "Must provide valid PeopleOptions!");
                return new PeopleClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, String.valueOf(((PeopleOptions1p) (obj)).clientApplicationId), clientsettings);
            }

        };
        API_1P = new Api("People.API_1P", CLIENT_BUILDER_1P, CLIENT_KEY_1P);
    }
}
