// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;

public class BankAccount
    implements Parcelable
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status AWAITING_CHALLENGE_DEPOSIT;
        public static final Status AWAITING_CHALLENGE_DEPOSIT_VERIFICATION;
        public static final Status AWAITING_YODLEE_VERIFICATION;
        public static final Status DECLINED;
        public static final Status READY_TO_VERIFY;
        public static final Status UNKNOWN;
        public static final Status VALID;
        public static final Status YODLEE_CHALLENGE_IN_PROGRESS;
        public static final Status YODLEE_FAILED;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/apps/wallet/bankaccount/api/BankAccount$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new Status("UNKNOWN", 0);
            READY_TO_VERIFY = new Status("READY_TO_VERIFY", 1);
            AWAITING_CHALLENGE_DEPOSIT = new Status("AWAITING_CHALLENGE_DEPOSIT", 2);
            AWAITING_CHALLENGE_DEPOSIT_VERIFICATION = new Status("AWAITING_CHALLENGE_DEPOSIT_VERIFICATION", 3);
            YODLEE_CHALLENGE_IN_PROGRESS = new Status("YODLEE_CHALLENGE_IN_PROGRESS", 4);
            AWAITING_YODLEE_VERIFICATION = new Status("AWAITING_YODLEE_VERIFICATION", 5);
            YODLEE_FAILED = new Status("YODLEE_FAILED", 6);
            VALID = new Status("VALID", 7);
            DECLINED = new Status("DECLINED", 8);
            $VALUES = (new Status[] {
                UNKNOWN, READY_TO_VERIFY, AWAITING_CHALLENGE_DEPOSIT, AWAITING_CHALLENGE_DEPOSIT_VERIFICATION, YODLEE_CHALLENGE_IN_PROGRESS, AWAITING_YODLEE_VERIFICATION, YODLEE_FAILED, VALID, DECLINED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static BankAccount createFromParcel(Parcel parcel)
        {
            try
            {
                parcel = new BankAccount((com.google.wallet.proto.NanoWalletEntities.BankAccount)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.BankAccount(), parcel.createByteArray()));
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

    };
    private final com.google.wallet.proto.NanoWalletEntities.BankAccount bankAccount;

    public BankAccount(com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount)
    {
        bankAccount = bankaccount;
    }

    private String getAccountNumberTailingDigits()
    {
        return bankAccount.accountNumberTrailingDigits;
    }

    private int getAccountStatus()
    {
        int i = 0;
        if (bankAccount.accountStatus != null)
        {
            i = Protos.valueWithDefault(bankAccount.accountStatus.status, 0);
        }
        return i;
    }

    private static int getRestrictedUse(com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse)
    {
        if (restrictedinstrumentuse == null || restrictedinstrumentuse.use == null || restrictedinstrumentuse.use.use == null)
        {
            return 0;
        } else
        {
            return restrictedinstrumentuse.use.use.intValue();
        }
    }

    private static int getRestrictedUseReason(com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse)
    {
        if (restrictedinstrumentuse == null || restrictedinstrumentuse.restriction == null || restrictedinstrumentuse.restriction.reason == null)
        {
            return 0;
        } else
        {
            return restrictedinstrumentuse.restriction.reason.intValue();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof BankAccount))
        {
            return false;
        } else
        {
            obj = (BankAccount)obj;
            return MessageNano.messageNanoEquals(bankAccount, ((BankAccount) (obj)).bankAccount);
        }
    }

    public final com.google.wallet.proto.NanoWalletEntities.BankAccount getBankAccountProto()
    {
        return bankAccount;
    }

    public final com.google.wallet.proto.NanoWalletEntities.CdpIdData getCdpId()
    {
        return bankAccount.id;
    }

    public final int getChallengeDepositStatus()
    {
        int i = 0;
        if (bankAccount.challengeStatus != null)
        {
            i = Protos.valueWithDefault(bankAccount.challengeStatus.status, 0);
        }
        return i;
    }

    public final int getIavStatus()
    {
        int i = 0;
        if (bankAccount.iavStatus != null)
        {
            i = Protos.valueWithDefault(bankAccount.iavStatus.status, 0);
        }
        return i;
    }

    public final String getNickname(Context context)
    {
        int i;
        int j;
        j = com.google.android.apps.walletnfcrel.R.string.bank_account_name;
        i = j;
        if (bankAccount.accountType == null) goto _L2; else goto _L1
_L1:
        if (bankAccount.accountType.intValue() != 1) goto _L4; else goto _L3
_L3:
        i = com.google.android.apps.walletnfcrel.R.string.checking_account_name;
_L2:
        return context.getString(i, new Object[] {
            getAccountNumberTailingDigits()
        });
_L4:
        i = j;
        if (bankAccount.accountType.intValue() == 2)
        {
            i = com.google.android.apps.walletnfcrel.R.string.savings_account_name;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse getRestrictedUse(int i)
    {
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse arestrictedinstrumentuse[] = bankAccount.restrictedUses;
        int k = arestrictedinstrumentuse.length;
        for (int j = 0; j < k; j++)
        {
            com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = arestrictedinstrumentuse[j];
            if (getRestrictedUse(restrictedinstrumentuse) == i)
            {
                return restrictedinstrumentuse;
            }
        }

        return null;
    }

    public final com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse getRestrictedUseExcludingUnverified(int i)
    {
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse arestrictedinstrumentuse[] = bankAccount.restrictedUses;
        int k = arestrictedinstrumentuse.length;
        for (int j = 0; j < k; j++)
        {
            com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = arestrictedinstrumentuse[j];
            if (getRestrictedUse(restrictedinstrumentuse) == i && getRestrictedUseReason(restrictedinstrumentuse) != 6)
            {
                return restrictedinstrumentuse;
            }
        }

        return null;
    }

    public final Status getStatus()
    {
        getAccountStatus();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 40
    //                   1 44
    //                   2 163
    //                   3 167;
           goto _L1 _L2 _L3 _L4 _L5
_L7:
        return Status.UNKNOWN;
_L2:
        return Status.UNKNOWN;
_L3:
        if (getChallengeDepositStatus() == 0 && getIavStatus() == 0)
        {
            return Status.UNKNOWN;
        }
        switch (getChallengeDepositStatus())
        {
        default:
            break;

        case 3: // '\003'
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
        case 1: // '\001'
            switch (getIavStatus())
            {
            case 0: // '\0'
            case 1: // '\001'
                return Status.READY_TO_VERIFY;

            case 2: // '\002'
                return Status.YODLEE_CHALLENGE_IN_PROGRESS;

            case 3: // '\003'
                return Status.AWAITING_YODLEE_VERIFICATION;

            case 4: // '\004'
                return Status.YODLEE_FAILED;
            }
            break;

        case 2: // '\002'
            return Status.AWAITING_CHALLENGE_DEPOSIT_VERIFICATION;
        }
_L1:
        if (true) goto _L7; else goto _L6
_L6:
        return Status.AWAITING_CHALLENGE_DEPOSIT;
_L4:
        return Status.VALID;
_L5:
        return Status.DECLINED;
    }

    public final String getSubId()
    {
        if (bankAccount.id != null && bankAccount.id.subId != null)
        {
            return bankAccount.id.subId;
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(MessageNano.toByteArray(bankAccount));
    }

    public final boolean isInapplicableForUse(int i)
    {
        boolean flag1 = false;
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse arestrictedinstrumentuse[] = bankAccount.restrictedUses;
        int k = arestrictedinstrumentuse.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (getRestrictedUse(arestrictedinstrumentuse[j]) != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public final boolean isValid()
    {
        return getStatus() == Status.VALID;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(MessageNano.toByteArray(bankAccount));
    }

}
