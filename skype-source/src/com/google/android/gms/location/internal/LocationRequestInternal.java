// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            j

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    static final List a = Collections.emptyList();
    LocationRequest b;
    boolean c;
    boolean d;
    boolean e;
    List f;
    final String g;
    boolean h;
    private final int i;

    LocationRequestInternal(int k, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
            boolean flag3)
    {
        i = k;
        b = locationrequest;
        c = flag;
        d = flag1;
        e = flag2;
        f = list;
        g = s;
        h = flag3;
    }

    public static LocationRequestInternal a(LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, a, null, false);
    }

    final int a()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (x.a(b, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).b) && c == ((LocationRequestInternal) (obj)).c && d == ((LocationRequestInternal) (obj)).d && e == ((LocationRequestInternal) (obj)).e && h == ((LocationRequestInternal) (obj)).h && x.a(f, ((LocationRequestInternal) (obj)).f))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(c);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(d);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(e);
        stringbuilder.append(" hideFromAppOps=");
        stringbuilder.append(h);
        stringbuilder.append(" clients=");
        stringbuilder.append(f);
        if (g != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(g);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        j.a(this, parcel, k);
    }

}
