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
//            kq

public class zzqo
    implements SafeParcelable
{

    public static final kq CREATOR = new kq();
    public static final zzqo a = new zzqo(0, "Home");
    public static final zzqo b = new zzqo(0, "Work");
    final int c;
    private final String d;

    zzqo(int i, String s)
    {
        c = i;
        d = s;
    }

    public final String a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof zzqo))
        {
            return false;
        } else
        {
            obj = (zzqo)obj;
            return an.a(d, ((zzqo) (obj)).d);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            d
        });
    }

    public String toString()
    {
        return an.a(this).a("alias", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kq.a(this, parcel);
    }

}
