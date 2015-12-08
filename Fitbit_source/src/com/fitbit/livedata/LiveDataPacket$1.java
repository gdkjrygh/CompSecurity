// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.os.Parcel;

// Referenced classes of package com.fitbit.livedata:
//            LiveDataPacket

static final class 
    implements android.os.r
{

    public LiveDataPacket a(Parcel parcel)
    {
        LiveDataPacket livedatapacket = new LiveDataPacket();
        LiveDataPacket.a(livedatapacket, parcel.readInt());
        LiveDataPacket.b(livedatapacket, parcel.readInt());
        LiveDataPacket.a(livedatapacket, parcel.readDouble());
        LiveDataPacket.b(livedatapacket, parcel.readDouble());
        LiveDataPacket.c(livedatapacket, parcel.readInt());
        LiveDataPacket.a(livedatapacket, (short)parcel.readInt());
        LiveDataPacket.b(livedatapacket, (short)parcel.readInt());
        return livedatapacket;
    }

    public LiveDataPacket[] a(int i)
    {
        return new LiveDataPacket[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
