// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class bgw
{

    public static final String a = bjz.a("emulator");
    final Date b;
    final String c;
    final int d;
    final Set e;
    final Location f;
    final boolean g;
    final Bundle h;
    public final Map i;
    final String j;
    final String k;
    final blm l;
    final int m;
    final Set n;
    final Bundle o;
    final Set p;

    public bgw(bgx bgx1)
    {
        this(bgx1, (byte)0);
    }

    private bgw(bgx bgx1, byte byte0)
    {
        b = bgx1.g;
        c = null;
        d = bgx1.h;
        e = Collections.unmodifiableSet(bgx1.a);
        f = bgx1.i;
        g = false;
        h = bgx1.b;
        i = Collections.unmodifiableMap(bgx1.c);
        j = bgx1.j;
        k = null;
        l = null;
        m = bgx1.k;
        n = Collections.unmodifiableSet(bgx1.d);
        o = bgx1.e;
        p = Collections.unmodifiableSet(bgx1.f);
    }

    static 
    {
        bfq.a();
    }
}
