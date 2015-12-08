// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            kj, zzpy

public class zzqa
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kj();
    final int a;
    final zzpy b;
    final float c;

    zzqa(int i, zzpy zzpy1, float f)
    {
        a = i;
        b = zzpy1;
        c = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzqa))
            {
                return false;
            }
            obj = (zzqa)obj;
            if (!b.equals(((zzqa) (obj)).b) || c != ((zzqa) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, Float.valueOf(c)
        });
    }

    public String toString()
    {
        return an.a(this).a("place", b).a("likelihood", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kj.a(this, parcel, i);
    }

}
