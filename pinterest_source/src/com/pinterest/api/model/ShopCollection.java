// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ShopCollectionItem

public class ShopCollection
{

    public List collections;
    public int displayCount;
    public String id;
    public String layout;
    public String title;
    public int totalCount;

    public ShopCollection()
    {
        id = null;
        layout = null;
        title = null;
        collections = null;
        totalCount = 0;
        displayCount = 0;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        int k = pinterestjsonarray.a();
        ArrayList arraylist = new ArrayList(k);
        for (int i = 0; i < k; i++)
        {
            Object obj = pinterestjsonarray.c(i);
            ShopCollection shopcollection = (ShopCollection)((PinterestJsonObject) (obj)).a(com/pinterest/api/model/ShopCollection);
            obj = ((PinterestJsonObject) (obj)).d("collections");
            int l = ((PinterestJsonArray) (obj)).a();
            shopcollection.collections = new ArrayList(l);
            for (int j = 0; j < l; j++)
            {
                ShopCollectionItem shopcollectionitem = ShopCollectionItem.make(((PinterestJsonArray) (obj)).c(j));
                shopcollection.collections.add(shopcollectionitem);
            }

            arraylist.add(shopcollection);
        }

        return arraylist;
    }

    public List getCollections()
    {
        return collections;
    }

    public int getDisplayCount()
    {
        return displayCount;
    }

    public String getId()
    {
        return id;
    }

    public String getLayout()
    {
        return layout;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTotalCount()
    {
        return totalCount;
    }
}
