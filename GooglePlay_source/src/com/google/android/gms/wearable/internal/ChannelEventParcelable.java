// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelableCreator, ChannelImpl

public final class ChannelEventParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ChannelEventParcelableCreator();
    final int appErrorCode;
    final ChannelImpl channel;
    final int closeReason;
    final int mVersionCode;
    final int type;

    ChannelEventParcelable(int i, ChannelImpl channelimpl, int j, int k, int l)
    {
        mVersionCode = i;
        channel = channelimpl;
        type = j;
        closeReason = k;
        appErrorCode = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = (new StringBuilder("ChannelEventParcelable[versionCode=")).append(mVersionCode).append(", channel=").append(channel).append(", type=");
        i = type;
        i;
        JVM INSTR tableswitch 1 4: default 72
    //                   1 155
    //                   2 161
    //                   3 173
    //                   4 167;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = Integer.toString(i);
_L11:
        stringbuilder = stringbuilder.append(s).append(", closeReason=");
        i = closeReason;
        i;
        JVM INSTR tableswitch 0 3: default 124
    //                   0 197
    //                   1 179
    //                   2 185
    //                   3 191;
           goto _L6 _L7 _L8 _L9 _L10
_L7:
        break MISSING_BLOCK_LABEL_197;
_L6:
        s = Integer.toString(i);
_L12:
        return stringbuilder.append(s).append(", appErrorCode=").append(appErrorCode).append("]").toString();
_L2:
        s = "CHANNEL_OPENED";
          goto _L11
_L3:
        s = "CHANNEL_CLOSED";
          goto _L11
_L5:
        s = "OUTPUT_CLOSED";
          goto _L11
_L4:
        s = "INPUT_CLOSED";
          goto _L11
_L8:
        s = "CLOSE_REASON_DISCONNECTED";
          goto _L12
_L9:
        s = "CLOSE_REASON_REMOTE_CLOSE";
          goto _L12
_L10:
        s = "CLOSE_REASON_LOCAL_CLOSE";
          goto _L12
        s = "CLOSE_REASON_NORMAL";
          goto _L12
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ChannelEventParcelableCreator.writeToParcel(this, parcel, i);
    }

}
