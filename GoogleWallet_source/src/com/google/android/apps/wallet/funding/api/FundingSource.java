// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.funding.api:
//            BankAccountItemHelper

public final class FundingSource
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static FundingSource createFromParcel(Parcel parcel)
        {
            BankAccount bankaccount = (BankAccount)parcel.readParcelable(com/google/android/apps/wallet/bankaccount/api/BankAccount.getClassLoader());
            PaymentCard paymentcard = (PaymentCard)parcel.readParcelable(com/google/android/apps/wallet/paymentcard/api/PaymentCard.getClassLoader());
            parcel = parcel.createByteArray();
            if (bankaccount != null)
            {
                return new FundingSource(bankaccount);
            }
            if (paymentcard != null)
            {
                return new FundingSource(paymentcard);
            }
            try
            {
                parcel = new FundingSource((com.google.wallet.proto.NanoWalletEntities.StoredValue)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.StoredValue(), parcel));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException(parcel);
            }
            return parcel;
        }

        private static FundingSource[] newArray(int i)
        {
            return new FundingSource[i];
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
    private final BankAccount bankAccount;
    private final PaymentCard paymentCard;
    private final com.google.wallet.proto.NanoWalletEntities.StoredValue storedValue;

    public FundingSource(BankAccount bankaccount)
    {
        bankAccount = (BankAccount)Preconditions.checkNotNull(bankaccount);
        paymentCard = null;
        storedValue = null;
    }

    public FundingSource(PaymentCard paymentcard)
    {
        bankAccount = null;
        paymentCard = (PaymentCard)Preconditions.checkNotNull(paymentcard);
        storedValue = null;
    }

    public FundingSource(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
    {
        bankAccount = null;
        paymentCard = null;
        storedValue = (com.google.wallet.proto.NanoWalletEntities.StoredValue)Preconditions.checkNotNull(storedvalue);
    }

    public static List bankAccountList(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new FundingSource((BankAccount)list.next()))) { }
        return arraylist;
    }

    private com.google.wallet.proto.NanoWalletEntities.CdpIdData getId()
    {
        if (isPaymentCard())
        {
            return paymentCard.getCdpId();
        }
        if (isBankAccount())
        {
            return bankAccount.getCdpId();
        } else
        {
            return storedValue.id;
        }
    }

    public static List paymentCardList(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new FundingSource((PaymentCard)list.next()))) { }
        return arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof FundingSource))
        {
            return false;
        } else
        {
            return ((FundingSource)obj).getCdpId().equals(getCdpId());
        }
    }

    public final BankAccount getBankAccount()
    {
        return bankAccount;
    }

    public final String getCdpId()
    {
        return getId().subId;
    }

    public final String getDescriptiveName(Context context)
    {
        if (isStoredValue())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_balance_and_amount, new Object[] {
                storedValue.balance.displayAmount
            });
        } else
        {
            return getNickname(context);
        }
    }

    public final Intent getDetailsIntent(Context context, int i)
    {
        if (isPaymentCard())
        {
            return PaymentCardApi.createPaymentCardDetailsIntent(context, getPaymentCard().getId().toKeyString(), Integer.valueOf(i));
        }
        if (isBankAccount())
        {
            return BankAccountItemHelper.createAccountItem(bankAccount, context).getIntentWhenClicked();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final String getNickname(Context context)
    {
        if (isPaymentCard())
        {
            return paymentCard.getNickname();
        }
        if (isBankAccount())
        {
            return bankAccount.getNickname(context);
        } else
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_balance);
        }
    }

    public final PaymentCard getPaymentCard()
    {
        return paymentCard;
    }

    public final com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse getRestrictedUse(int i)
    {
        if (isPaymentCard())
        {
            return getPaymentCard().getRestrictedUse(i);
        }
        if (isBankAccount())
        {
            return getBankAccount().getRestrictedUse(i);
        }
        if (isStoredValue())
        {
            com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = new com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse();
            restrictedinstrumentuse.shortMessage = "";
            restrictedinstrumentuse.longMessage = "";
            return restrictedinstrumentuse;
        } else
        {
            return null;
        }
    }

    public final com.google.wallet.proto.NanoWalletEntities.StoredValue getStoredValue()
    {
        return storedValue;
    }

    public final int hashCode()
    {
        return getCdpId().hashCode();
    }

    public final boolean isBankAccount()
    {
        return bankAccount != null;
    }

    public final boolean isInapplicableForUse(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (isPaymentCard())
        {
            flag = getPaymentCard().isInapplicableForUse(i);
        } else
        {
            if (isBankAccount())
            {
                return getBankAccount().isInapplicableForUse(i);
            }
            flag = flag1;
            if (isStoredValue())
            {
                flag = flag1;
                if (i == 3)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public final boolean isPaymentCard()
    {
        return paymentCard != null;
    }

    public final boolean isStoredValue()
    {
        return storedValue != null;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(bankAccount, i);
        parcel.writeParcelable(paymentCard, i);
        if (storedValue != null)
        {
            parcel.writeByteArray(MessageNano.toByteArray(storedValue));
            return;
        } else
        {
            parcel.writeByteArray(new byte[0]);
            return;
        }
    }

}
