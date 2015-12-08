// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            al

public class ak
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    public final long amb;
    public final String label;
    public final String packageName;
    public final int versionCode;

    ak(int i, String s, String s1, long l)
    {
        versionCode = i;
        packageName = s;
        label = s1;
        amb = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        al.a(this, parcel, i);
    }

}
