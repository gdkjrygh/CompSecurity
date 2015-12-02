// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import com.facebook.common.build.BuildConstants;
import com.facebook.common.build.SignatureType;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.IntendedAudience;
import com.facebook.config.application.Product;

public class FacebookAppTypes
{

    public static final FbAppType a;
    public static final FbAppType b;
    public static final FbAppType c;

    public FacebookAppTypes()
    {
    }

    static 
    {
        a = new FbAppType(BuildConstants.k(), Long.toString(0x51a67c8e50L), "882a8490361da98702bf97a021ddc14d", "62f8ce9f74b12f84c123cc23437a4a32", "0SmP9AZrwrsbrHR2RyVaQ-sqRoukl2MAjk04Ibg", "Xo8WBi6jzSxKDVR4drqm84yr9iU", BuildConstants.l(), IntendedAudience.DEVELOPMENT, Product.FB4A, SignatureType.DEBUG);
        b = new FbAppType(BuildConstants.k(), Long.toString(0x51a67c8e50L), "882a8490361da98702bf97a021ddc14d", "62f8ce9f74b12f84c123cc23437a4a32", "0e1ruJ7mZbBXS0h1Ffa7wWK4SMcshAyydjcm1qg", "pLdFLi7Y9fGRBYynu_0msNMhS_w", BuildConstants.l(), IntendedAudience.FACEBOOK, Product.FB4A, SignatureType.IN_HOUSE);
        c = new FbAppType(BuildConstants.k(), Long.toString(0x51a67c8e50L), "882a8490361da98702bf97a021ddc14d", "62f8ce9f74b12f84c123cc23437a4a32", "0e1ruJ7mZbBWslnLnQQ5RPITlJs7QBrg8JYbTyg", "ijxLJi1yGs1JpL-X1SExmchvork", BuildConstants.l(), IntendedAudience.PUBLIC, Product.FB4A, SignatureType.PROD);
    }
}
