// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;

import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.activity.commerce.model.ContactAddressItem;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.Address;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.ItemVariant;
import com.pinterest.model.commerce.ShippingRate;
import com.pinterest.model.commerce.UserCard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.commerce.util:
//            CommerceHelper

public class BuyableProductHelper
{

    public static final String ATTRIBUTE_COLOR = "colors";
    public static final String ATTRIBUTE_MATERIAL = "material";
    public static final String ATTRIBUTE_PATTERN = "pattern";
    public static final String ATTRIBUTE_SIZE = "size";
    private static final String COMMA_SEPARATOR = ", ";
    private static final String DASH = "-";
    private static final Comparator DEFAULT_ATTRIBUTE_COMPARATOR = new _cls2();
    private static final List DEFAULT_ATTRIBUTE_ORDER;
    private static final int DEFAULT_STRING_BUILDER_LEN = 100;
    private static final String DOUBLE_SPACE = " ";
    private static final String LINE_BREAK = "\n";
    public static final int NUM_ATTRIBUTES;
    private static final String PRICE_SEPARATOR = " - ";
    public static final String PRIVACY_POLICY = "https://about.pinterest.com/en/privacy-policy";
    private static final String SPACE = " ";
    public static final String STATEMENT_CREDITS = "https://help.pinterest.com/en/articles/mastercard-statement-credit";

    public BuyableProductHelper()
    {
    }

    public static boolean buyableProductReady(BuyableProduct buyableproduct)
    {
        if (buyableproduct != null)
        {
            if ((buyableproduct = buyableproduct.getVariants()) != null && !buyableproduct.isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    public static List getAttributeOptionsForAttributeName(BuyableProduct buyableproduct, String s, Map map)
    {
        return getAttributeOptionsForAttributeName(buyableproduct, s, map, false);
    }

    public static List getAttributeOptionsForAttributeName(BuyableProduct buyableproduct, String s, Map map, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (!ModelHelper.isValid(s))
        {
            return arraylist;
        }
        List list;
        int j;
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = new HashMap();
        }
        list = (List)buyableproduct.getVariations().get(s);
        j = list.size();
        for (int i = 0; i < j; i++)
        {
            String s1 = (String)list.get(i);
            map.put(s, s1);
            if (getVariantForOptions(buyableproduct.getVariants(), map, flag) != null)
            {
                arraylist.add(s1);
            }
        }

        return arraylist;
    }

    public static ClickableSpan getClickablePrivacyPolicySpan()
    {
        return new _cls3();
    }

    public static String getDefaultImage(BuyableProduct buyableproduct)
    {
        if (buyableproduct.getVariants() != null && !buyableproduct.getVariants().isEmpty())
        {
            buyableproduct = (com.pinterest.api.model.BuyableProduct.Variant)buyableproduct.getVariants().get(0);
            if (buyableproduct.getImages() != null && !buyableproduct.getImages().isEmpty())
            {
                return ((com.pinterest.api.model.Pin.GalleryItem)buyableproduct.getImages().get(0)).getLargeUrl();
            }
        }
        return null;
    }

    public static String getDefaultImageForVariant(com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        if (variant != null)
        {
            if ((variant = variant.getImages()) != null && !variant.isEmpty())
            {
                return ((com.pinterest.api.model.Pin.GalleryItem)variant.get(0)).getLargeUrl();
            }
        }
        return null;
    }

    public static String getDisplayPriceForOptions(BuyableProduct buyableproduct, Map map)
    {
        Object obj = null;
        if (map == null || map.keySet().isEmpty())
        {
            return buyableproduct.getDisplayPrice();
        }
        buyableproduct = getVariantItemsForOptions(buyableproduct, map);
        float f = 0.0F;
        Iterator iterator = buyableproduct.iterator();
        map = null;
        float f2 = 3.402823E+38F;
        buyableproduct = obj;
        while (iterator.hasNext()) 
        {
            com.pinterest.api.model.BuyableProduct.Variant variant = (com.pinterest.api.model.BuyableProduct.Variant)iterator.next();
            float f3 = Float.parseFloat(variant.getActivePrice());
            float f1 = f2;
            if (f3 < f2)
            {
                map = variant;
                f1 = f3;
            }
            if (f3 > f)
            {
                f = f3;
                buyableproduct = variant;
            }
            f2 = f1;
        }
        if (map == buyableproduct)
        {
            return map.getDisplayActivePrice();
        } else
        {
            return (new StringBuilder(buyableproduct.getDisplayActivePrice().length() * 2 + 3)).append(map.getDisplayActivePrice()).append(" - ").append(buyableproduct.getDisplayActivePrice()).toString();
        }
    }

    public static String getFormattedAddress(DetailedShipping detailedshipping)
    {
        return getFormattedAddress(detailedshipping, false);
    }

    public static String getFormattedAddress(DetailedShipping detailedshipping, boolean flag)
    {
        StringBuilder stringbuilder;
label0:
        {
            if (detailedshipping == null)
            {
                return "";
            }
            StringBuilder stringbuilder1 = (new StringBuilder(100)).append(detailedshipping.getFirstName()).append(" ").append(detailedshipping.getLastName());
            stringbuilder = stringbuilder1;
            if (ModelHelper.isValid(detailedshipping.getAddress().getStreet()))
            {
                stringbuilder = stringbuilder1.append("\n").append(detailedshipping.getAddress().getStreet());
            }
            stringbuilder1 = stringbuilder;
            if (ModelHelper.isValid(detailedshipping.getAddress().getExtraStreet()))
            {
                stringbuilder1 = stringbuilder.append("\n").append(detailedshipping.getAddress().getExtraStreet());
            }
            if (!ModelHelper.isValid(detailedshipping.getAddress().getLocality()) && !ModelHelper.isValid(detailedshipping.getAddress().getRegion()))
            {
                stringbuilder = stringbuilder1;
                if (!ModelHelper.isValid(detailedshipping.getAddress().getPostalCode()))
                {
                    break label0;
                }
            }
            stringbuilder = stringbuilder1.append("\n");
        }
        StringBuilder stringbuilder2 = stringbuilder;
        if (ModelHelper.isValid(detailedshipping.getAddress().getLocality()))
        {
            stringbuilder2 = stringbuilder.append(detailedshipping.getAddress().getLocality()).append(", ");
        }
        StringBuilder stringbuilder4 = stringbuilder2;
        if (ModelHelper.isValid(detailedshipping.getAddress().getRegion()))
        {
            stringbuilder4 = stringbuilder2.append(detailedshipping.getAddress().getRegion()).append(" ");
        }
        stringbuilder = stringbuilder4;
        if (ModelHelper.isValid(detailedshipping.getAddress().getPostalCode()))
        {
            stringbuilder = stringbuilder4.append(detailedshipping.getAddress().getPostalCode());
        }
        stringbuilder4 = stringbuilder;
        if (flag)
        {
            StringBuilder stringbuilder3 = stringbuilder;
            if (ModelHelper.isValid(detailedshipping.getEmail()))
            {
                stringbuilder3 = stringbuilder.append("\n").append(detailedshipping.getEmail());
            }
            stringbuilder4 = stringbuilder3;
            if (ModelHelper.isValid(detailedshipping.getPhone()))
            {
                stringbuilder4 = stringbuilder3.append("\n").append(detailedshipping.getPhone());
            }
        }
        return stringbuilder4.toString();
    }

    public static String getFormattedContactAddress(ContactAddressItem contactaddressitem)
    {
        StringBuilder stringbuilder2;
label0:
        {
            stringbuilder2 = (new StringBuilder(100)).append(contactaddressitem.getFirstName()).append(" ").append(contactaddressitem.getLastName());
            StringBuilder stringbuilder = stringbuilder2;
            if (ModelHelper.isValid(contactaddressitem.getStreetAddress1()))
            {
                stringbuilder = stringbuilder2.append("\n").append(contactaddressitem.getStreetAddress1());
            }
            if (!ModelHelper.isValid(contactaddressitem.getCity()) && !ModelHelper.isValid(contactaddressitem.getZipCode()))
            {
                stringbuilder2 = stringbuilder;
                if (!ModelHelper.isValid(contactaddressitem.getState()))
                {
                    break label0;
                }
            }
            stringbuilder2 = stringbuilder.append("\n");
        }
        StringBuilder stringbuilder1 = stringbuilder2;
        if (ModelHelper.isValid(contactaddressitem.getCity()))
        {
            stringbuilder1 = stringbuilder2.append(contactaddressitem.getCity()).append(", ");
        }
        stringbuilder2 = stringbuilder1;
        if (ModelHelper.isValid(contactaddressitem.getState()))
        {
            stringbuilder2 = stringbuilder1.append(contactaddressitem.getState()).append(" ");
        }
        stringbuilder1 = stringbuilder2;
        if (ModelHelper.isValid(contactaddressitem.getZipCode()))
        {
            stringbuilder1 = stringbuilder2.append(contactaddressitem.getZipCode());
        }
        stringbuilder2 = stringbuilder1;
        if (ModelHelper.isValid(contactaddressitem.getEmail()))
        {
            stringbuilder2 = stringbuilder1.append("\n").append(contactaddressitem.getEmail());
        }
        stringbuilder1 = stringbuilder2;
        if (ModelHelper.isValid(contactaddressitem.getPhoneNumber()))
        {
            stringbuilder1 = stringbuilder2.append("\n").append(contactaddressitem.getPhoneNumber());
        }
        return stringbuilder1.toString();
    }

    public static String getFormattedShippingMethod(ShippingRate shippingrate)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append(shippingrate.getTitle()).append("\n").append(shippingrate.getDisplayPrice());
        return stringbuilder.toString();
    }

    public static String getFormattedUserCard(UserCard usercard)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append(usercard.getFirstName()).append(" ").append(usercard.getLastName()).append("\n").append(usercard.getBrandName()).append(" ").append(usercard.getLast4());
        return stringbuilder.toString();
    }

    public static String getHeaderForAttributeName(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1354842768: 91
    //                   -791090288: 105
    //                   3530753: 133
    //                   299066663: 119;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_133;
_L6:
        switch (byte0)
        {
        default:
            throw new IllegalStateException("Unknown attributeName");

        case 0: // '\0'
            return Resources.string(0x7f070161);

        case 1: // '\001'
            return Resources.string(0x7f070163);

        case 2: // '\002'
            return Resources.string(0x7f070162);

        case 3: // '\003'
            return Resources.string(0x7f070164);
        }
_L2:
        if (s.equals("colors"))
        {
            byte0 = 0;
        }
          goto _L6
_L3:
        if (s.equals("pattern"))
        {
            byte0 = 1;
        }
          goto _L6
_L5:
        if (s.equals("material"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("size"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    public static android.view.View.OnClickListener getOnClickMerchantFeed(final String canonicalMerchantDomain)
    {
        return new _cls4();
    }

    public static long getOrderTimeStampMs(Cart cart)
    {
        if (cart.getPaidAt() != 0L)
        {
            return cart.getPaidAt();
        }
        if (cart.getSubmittedAt() != 0L)
        {
            return cart.getSubmittedAt();
        } else
        {
            return cart.getUpdatedAt();
        }
    }

    public static String getPriceDisplay(BuyableProduct buyableproduct)
    {
        String s1 = buyableproduct.getDisplayActiveMinPrice();
        String s3 = buyableproduct.getDisplayActiveMaxPrice();
        String s2 = buyableproduct.getDisplayPrice();
        String s = s2;
        if (s2 == null)
        {
            s = s2;
            if (s1 != null)
            {
                s = s2;
                if (s3 != null)
                {
                    s = s2;
                    if (s1.equals(s3))
                    {
                        s = s1;
                    }
                }
            }
        }
        s2 = buyableproduct.getDisplaySalePrice();
        if (getPriceTitleType(buyableproduct) == PriceTitleType.ON_SALE)
        {
            buyableproduct = s2;
        } else
        {
            if (s1 != null && s3 != null && !s3.equals(s1))
            {
                return (new StringBuilder()).append(s1).append(" - ").append(s3).toString();
            }
            buyableproduct = s;
            if (s == null)
            {
                return "";
            }
        }
        return buyableproduct;
    }

    public static PriceTitleType getPriceTitleType(com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        com.pinterest.api.model.BuyableProduct.Variant.Availability availability = variant.getAvailability();
        switch (_cls5..SwitchMap.com.pinterest.api.model.BuyableProduct.Variant.Availability[availability.ordinal()])
        {
        default:
            return PriceTitleType.UNAVAILABLE;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return PriceTitleType.UNAVAILABLE;

        case 4: // '\004'
            if (variant.getSalePrice() != null && variant.getPrice() != null && !variant.getSalePrice().equals("0.00") && !variant.getSalePrice().equals(variant.getPrice()))
            {
                return PriceTitleType.ON_SALE;
            } else
            {
                return PriceTitleType.NORMAL;
            }

        case 5: // '\005'
            return PriceTitleType.OUT_OF_STOCK;
        }
    }

    public static PriceTitleType getPriceTitleType(BuyableProduct buyableproduct)
    {
        if (Boolean.FALSE.equals(buyableproduct.getIsAvailable()))
        {
            return PriceTitleType.UNAVAILABLE;
        }
        if (Integer.valueOf(0).equals(buyableproduct.getAvailability()))
        {
            return PriceTitleType.OUT_OF_STOCK;
        }
        if (buyableproduct.getSalePrice() != null && buyableproduct.getPrice() != null && !buyableproduct.getSalePrice().equals(buyableproduct.getPrice()))
        {
            return PriceTitleType.ON_SALE;
        } else
        {
            return PriceTitleType.NORMAL;
        }
    }

    public static final com.pinterest.api.model.BuyableProduct.Variant getVariantForOptions(List list, Map map)
    {
        return getVariantForOptions(list, map, false);
    }

    public static final com.pinterest.api.model.BuyableProduct.Variant getVariantForOptions(List list, Map map, boolean flag)
    {
        list = list.iterator();
_L2:
        com.pinterest.api.model.BuyableProduct.Variant variant;
        boolean flag1;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        variant = (com.pinterest.api.model.BuyableProduct.Variant)list.next();
        Iterator iterator = map.keySet().iterator();
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_123;
            }
            s = (String)iterator.next();
        } while (((String)variant.getVariant().get(s)).equals(map.get(s)));
        flag1 = false;
_L3:
        com.pinterest.api.model.BuyableProduct.Variant.Availability availability = variant.getAvailability();
        if (flag1 && (!flag || flag && availability == com.pinterest.api.model.BuyableProduct.Variant.Availability.IN_STOCK))
        {
            return variant;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return null;
        flag1 = true;
          goto _L3
    }

    public static List getVariantItemsForOptions(BuyableProduct buyableproduct, Map map)
    {
        ArrayList arraylist = new ArrayList();
        buyableproduct = buyableproduct.getVariants().iterator();
        do
        {
            if (!buyableproduct.hasNext())
            {
                break;
            }
            com.pinterest.api.model.BuyableProduct.Variant variant = (com.pinterest.api.model.BuyableProduct.Variant)buyableproduct.next();
            Iterator iterator = map.keySet().iterator();
            boolean flag = true;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (!((String)variant.getVariant().get(s)).equals(map.get(s)))
                {
                    flag = false;
                }
            } while (true);
            if (flag)
            {
                arraylist.add(variant);
            }
        } while (true);
        return arraylist;
    }

    public static String getVariantOptionsForDisplay(ItemVariant itemvariant)
    {
        if (itemvariant == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = DEFAULT_ATTRIBUTE_ORDER.iterator();
        do
        {
            if (iterator.hasNext())
            {
                String s = (String)iterator.next();
                if (s.equals("colors") && ModelHelper.isValid(itemvariant.getColors()))
                {
                    s = itemvariant.getColors();
                } else
                if (s.equals("size") && ModelHelper.isValid(itemvariant.getSize()))
                {
                    s = itemvariant.getSize();
                } else
                if (s.equals("pattern") && ModelHelper.isValid(itemvariant.getPattern()))
                {
                    s = itemvariant.getPattern();
                } else
                if (s.equals("material") && ModelHelper.isValid(itemvariant.getMaterial()))
                {
                    s = itemvariant.getMaterial();
                } else
                {
                    s = null;
                }
                if (s != null)
                {
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append("\n");
                    }
                    stringbuilder.append(s);
                }
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static boolean isPinAvailable(Pin pin)
    {
        if (isPinBuyable(pin))
        {
            if ((pin = getPriceTitleType(pin.getBuyableProduct())) != PriceTitleType.OUT_OF_STOCK && pin != PriceTitleType.UNAVAILABLE)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isPinBuyable(Pin pin)
    {
        return CommerceHelper.isCommerceEnabled() && ModelHelper.isValid(pin.getBuyableProduct()) && ModelHelper.isValid(pin.getBuyableProduct().getMerchantItemGroupId());
    }

    public static boolean isPointInsideView(float f, float f1, View view)
    {
        if (view != null)
        {
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            int i = ai[0];
            int j = ai[1];
            if (f > (float)i && f < (float)(i + view.getWidth()) && f1 > (float)j && f1 < (float)(j + view.getHeight()))
            {
                return true;
            }
        }
        return false;
    }

    public static List sortAttributeNames(Map map)
    {
        map = map.keySet();
        String as[] = new String[map.size()];
        map.toArray(as);
        Arrays.sort(as, DEFAULT_ATTRIBUTE_COMPARATOR);
        return Arrays.asList(as);
    }

    static 
    {
        _cls1 _lcls1 = new _cls1(4);
        DEFAULT_ATTRIBUTE_ORDER = _lcls1;
        NUM_ATTRIBUTES = _lcls1.size();
    }


    private class _cls3 extends ClickableSpan
    {

        public final void onClick(View view)
        {
            Events.post(new Navigation(Location.BROWSER, "https://about.pinterest.com/en/privacy-policy"));
            Events.post(new CloseCommerceFormDialogEvent());
        }

        public final void updateDrawState(TextPaint textpaint)
        {
            textpaint.setColor(Resources.color(0x7f0e0073));
            textpaint.setFakeBoldText(true);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final String val$canonicalMerchantDomain;

        public final void onClick(View view)
        {
            view = new Navigation(Location.SEARCH_PIN_COMMERCE);
            view.putStringParcelable("domain", canonicalMerchantDomain);
            Events.post(view);
        }

        _cls4()
        {
            canonicalMerchantDomain = s;
            super();
        }
    }


    private class PriceTitleType extends Enum
    {

        private static final PriceTitleType $VALUES[];
        public static final PriceTitleType NORMAL;
        public static final PriceTitleType ON_SALE;
        public static final PriceTitleType OUT_OF_STOCK;
        public static final PriceTitleType UNAVAILABLE;

        public static PriceTitleType valueOf(String s)
        {
            return (PriceTitleType)Enum.valueOf(com/pinterest/activity/commerce/util/BuyableProductHelper$PriceTitleType, s);
        }

        public static PriceTitleType[] values()
        {
            return (PriceTitleType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new PriceTitleType("NORMAL", 0);
            OUT_OF_STOCK = new PriceTitleType("OUT_OF_STOCK", 1);
            UNAVAILABLE = new PriceTitleType("UNAVAILABLE", 2);
            ON_SALE = new PriceTitleType("ON_SALE", 3);
            $VALUES = (new PriceTitleType[] {
                NORMAL, OUT_OF_STOCK, UNAVAILABLE, ON_SALE
            });
        }

        private PriceTitleType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls5
    {

        static final int $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[];

        static 
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability = new int[com.pinterest.api.model.BuyableProduct.Variant.Availability.values().length];
            try
            {
                $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.BuyableProduct.Variant.Availability.UNKNOWN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.BuyableProduct.Variant.Availability.UNAVAILABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.BuyableProduct.Variant.Availability.PREORDER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.BuyableProduct.Variant.Availability.IN_STOCK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.BuyableProduct.Variant.Availability.OUT_OF_STOCK.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends ArrayList
    {

        _cls1(int i)
        {
            super(i);
            add("colors");
            add("size");
            add("pattern");
            add("material");
        }
    }


    private class _cls2
        implements Comparator
    {

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((String)obj, (String)obj1);
        }

        public final int compare(String s, String s1)
        {
            if (BuyableProductHelper.DEFAULT_ATTRIBUTE_ORDER.indexOf(s) < BuyableProductHelper.DEFAULT_ATTRIBUTE_ORDER.indexOf(s1))
            {
                return -1;
            }
            if (BuyableProductHelper.DEFAULT_ATTRIBUTE_ORDER.indexOf(s) > BuyableProductHelper.DEFAULT_ATTRIBUTE_ORDER.indexOf(s1))
            {
                return 1;
            } else
            {
                throw new IllegalStateException("There shouldn't be duplicate attributes");
            }
        }

        _cls2()
        {
        }
    }

}
