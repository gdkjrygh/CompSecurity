// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import android.os.Parcel;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccount

final class 
    implements android.os.ator
{

    private static BankAccount createFromParcel(Parcel parcel)
    {
        try
        {
            parcel = new BankAccount((com.google.wallet.proto.ties.BankAccount)MessageNano.mergeFrom(new com.google.wallet.proto.ties.BankAccount(), parcel.createByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("Attempted to restore BankAccount from parcel but failed.");
        }
        return parcel;
    }

    private static BankAccount[] newArray(int i)
    {
        return new BankAccount[i];
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
