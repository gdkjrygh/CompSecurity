// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzc

public final class LabelValueRow
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    String a;
    String b;
    ArrayList c;
    private final int d;

    LabelValueRow()
    {
        d = 1;
        c = zzkx.a();
    }

    LabelValueRow(int i, String s, String s1, ArrayList arraylist)
    {
        d = i;
        a = s;
        b = s1;
        c = arraylist;
    }

    public int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.a(this, parcel, i);
    }

}
