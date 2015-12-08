// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.gy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{
    public static interface ApiOptions
    {
    }

    public static interface ApiOptions.HasOptions
        extends ApiOptions
    {
    }

    public static final class ApiOptions.NoOptions
        implements ApiOptions.NotRequiredOptions
    {

        private ApiOptions.NoOptions()
        {
        }
    }

    public static interface ApiOptions.NotRequiredOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.Optional
        extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
    {
    }

    public static interface a
    {

        public abstract void connect();

        public abstract void disconnect();

        public abstract Looper getLooper();

        public abstract boolean isConnected();
    }

    public static interface b
    {

        public abstract a a(Context context, Looper looper, gy gy, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);

        public abstract int getPriority();
    }

    public static final class c
    {

        public c()
        {
        }
    }


    private final b Dm;
    private final c Dn;
    private final ArrayList Do;

    public transient Api(b b1, c c1, Scope ascope[])
    {
        Dm = b1;
        Dn = c1;
        Do = new ArrayList(Arrays.asList(ascope));
    }

    public List eA()
    {
        return Do;
    }

    public c eB()
    {
        return Dn;
    }

    public b ez()
    {
        return Dm;
    }
}
