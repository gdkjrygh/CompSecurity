// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class cfu
    implements blj
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final NativeAdOptionsParcel g;
    private final List h;

    public cfu(Date date, int j, Set set, Location location, boolean flag, int k, NativeAdOptionsParcel nativeadoptionsparcel, 
            List list)
    {
        a = date;
        b = j;
        c = set;
        e = location;
        d = flag;
        f = k;
        g = nativeadoptionsparcel;
        h = list;
    }

    public final Date a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final Set c()
    {
        return c;
    }

    public final Location d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final boolean f()
    {
        return d;
    }

    public final bey g()
    {
        if (g == null)
        {
            return null;
        } else
        {
            bez bez1 = new bez();
            bez1.a = g.b;
            bez1.b = g.c;
            bez1.c = g.d;
            return new bey(bez1, (byte)0);
        }
    }

    public final boolean h()
    {
        return h != null && h.contains("2");
    }

    public final boolean i()
    {
        return h != null && h.contains("1");
    }
}
