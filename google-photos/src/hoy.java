// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hoy extends mtf
{

    private final int a;
    private final String b;
    private final String c;
    private final String j;
    private final hoo k;

    hoy(int i, String s, String s1, String s2, hoo hoo)
    {
        super("ReportAbuseTask");
        a = i;
        c = s;
        b = s1;
        j = s2;
        k = hoo;
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, "ReportAbuseTask", new String[0]);
        noz noz2 = noz.a(context, 3, "ReportAbuseTask", new String[] {
            "perf"
        });
        context = (hpz)olm.a(context, hpz);
        hox hox1 = new hox(k, b, c, j);
        long l = noy.a();
        context.a(a, hox1);
        boolean flag;
        if (hox1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (noz1.a())
            {
                noy.a("tag", "ReportAbuseTask");
                noy.a("error", hox1.a);
            }
            return new mue(false);
        }
        if (noz2.a())
        {
            noy.a("taskTag", "ReportAbuseTask");
            noy.a("duration", l);
        }
        return new mue(true);
    }
}
