// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.location.places.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            b, e, PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, b
{

    public static final com.google.android.gms.location.places.internal.b CREATOR = new com.google.android.gms.location.places.internal.b();
    final int a;
    final String b;
    final Bundle c;
    final PlaceLocalization d;
    final LatLng e;
    final float f;
    final LatLngBounds g;
    final String h;
    final Uri i;
    final boolean j;
    final float k;
    final int l;
    final long m;
    final List n;
    final List o;
    final String p;
    final String q;
    final String r;
    final String s;
    final List t;
    final boolean u;
    private final Map v = Collections.unmodifiableMap(new HashMap());
    private final TimeZone w = null;
    private Locale x;
    private e y;

    PlaceImpl(int i1, String s1, List list, List list1, Bundle bundle, String s2, String s3, 
            String s4, String s5, List list2, LatLng latlng, float f1, LatLngBounds latlngbounds, String s6, 
            Uri uri, boolean flag, float f2, int j1, long l1, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        a = i1;
        b = s1;
        o = Collections.unmodifiableList(list);
        n = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        c = bundle;
        p = s2;
        q = s3;
        r = s4;
        s = s5;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        t = list2;
        e = latlng;
        f = f1;
        g = latlngbounds;
        if (s6 == null)
        {
            s6 = "UTC";
        }
        h = s6;
        i = uri;
        j = flag;
        k = f2;
        l = j1;
        m = l1;
        x = null;
        u = flag1;
        d = placelocalization;
    }

    public final Object a()
    {
        return this;
    }

    final void a(String s1)
    {
        e e1;
        String s2;
        if (!u || y == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        e1 = y;
        s2 = b;
        Object obj = e1.e;
        obj;
        JVM INSTR monitorenter ;
        if (e1.f == null)
        {
            e1.f = new ArrayList();
            e1.g = new ArrayList();
            e1.c.postDelayed(e1.d, com.google.android.gms.location.places.internal.e.b);
        }
        e1.f.add(s2);
        e1.g.add(s1);
        if (e1.f.size() >= 10000)
        {
            if (Log.isLoggable(e.a, 5))
            {
                Log.w(e.a, "Event buffer full, flushing");
            }
            e1.d.run();
            e1.c.removeCallbacks(e1.d);
            return;
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceImpl))
            {
                return false;
            }
            obj = (PlaceImpl)obj;
            if (!b.equals(((PlaceImpl) (obj)).b) || !com.google.android.gms.common.internal.t.a(x, ((PlaceImpl) (obj)).x) || m != ((PlaceImpl) (obj)).m)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, x, Long.valueOf(m)
        });
    }

    public final String toString()
    {
        return com.google.android.gms.common.internal.t.a(this).a("id", b).a("placeTypes", o).a("locale", x).a("name", p).a("address", q).a("phoneNumber", r).a("latlng", e).a("viewport", g).a("websiteUri", i).a("isPermanentlyClosed", Boolean.valueOf(j)).a("priceLevel", Integer.valueOf(l)).a("timestampSecs", Long.valueOf(m)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.location.places.internal.b.a(this, parcel, i1);
    }

}
