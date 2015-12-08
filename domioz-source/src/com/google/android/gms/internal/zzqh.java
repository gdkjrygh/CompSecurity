// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            km

public class zzqh
    implements SafeParcelable
{

    public static final km CREATOR = new km();
    public static final zzqh a = new zzqh("com.google.android.gms", Locale.getDefault());
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public zzqh(int i, String s, String s1, String s2, String s3, String s4)
    {
        b = i;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
    }

    private zzqh(String s, Locale locale)
    {
        this(1, s, locale.toString(), null, null, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof zzqh))
            {
                return false;
            }
            obj = (zzqh)obj;
            if (!d.equals(((zzqh) (obj)).d) || !c.equals(((zzqh) (obj)).c) || !an.a(e, ((zzqh) (obj)).e) || !an.a(f, ((zzqh) (obj)).f) || !an.a(g, ((zzqh) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d, e, f, g
        });
    }

    public String toString()
    {
        return an.a(this).a("clientPackageName", c).a("locale", d).a("accountName", e).a("gCoreClientName", f).a("chargedPackageName", g).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        km.a(this, parcel);
    }

}
