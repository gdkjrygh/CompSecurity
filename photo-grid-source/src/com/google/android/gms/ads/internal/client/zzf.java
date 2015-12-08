// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdRequestParcel, SearchAdRequestParcel

public final class zzf
{

    private long a;
    private Bundle b;
    private int c;
    private List d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private SearchAdRequestParcel i;
    private Location j;
    private String k;
    private Bundle l;
    private Bundle m;
    private List n;
    private String o;
    private String p;

    public zzf()
    {
        a = -1L;
        b = new Bundle();
        c = -1;
        d = new ArrayList();
        e = false;
        f = -1;
        g = false;
        h = null;
        i = null;
        j = null;
        k = null;
        l = new Bundle();
        m = new Bundle();
        n = new ArrayList();
        o = null;
        p = null;
    }

    public zzf(AdRequestParcel adrequestparcel)
    {
        a = adrequestparcel.zzsB;
        b = adrequestparcel.extras;
        c = adrequestparcel.zzsC;
        d = adrequestparcel.zzsD;
        e = adrequestparcel.zzsE;
        f = adrequestparcel.zzsF;
        g = adrequestparcel.zzsG;
        h = adrequestparcel.zzsH;
        i = adrequestparcel.zzsI;
        j = adrequestparcel.zzsJ;
        k = adrequestparcel.zzsK;
        l = adrequestparcel.zzsL;
        m = adrequestparcel.zzsM;
        n = adrequestparcel.zzsN;
        o = adrequestparcel.zzsO;
        p = adrequestparcel.zzsP;
    }

    public final zzf zza(Location location)
    {
        j = location;
        return this;
    }

    public final AdRequestParcel zzcA()
    {
        return new AdRequestParcel(6, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p);
    }
}
