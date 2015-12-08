// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;

import android.os.Parcel;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.plastic.api:
//            PlasticCard

final class on
    implements android.os.ator
{

    private static PlasticCard createFromParcel(Parcel parcel)
    {
        try
        {
            parcel = new PlasticCard((com.google.wallet.proto.ties.PlasticProxyCardDetails)MessageNano.mergeFrom(new com.google.wallet.proto.ties.PlasticProxyCardDetails(), parcel.createByteArray()), atus.valueOf(parcel.readString()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("Attempted to restore PlasticProxyCardDetails from parcel but failed.");
        }
        return parcel;
    }

    private static PlasticCard[] newArray(int i)
    {
        return new PlasticCard[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    on()
    {
    }
}
