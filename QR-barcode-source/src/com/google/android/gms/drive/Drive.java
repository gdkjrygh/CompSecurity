// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.drive.internal.o;
import com.google.android.gms.drive.internal.q;
import com.google.android.gms.drive.internal.t;
import com.google.android.gms.drive.internal.x;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            DriveApi, b, e

public final class Drive
{
    public static abstract class a
        implements com.google.android.gms.common.api.Api.b
    {

        protected abstract Bundle a(com.google.android.gms.common.api.Api.ApiOptions apioptions);

        public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return a(context, looper, clientsettings, (com.google.android.gms.common.api.Api.ApiOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public q a(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.Api.ApiOptions apioptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            List list = clientsettings.getScopes();
            return new q(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener, (String[])list.toArray(new String[list.size()]), a(apioptions));
        }

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public a()
        {
        }
    }

    public static class b
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private final Bundle Nh;

        public Bundle hM()
        {
            return Nh;
        }

        private b()
        {
            this(new Bundle());
        }

        private b(Bundle bundle)
        {
            Nh = bundle;
        }
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.c CU;
    public static final DriveApi DriveApi = new o();
    public static final Scope Nc = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope Nd = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final Api Ne;
    public static final com.google.android.gms.drive.b Nf = new t();
    public static final e Ng = new x();
    public static final Scope SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");

    private Drive()
    {
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        API = new Api(new a() {

            protected Bundle a(com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions)
            {
                return new Bundle();
            }

            protected volatile Bundle a(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return a((com.google.android.gms.common.api.Api.ApiOptions.NoOptions)apioptions);
            }

        }, CU, new Scope[0]);
        Ne = new Api(new a() {

            protected volatile Bundle a(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return a((b)apioptions);
            }

            protected Bundle a(b b1)
            {
                if (b1 == null)
                {
                    return new Bundle();
                } else
                {
                    return b1.hM();
                }
            }

        }, CU, new Scope[0]);
    }
}
