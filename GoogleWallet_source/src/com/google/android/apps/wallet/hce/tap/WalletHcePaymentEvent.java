// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            NfcSessionLog

public final class WalletHcePaymentEvent
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static WalletHcePaymentEvent createFromParcel(Parcel parcel)
        {
            long l = parcel.readLong();
            com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit;
            boolean flag;
            boolean flag1;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            rotatingatclimit = (com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit)parcel.readParcelable(com/google/android/apps/wallet/hce/emv/RotatingAtc$RotatingAtcLimit.getClassLoader());
            if (parcel.readInt() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return new WalletHcePaymentEvent(l, flag, rotatingatclimit, null, flag1);
        }

        private static WalletHcePaymentEvent[] newArray(int i)
        {
            return new WalletHcePaymentEvent[i];
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
    private final com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit atcLimit;
    private final NfcSessionLog nfcSessionLog;
    private final boolean pinExpired;
    private final boolean positive;
    private final long ppmsRowId;

    public WalletHcePaymentEvent(long l, boolean flag, com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit, NfcSessionLog nfcsessionlog, boolean flag1)
    {
        if (flag)
        {
            boolean flag2;
            if (!flag1 && rotatingatclimit == null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Preconditions.checkArgument(flag2);
        }
        ppmsRowId = l;
        positive = flag;
        atcLimit = rotatingatclimit;
        nfcSessionLog = nfcsessionlog;
        pinExpired = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof WalletHcePaymentEvent)
        {
            obj = (WalletHcePaymentEvent)obj;
            flag = flag1;
            if (ppmsRowId == ((WalletHcePaymentEvent) (obj)).ppmsRowId)
            {
                flag = flag1;
                if (positive == ((WalletHcePaymentEvent) (obj)).positive)
                {
                    flag = flag1;
                    if (Objects.equal(atcLimit, ((WalletHcePaymentEvent) (obj)).atcLimit))
                    {
                        flag = flag1;
                        if (pinExpired == ((WalletHcePaymentEvent) (obj)).pinExpired)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit getAtcLimit()
    {
        return atcLimit;
    }

    public final NfcSessionLog getNfcSessionLog()
    {
        return (NfcSessionLog)Preconditions.checkNotNull(nfcSessionLog);
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Long.valueOf(ppmsRowId), Boolean.valueOf(positive), atcLimit, Boolean.valueOf(pinExpired)
        });
    }

    public final boolean isPinExpired()
    {
        return pinExpired;
    }

    public final boolean isPositive()
    {
        return positive;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeLong(ppmsRowId);
        if (positive)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeParcelable(atcLimit, 0);
        if (pinExpired)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
