// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.base.Events;

public class ShopSpaceNavigationHelper
{

    public static final String EXTRA_SHOP_COLLECTION = "shop_collection";
    private static final String NAVIGATION_TYPE_BOARD = "board";
    private static final String NAVIGATION_TYPE_MERCHANT = "merchant";

    public ShopSpaceNavigationHelper()
    {
    }

    public static Navigation getNavigation(ShopCollectionItem shopcollectionitem)
    {
        Object obj;
        byte byte0;
        obj = shopcollectionitem.getType();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -505296440: 76
    //                   93908710: 62;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_76;
_L4:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            obj = new Navigation(Location.COMMERCE_SHOP_SPACE_BOARD);
            ((Navigation) (obj)).putParcelable("shop_collection", shopcollectionitem);
            return ((Navigation) (obj));

        case 1: // '\001'
            obj = new Navigation(Location.SEARCH, "");
            break;
        }
        break MISSING_BLOCK_LABEL_123;
_L3:
        if (((String) (obj)).equals("board"))
        {
            byte0 = 0;
        }
          goto _L4
        if (((String) (obj)).equals("merchant"))
        {
            byte0 = 1;
        }
          goto _L4
        ((Navigation) (obj)).putExtra("com.pinterest.EXTRA_SEARCH_MODE", "VALUE_SEARCH_BUYABLE");
        ((Navigation) (obj)).putStringParcelable("domain", shopcollectionitem.getDomain());
        ((Navigation) (obj)).putParcelable("shop_collection", shopcollectionitem);
        return ((Navigation) (obj));
    }

    public static void handleNavigation(ShopCollectionItem shopcollectionitem)
    {
        Navigation navigation = getNavigation(shopcollectionitem);
        if (navigation == null)
        {
            throw new IllegalStateException((new StringBuilder("Unknown collection type: ")).append(shopcollectionitem.getType()).toString());
        } else
        {
            Events.post(navigation);
            return;
        }
    }
}
