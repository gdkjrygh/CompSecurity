// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public final class WobCategory extends Enum
{

    private static final WobCategory $VALUES[];
    public static final WobCategory ACTIVE_GIFTCARDS;
    public static final WobCategory ACTIVE_LOYALTY;
    public static final WobCategory ACTIVE_OFFERS;
    public static final WobCategory ACTIVE_ONE_VIEW;
    public static final WobCategory EXPIRED_LOYALTY;
    public static final WobCategory EXPIRED_ONE_VIEW;
    private static final Map ID_TO_WOB_CATEGORY;
    private static final Map UI_LABEL_TO_CATEGORY_ID;
    public static final WobCategory USED_EXPIRED_OFFERS;
    public static final WobCategory USED_GIFTCARDS;
    private final Integer emptyTextId;
    private boolean hasSplashScreen;
    private int id;
    private final Integer titleId;

    private WobCategory(String s, int i, int j, boolean flag, Integer integer)
    {
        this(s, i, j, flag, integer, null);
    }

    private WobCategory(String s, int i, int j, boolean flag, Integer integer, Integer integer1)
    {
        super(s, i);
        id = j;
        hasSplashScreen = flag;
        titleId = integer;
        emptyTextId = integer1;
    }

    public static WobCategory fromId(int i)
    {
        return (WobCategory)ID_TO_WOB_CATEGORY.get(Integer.valueOf(i));
    }

    public static WobCategory labelOrdinalToCategory(Long long1)
    {
        WobCategory wobcategory = (WobCategory)UI_LABEL_TO_CATEGORY_ID.get(long1);
        if (wobcategory == null)
        {
            long1 = String.valueOf(long1);
            throw new RuntimeException((new StringBuilder(String.valueOf(long1).length() + 43)).append("Couldn't map labelOrdinal to WOB category: ").append(long1).toString());
        } else
        {
            return wobcategory;
        }
    }

    public static WobCategory valueOf(String s)
    {
        return (WobCategory)Enum.valueOf(com/google/android/apps/wallet/wobs/caching/WobCategory, s);
    }

    public static WobCategory[] values()
    {
        return (WobCategory[])$VALUES.clone();
    }

    public final Integer getEmptyTextId()
    {
        return emptyTextId;
    }

    public final int getId()
    {
        return id;
    }

    public final Integer getTitleTextId()
    {
        return titleId;
    }

    public final boolean hasSplashScreen()
    {
        return hasSplashScreen;
    }

    static 
    {
        ACTIVE_LOYALTY = new WobCategory("ACTIVE_LOYALTY", 0, 1, true, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.loyalty_active_title));
        EXPIRED_LOYALTY = new WobCategory("EXPIRED_LOYALTY", 1, 2, false, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.loyalty_inactive_title), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.loyalty_expired_empty_text));
        ACTIVE_OFFERS = new WobCategory("ACTIVE_OFFERS", 2, 3, true, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.offers_active_title));
        USED_EXPIRED_OFFERS = new WobCategory("USED_EXPIRED_OFFERS", 3, 4, false, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.offers_inactive_title), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.offers_expired_empty_text));
        ACTIVE_GIFTCARDS = new WobCategory("ACTIVE_GIFTCARDS", 4, 7, true, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.gift_cards_active_title));
        USED_GIFTCARDS = new WobCategory("USED_GIFTCARDS", 5, 8, false, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.gift_cards_inactive_title), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.gift_cards_used_empty_text));
        ACTIVE_ONE_VIEW = new WobCategory("ACTIVE_ONE_VIEW", 6, 9, true, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.one_view_active_tab_title));
        EXPIRED_ONE_VIEW = new WobCategory("EXPIRED_ONE_VIEW", 7, 10, false, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.one_view_expired_tab_title), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.one_view_expired_empty_text));
        $VALUES = (new WobCategory[] {
            ACTIVE_LOYALTY, EXPIRED_LOYALTY, ACTIVE_OFFERS, USED_EXPIRED_OFFERS, ACTIVE_GIFTCARDS, USED_GIFTCARDS, ACTIVE_ONE_VIEW, EXPIRED_ONE_VIEW
        });
        UI_LABEL_TO_CATEGORY_ID = ImmutableMap.builder().put(Long.valueOf(0xf824328813b0d35eL), ACTIVE_LOYALTY).put(Long.valueOf(0x1795015b9646fc27L), EXPIRED_LOYALTY).put(Long.valueOf(0x8c2aa2b750ff66f8L), ACTIVE_OFFERS).put(Long.valueOf(0x8d11e6de4edbd1d3L), USED_EXPIRED_OFFERS).put(Long.valueOf(0x5ca6fa4359bfd2edL), ACTIVE_GIFTCARDS).put(Long.valueOf(0x5ca6fa4359bfd2efL), USED_GIFTCARDS).put(Long.valueOf(1002L), ACTIVE_ONE_VIEW).put(Long.valueOf(1003L), EXPIRED_ONE_VIEW).build();
        ID_TO_WOB_CATEGORY = Maps.newHashMap();
        WobCategory awobcategory[] = values();
        int j = awobcategory.length;
        for (int i = 0; i < j; i++)
        {
            WobCategory wobcategory = awobcategory[i];
            ID_TO_WOB_CATEGORY.put(Integer.valueOf(wobcategory.getId()), wobcategory);
        }

    }
}
