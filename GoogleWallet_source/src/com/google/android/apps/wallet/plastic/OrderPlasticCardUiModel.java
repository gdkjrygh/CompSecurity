// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderPlasticCardUiModel
    implements Parcelable
{

    public static final StringValidators ADDRESS_LINE1_VALIDATOR;
    public static final StringValidators ADDRESS_LINE2_VALIDATOR;
    public static final StringValidators CITY_VALIDATOR;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static OrderPlasticCardUiModel createFromParcel(Parcel parcel)
        {
            OrderPlasticCardUiModel orderplasticcarduimodel = new OrderPlasticCardUiModel();
            orderplasticcarduimodel.setAddresses(OrderPlasticCardUiModel.parseAddresses(parcel));
            orderplasticcarduimodel.setSelectedAddressIndex(parcel.readInt());
            return orderplasticcarduimodel;
        }

        private static OrderPlasticCardUiModel[] newArray(int i)
        {
            return new OrderPlasticCardUiModel[i];
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
    public static final StringValidators STATE_VALIDATOR;
    private static final String TAG = com/google/android/apps/wallet/plastic/OrderPlasticCardUiModel.getSimpleName();
    public static final StringValidators ZIP_CODE_VALIDATOR;
    private final ArrayList mAddresses = Lists.newArrayList();
    private int mSelectedAddressIndex;

    public OrderPlasticCardUiModel()
    {
        mSelectedAddressIndex = -1;
    }

    private static List parseAddresses(Parcel parcel)
    {
        int j = parcel.readInt();
        ArrayList arraylist = Lists.newArrayListWithCapacity(j);
        int i = 0;
        while (i < j) 
        {
            try
            {
                arraylist.add(MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.Address(), parcel.createByteArray()));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                WLog.e(TAG, "Unable to parse Address from Parcel");
            }
            i++;
        }
        return arraylist;
    }

    public final int addAndSelectAddress(com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        int i = mAddresses.size();
        mAddresses.add(address);
        setSelectedAddressIndex(i);
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public final List getAddresses()
    {
        return Lists.newArrayList(mAddresses);
    }

    public final com.google.wallet.proto.NanoWalletEntities.Address getSelectedAddress()
    {
        if (mSelectedAddressIndex < 0 || mSelectedAddressIndex > mAddresses.size() - 1)
        {
            return null;
        } else
        {
            return (com.google.wallet.proto.NanoWalletEntities.Address)mAddresses.get(mSelectedAddressIndex);
        }
    }

    public final int getSelectedAddressIndex()
    {
        return mSelectedAddressIndex;
    }

    public final boolean hasSelectedAddress()
    {
        return mSelectedAddressIndex != -1;
    }

    public final boolean isSelectedAddressValid(Resources resources)
    {
        for (com.google.wallet.proto.NanoWalletEntities.Address address = getSelectedAddress(); !CITY_VALIDATOR.isValid(address.city, resources) || !ADDRESS_LINE1_VALIDATOR.isValid(address.line1, resources) || !ADDRESS_LINE2_VALIDATOR.isValid(address.line2, resources) || !STATE_VALIDATOR.isValid(address.state, resources) || !ZIP_CODE_VALIDATOR.isValid(address.postalCode, resources);)
        {
            return false;
        }

        return true;
    }

    public final void setAddresses(List list)
    {
        mAddresses.clear();
        mAddresses.addAll(list);
    }

    public final void setSelectedAddressIndex(int i)
    {
        mSelectedAddressIndex = i;
    }

    public final void updateSelectedAddress(com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        Preconditions.checkNotNull(getSelectedAddress());
        mAddresses.set(getSelectedAddressIndex(), address);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mAddresses.size());
        for (Iterator iterator = mAddresses.iterator(); iterator.hasNext(); parcel.writeByteArray(MessageNano.toByteArray((com.google.wallet.proto.NanoWalletEntities.Address)iterator.next()))) { }
        parcel.writeInt(mSelectedAddressIndex);
    }

    static 
    {
        CITY_VALIDATOR = StringValidators.NON_EMPTY;
        ADDRESS_LINE1_VALIDATOR = StringValidators.NON_EMPTY;
        ADDRESS_LINE2_VALIDATOR = StringValidators.NO_VALIDATION;
        STATE_VALIDATOR = StringValidators.STATE_CODE;
        ZIP_CODE_VALIDATOR = StringValidators.ZIP_CODE;
    }

}
