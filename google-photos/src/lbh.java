// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;

final class lbh
    implements lhz
{

    private final Status a;
    private final ReportingState b;

    public lbh(Status status, ReportingState reportingstate)
    {
        a = status;
        if (status.g == 0)
        {
            b.d(reportingstate);
        }
        b = reportingstate;
    }

    private void h()
    {
        if (a.g != 0)
        {
            throw new IllegalStateException((new StringBuilder("Illegal to call this method when status is failure: ")).append(a).toString());
        } else
        {
            return;
        }
    }

    public final Status a_()
    {
        return a;
    }

    public final int b()
    {
        h();
        return p.a(b.b);
    }

    public final int c()
    {
        h();
        return p.a(b.c);
    }

    public final boolean d()
    {
        h();
        return b.d;
    }

    public final boolean e()
    {
        h();
        return b.a();
    }

    public final int f()
    {
        h();
        return lbd.a(b.q(b.f));
    }

    public final boolean g()
    {
        h();
        ReportingState reportingstate = b;
        return !reportingstate.a() && b.q(reportingstate.f) == 0;
    }

    public final String toString()
    {
        return (new StringBuilder("ReportingStateResultImpl{mStatus=")).append(a).append(", mReportingState=").append(b).append('}').toString();
    }
}
