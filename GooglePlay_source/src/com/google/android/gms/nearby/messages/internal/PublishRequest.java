// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            PublishRequestCreator, INearbyMessagesCallback, MessageWrapper, IPublishCallback

public final class PublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PublishRequestCreator();
    public final INearbyMessagesCallback callback;
    public final boolean isIgnoreNearbyPermission;
    final int mVersionCode;
    public final MessageWrapper messageWrapper;
    public final IPublishCallback publishCallback;
    public final String realClientPackageName;
    public final Strategy strategy;
    public final boolean useRealClientApiKey;
    public final String zeroPartyPackageName;

    PublishRequest(int i, MessageWrapper messagewrapper, Strategy strategy1, IBinder ibinder, String s, String s1, boolean flag, 
            IBinder ibinder1, boolean flag1)
    {
        mVersionCode = i;
        messageWrapper = messagewrapper;
        strategy = strategy1;
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder);
        zeroPartyPackageName = s;
        realClientPackageName = s1;
        isIgnoreNearbyPermission = flag;
        if (ibinder1 == null)
        {
            messagewrapper = null;
        } else
        {
            messagewrapper = IPublishCallback.Stub.asInterface(ibinder1);
        }
        publishCallback = messagewrapper;
        useRealClientApiKey = flag1;
    }

    PublishRequest(MessageWrapper messagewrapper, Strategy strategy1, IBinder ibinder, String s, String s1, boolean flag, IBinder ibinder1, 
            boolean flag1)
    {
        this(2, messagewrapper, strategy1, ibinder, s, s1, flag, ibinder1, flag1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PublishRequestCreator.writeToParcel(this, parcel, i);
    }

}
