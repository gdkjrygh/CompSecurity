// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class zi extends vq
{

    public zi(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13)
    {
        super(zd.h);
        putRequest("keywords", s);
        putRequest("categoryId", s1);
        putRequest("sortBy", s2);
        putRequest("shiptoCountry", s3);
        putRequest("companyId", s4);
        putRequest("priceRange", s5);
        putRequest("isFreeShipping", s6);
        putRequest("isOnePieceOnly", s7);
        putRequest("isSaleItems", s8);
        putRequest("isBigSale", s9);
        putRequest("isMobileDealOnly", s10);
        putRequest("searchProperties", s11);
        putRequest("filteredProperties", s12);
        putRequest("_lang", s13);
    }
}
