// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            t, NodeParcelable

public class GetLocalNodeResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    public final int a;
    public final int b;
    public final NodeParcelable c;

    GetLocalNodeResponse(int i, int j, NodeParcelable nodeparcelable)
    {
        a = i;
        b = j;
        c = nodeparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
