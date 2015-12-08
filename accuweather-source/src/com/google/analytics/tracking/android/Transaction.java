// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Transaction
{
    public static final class Builder
    {

        private String mAffiliation;
        private String mCurrencyCode;
        private long mShippingCostInMicros;
        private final long mTotalCostInMicros;
        private long mTotalTaxInMicros;
        private final String mTransactionId;

        public Transaction build()
        {
            return new Transaction(this);
        }

        public Builder setAffiliation(String s)
        {
            mAffiliation = s;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            mCurrencyCode = s;
            return this;
        }

        public Builder setShippingCostInMicros(long l)
        {
            mShippingCostInMicros = l;
            return this;
        }

        public Builder setTotalTaxInMicros(long l)
        {
            mTotalTaxInMicros = l;
            return this;
        }







        public Builder(String s, long l)
        {
            mAffiliation = null;
            mTotalTaxInMicros = 0L;
            mShippingCostInMicros = 0L;
            mCurrencyCode = null;
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("orderId must not be empty or null");
            } else
            {
                mTransactionId = s;
                mTotalCostInMicros = l;
                return;
            }
        }
    }

    public static final class Item
    {

        private final String mCategory;
        private final String mName;
        private final long mPriceInMicros;
        private final long mQuantity;
        private final String mSKU;

        public String getCategory()
        {
            return mCategory;
        }

        public String getName()
        {
            return mName;
        }

        public long getPriceInMicros()
        {
            return mPriceInMicros;
        }

        public long getQuantity()
        {
            return mQuantity;
        }

        public String getSKU()
        {
            return mSKU;
        }

        private Item(Builder builder)
        {
            mSKU = builder.mSKU;
            mPriceInMicros = builder.mPriceInMicros;
            mQuantity = builder.mQuantity;
            mName = builder.mName;
            mCategory = builder.mCategory;
        }

    }

    public static final class Item.Builder
    {

        private String mCategory;
        private final String mName;
        private final long mPriceInMicros;
        private final long mQuantity;
        private final String mSKU;

        public Item build()
        {
            return new Item(this);
        }

        public Item.Builder setProductCategory(String s)
        {
            mCategory = s;
            return this;
        }






        public Item.Builder(String s, String s1, long l, long l1)
        {
            mCategory = null;
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("SKU must not be empty or null");
            }
            if (TextUtils.isEmpty(s1))
            {
                throw new IllegalArgumentException("name must not be empty or null");
            } else
            {
                mSKU = s;
                mName = s1;
                mPriceInMicros = l;
                mQuantity = l1;
                return;
            }
        }
    }


    private final String mAffiliation;
    private final String mCurrencyCode;
    private final Map mItems;
    private final long mShippingCostInMicros;
    private final long mTotalCostInMicros;
    private final long mTotalTaxInMicros;
    private final String mTransactionId;

    private Transaction(Builder builder)
    {
        mTransactionId = builder.mTransactionId;
        mTotalCostInMicros = builder.mTotalCostInMicros;
        mAffiliation = builder.mAffiliation;
        mTotalTaxInMicros = builder.mTotalTaxInMicros;
        mShippingCostInMicros = builder.mShippingCostInMicros;
        mCurrencyCode = builder.mCurrencyCode;
        mItems = new HashMap();
    }


    public void addItem(Item item)
    {
        mItems.put(item.getSKU(), item);
    }

    public String getAffiliation()
    {
        return mAffiliation;
    }

    public String getCurrencyCode()
    {
        return mCurrencyCode;
    }

    public List getItems()
    {
        return new ArrayList(mItems.values());
    }

    public long getShippingCostInMicros()
    {
        return mShippingCostInMicros;
    }

    public long getTotalCostInMicros()
    {
        return mTotalCostInMicros;
    }

    public long getTotalTaxInMicros()
    {
        return mTotalTaxInMicros;
    }

    public String getTransactionId()
    {
        return mTransactionId;
    }
}
