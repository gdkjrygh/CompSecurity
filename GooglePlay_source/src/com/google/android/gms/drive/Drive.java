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
import com.google.android.gms.drive.internal.DriveApiImpl;
import com.google.android.gms.drive.internal.DriveClientImpl;
import com.google.android.gms.drive.internal.DriveFirstPartyApiImpl;
import com.google.android.gms.drive.internal.DrivePreferencesApiImpl;
import com.google.android.gms.drive.internal.DriveServiceApiImpl;

// Referenced classes of package com.google.android.gms.drive:
//            DriveApi, DriveFirstPartyApi, DrivePreferencesApi, DriveServiceApi

public final class Drive
{
    public static abstract class ClientBuilder extends com.google.android.gms.common.api.Api.AbstractClientBuilder
    {

        public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new DriveClientImpl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener, getOptionsBundle((com.google.android.gms.common.api.Api.ApiOptions)obj));
        }

        protected abstract Bundle getOptionsBundle(com.google.android.gms.common.api.Api.ApiOptions apioptions);

        public ClientBuilder()
        {
        }
    }

    public static final class DriveOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        final Bundle mBundle;

        private DriveOptions(Bundle bundle)
        {
            mBundle = bundle;
        }

        DriveOptions(Bundle bundle, byte byte0)
        {
            this(bundle);
        }
    }

    public static final class DriveOptions.Builder
    {

        private final Bundle mBundle = new Bundle();

        public final DriveOptions build()
        {
            return new DriveOptions(new Bundle(mBundle), (byte)0);
        }

        public final DriveOptions.Builder setProxyType$24057e15()
        {
            mBundle.putInt("proxy_type", 1);
            return this;
        }

        public DriveOptions.Builder()
        {
        }
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final DriveApi DriveApi = new DriveApiImpl();
    public static final DriveFirstPartyApi DriveFirstPartyApi = new DriveFirstPartyApiImpl();
    public static final DrivePreferencesApi DrivePreferencesApi = new DrivePreferencesApiImpl();
    public static final DriveServiceApi DriveServiceApi = new DriveServiceApiImpl();
    public static final Api INTERNAL_API;
    public static final Scope SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope SCOPE_APPS = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
    public static final Scope SCOPE_FULL = new Scope("https://www.googleapis.com/auth/drive");

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        API = new Api("Drive.API", new ClientBuilder() {

            protected final volatile Bundle getOptionsBundle(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return new Bundle();
            }

        }, CLIENT_KEY);
        INTERNAL_API = new Api("Drive.INTERNAL_API", new ClientBuilder() {

            protected final volatile Bundle getOptionsBundle(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                apioptions = (DriveOptions)apioptions;
                if (apioptions == null)
                {
                    return new Bundle();
                } else
                {
                    return ((DriveOptions) (apioptions)).mBundle;
                }
            }

        }, CLIENT_KEY);
    }
}
