// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzs

public class PlacesParams
    implements SafeParcelable
{

    public static final zzs CREATOR = new zzs();
    public static final PlacesParams a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public PlacesParams(int i, String s, String s1, String s2, String s3, String s4, int j)
    {
        b = i;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = j;
    }

    public PlacesParams(String s, Locale locale, String s1)
    {
        this(1, s, locale.toString(), s1, null, null, GoogleApiAvailability.a);
    }

    public PlacesParams(String s, Locale locale, String s1, String s2, String s3)
    {
        this(1, s, locale.toString(), s1, s2, s3, GoogleApiAvailability.a);
    }

    public int describeContents()
    {
        zzs zzs1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof PlacesParams))
            {
                return false;
            }
            obj = (PlacesParams)obj;
            if (!d.equals(((PlacesParams) (obj)).d) || !c.equals(((PlacesParams) (obj)).c) || !zzt.a(e, ((PlacesParams) (obj)).e) || !zzt.a(f, ((PlacesParams) (obj)).f) || !zzt.a(g, ((PlacesParams) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            c, d, e, f, g
        });
    }

    public String toString()
    {
        return zzt.a(this).a("clientPackageName", c).a("locale", d).a("accountName", e).a("gCoreClientName", f).a("chargedPackageName", g).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzs zzs1 = CREATOR;
        zzs.a(this, parcel, i);
    }

}
