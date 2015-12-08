// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddListenerRequestCreator, IWearableListener

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AddListenerRequestCreator();
    public final String capability;
    public final String channelToken;
    public final IntentFilter filters[];
    public final IWearableListener listener;
    final int mVersionCode;

    AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        mVersionCode = i;
        if (ibinder != null)
        {
            listener = IWearableListener.Stub.asInterface(ibinder);
        } else
        {
            listener = null;
        }
        filters = aintentfilter;
        channelToken = s;
        capability = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AddListenerRequestCreator.writeToParcel(this, parcel, i);
    }

}
