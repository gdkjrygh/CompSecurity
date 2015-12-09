// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import java.util.ArrayList;
import java.util.List;

public final class bfm
{

    public long a;
    public Bundle b;
    public int c;
    public List d;
    public boolean e;
    public int f;
    public boolean g;
    public String h;
    public SearchAdRequestParcel i;
    public Location j;
    public String k;
    public Bundle l;
    public Bundle m;
    public List n;
    public String o;
    public String p;

    public bfm()
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

    public bfm(AdRequestParcel adrequestparcel)
    {
        a = adrequestparcel.b;
        b = adrequestparcel.c;
        c = adrequestparcel.d;
        d = adrequestparcel.e;
        e = adrequestparcel.f;
        f = adrequestparcel.g;
        g = adrequestparcel.h;
        h = adrequestparcel.i;
        i = adrequestparcel.j;
        j = adrequestparcel.k;
        k = adrequestparcel.l;
        l = adrequestparcel.m;
        m = adrequestparcel.n;
        n = adrequestparcel.o;
        o = adrequestparcel.p;
        p = adrequestparcel.q;
    }
}
