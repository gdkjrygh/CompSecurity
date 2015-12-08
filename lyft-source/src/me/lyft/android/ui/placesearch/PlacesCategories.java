// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.infrastructure.googleplaces.GooglePlaceType;

public final class PlacesCategories
{

    public static final List CATEGORIES_BAR;
    public static final List CATEGORIES_BUSINESS;
    public static final List CATEGORIES_CAFE;
    public static final List CATEGORIES_RESTAURANT;
    public static final List CATEGORIES_TOP_DESTINATION;
    public static final int DEFAULT_ICON_RESOURCE = 0x7f0201a0;
    private static final String HOME_SHORTCUT = "home";
    private static final String WORK_SHORTCUT = "work";
    public static final Map categoryToResourceIdMap;

    public PlacesCategories()
    {
    }

    public static int getIconResource(ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        int i = 0x7f0201a0;
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            String s = (String)arraylist.next();
            if (categoryToResourceIdMap.get(s) != null)
            {
                i = ((Integer)categoryToResourceIdMap.get(s)).intValue();
            }
        } while (true);
        return i;
    }

    public static int getIconResource(GooglePlaceType googleplacetype)
    {
        class _cls1
        {

            static final int $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[];

            static 
            {
                $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType = new int[GooglePlaceType.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.BAR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.CAFE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.BUSINESS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.RESTAURANT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.TOP_DESTINATION.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.HOME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.WORK.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.OTHER.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.me.lyft.android.infrastructure.googleplaces.GooglePlaceType[googleplacetype.ordinal()])
        {
        default:
            return 0x7f0201a0;

        case 1: // '\001'
            return 0x7f02019d;

        case 2: // '\002'
            return 0x7f02019f;

        case 3: // '\003'
            return 0x7f02019e;

        case 4: // '\004'
            return 0x7f0201a1;

        case 5: // '\005'
            return 0x7f020205;

        case 6: // '\006'
            return 0x7f020166;

        case 7: // '\007'
            return 0x7f0201ce;
        }
    }

    private static void insertToMap(List list, int i)
    {
        String s;
        for (list = list.iterator(); list.hasNext(); categoryToResourceIdMap.put(s, Integer.valueOf(i)))
        {
            s = (String)list.next();
        }

    }

    static 
    {
        CATEGORIES_BAR = Arrays.asList(new String[] {
            "bar", "night_club"
        });
        CATEGORIES_CAFE = Arrays.asList(new String[] {
            "cafe"
        });
        CATEGORIES_BUSINESS = Arrays.asList(new String[] {
            "accounting", "art_gallery", "atm", "bakery", "bank", "beauty_salon", "bicycle_store", "book_store", "car_dealer", "car_rental", 
            "car_repair", "car_wash", "casino", "city_hall", "clothing_store", "convenience_store", "courthouse", "dentist", "department_store", "doctor", 
            "electrician", "electronics_store", "embassy", "establishment", "finance", "fire_station", "florist", "funeral_home", "furniture_store", "general_contractor", 
            "grocery_or_supermarket", "gym", "hair_care", "hardware_store", "health", "home_goods_store", "hospital", "insurance_agency", "jewelry_store", "laundry", 
            "lawyer", "library", "liquor_store", "local_government_office", "locksmith", "lodging", "movie_rental", "movie_theater", "moving_company", "museum", 
            "painter", "pet_store", "pharmacy", "physiotherapist", "plumber", "police", "post_office", "real_estate_agency", "roofing_contractor", "school", 
            "shoe_store shopping_mall", "storage", "store", "travel_agency", "university", "veterinary_care"
        });
        CATEGORIES_RESTAURANT = Arrays.asList(new String[] {
            "restaurant", "food", "meal_delivery", "meal_takeaway"
        });
        CATEGORIES_TOP_DESTINATION = Arrays.asList(new String[] {
            "top_destination"
        });
        categoryToResourceIdMap = new HashMap();
        insertToMap(CATEGORIES_BAR, 0x7f02019d);
        insertToMap(CATEGORIES_CAFE, 0x7f02019f);
        insertToMap(CATEGORIES_BUSINESS, 0x7f02019e);
        insertToMap(CATEGORIES_RESTAURANT, 0x7f0201a1);
        insertToMap(CATEGORIES_TOP_DESTINATION, 0x7f020205);
        categoryToResourceIdMap.put("home", Integer.valueOf(0x7f020166));
        categoryToResourceIdMap.put("work", Integer.valueOf(0x7f0201ce));
    }
}
