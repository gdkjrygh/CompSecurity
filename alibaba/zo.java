// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.alibaba.api.base.util.LanguageUtil;

public class zo extends vq
{

    public zo(String s, String s1, String s2, String s3, String s4, int i, String s5, 
            String s6, String s7, String s8, String s9, String s10, int j, String s11, 
            String s12, String s13, String s14, String s15, String s16, String s17, String s18, 
            String s19, String s20, int k)
    {
        super(zd.a);
        putRequest("isc", s);
        putRequest("q", s1);
        putRequest("cid", s2);
        putRequest("tagId", s3);
        putRequest("brandId", s4);
        putRequest("s", String.valueOf(i));
        putRequest("rk", s5);
        putRequest("shpc", s6);
        putRequest("rg", s7);
        putRequest("f", s8);
        putRequest("cpid", s9);
        putRequest("pid", s10);
        putRequest("n", String.valueOf(j));
        putRequest("isRtl", s11);
        putRequest("isOnsale", s12);
        putRequest("_lang", s13);
        putRequest("bigSaleSwitch", s14);
        putRequest("mobileExclusiveSwitch", s15);
        putRequest("offset", s16);
        putRequest("searchProperties", s17);
        putRequest("channel", s18);
        putRequest("isP4p", s19);
        putRequest("useIMatch", s20);
        try
        {
            putRequest("p4pSearchedCount", String.valueOf(k));
            putRequest("p4pPid", LanguageUtil.getP4PPid(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }
}
