// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;

// Referenced classes of package com.google.analytics.tracking.android:
//            Transaction

public static final class mQuantity
{

    private String mCategory;
    private final String mName;
    private final long mPriceInMicros;
    private final long mQuantity;
    private final String mSKU;

    public mQuantity build()
    {
        return new mQuantity(this, null);
    }

    public mQuantity setProductCategory(String s)
    {
        mCategory = s;
        return this;
    }






    public (String s, String s1, long l, long l1)
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
