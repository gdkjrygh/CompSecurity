// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.upsell;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.store.MenuManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.upsell:
//            UpsellAPI

public class UpsellManager extends Manager
{

    private static final int MAX_SIZE = 4;
    UpsellAPI mUpsellAPI;
    private ArrayList upsellBarProductList;

    public UpsellManager()
    {
    }

    public String getName()
    {
        return "upsell_manager";
    }

    public ArrayList getProductList(MenuManager menumanager, ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            UpsellBarProductData.UpsellBarProduct upsellbarproduct = (UpsellBarProductData.UpsellBarProduct)arraylist.next();
            if (menumanager.getMenu().getProductMap().containsKey(upsellbarproduct.productCode))
            {
                arraylist1.add(menumanager.getProduct(upsellbarproduct.productCode));
            }
        } while (true);
        return arraylist1;
    }

    public List getUpsellBarForCurrentStore()
    {
        MenuManager menumanager = (MenuManager)getSession().getManager("menu_manager");
        if (upsellBarProductList != null && !upsellBarProductList.isEmpty() && menumanager.getMenu() != null && StringHelper.isNotEmpty(menumanager.getMenu().getStoreID()))
        {
            ArrayList arraylist = new ArrayList(upsellBarProductList);
            ArrayList arraylist1 = getProductList(menumanager, arraylist);
            if (arraylist1.size() <= 4)
            {
                Collections.sort(arraylist, new _cls1());
                return getProductList(menumanager, arraylist);
            }
            int i;
            if (arraylist1.size() > 4)
            {
                i = 4;
            } else
            {
                i = arraylist1.size();
            }
            return arraylist1.subList(0, i);
        } else
        {
            return null;
        }
    }

    public void loadUpsellBarList(String s)
    {
        upsellBarProductList = mUpsellAPI.getUpsellBarProductList(s);
    }

    protected void onSessionSet()
    {
    }

    private class _cls1
        implements Comparator
    {

        final UpsellManager this$0;

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
            this$0 = UpsellManager.this;
            super();
        }
    }

}
