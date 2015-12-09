// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments.application;

import com.facebook.common.build.SignatureType;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.IntendedAudience;
import com.facebook.config.application.Product;

// Referenced classes of package com.facebook.moments.application:
//            MomentsAppConstants

public class MomentsAppTypes
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final FbAppType g;
    public static final FbAppType h;
    public static final FbAppType i;

    public MomentsAppTypes()
    {
    }

    static 
    {
        String s = MomentsAppConstants.a;
        a = s;
        b = s;
        c = MomentsAppConstants.b;
        d = a;
        e = b;
        f = c;
        g = new FbAppType("moments-dev", a, b, c, "0SmP9AZrwrsbrHR2RyVaQ-sqRoukl2MAjk04Ibg", "Xo8WBi6jzSxKDVR4drqm84yr9iU", "https://m.facebook.com/mobile_builds", IntendedAudience.DEVELOPMENT, Product.MOMENTS, SignatureType.DEBUG);
        h = new FbAppType("moments-inhouse", d, e, f, "0e1ruJ7mZbBXS0h1Ffa7wWK4SMcshAyydjcm1qg", "pLdFLi7Y9fGRBYynu_0msNMhS_w", "https://m.facebook.com/mobile_builds", IntendedAudience.FACEBOOK, Product.MOMENTS, SignatureType.IN_HOUSE);
        i = new FbAppType("moments-prod", d, e, f, "0e1ruJ7mZbBWslnLnQQ5RPITlJs7QBrg8JYbTyg", "ijxLJi1yGs1JpL-X1SExmchvork", "https://market.android.com/details?id=com.facebook.moments", IntendedAudience.PUBLIC, Product.MOMENTS, SignatureType.PROD);
    }
}
