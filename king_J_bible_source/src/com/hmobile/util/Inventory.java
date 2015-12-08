// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.hmobile.util:
//            Purchase, SkuDetails

public class Inventory
{

    Map mPurchaseMap;
    Map mSkuMap;

    Inventory()
    {
        mSkuMap = new HashMap();
        mPurchaseMap = new HashMap();
    }

    void addPurchase(Purchase purchase)
    {
        mPurchaseMap.put(purchase.getSku(), purchase);
    }

    void addSkuDetails(SkuDetails skudetails)
    {
        mSkuMap.put(skudetails.getSku(), skudetails);
    }

    public void erasePurchase(String s)
    {
        if (mPurchaseMap.containsKey(s))
        {
            mPurchaseMap.remove(s);
        }
    }

    List getAllOwnedSkus()
    {
        return new ArrayList(mPurchaseMap.keySet());
    }

    List getAllOwnedSkus(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mPurchaseMap.values().iterator();
        do
        {
            Purchase purchase;
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                purchase = (Purchase)iterator.next();
            } while (!purchase.getItemType().equals(s));
            arraylist.add(purchase.getSku());
        } while (true);
    }

    List getAllPurchases()
    {
        return new ArrayList(mPurchaseMap.values());
    }

    public Purchase getPurchase(String s)
    {
        return (Purchase)mPurchaseMap.get(s);
    }

    public SkuDetails getSkuDetails(String s)
    {
        return (SkuDetails)mSkuMap.get(s);
    }

    public boolean hasDetails(String s)
    {
        return mSkuMap.containsKey(s);
    }

    public boolean hasPurchase(String s)
    {
        return mPurchaseMap.containsKey(s);
    }
}
