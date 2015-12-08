// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLocalNodeResponseCreator, NodeParcelable

public class GetLocalNodeResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetLocalNodeResponseCreator();
    public final NodeParcelable node;
    public final int statusCode;
    public final int versionCode;

    GetLocalNodeResponse(int i, int j, NodeParcelable nodeparcelable)
    {
        versionCode = i;
        statusCode = j;
        node = nodeparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetLocalNodeResponseCreator.writeToParcel(this, parcel, i);
    }

}
