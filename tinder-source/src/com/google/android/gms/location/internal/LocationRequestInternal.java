// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            l

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    static final List a = Collections.emptyList();
    final int b;
    LocationRequest c;
    boolean d;
    boolean e;
    boolean f;
    List g;
    String h;
    boolean i;

    LocationRequestInternal(int j, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
            boolean flag3)
    {
        b = j;
        c = locationrequest;
        d = flag;
        e = flag1;
        f = flag2;
        g = list;
        h = s;
        i = flag3;
    }

    public static LocationRequestInternal a(LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, a, null, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (t.a(c, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).c) && d == ((LocationRequestInternal) (obj)).d && e == ((LocationRequestInternal) (obj)).e && f == ((LocationRequestInternal) (obj)).f && i == ((LocationRequestInternal) (obj)).i && t.a(g, ((LocationRequestInternal) (obj)).g))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return c.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(c.toString());
        if (h != null)
        {
            stringbuilder.append(" tag=").append(h);
        }
        stringbuilder.append(" nlpDebug=").append(d);
        stringbuilder.append(" trigger=").append(f);
        stringbuilder.append(" restorePIListeners=").append(e);
        stringbuilder.append(" hideAppOps=").append(i);
        stringbuilder.append(" clients=").append(g);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        l.a(this, parcel, j);
    }

}
