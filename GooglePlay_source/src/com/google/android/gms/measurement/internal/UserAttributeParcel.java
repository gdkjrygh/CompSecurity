// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            UserAttributeParcelCreator

public class UserAttributeParcel
    implements SafeParcelable
{

    public static final UserAttributeParcelCreator CREATOR = new UserAttributeParcelCreator();
    public final Float floatValue;
    public final Long longValue;
    public final String name;
    public final String origin;
    public final long setTimestamp;
    public final String stringValue;
    public final int versionCode;

    UserAttributeParcel(int i, String s, long l, Long long1, Float float1, String s1, 
            String s2)
    {
        versionCode = i;
        name = s;
        setTimestamp = l;
        longValue = long1;
        floatValue = float1;
        stringValue = s1;
        origin = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UserAttributeParcelCreator.writeToParcel$2732f0dd(this, parcel);
    }

}
