// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kct;
import lhr;
import lhs;
import lhu;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, lhr
{

    public static final lhs CREATOR = new lhs();
    public final int a;
    public final Bundle b;
    public final PlaceLocalization c;
    public final float d;
    public final LatLngBounds e;
    public final String f;
    public final Uri g;
    public final boolean h;
    public final float i;
    public final int j;
    public final long k;
    public final List l;
    public final List m;
    public final String n;
    public final String o;
    public final List p;
    public final boolean q;
    public lhu r;
    private final String s;
    private final LatLng t;
    private final String u;
    private final String v;
    private Locale w;

    public PlaceImpl(int i1, String s1, List list, List list1, Bundle bundle, String s2, String s3, 
            String s4, String s5, List list2, LatLng latlng, float f1, LatLngBounds latlngbounds, String s6, 
            Uri uri, boolean flag, float f2, int j1, long l1, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        a = i1;
        s = s1;
        m = Collections.unmodifiableList(list);
        l = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        b = bundle;
        u = s2;
        v = s3;
        n = s4;
        o = s5;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        p = list2;
        t = latlng;
        d = f1;
        e = latlngbounds;
        if (s6 == null)
        {
            s6 = "UTC";
        }
        f = s6;
        g = uri;
        h = flag;
        i = f2;
        j = j1;
        k = l1;
        Collections.unmodifiableMap(new HashMap());
        w = null;
        q = flag1;
        c = placelocalization;
    }

    public final String a()
    {
        a("getId");
        return s;
    }

    public void a(String s1)
    {
        lhu lhu1;
        String s2;
        if (!q || r == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        lhu1 = r;
        s2 = s;
        Object obj = lhu1.e;
        obj;
        JVM INSTR monitorenter ;
        if (lhu1.f == null)
        {
            lhu1.f = new ArrayList();
            lhu1.g = new ArrayList();
            lhu1.c.postDelayed(lhu1.d, lhu.b);
        }
        lhu1.f.add(s2);
        lhu1.g.add(s1);
        if (lhu1.f.size() >= 10000)
        {
            if (Log.isLoggable(lhu.a, 5))
            {
                Log.w(lhu.a, "Event buffer full, flushing");
            }
            lhu1.d.run();
            lhu1.c.removeCallbacks(lhu1.d);
            return;
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final CharSequence b()
    {
        return f();
    }

    public final CharSequence c()
    {
        return e();
    }

    public final LatLng d()
    {
        a("getLatLng");
        return t;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        a("getName");
        return u;
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
            if (!s.equals(((PlaceImpl) (obj)).s) || !c.b(null, null) || k != ((PlaceImpl) (obj)).k)
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        a("getAddress");
        return v;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            s, null, Long.valueOf(k)
        });
    }

    public final String toString()
    {
        return c.b(this).a("id", s).a("placeTypes", m).a("locale", null).a("name", u).a("address", v).a("phoneNumber", n).a("latlng", t).a("viewport", e).a("websiteUri", g).a("isPermanentlyClosed", Boolean.valueOf(h)).a("priceLevel", Integer.valueOf(j)).a("timestampSecs", Long.valueOf(k)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        lhs.a(this, parcel, i1);
    }

}
