// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.internal:
//            iy, jf, ht, je, 
//            jk, gq, gr, hz

public final class hx extends iy
    implements SafeParcelable
{

    public static final jf a = new jf();
    final int b;
    private final String c;
    private final Bundle d;
    private final hz e;
    private final LatLng f;
    private final float g;
    private final LatLngBounds h;
    private final String i;
    private final Uri j;
    private final boolean k;
    private final float l;
    private final int m;
    private final long n;
    private final List o;
    private final Map p;
    private final TimeZone q;
    private Locale r;
    private jk s;

    hx(int i1, String s1, List list, Bundle bundle, hz hz, LatLng latlng, float f1, 
            LatLngBounds latlngbounds, String s2, Uri uri, boolean flag, float f2, int j1, long l1)
    {
        b = i1;
        c = s1;
        o = Collections.unmodifiableList(list);
        d = bundle;
        e = hz;
        f = latlng;
        g = f1;
        h = latlngbounds;
        i = s2;
        j = uri;
        k = flag;
        l = f2;
        m = j1;
        n = l1;
        s1 = new HashMap();
        for (list = bundle.keySet().iterator(); list.hasNext(); s1.put(ht.a(hz), bundle.getString(hz)))
        {
            hz = (String)list.next();
        }

        p = Collections.unmodifiableMap(s1);
        q = TimeZone.getTimeZone(i);
        r = null;
        s = null;
    }

    private void a(String s1)
    {
        if (s != null)
        {
            s.a(new je(c, s1));
        }
    }

    public final String a()
    {
        a("getId");
        return c;
    }

    public final List b()
    {
        a("getTypes");
        return o;
    }

    public final LatLng c()
    {
        a("getLatLng");
        return f;
    }

    public final float d()
    {
        a("getLevelNumber");
        return g;
    }

    public final int describeContents()
    {
        jf jf1 = a;
        return 0;
    }

    public final LatLngBounds e()
    {
        a("getViewport");
        return h;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hx))
            {
                return false;
            }
            obj = (hx)obj;
            if (!c.equals(((hx) (obj)).c) || !gq.a(r, ((hx) (obj)).r) || n != ((hx) (obj)).n)
            {
                return false;
            }
        }
        return true;
    }

    public final Uri f()
    {
        a("getWebsiteUri");
        return j;
    }

    public final boolean g()
    {
        a("isPermanentlyClosed");
        return k;
    }

    public final float h()
    {
        a("getRating");
        return l;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, r, Long.valueOf(n)
        });
    }

    public final int i()
    {
        a("getPriceLevel");
        return m;
    }

    public final long j()
    {
        return n;
    }

    public final Bundle k()
    {
        return d;
    }

    public final hz l()
    {
        return e;
    }

    public final String m()
    {
        return i;
    }

    public final String toString()
    {
        return gq.a(this).a("id", c).a("localization", e).a("locale", r).a("latlng", f).a("levelNumber", Float.valueOf(g)).a("viewport", h).a("timeZone", i).a("websiteUri", j).a("isPermanentlyClosed", Boolean.valueOf(k)).a("priceLevel", Integer.valueOf(m)).a("timestampSecs", Long.valueOf(n)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        jf jf1 = a;
        jf.a(this, parcel, i1);
    }

}
