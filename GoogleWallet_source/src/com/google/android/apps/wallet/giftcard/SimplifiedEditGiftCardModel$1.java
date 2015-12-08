// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Parcel;
import com.google.android.apps.wallet.logging.WLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            SimplifiedEditGiftCardModel

final class 
    implements android.os.implifiedEditGiftCardModel._cls1
{

    private static SimplifiedEditGiftCardModel createFromParcel(Parcel parcel)
    {
        SimplifiedEditGiftCardModel simplifiededitgiftcardmodel = new SimplifiedEditGiftCardModel();
        simplifiededitgiftcardmodel.setWobInstanceId(parcel.readString());
        simplifiededitgiftcardmodel.setWobInstanceServerData(parcel.createByteArray());
        simplifiededitgiftcardmodel.setEditWobUri(parcel.readString());
        try
        {
            simplifiededitgiftcardmodel.setInputForm((com.google.wallet.proto.api.CardModel.setInputForm)MessageNano.mergeFrom(new com.google.wallet.proto.api.init>(), parcel.createByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            WLog.e(SimplifiedEditGiftCardModel.access$000(), "Unable to parse EditGiftCardModel from parcel.");
            return simplifiededitgiftcardmodel;
        }
        return simplifiededitgiftcardmodel;
    }

    private static SimplifiedEditGiftCardModel[] newArray(int i)
    {
        return new SimplifiedEditGiftCardModel[i];
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
