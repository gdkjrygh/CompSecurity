// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ioq extends mtf
{

    private final int a;
    private final int b;
    private final iuj c;
    private final pgq j;

    public ioq(int i, int k, iuj iuj, pgq pgq)
    {
        super("ReportStoryAbuseTask");
        a = i;
        b = k;
        c = iuj;
        j = pgq;
    }

    protected final mue a(Context context)
    {
        context = new iop(context, a, b, c, j);
        context.d();
        return new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
    }
}
