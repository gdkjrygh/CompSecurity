// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRow, PurchaseRecordRenderable, PurchaseRecordAction

public final class PurchaseRecord
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PurchaseRecord createFromParcel(Parcel parcel)
        {
            PurchaseRecord purchaserecord = new PurchaseRecord();
            purchaserecord.status = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
            purchaserecord.type = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
            purchaserecord.title = parcel.readString();
            purchaserecord.label = parcel.readString();
            purchaserecord.displayableAmount = parcel.readString();
            purchaserecord.imageUrl = parcel.readString();
            purchaserecord.transactionTimeInMillis = (Long)parcel.readValue(java/lang/Long.getClassLoader());
            purchaserecord.id = parcel.readString();
            boolean aflag[] = new boolean[1];
            parcel.readBooleanArray(aflag);
            purchaserecord.isPending = aflag[0];
            purchaserecord.creditDebit = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
            purchaserecord.counterPartyEmail = parcel.readString();
            purchaserecord.counterPartyName = parcel.readString();
            purchaserecord.totalAmountMicros = (Long)parcel.readValue(java/lang/Long.getClassLoader());
            purchaserecord.totalAmountCurrencyCode = parcel.readString();
            purchaserecord.userVisibleTransactionId = parcel.readString();
            purchaserecord.purchaseRecordRows = parcel.createTypedArrayList(PurchaseRecordRow.CREATOR);
            purchaserecord.actions = parcel.createTypedArrayList(PurchaseRecordAction.CREATOR);
            return purchaserecord;
        }

        private static PurchaseRecord[] newArray(int i)
        {
            return new PurchaseRecord[i];
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
    private List actions;
    private String counterPartyEmail;
    private String counterPartyName;
    private Integer creditDebit;
    private String displayableAmount;
    private String id;
    private String imageUrl;
    private boolean isPending;
    private String label;
    private String memo;
    private List purchaseRecordRows;
    private com.google.wallet.proto.NanoWalletWobl.RenderOutput renderOutput;
    private Integer status;
    private String title;
    private String totalAmountCurrencyCode;
    private Long totalAmountMicros;
    private Long transactionTimeInMillis;
    private Integer type;
    private String userVisibleTransactionId;

    public PurchaseRecord()
    {
    }

    public static PurchaseRecord from(com.google.wallet.proto.NanoWalletEntities.NfcTapEvent nfctapevent, Context context, int i)
    {
        PurchaseRecord purchaserecord = new PurchaseRecord();
        purchaserecord.type = Integer.valueOf(1);
        purchaserecord.purchaseRecordRows = Lists.newArrayList();
        purchaserecord.actions = Lists.newArrayList();
        PurchaseRecordRow purchaserecordrow = new PurchaseRecordRow(null, context.getString(com.google.android.apps.walletnfcrel.R.string.receipt_purchase_type_nfc_label), null, PurchaseRecordRow.RuleWeight.THIN, PurchaseRecordRenderable.createWithText(PurchaseRecordRenderable.Style.BOLD, context.getString(i), null), null, true);
        purchaserecord.purchaseRecordRows.add(purchaserecordrow);
        if (nfctapevent.purchaseTimeMillis != null)
        {
            nfctapevent = new PurchaseRecordRow(null, null, null, PurchaseRecordRow.RuleWeight.THIN, PurchaseRecordRenderable.createWithDateTime(nfctapevent.purchaseTimeMillis), null, false);
            purchaserecord.purchaseRecordRows.add(nfctapevent);
        }
        nfctapevent = new PurchaseRecordRow(context.getString(com.google.android.apps.walletnfcrel.R.string.receipt_status), null, null, PurchaseRecordRow.RuleWeight.THIN, PurchaseRecordRenderable.createWithText(PurchaseRecordRenderable.Style.NORMAL, context.getString(com.google.android.apps.walletnfcrel.R.string.tap_completed_status_unknown), null), null, false);
        purchaserecord.purchaseRecordRows.add(nfctapevent);
        purchaserecord.creditDebit = Integer.valueOf(2);
        return purchaserecord;
    }

    public static PurchaseRecord fromClientPurchaseRecord(com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord)
    {
        boolean flag1 = true;
        Preconditions.checkNotNull(clientpurchaserecord, "ClientPurchaseRecord is null");
        PurchaseRecord purchaserecord;
        int i;
        boolean flag;
        if (clientpurchaserecord.id != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "ClientPurchaseRecord has no id");
        flag = flag1;
        if (clientpurchaserecord.basicView == null)
        {
            if (clientpurchaserecord.renderOutput != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Preconditions.checkState(flag, "Purchase record has no MRF or RenderOutput");
        purchaserecord = new PurchaseRecord();
        purchaserecord.id = clientpurchaserecord.id;
        if (clientpurchaserecord.status != null)
        {
            purchaserecord.status = clientpurchaserecord.status.status;
        }
        if (clientpurchaserecord.type != null)
        {
            i = Protos.valueWithDefault(clientpurchaserecord.type.type, 0);
        } else
        {
            i = 0;
        }
        purchaserecord.type = Integer.valueOf(i);
        if (clientpurchaserecord.basicView != null)
        {
            if (clientpurchaserecord.basicView.listTitle != null)
            {
                purchaserecord.title = clientpurchaserecord.basicView.listTitle;
            }
            if (clientpurchaserecord.basicView.listLabel != null)
            {
                purchaserecord.label = clientpurchaserecord.basicView.listLabel;
            }
            if (clientpurchaserecord.basicView.listAmount != null)
            {
                purchaserecord.displayableAmount = clientpurchaserecord.basicView.listAmount;
            }
            if (clientpurchaserecord.basicView.listImageUrl != null)
            {
                purchaserecord.imageUrl = clientpurchaserecord.basicView.listImageUrl;
            }
            if (clientpurchaserecord.basicView.transactionTime != null && clientpurchaserecord.basicView.transactionTime.millisSinceEpoch != null)
            {
                purchaserecord.transactionTimeInMillis = clientpurchaserecord.basicView.transactionTime.millisSinceEpoch;
            }
            purchaserecord.purchaseRecordRows = PurchaseRecordRow.fromRows(Arrays.asList(clientpurchaserecord.basicView.row));
            purchaserecord.actions = PurchaseRecordAction.fromActionRenderables(Arrays.asList(clientpurchaserecord.basicView.actionRenderable));
        }
        if (clientpurchaserecord.renderOutput != null)
        {
            purchaserecord.renderOutput = clientpurchaserecord.renderOutput;
            purchaserecord.actions = PurchaseRecordAction.fromActionRenderables(Arrays.asList(clientpurchaserecord.actionRenderable));
        }
        if (clientpurchaserecord.pending != null)
        {
            purchaserecord.isPending = clientpurchaserecord.pending.booleanValue();
        }
        purchaserecord.creditDebit = clientpurchaserecord.creditDebit;
        if ((i == 3 || i == 2) && clientpurchaserecord.p2PDetails.counterParty != null && clientpurchaserecord.p2PDetails.counterParty.email != null)
        {
            purchaserecord.counterPartyEmail = clientpurchaserecord.p2PDetails.counterParty.email;
        }
        if (i == 13)
        {
            purchaserecord.counterPartyEmail = clientpurchaserecord.moneyRequestDetails.requester.email;
            purchaserecord.counterPartyName = clientpurchaserecord.moneyRequestDetails.requester.displayName;
            purchaserecord.memo = clientpurchaserecord.moneyRequestDetails.requesterMessage;
        }
        if (i == 12)
        {
            purchaserecord.counterPartyEmail = clientpurchaserecord.moneyRequestDetails.requestee.email;
            purchaserecord.counterPartyName = clientpurchaserecord.moneyRequestDetails.requestee.displayName;
            purchaserecord.memo = clientpurchaserecord.moneyRequestDetails.requesterMessage;
        }
        if ((i == 3 || i == 2) && clientpurchaserecord.p2PDetails.counterParty != null && clientpurchaserecord.p2PDetails.counterParty.displayName != null)
        {
            purchaserecord.counterPartyName = clientpurchaserecord.p2PDetails.counterParty.displayName;
            purchaserecord.memo = clientpurchaserecord.p2PDetails.senderMessage;
        }
        if (clientpurchaserecord.totalAmount != null)
        {
            com.google.checkout.customer.common.definitions.NanoMoney.Money money = clientpurchaserecord.totalAmount;
            purchaserecord.totalAmountMicros = money.micros;
            purchaserecord.totalAmountCurrencyCode = money.currencyCode;
        }
        if (clientpurchaserecord.userVisibleTransactionId != null)
        {
            purchaserecord.userVisibleTransactionId = clientpurchaserecord.userVisibleTransactionId;
        }
        return purchaserecord;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final List getActions()
    {
        return actions;
    }

    public final String getCounterPartyEmail()
    {
        return counterPartyEmail;
    }

    public final Integer getCreditDebit()
    {
        return creditDebit;
    }

    public final Optional getDisplayableAmount()
    {
        return Optional.fromNullable(displayableAmount);
    }

    public final String getId()
    {
        return id;
    }

    public final Optional getLabel()
    {
        return Optional.fromNullable(label);
    }

    public final String getMemo()
    {
        return memo;
    }

    public final com.google.wallet.proto.NanoWalletWobl.RenderOutput getRenderOutput()
    {
        return renderOutput;
    }

    public final List getRows()
    {
        return purchaseRecordRows;
    }

    public final String getSenderDisplayName(String s)
    {
        if (!TextUtils.isEmpty(counterPartyName))
        {
            s = counterPartyName;
        } else
        if (!TextUtils.isEmpty(counterPartyEmail))
        {
            return counterPartyEmail;
        }
        return s;
    }

    public final Integer getStatus()
    {
        return status;
    }

    public final Optional getTitle()
    {
        return Optional.fromNullable(title);
    }

    public final String getTotalAmountCurrencyCode()
    {
        return totalAmountCurrencyCode;
    }

    public final long getTotalAmountMicros()
    {
        return totalAmountMicros.longValue();
    }

    public final Optional getTransactionTimeInMillis()
    {
        return Optional.fromNullable(transactionTimeInMillis);
    }

    public final Integer getType()
    {
        return type;
    }

    public final boolean isPending()
    {
        return isPending;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(status);
        parcel.writeValue(type);
        parcel.writeString(title);
        parcel.writeString(label);
        parcel.writeString(displayableAmount);
        parcel.writeString(imageUrl);
        parcel.writeValue(transactionTimeInMillis);
        parcel.writeString(id);
        parcel.writeBooleanArray(new boolean[] {
            isPending
        });
        parcel.writeValue(creditDebit);
        parcel.writeString(counterPartyEmail);
        parcel.writeString(counterPartyName);
        parcel.writeValue(totalAmountMicros);
        parcel.writeString(totalAmountCurrencyCode);
        parcel.writeString(userVisibleTransactionId);
        parcel.writeTypedList(purchaseRecordRows);
        parcel.writeTypedList(actions);
    }



/*
    static Integer access$002(PurchaseRecord purchaserecord, Integer integer)
    {
        purchaserecord.status = integer;
        return integer;
    }

*/


/*
    static String access$1002(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.counterPartyEmail = s;
        return s;
    }

*/


/*
    static Integer access$102(PurchaseRecord purchaserecord, Integer integer)
    {
        purchaserecord.type = integer;
        return integer;
    }

*/


/*
    static String access$1102(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.counterPartyName = s;
        return s;
    }

*/


/*
    static Long access$1202(PurchaseRecord purchaserecord, Long long1)
    {
        purchaserecord.totalAmountMicros = long1;
        return long1;
    }

*/


/*
    static String access$1302(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.totalAmountCurrencyCode = s;
        return s;
    }

*/


/*
    static String access$1402(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.userVisibleTransactionId = s;
        return s;
    }

*/


/*
    static List access$1502(PurchaseRecord purchaserecord, List list)
    {
        purchaserecord.purchaseRecordRows = list;
        return list;
    }

*/


/*
    static List access$1602(PurchaseRecord purchaserecord, List list)
    {
        purchaserecord.actions = list;
        return list;
    }

*/


/*
    static String access$202(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.title = s;
        return s;
    }

*/


/*
    static String access$302(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.label = s;
        return s;
    }

*/


/*
    static String access$402(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.displayableAmount = s;
        return s;
    }

*/


/*
    static String access$502(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.imageUrl = s;
        return s;
    }

*/


/*
    static Long access$602(PurchaseRecord purchaserecord, Long long1)
    {
        purchaserecord.transactionTimeInMillis = long1;
        return long1;
    }

*/


/*
    static String access$702(PurchaseRecord purchaserecord, String s)
    {
        purchaserecord.id = s;
        return s;
    }

*/


/*
    static boolean access$802(PurchaseRecord purchaserecord, boolean flag)
    {
        purchaserecord.isPending = flag;
        return flag;
    }

*/


/*
    static Integer access$902(PurchaseRecord purchaserecord, Integer integer)
    {
        purchaserecord.creditDebit = integer;
        return integer;
    }

*/
}
