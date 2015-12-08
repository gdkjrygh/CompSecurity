// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kc

public class zzpg
    implements SafeParcelable
{

    public static final kc CREATOR = new kc();
    static final List a = Collections.emptyList();
    LocationRequest b;
    boolean c;
    boolean d;
    boolean e;
    List f;
    final String g;
    private final int h;

    zzpg(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        h = i;
        b = locationrequest;
        c = flag;
        d = flag1;
        e = flag2;
        f = list;
        g = s;
    }

    private zzpg(LocationRequest locationrequest)
    {
        this(1, locationrequest, false, true, true, a, null);
    }

    public static zzpg a(LocationRequest locationrequest)
    {
        return new zzpg(locationrequest);
    }

    final int a()
    {
        return h;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzpg)
        {
            if (an.a(b, ((zzpg) (obj = (zzpg)obj)).b) && c == ((zzpg) (obj)).c && d == ((zzpg) (obj)).d && e == ((zzpg) (obj)).e && an.a(f, ((zzpg) (obj)).f))
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
        stringbuilder.append(" clients=");
        stringbuilder.append(f);
        if (g != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(g);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kc.a(this, parcel, i);
    }

}
