// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze

private static final class e
    implements com.google.android.gms.cast.pplicationConnectionResult
{

    private final Status a;
    private final ApplicationMetadata b;
    private final String c;
    private final String d;
    private final boolean e;

    public ApplicationMetadata getApplicationMetadata()
    {
        return b;
    }

    public String getApplicationStatus()
    {
        return c;
    }

    public String getSessionId()
    {
        return d;
    }

    public Status getStatus()
    {
        return a;
    }

    public boolean getWasLaunched()
    {
        return e;
    }

    public data(Status status)
    {
        this(status, null, null, null, false);
    }

    public data(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        a = status;
        b = applicationmetadata;
        c = s;
        d = s1;
        e = flag;
    }
}
