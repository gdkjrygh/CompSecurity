// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast.internal:
//            e

private static final class e
    implements com.google.android.gms.cast.rnal.e.a
{

    private final Status a;
    private final ApplicationMetadata b;
    private final String c;
    private final String d;
    private final boolean e;

    public final ApplicationMetadata a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final Status getStatus()
    {
        return a;
    }

    public tadata(Status status)
    {
        this(status, null, null, null, false);
    }

    public tadata(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        a = status;
        b = applicationmetadata;
        c = s;
        d = s1;
        e = flag;
    }
}
