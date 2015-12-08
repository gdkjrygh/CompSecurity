// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzly

public class zzlz extends zzi
{

    public zzlz(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze)
    {
        super(context, context.getMainLooper(), 73, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcF(ibinder);
    }

    protected zzly zzcF(IBinder ibinder)
    {
        return zzly.zza.zzcE(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }
}
