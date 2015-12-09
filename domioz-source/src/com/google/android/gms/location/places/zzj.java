// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            g

public final class zzj
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    public static final zzj a;
    public static final zzj b;
    public static final zzj c;
    public static final Set d;
    final int e;
    final String f;
    final int g;

    zzj(int i, String s, int j)
    {
        ap.a(s);
        e = i;
        f = s;
        g = j;
    }

    private static zzj a(String s, int i)
    {
        return new zzj(0, s, i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzj))
            {
                return false;
            }
            obj = (zzj)obj;
            if (!f.equals(((zzj) (obj)).f) || g != ((zzj) (obj)).g)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return f.hashCode();
    }

    public final String toString()
    {
        return f;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.g.a(this, parcel);
    }

    static 
    {
        a = a("test_type", 1);
        b = a("labeled_place", 6);
        c = a("here_content", 7);
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new zzj[] {
            a, b, c
        })));
    }
}
