// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.messages;

import android.os.Parcel;

// Referenced classes of package com.facebook.mqtt.messages:
//            SubscribeTopic

final class t
    implements android.os.Parcelable.Creator
{

    t()
    {
    }

    public SubscribeTopic a(Parcel parcel)
    {
        return new SubscribeTopic(parcel.readString(), parcel.readInt());
    }

    public SubscribeTopic[] a(int i)
    {
        return new SubscribeTopic[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
