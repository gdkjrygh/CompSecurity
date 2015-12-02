// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.base.j;
import com.facebook.config.a.a;
import com.facebook.config.a.b;
import com.facebook.config.a.d;

public class ff
{

    public static final a a;
    public static final a b;
    public static final a c;

    public ff()
    {
    }

    static 
    {
        a = new a("dev", "181425161904154", "29695f68d8dfa9d6a9cb4662735c9aff", "95a15d22a0e735b2983ecb9759dbaf91", "0SmP9AZrwrsbrHR2RyVaQ-sqRoukl2MAjk04Ibg", "Xt7gUVGsahT285mm_GF6NyGlLn0", "https://developers.facebook.com", b.DEVELOPMENT, d.MESSENGER, j.DEBUG);
        b = new a("in-house", "105910932827969", "3fd89d7c8cf293c5c6db88444077422f", "201f1a1fa4998b746f7b531e6434c224", "0e1ruJ7mZbBXS0h1Ffa7wWK4SMcshAyydjcm1qg", "pLdFLi7Y9fGRBYynu_0msNMhS_w", "https://m.facebook.com/mobile_builds", b.FACEBOOK, d.MESSENGER, j.IN_HOUSE);
        c = new a("prod", "256002347743983", "256002347743983", "374e60f8b9bb6b8cbb30f78030438895", "0e1ruJ7mZbBWslnLnQQ5RPITlJs7QBrg8JYbTyg", "c_0Yh6T3lvD4FVtzlEnJKk94sDY", "https://market.android.com/details?id=com.facebook.orca", b.PUBLIC, d.MESSENGER, j.PROD);
    }
}
