// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.l;
import com.google.android.gms.drive.internal.n;
import com.google.android.gms.drive.internal.p;
import com.google.android.gms.internal.fc;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            DriveApi, c

public final class Drive
{

    public static final Api API;
    public static final DriveApi DriveApi = new l();
    public static final Scope EE = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope EF = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final c EG = new p();
    public static final Scope SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
    public static final com.google.android.gms.common.api.Api.c wx;
    public static final com.google.android.gms.common.api.Api.b wy;

    private Drive()
    {
    }

    static 
    {
        wx = new com.google.android.gms.common.api.Api.c();
        wy = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, fc fc1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return b(context, looper, fc1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public n b(Context context, Looper looper, fc fc1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                nooptions = fc1.eE();
                return new n(context, looper, fc1, connectioncallbacks, onconnectionfailedlistener, (String[])nooptions.toArray(new String[nooptions.size()]));
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(wy, wx, new Scope[0]);
    }
}
