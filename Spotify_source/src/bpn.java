// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

final class bpn
    implements boi
{

    private final Status a;
    private final ApplicationMetadata b;
    private final boolean c;

    public bpn(Status status)
    {
        this(status, null, false);
    }

    public bpn(Status status, ApplicationMetadata applicationmetadata, boolean flag)
    {
        a = status;
        b = applicationmetadata;
        c = flag;
    }

    public final ApplicationMetadata a()
    {
        return b;
    }

    public final boolean b()
    {
        return c;
    }

    public final Status c()
    {
        return a;
    }
}
