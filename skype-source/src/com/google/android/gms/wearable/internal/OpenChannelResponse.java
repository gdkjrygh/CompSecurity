// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ae, ChannelImpl

public class OpenChannelResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    public final int a;
    public final int b;
    public final ChannelImpl c;

    OpenChannelResponse(int i, int j, ChannelImpl channelimpl)
    {
        a = i;
        b = j;
        c = channelimpl;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ae.a(this, parcel, i);
    }

}
