// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.jw;
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

    public static class ApiOptions.NotRequiredOptions
        implements ApiOptions
    {

        private ApiOptions.NotRequiredOptions()
        {
        }
    }

    public static interface a
    {

        public abstract void connect();

        public abstract void disconnect();

        public abstract boolean isConnected();
    }

    public static interface b
    {

        public abstract a a$28a3456d(Context context, Looper looper, jw jw, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener);

        public abstract int getPriority();
    }

    public static final class c
    {

        public c()
        {
        }
    }


    private final b Sa;
    private final c Sb;
    private final ArrayList Sc;

    public transient Api(b b1, c c1, Scope ascope[])
    {
        Sa = b1;
        Sb = c1;
        Sc = new ArrayList(Arrays.asList(ascope));
    }

    public final b hT()
    {
        return Sa;
    }

    public final List hU()
    {
        return Sc;
    }

    public final c hV()
    {
        return Sb;
    }
}
