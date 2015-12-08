// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ig

public class if
    implements SafeParcelable
{

    public static final ig CREATOR = new ig();
    final Bundle Ep;
    final byte Eq[];
    final int responseCode;
    final int versionCode;

    public if(int i, int j, Bundle bundle, byte abyte0[])
    {
        versionCode = i;
        responseCode = j;
        Ep = bundle;
        Eq = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ig.a(this, parcel, i);
    }

}
