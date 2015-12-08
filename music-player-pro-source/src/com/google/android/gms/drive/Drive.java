// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.p;
import com.google.android.gms.drive.internal.r;
import com.google.android.gms.drive.internal.u;
import com.google.android.gms.drive.internal.x;
import com.google.android.gms.drive.internal.z;
import com.google.android.gms.internal.jg;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            DriveApi, DrivePreferencesApi, b, e

public final class Drive
{
    public static abstract class a
        implements com.google.android.gms.common.api.Api.b
    {

        protected abstract Bundle a(com.google.android.gms.common.api.Api.ApiOptions apioptions);

        public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return a(context, looper, jg1, (com.google.android.gms.common.api.Api.ApiOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public r a(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.Api.ApiOptions apioptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            List list = jg1.ho();
            return new r(context, looper, jg1, connectioncallbacks, onconnectionfailedlistener, (String[])list.toArray(new String[list.size()]), a(apioptions));
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

        private final Bundle DJ;

        public Bundle iq()
        {
            return DJ;
        }

        private b()
        {
            this(new Bundle());
        }

        private b(Bundle bundle)
        {
            DJ = bundle;
        }
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.c DQ;
    public static final DriveApi DriveApi = new p();
    public static final DrivePreferencesApi DrivePreferencesApi = new x();
    public static final Scope Oo = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope Op = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final Api Oq;
    public static final com.google.android.gms.drive.b Or = new u();
    public static final e Os = new z();
    public static final Scope SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");

    private Drive()
    {
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        API = new Api(new a() {

            protected Bundle a(com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions)
            {
                return new Bundle();
            }

            protected volatile Bundle a(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return a((com.google.android.gms.common.api.Api.ApiOptions.NoOptions)apioptions);
            }

        }, DQ, new Scope[0]);
        Oq = new Api(new a() {

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
                    return b1.iq();
                }
            }

        }, DQ, new Scope[0]);
    }
}
