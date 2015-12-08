// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class hox
    implements ds
{

    hpr a;
    private final String b;
    private final String c;
    private final String d;
    private final hoo e;

    hox(hoo hoo1, String s, String s1, String s2)
    {
        p.b(hoo1, "abuseType must be non-null");
        p.a(TextUtils.isEmpty(s) ^ TextUtils.isEmpty(s1), "Either envelopeMediaKey or mediaKey must be non-empty");
        b = s;
        c = s1;
        d = s2;
        e = hoo1;
    }

    public final void a(hpr hpr)
    {
        a = hpr;
    }

    public final volatile void a(qlw qlw)
    {
    }

    public final qlr f()
    {
        return qrl.a;
    }

    public final int g()
    {
        return qmb.b(qrl.a.b);
    }

    public final qlr g_()
    {
        return qrk.a;
    }

    public final String k_()
    {
        return "ReportAbuseOp";
    }

    public final qlw l_()
    {
        qrk qrk1 = new qrk();
        qrk1.b = e.e;
        qrk1.c = b;
        qrk1.d = c;
        qrk1.e = d;
        return qrk1;
    }
}
