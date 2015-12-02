// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import java.util.Date;
import java.util.Set;

public final class aes
    implements ou
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;

    public aes(Date date, int i, Set set, Location location, boolean flag, int j)
    {
        a = date;
        b = i;
        c = set;
        e = location;
        d = flag;
        f = j;
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
}
