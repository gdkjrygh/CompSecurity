// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            Api

public interface GoogleApiClient
{

    public abstract Looper a();

    public abstract Api.Client a(Api.ClientKey clientkey);

    public abstract zza.zza a(zza.zza zza);

    public abstract void a(ConnectionCallbacks connectioncallbacks);

    public abstract void a(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract boolean a(Api api);

    public abstract zza.zza b(zza.zza zza);

    public abstract void b();

    public abstract void b(ConnectionCallbacks connectioncallbacks);

    public abstract void b(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();
}
