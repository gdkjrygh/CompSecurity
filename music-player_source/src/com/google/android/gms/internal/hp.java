// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ja, gq, gr

public class hp
    implements SafeParcelable
{

    public static final ja a = new ja();
    final int b;
    private final String c;
    private final String d;

    hp(int i, String s, String s1)
    {
        b = i;
        c = s;
        d = s1;
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public int describeContents()
    {
        ja ja1 = a;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof hp)
        {
            if (gq.a(c, ((hp) (obj = (hp)obj)).c) && gq.a(d, ((hp) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d
        });
    }

    public String toString()
    {
        return gq.a(this).a("mPlaceId", c).a("mTag", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ja ja1 = a;
        ja.a(this, parcel);
    }

}
