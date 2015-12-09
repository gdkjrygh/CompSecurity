// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            UnpublishRequestCreator, INearbyMessagesCallback, MessageWrapper

public final class UnpublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new UnpublishRequestCreator();
    public final INearbyMessagesCallback callback;
    final int mVersionCode;
    public final MessageWrapper messageWrapper;
    public final String realClientPackageName;
    public final boolean useRealClientApiKey;
    public final String zeroPartyPackageName;

    UnpublishRequest(int i, MessageWrapper messagewrapper, IBinder ibinder, String s, String s1, boolean flag)
    {
        mVersionCode = i;
        messageWrapper = messagewrapper;
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder);
        zeroPartyPackageName = s;
        realClientPackageName = s1;
        useRealClientApiKey = flag;
    }

    UnpublishRequest(MessageWrapper messagewrapper, IBinder ibinder, String s, String s1, boolean flag)
    {
        this(1, messagewrapper, ibinder, s, s1, flag);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UnpublishRequestCreator.writeToParcel(this, parcel, i);
    }

}
