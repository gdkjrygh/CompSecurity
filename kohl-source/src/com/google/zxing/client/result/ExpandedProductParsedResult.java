// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import java.util.Map;

// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class ExpandedProductParsedResult extends ParsedResult
{

    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";
    private final String bestBeforeDate;
    private final String expirationDate;
    private final String lotNumber;
    private final String packagingDate;
    private final String price;
    private final String priceCurrency;
    private final String priceIncrement;
    private final String productID;
    private final String productionDate;
    private final String rawText;
    private final String sscc;
    private final Map uncommonAIs;
    private final String weight;
    private final String weightIncrement;
    private final String weightType;

    public ExpandedProductParsedResult(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
            Map map)
    {
        super(ParsedResultType.PRODUCT);
        rawText = s;
        productID = s1;
        sscc = s2;
        lotNumber = s3;
        productionDate = s4;
        packagingDate = s5;
        bestBeforeDate = s6;
        expirationDate = s7;
        weight = s8;
        weightType = s9;
        weightIncrement = s10;
        price = s11;
        priceIncrement = s12;
        priceCurrency = s13;
        uncommonAIs = map;
    }

    private static boolean equalsOrNull(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private static int hashNotNull(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ExpandedProductParsedResult)
        {
            if (equalsOrNull(productID, ((ExpandedProductParsedResult) (obj = (ExpandedProductParsedResult)obj)).productID) && equalsOrNull(sscc, ((ExpandedProductParsedResult) (obj)).sscc) && equalsOrNull(lotNumber, ((ExpandedProductParsedResult) (obj)).lotNumber) && equalsOrNull(productionDate, ((ExpandedProductParsedResult) (obj)).productionDate) && equalsOrNull(bestBeforeDate, ((ExpandedProductParsedResult) (obj)).bestBeforeDate) && equalsOrNull(expirationDate, ((ExpandedProductParsedResult) (obj)).expirationDate) && equalsOrNull(weight, ((ExpandedProductParsedResult) (obj)).weight) && equalsOrNull(weightType, ((ExpandedProductParsedResult) (obj)).weightType) && equalsOrNull(weightIncrement, ((ExpandedProductParsedResult) (obj)).weightIncrement) && equalsOrNull(price, ((ExpandedProductParsedResult) (obj)).price) && equalsOrNull(priceIncrement, ((ExpandedProductParsedResult) (obj)).priceIncrement) && equalsOrNull(priceCurrency, ((ExpandedProductParsedResult) (obj)).priceCurrency) && equalsOrNull(uncommonAIs, ((ExpandedProductParsedResult) (obj)).uncommonAIs))
            {
                return true;
            }
        }
        return false;
    }

    public String getBestBeforeDate()
    {
        return bestBeforeDate;
    }

    public String getDisplayResult()
    {
        return String.valueOf(rawText);
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public String getLotNumber()
    {
        return lotNumber;
    }

    public String getPackagingDate()
    {
        return packagingDate;
    }

    public String getPrice()
    {
        return price;
    }

    public String getPriceCurrency()
    {
        return priceCurrency;
    }

    public String getPriceIncrement()
    {
        return priceIncrement;
    }

    public String getProductID()
    {
        return productID;
    }

    public String getProductionDate()
    {
        return productionDate;
    }

    public String getRawText()
    {
        return rawText;
    }

    public String getSscc()
    {
        return sscc;
    }

    public Map getUncommonAIs()
    {
        return uncommonAIs;
    }

    public String getWeight()
    {
        return weight;
    }

    public String getWeightIncrement()
    {
        return weightIncrement;
    }

    public String getWeightType()
    {
        return weightType;
    }

    public int hashCode()
    {
        return 0 ^ hashNotNull(productID) ^ hashNotNull(sscc) ^ hashNotNull(lotNumber) ^ hashNotNull(productionDate) ^ hashNotNull(bestBeforeDate) ^ hashNotNull(expirationDate) ^ hashNotNull(weight) ^ hashNotNull(weightType) ^ hashNotNull(weightIncrement) ^ hashNotNull(price) ^ hashNotNull(priceIncrement) ^ hashNotNull(priceCurrency) ^ hashNotNull(uncommonAIs);
    }
}
