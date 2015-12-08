// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            w, m

public class v
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    public final m alO;
    public final int statusCode;
    public final int versionCode;

    v(int i, int j, m m)
    {
        versionCode = i;
        statusCode = j;
        alO = m;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}
