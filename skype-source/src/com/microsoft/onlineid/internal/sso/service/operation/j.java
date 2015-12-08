// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.internal.b.a;
import com.microsoft.onlineid.internal.m;
import com.microsoft.onlineid.sts.a.c;
import com.microsoft.onlineid.sts.a.e;

public abstract class j
{

    private final Context a;
    private final Bundle b;
    private final com.microsoft.onlineid.sts.a c;
    private final com.microsoft.onlineid.internal.f.a d;

    public j(Context context, Bundle bundle, com.microsoft.onlineid.sts.a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        a = context;
        b = bundle;
        c = a1;
        d = a2;
    }

    protected static m a(Intent intent)
    {
        return new m(intent);
    }

    public abstract Bundle a()
        throws a, c, com.microsoft.onlineid.b.c, e, b;

    public final Bundle b()
    {
        return b;
    }

    public final String c()
    {
        return b.getString("com.microsoft.onlineid.client_package_name");
    }

    public final String d()
    {
        return b.getString("com.microsoft.onlineid.client_sdk_version");
    }

    public final int e()
    {
        return b.getInt("com.microsoft.onlineid.client_sso_version");
    }

    public final Bundle f()
    {
        return b.getBundle("com.microsoft.onlineid.client_state");
    }

    public final String g()
    {
        return b.getString("com.microsoft.onlineid.client_config_version");
    }

    public final long h()
    {
        return b.getLong("com.microsoft.onlineid.client_config_last_downloaded_time");
    }

    protected final Context i()
    {
        return a;
    }

    protected final com.microsoft.onlineid.sts.a j()
    {
        return c;
    }

    protected final com.microsoft.onlineid.internal.f.a k()
    {
        return d;
    }
}
