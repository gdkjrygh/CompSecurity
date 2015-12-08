// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            Api

public interface zzj
{

    public abstract void begin();

    public abstract void connect();

    public abstract void disconnect();

    public abstract String getName();

    public abstract void onConnected(Bundle bundle);

    public abstract void onConnectionSuspended(int i);

    public abstract zzc.zza zza(zzc.zza zza1);

    public abstract void zza(ConnectionResult connectionresult, Api api, int i);

    public abstract zzc.zza zzb(zzc.zza zza1);
}
