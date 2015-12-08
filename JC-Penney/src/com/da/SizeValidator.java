// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.da:
//            DigitalAnalyticsModule, LoggingUtil

final class SizeValidator extends Enum
{

    private static final SizeValidator $VALUES[];
    public static final SizeValidator CONVERSIONEVENT;
    public static final SizeValidator ELEMENT;
    public static final SizeValidator IMPRESSION;
    public static final SizeValidator LINKCLICK;
    public static final SizeValidator ORDER;
    public static final SizeValidator PAGEVIEW;
    public static final SizeValidator PRODUCTVIEW;
    public static final SizeValidator REGISTRATION;
    public static final SizeValidator SHOPACTION5;
    public static final SizeValidator SHOPACTION9;

    private SizeValidator(String s, int i)
    {
        super(s, i);
    }

    private int maxLength(String s, String s1)
    {
        Object obj = null;
        String s2;
        if (s.equals("PAGEVIEW"))
        {
            s2 = "firePageView";
        } else
        if (s.equals("PRODUCTVIEW"))
        {
            s2 = "fireProductview";
        } else
        if (s.equals("SHOPACTION5"))
        {
            s2 = "fireShopAction5";
        } else
        if (s.equals("SHOPACTION9"))
        {
            s2 = "fireShopAction9";
        } else
        if (s.equals("ORDER"))
        {
            s2 = "fireOrder";
        } else
        if (s.equals("REGISTRATION"))
        {
            s2 = "fireRegistration";
        } else
        if (s.equals("ELEMENT"))
        {
            s2 = "fireElement";
        } else
        if (s.equals("CONVERSIONEVENT"))
        {
            s2 = "fireConversionEvent";
        } else
        if (s.equals("LINKCLICK"))
        {
            s2 = "fireLinkClick";
        } else
        if (s.equals("IMPRESSION"))
        {
            s2 = "fireImpression";
        } else
        {
            s2 = null;
        }
        if (!s1.equals("PAGEID")) goto _L2; else goto _L1
_L1:
        s = "pageId";
_L4:
        return DigitalAnalyticsModule.getInstance().maxLength(s2, s);
_L2:
        if (s1.equals("CATEGORYID"))
        {
            s = "category";
        } else
        if (s1.equals("SEARCHTERM"))
        {
            s = "searchTerm";
        } else
        if (s1.equals("SEARCHRESULTS"))
        {
            s = "searchResult";
        } else
        if (s1.equals("ATTRIBUTE"))
        {
            s = "attributes";
        } else
        if (s1.equals("PRODUCTID"))
        {
            s = "productId";
        } else
        if (s1.equals("PRODUCTNAME"))
        {
            s = "productName";
        } else
        if (s1.equals("UNITPRICE"))
        {
            s = "baseUnitPrice";
        } else
        if (s1.equals("QUANTITY"))
        {
            s = "quantity";
        } else
        if (s1.equals("ORDERID"))
        {
            s = "orderId";
        } else
        if (s1.equals("ORDERSUBTOTAL"))
        {
            s = "orderSubTotal";
            if ("fireOrder".equals(s2))
            {
                s = "subtotal";
            }
        } else
        if (s1.equals("REGISTRATIONID"))
        {
            s = "customerId";
        } else
        if (s1.equals("SHIPPING"))
        {
            s = "shippingCharge";
        } else
        if (s1.equals("CITY"))
        {
            s = "customerCity";
        } else
        if (s1.equals("STATE"))
        {
            s = "customerState";
        } else
        if (s1.equals("ZIP"))
        {
            s = "customerZip";
        } else
        if (s1.equals("EMAIL"))
        {
            s = "email";
        } else
        if (s1.equals("ELEMENTID"))
        {
            s = "elementId";
        } else
        if (s1.equals("ELEMENTCATEGORY"))
        {
            s = "elementCategory";
        } else
        if (s1.equals("EVENTID"))
        {
            s = "eventId";
        } else
        if (s1.equals("ACTIONTYPE"))
        {
            s = "actionType";
        } else
        if (s1.equals("EVENTCATEGORYID"))
        {
            s = "eventCategory";
        } else
        if (s1.equals("POINTS"))
        {
            s = "eventPoints";
        } else
        if (s1.equals("LINKNAME"))
        {
            s = "linkName";
        } else
        if (s1.equals("HREF"))
        {
            s = "link";
        } else
        if (s1.equals("REALESTATE"))
        {
            s = "cmre";
        } else
        {
            s = obj;
            if (s1.equals("SITEPROMOTION"))
            {
                s = "cmsp";
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean validate(String s, String s1, String s2)
    {
        if (s2 != null)
        {
            int i = s2.length();
            int j = maxLength(s, s1);
            if (j != -1 && i > j)
            {
                LoggingUtil.log((new StringBuilder()).append("Tag: ").append(s).append(" , Parameter: ").append(s1).append(" exceeds a maximum length limit of ").append(j).toString(), 4);
                return false;
            }
        }
        return true;
    }

    private boolean validate(String s, Map map)
    {
        if (map == null)
        {
            return true;
        }
        map = map.entrySet().iterator();
        boolean flag1 = true;
label0:
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj == null)
            {
                continue;
            }
            boolean flag = flag1;
            if (obj instanceof String)
            {
                flag = flag1;
                if (!validate(s, s1, (String)obj))
                {
                    flag = false;
                }
            }
            if (obj instanceof String[])
            {
                String as[] = (String[])(String[])obj;
                int j = as.length;
                int i = 0;
                do
                {
                    flag1 = flag;
                    if (i >= j)
                    {
                        continue label0;
                    }
                    if (!validate(s, s1, as[i]))
                    {
                        flag = false;
                    }
                    i++;
                } while (true);
            }
            flag1 = flag;
        } while (true);
        return flag1;
    }

    public static SizeValidator valueOf(String s)
    {
        return (SizeValidator)Enum.valueOf(com/da/SizeValidator, s);
    }

    public static SizeValidator[] values()
    {
        return (SizeValidator[])$VALUES.clone();
    }

    public boolean validate(Map map)
    {
        switch (_cls1..SwitchMap.com.da.SizeValidator[ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
            return validate("PAGEVIEW", map);

        case 2: // '\002'
            return validate("PRODUCTVIEW", map);

        case 3: // '\003'
            return validate("SHOPACTION5", map);

        case 4: // '\004'
            return validate("SHOPACTION9", map);

        case 5: // '\005'
            return validate("ORDER", map);

        case 6: // '\006'
            return validate("REGISTRATION", map);

        case 7: // '\007'
            return validate("ELEMENT", map);

        case 8: // '\b'
            return validate("CONVERSIONEVENT", map);

        case 9: // '\t'
            return validate("LINKCLICK", map);

        case 10: // '\n'
            return validate("IMPRESSION", map);
        }
    }

    static 
    {
        PAGEVIEW = new SizeValidator("PAGEVIEW", 0);
        PRODUCTVIEW = new SizeValidator("PRODUCTVIEW", 1);
        SHOPACTION5 = new SizeValidator("SHOPACTION5", 2);
        SHOPACTION9 = new SizeValidator("SHOPACTION9", 3);
        ORDER = new SizeValidator("ORDER", 4);
        REGISTRATION = new SizeValidator("REGISTRATION", 5);
        ELEMENT = new SizeValidator("ELEMENT", 6);
        CONVERSIONEVENT = new SizeValidator("CONVERSIONEVENT", 7);
        LINKCLICK = new SizeValidator("LINKCLICK", 8);
        IMPRESSION = new SizeValidator("IMPRESSION", 9);
        $VALUES = (new SizeValidator[] {
            PAGEVIEW, PRODUCTVIEW, SHOPACTION5, SHOPACTION9, ORDER, REGISTRATION, ELEMENT, CONVERSIONEVENT, LINKCLICK, IMPRESSION
        });
    }

    private class _cls1
    {

        static final int $SwitchMap$com$da$SizeValidator[];

        static 
        {
            $SwitchMap$com$da$SizeValidator = new int[SizeValidator.values().length];
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.PAGEVIEW.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.PRODUCTVIEW.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.SHOPACTION5.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.SHOPACTION9.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.ORDER.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.REGISTRATION.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.ELEMENT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.CONVERSIONEVENT.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.LINKCLICK.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$da$SizeValidator[SizeValidator.IMPRESSION.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
