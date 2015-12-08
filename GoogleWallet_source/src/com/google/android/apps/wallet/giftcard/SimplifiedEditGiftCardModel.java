// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.logging.WLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class SimplifiedEditGiftCardModel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static SimplifiedEditGiftCardModel createFromParcel(Parcel parcel)
        {
            SimplifiedEditGiftCardModel simplifiededitgiftcardmodel = new SimplifiedEditGiftCardModel();
            simplifiededitgiftcardmodel.setWobInstanceId(parcel.readString());
            simplifiededitgiftcardmodel.setWobInstanceServerData(parcel.createByteArray());
            simplifiededitgiftcardmodel.setEditWobUri(parcel.readString());
            try
            {
                simplifiededitgiftcardmodel.setInputForm((com.google.wallet.proto.api.NanoWalletWobForms.InputForm)MessageNano.mergeFrom(new com.google.wallet.proto.api.NanoWalletWobForms.InputForm(), parcel.createByteArray()));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                WLog.e(SimplifiedEditGiftCardModel.TAG, "Unable to parse EditGiftCardModel from parcel.");
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

    };
    private static final String TAG = com/google/android/apps/wallet/giftcard/SimplifiedEditGiftCardModel.getSimpleName();
    private String editWobUri;
    private com.google.wallet.proto.api.NanoWalletWobForms.InputForm inputForm;
    private String wobInstanceId;
    private byte wobInstanceServerData[];

    public SimplifiedEditGiftCardModel()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getEditWobUri()
    {
        return editWobUri;
    }

    public final com.google.wallet.proto.api.NanoWalletWobForms.InputForm getInputForm()
    {
        return inputForm;
    }

    public final String getWobInstanceId()
    {
        return wobInstanceId;
    }

    public final byte[] getWobInstanceServerData()
    {
        return wobInstanceServerData;
    }

    public final void setEditWobUri(String s)
    {
        editWobUri = s;
    }

    public final void setInputForm(com.google.wallet.proto.api.NanoWalletWobForms.InputForm inputform)
    {
        inputForm = inputform;
    }

    public final void setWobInstanceId(String s)
    {
        wobInstanceId = s;
    }

    public final void setWobInstanceServerData(byte abyte0[])
    {
        wobInstanceServerData = abyte0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(wobInstanceId);
        parcel.writeByteArray(wobInstanceServerData);
        parcel.writeString(editWobUri);
        parcel.writeByteArray(MessageNano.toByteArray(inputForm));
    }


}
