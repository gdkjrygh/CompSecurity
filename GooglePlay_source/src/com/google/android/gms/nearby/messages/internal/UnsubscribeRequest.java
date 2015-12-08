// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            UnsubscribeRequestCreator, INearbyMessagesCallback, IMessageListener

public final class UnsubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new UnsubscribeRequestCreator();
    public final INearbyMessagesCallback callback;
    final int mVersionCode;
    public final IMessageListener messageListener;
    public final int messageListenerKey;
    public final PendingIntent pendingIntent;
    public final String realClientPackageName;
    public final boolean useRealClientApiKey;
    public final String zeroPartyPackageName;

    UnsubscribeRequest(int i, IBinder ibinder, IBinder ibinder1, PendingIntent pendingintent, int j, String s, String s1, 
            boolean flag)
    {
        mVersionCode = i;
        messageListener = IMessageListener.Stub.asInterface(ibinder);
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder1);
        pendingIntent = pendingintent;
        messageListenerKey = j;
        zeroPartyPackageName = s;
        realClientPackageName = s1;
        useRealClientApiKey = flag;
    }

    UnsubscribeRequest(IBinder ibinder, IBinder ibinder1, String s, String s1, boolean flag)
    {
        this(1, ibinder, ibinder1, null, 0, s, s1, flag);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UnsubscribeRequestCreator.writeToParcel(this, parcel, i);
    }

}
