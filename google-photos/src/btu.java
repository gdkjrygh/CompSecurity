// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.concurrent.TimeUnit;

final class btu extends bsr
{

    private final String a;
    private btq b;

    btu(btq btq1, String s)
    {
        b = btq1;
        btq1 = String.valueOf(s);
        if (btq1.length() != 0)
        {
            btq1 = "OverrideTable.".concat(btq1);
        } else
        {
            btq1 = new String("OverrideTable.");
        }
        super(btq1);
        a = s;
    }

    public final mtf a(String s)
    {
        cqf cqf1 = b.c.c.e;
        String s1 = a;
        return new btt((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(".").append(s).toString(), btq.a(b), btq.b(b), b.c.b.X, b.c.b.p, Uri.fromFile(btq.c(b)).toString(), TimeUnit.MICROSECONDS.toMillis(cqf1.h), cqf1.e);
    }

    public final boolean a(String s, mue mue)
    {
        btq.d(b).b(btq.d());
        return true;
    }
}
