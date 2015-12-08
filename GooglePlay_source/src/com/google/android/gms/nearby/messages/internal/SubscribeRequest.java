// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            SubscribeRequestCreator, INearbyMessagesCallback, IMessageListener, ISubscribeCallback

public final class SubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SubscribeRequestCreator();
    public final INearbyMessagesCallback callback;
    public final MessageFilter filter;
    public final byte hint[];
    public final boolean isIgnoreNearbyPermission;
    final int mVersionCode;
    public final IMessageListener messageListener;
    public final int messageListenerKey;
    public final PendingIntent pendingIntent;
    public final String realClientPackageName;
    public final Strategy strategy;
    public final ISubscribeCallback subscribeCallback;
    public final boolean useRealClientApiKey;
    public final String zeroPartyPackageName;

    SubscribeRequest(int i, IBinder ibinder, Strategy strategy1, IBinder ibinder1, MessageFilter messagefilter, PendingIntent pendingintent, int j, 
            String s, String s1, byte abyte0[], boolean flag, IBinder ibinder2, boolean flag1)
    {
        mVersionCode = i;
        messageListener = IMessageListener.Stub.asInterface(ibinder);
        strategy = strategy1;
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder1);
        filter = messagefilter;
        pendingIntent = pendingintent;
        messageListenerKey = j;
        zeroPartyPackageName = s;
        realClientPackageName = s1;
        hint = abyte0;
        isIgnoreNearbyPermission = flag;
        if (ibinder2 == null)
        {
            ibinder = null;
        } else
        {
            ibinder = ISubscribeCallback.Stub.asInterface(ibinder2);
        }
        subscribeCallback = ibinder;
        useRealClientApiKey = flag1;
    }

    public SubscribeRequest(IBinder ibinder, Strategy strategy1, IBinder ibinder1, MessageFilter messagefilter, String s, String s1, byte abyte0[], 
            boolean flag, IBinder ibinder2, boolean flag1)
    {
        this(3, ibinder, strategy1, ibinder1, messagefilter, null, 0, s, s1, null, flag, ibinder2, flag1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SubscribeRequestCreator.writeToParcel(this, parcel, i);
    }

}
