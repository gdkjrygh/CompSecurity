// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class eja
{

    final String a;
    final long b;
    final String c;
    final String d;
    final int e;
    final long f;
    final Float g;
    final Float h;

    eja(ejb ejb1)
    {
        a = ejb1.a;
        b = ejb1.b;
        c = ejb1.c;
        d = ejb1.d;
        e = ejb1.e;
        f = ejb1.f;
        g = ejb1.g;
        h = ejb1.h;
    }

    public final String toString()
    {
        return String.format(Locale.US, "MediaDetails {displayName: %s, fileSize: %d, mimeType: %s, orientation: %d, dateTaken: %d, latitude: %s, longitude: %s, dataUri: %s}", new Object[] {
            a, Long.valueOf(b), c, Integer.valueOf(e), Long.valueOf(f), g, h, d
        });
    }
}
