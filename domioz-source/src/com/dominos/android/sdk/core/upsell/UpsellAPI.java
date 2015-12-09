// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.upsell;

import com.dominos.android.sdk.data.http.cdn.ContentRestClient;
import java.util.ArrayList;
import java.util.Collections;

public class UpsellAPI
{

    private int MAX_SIZE;
    ContentRestClient mContentRestClient;

    public UpsellAPI()
    {
        MAX_SIZE = 4;
    }

    public ArrayList getUpsellBarProductList(String s)
    {
        s = mContentRestClient.getUpsellBarList(s);
        if (s != null && s.size() <= MAX_SIZE)
        {
            Collections.sort(s, new _cls1());
        }
        return s;
    }

    private class _cls1
        implements Comparator
    {

        final UpsellAPI this$0;

        public int compare(UpsellBarProductData.UpsellBarProduct upsellbarproduct, UpsellBarProductData.UpsellBarProduct upsellbarproduct1)
        {
            return upsellbarproduct.priority - upsellbarproduct1.priority;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((UpsellBarProductData.UpsellBarProduct)obj, (UpsellBarProductData.UpsellBarProduct)obj1);
        }

        _cls1()
        {
            this$0 = UpsellAPI.this;
            super();
        }
    }

}
