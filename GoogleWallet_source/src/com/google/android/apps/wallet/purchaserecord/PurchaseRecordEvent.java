// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord

public class PurchaseRecordEvent
{
    public static final class PurchaseRecordEventType extends Enum
    {

        private static final PurchaseRecordEventType $VALUES[];
        public static final PurchaseRecordEventType FETCHING_ADDITIONAL_PAGE;
        public static final PurchaseRecordEventType FETCHING_FIRST_PAGE;
        public static final PurchaseRecordEventType FETCHING_PURCHASE_RECORD;
        public static final PurchaseRecordEventType FETCH_ADDITIONAL_PAGE_ERROR;
        public static final PurchaseRecordEventType FETCH_FIRST_PAGE_ERROR;
        public static final PurchaseRecordEventType FETCH_PURCHASE_RECORD_FAIL;
        public static final PurchaseRecordEventType FETCH_PURCHASE_RECORD_NOT_FOUND;
        public static final PurchaseRecordEventType FETCH_PURCHASE_RECORD_SUCCESS;
        public static final PurchaseRecordEventType LOADED_PAGE;

        public static PurchaseRecordEventType valueOf(String s)
        {
            return (PurchaseRecordEventType)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent$PurchaseRecordEventType, s);
        }

        public static PurchaseRecordEventType[] values()
        {
            return (PurchaseRecordEventType[])$VALUES.clone();
        }

        static 
        {
            FETCHING_FIRST_PAGE = new PurchaseRecordEventType("FETCHING_FIRST_PAGE", 0);
            FETCH_FIRST_PAGE_ERROR = new PurchaseRecordEventType("FETCH_FIRST_PAGE_ERROR", 1);
            FETCHING_ADDITIONAL_PAGE = new PurchaseRecordEventType("FETCHING_ADDITIONAL_PAGE", 2);
            FETCH_ADDITIONAL_PAGE_ERROR = new PurchaseRecordEventType("FETCH_ADDITIONAL_PAGE_ERROR", 3);
            LOADED_PAGE = new PurchaseRecordEventType("LOADED_PAGE", 4);
            FETCHING_PURCHASE_RECORD = new PurchaseRecordEventType("FETCHING_PURCHASE_RECORD", 5);
            FETCH_PURCHASE_RECORD_FAIL = new PurchaseRecordEventType("FETCH_PURCHASE_RECORD_FAIL", 6);
            FETCH_PURCHASE_RECORD_SUCCESS = new PurchaseRecordEventType("FETCH_PURCHASE_RECORD_SUCCESS", 7);
            FETCH_PURCHASE_RECORD_NOT_FOUND = new PurchaseRecordEventType("FETCH_PURCHASE_RECORD_NOT_FOUND", 8);
            $VALUES = (new PurchaseRecordEventType[] {
                FETCHING_FIRST_PAGE, FETCH_FIRST_PAGE_ERROR, FETCHING_ADDITIONAL_PAGE, FETCH_ADDITIONAL_PAGE_ERROR, LOADED_PAGE, FETCHING_PURCHASE_RECORD, FETCH_PURCHASE_RECORD_FAIL, FETCH_PURCHASE_RECORD_SUCCESS, FETCH_PURCHASE_RECORD_NOT_FOUND
            });
        }

        private PurchaseRecordEventType(String s, int i)
        {
            super(s, i);
        }
    }


    private final ImmutableList mPurchaseRecords;
    private final PurchaseRecordEventType mType;

    private PurchaseRecordEvent(ImmutableList immutablelist, PurchaseRecordEventType purchaserecordeventtype)
    {
        mPurchaseRecords = immutablelist;
        mType = purchaserecordeventtype;
    }

    public static PurchaseRecordEvent loadedPageEvent(ImmutableList immutablelist)
    {
        Preconditions.checkNotNull(immutablelist);
        return new PurchaseRecordEvent(immutablelist, PurchaseRecordEventType.LOADED_PAGE);
    }

    public static PurchaseRecordEvent loadedPurchaseRecordEvent(PurchaseRecord purchaserecord)
    {
        Preconditions.checkNotNull(purchaserecord);
        return new PurchaseRecordEvent(ImmutableList.of(purchaserecord), PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS);
    }

    public static PurchaseRecordEvent statusEvent(PurchaseRecordEventType purchaserecordeventtype)
    {
        boolean flag;
        if (purchaserecordeventtype != PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS && purchaserecordeventtype != PurchaseRecordEventType.LOADED_PAGE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new PurchaseRecordEvent(null, purchaserecordeventtype);
    }

    public final PurchaseRecord getPurchaseRecord()
    {
        boolean flag;
        if (mType == PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return (PurchaseRecord)mPurchaseRecords.get(0);
    }

    public final ImmutableList getPurchaseRecords()
    {
        boolean flag;
        if (mType == PurchaseRecordEventType.LOADED_PAGE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return mPurchaseRecords;
    }

    public final PurchaseRecordEventType getType()
    {
        return mType;
    }
}
