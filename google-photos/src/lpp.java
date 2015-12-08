// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class lpp
    implements lfk
{

    private lpo a;

    public lpp(lpo lpo1, String s)
    {
        a = lpo1;
        super();
    }

    public final void a(lfq lfq1)
    {
        if (lfq1.a_() != Status.a)
        {
            lqh.a((new StringBuilder("Load request failed for the container ")).append(a.j).toString());
            a.a(a.c(Status.c));
            return;
        }
        lfv lfv = lfq1.a.f;
        if (lfv == null)
        {
            lqh.a("Response doesn't have the requested container");
            a.a(a.c(new Status(8, "Response doesn't have the requested container", null)));
            return;
        } else
        {
            long l = lfq1.a.d;
            a.l = new lpn(a.i, a.f, new lpk(a.h, a.i.c, a.j, l, lfv), new lpq(this));
            a.a(a.l);
            return;
        }
    }
}
