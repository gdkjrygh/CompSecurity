// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import android.os.Parcel;
import com.google.common.base.Throwables;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            PaymentCard

final class 
    implements android.os.ator
{

    private static PaymentCard createFromParcel(Parcel parcel)
    {
        try
        {
            parcel = new PaymentCard((com.google.wallet.proto.ties.Credential)MessageNano.mergeFrom(new com.google.wallet.proto.ties.Credential(), parcel.createByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw Throwables.propagate(parcel);
        }
        return parcel;
    }

    private static PaymentCard[] newArray(int i)
    {
        return new PaymentCard[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
