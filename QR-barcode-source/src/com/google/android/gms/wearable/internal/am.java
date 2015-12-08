// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            an

public class am
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new an();
    public final long avN;
    public final String label;
    public final String packageName;
    public final int versionCode;

    am(int i, String s, String s1, long l)
    {
        versionCode = i;
        packageName = s;
        label = s1;
        avN = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        an.a(this, parcel, i);
    }

}
