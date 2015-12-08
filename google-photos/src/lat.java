// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.NetworkQualityReport;

public final class lat extends lau
{

    private NetworkQualityReport g;

    public lat(kqf kqf, jyn jyn, NetworkQualityReport networkqualityreport)
    {
        g = networkqualityreport;
        super(jyn);
    }

    protected final jyw a(Status status)
    {
        return status;
    }

    protected final void a(jyl jyl)
    {
        ((kqn)((kqq)jyl).o()).a(g);
        a(((jyw) (Status.a)));
    }
}
