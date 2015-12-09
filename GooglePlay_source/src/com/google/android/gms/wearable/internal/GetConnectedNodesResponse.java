// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConnectedNodesResponseCreator

public class GetConnectedNodesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetConnectedNodesResponseCreator();
    public final List nodes;
    public final int statusCode;
    public final int versionCode;

    GetConnectedNodesResponse(int i, int j, List list)
    {
        versionCode = i;
        statusCode = j;
        nodes = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetConnectedNodesResponseCreator.writeToParcel$2f58af5f(this, parcel);
    }

}
