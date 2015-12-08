// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.extension.model.Partners;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class PartnersSerializer
    implements ae
{

    public PartnersSerializer()
    {
    }

    public w serialize(Partners partners, Type type, ad ad1)
    {
        type = new z();
        if (partners.getShopRunner() != null && partners.getShopRunner().getTag() != null)
        {
            type.a("ShopRunner", ad1.a(partners.getShopRunner(), com/dominos/android/sdk/extension/model/Shoprunner));
        }
        return type;
    }

    public volatile w serialize(Object obj, Type type, ad ad1)
    {
        return serialize((Partners)obj, type, ad1);
    }
}
