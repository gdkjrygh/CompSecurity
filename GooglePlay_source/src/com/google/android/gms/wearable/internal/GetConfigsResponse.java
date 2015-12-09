// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigsResponseCreator

public class GetConfigsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetConfigsResponseCreator();
    public final ConnectionConfiguration configs[];
    public final int statusCode;
    public final int versionCode;

    GetConfigsResponse(int i, int j, ConnectionConfiguration aconnectionconfiguration[])
    {
        versionCode = i;
        statusCode = j;
        configs = aconnectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetConfigsResponseCreator.writeToParcel(this, parcel, i);
    }

}
