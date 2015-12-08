// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.np;
import com.google.android.gms.internal.nq;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.ns;
import com.google.android.gms.internal.nt;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.internal.h;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Account, Moments, People, b, 
//            a

public final class Plus
{
    public static final class PlusOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        final String alb;
        final Set alc;

        public static Builder builder()
        {
            return new Builder();
        }

        private PlusOptions()
        {
            alb = null;
            alc = new HashSet();
        }


        private PlusOptions(Builder builder1)
        {
            alb = builder1.alb;
            alc = builder1.alc;
        }

    }

    public static final class PlusOptions.Builder
    {

        String alb;
        final Set alc = new HashSet();

        public transient PlusOptions.Builder addActivityTypes(String as[])
        {
            o.b(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                alc.add(as[i]);
            }

            return this;
        }

        public PlusOptions build()
        {
            return new PlusOptions(this);
        }

        public PlusOptions.Builder setServerClientId(String s)
        {
            alb = s;
            return this;
        }

        public PlusOptions.Builder()
        {
        }
    }

    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a()
        {
            super(Plus.CU);
        }
    }


    public static final Api API;
    public static final Account AccountApi = new np();
    public static final com.google.android.gms.common.api.Api.c CU;
    static final com.google.android.gms.common.api.Api.b CV;
    public static final Moments MomentsApi = new ns();
    public static final People PeopleApi = new nt();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final b akZ = new nr();
    public static final com.google.android.gms.plus.a ala = new nq();

    private Plus()
    {
    }

    public static e a(GoogleApiClient googleapiclient, com.google.android.gms.common.api.Api.c c)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "GoogleApiClient parameter is required.");
        o.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (e)googleapiclient.a(c);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        CV = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, clientsettings, (PlusOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public e a(Context context, Looper looper, ClientSettings clientsettings, PlusOptions plusoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                PlusOptions plusoptions1 = plusoptions;
                if (plusoptions == null)
                {
                    plusoptions1 = new PlusOptions();
                }
                plusoptions = clientsettings.getAccountNameOrDefault();
                clientsettings = clientsettings.getScopesArray();
                String as[] = (String[])plusoptions1.alc.toArray(new String[0]);
                String s = context.getPackageName();
                String s1 = context.getPackageName();
                PlusCommonExtras pluscommonextras = new PlusCommonExtras();
                return new e(context, looper, connectioncallbacks, onconnectionfailedlistener, new h(plusoptions, clientsettings, as, new String[0], s, s1, null, pluscommonextras));
            }

            public int getPriority()
            {
                return 2;
            }

        };
        API = new Api(CV, CU, new Scope[0]);
    }
}
