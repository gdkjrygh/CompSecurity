// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, zzao

public class zzae
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public final int a;
    public final int b;
    public final zzao c;

    zzae(int i, int j, zzao zzao)
    {
        a = i;
        b = j;
        c = zzao;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
