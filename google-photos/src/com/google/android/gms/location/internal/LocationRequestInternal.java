// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import lhn;

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final lhn CREATOR = new lhn();
    public static final List a = Collections.emptyList();
    public final int b;
    public LocationRequest c;
    public boolean d;
    public boolean e;
    public boolean f;
    public List g;
    public final String h;
    public boolean i;

    public LocationRequestInternal(int j, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
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

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (c.b(c, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).c) && d == ((LocationRequestInternal) (obj)).d && e == ((LocationRequestInternal) (obj)).e && f == ((LocationRequestInternal) (obj)).f && i == ((LocationRequestInternal) (obj)).i && c.b(g, ((LocationRequestInternal) (obj)).g))
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
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(d);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(e);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(f);
        stringbuilder.append(" hideFromAppOps=");
        stringbuilder.append(i);
        stringbuilder.append(" clients=");
        stringbuilder.append(g);
        if (h != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(h);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        lhn.a(this, parcel, j);
    }

}
