// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class ShopRunnerSerializer
    implements ae
{

    public ShopRunnerSerializer()
    {
    }

    public w serialize(Shoprunner shoprunner, Type type, ad ad1)
    {
        type = new z();
        if (shoprunner.getTag() != null && StringHelper.isNotEmpty(shoprunner.getTag().getToken()))
        {
            type.a("Tags", ad1.a(shoprunner.getTag(), com/dominos/android/sdk/extension/model/ShopRunnerTag));
        }
        return type;
    }

    public volatile w serialize(Object obj, Type type, ad ad1)
    {
        return serialize((Shoprunner)obj, type, ad1);
    }
}
