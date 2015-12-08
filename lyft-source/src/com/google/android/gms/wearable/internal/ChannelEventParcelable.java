// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzk, ChannelImpl

public final class ChannelEventParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int a;
    final ChannelImpl b;
    final int c;
    final int d;
    final int e;

    ChannelEventParcelable(int i, ChannelImpl channelimpl, int j, int k, int l)
    {
        a = i;
        b = channelimpl;
        c = j;
        d = k;
        e = l;
    }

    private static String a(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CHANNEL_OPENED";

        case 2: // '\002'
            return "CHANNEL_CLOSED";

        case 4: // '\004'
            return "OUTPUT_CLOSED";

        case 3: // '\003'
            return "INPUT_CLOSED";
        }
    }

    private static String b(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CLOSE_REASON_DISCONNECTED";

        case 2: // '\002'
            return "CLOSE_REASON_REMOTE_CLOSE";

        case 3: // '\003'
            return "CLOSE_REASON_LOCAL_CLOSE";

        case 0: // '\0'
            return "CLOSE_REASON_NORMAL";
        }
    }

    public void a(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        switch (c)
        {
        default:
            Log.w("ChannelEventParcelable", (new StringBuilder()).append("Unknown type: ").append(c).toString());
            return;

        case 1: // '\001'
            channellistener.onChannelOpened(b);
            return;

        case 2: // '\002'
            channellistener.onChannelClosed(b, d, e);
            return;

        case 3: // '\003'
            channellistener.onInputClosed(b, d, e);
            return;

        case 4: // '\004'
            channellistener.onOutputClosed(b, d, e);
            break;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelEventParcelable[versionCode=").append(a).append(", channel=").append(b).append(", type=").append(a(c)).append(", closeReason=").append(b(d)).append(", appErrorCode=").append(e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.a(this, parcel, i);
    }

}
