// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.ki;
import com.google.android.gms.internal.kj;
import com.google.android.gms.internal.kk;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.km;
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

        final String abr;
        final Set abs;

        public static Builder builder()
        {
            return new Builder();
        }

        private PlusOptions()
        {
            abr = null;
            abs = new HashSet();
        }


        private PlusOptions(Builder builder1)
        {
            abr = builder1.abr;
            abs = builder1.abs;
        }

    }

    public static final class PlusOptions.Builder
    {

        String abr;
        final Set abs = new HashSet();

        public transient PlusOptions.Builder addActivityTypes(String as[])
        {
            hm.b(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                abs.add(as[i]);
            }

            return this;
        }

        public PlusOptions build()
        {
            return new PlusOptions(this);
        }

        public PlusOptions.Builder setServerClientId(String s)
        {
            abr = s;
            return this;
        }

        public PlusOptions.Builder()
        {
        }
    }

    public static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public a()
        {
            super(Plus.yH);
        }
    }


    public static final Api API;
    public static final Account AccountApi = new ki();
    public static final Moments MomentsApi = new kl();
    public static final People PeopleApi = new km();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final b abp = new kk();
    public static final com.google.android.gms.plus.a abq = new kj();
    public static final com.google.android.gms.common.api.Api.c yH;
    static final com.google.android.gms.common.api.Api.b yI;

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
        hm.b(flag, "GoogleApiClient parameter is required.");
        hm.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (e)googleapiclient.a(c);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static 
    {
        yH = new com.google.android.gms.common.api.Api.c();
        yI = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gy1, (PlusOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public e a(Context context, Looper looper, gy gy1, PlusOptions plusoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                PlusOptions plusoptions1 = plusoptions;
                if (plusoptions == null)
                {
                    plusoptions1 = new PlusOptions();
                }
                plusoptions = gy1.fj();
                gy1 = gy1.fm();
                String as[] = (String[])plusoptions1.abs.toArray(new String[0]);
                String s = context.getPackageName();
                String s1 = context.getPackageName();
                PlusCommonExtras pluscommonextras = new PlusCommonExtras();
                return new e(context, looper, connectioncallbacks, onconnectionfailedlistener, new h(plusoptions, gy1, as, new String[0], s, s1, null, pluscommonextras));
            }

            public int getPriority()
            {
                return 2;
            }

        };
        API = new Api(yI, yH, new Scope[0]);
    }
}
