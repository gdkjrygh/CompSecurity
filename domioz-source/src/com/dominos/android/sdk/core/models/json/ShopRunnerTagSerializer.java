// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class ShopRunnerTagSerializer
    implements ae
{

    public ShopRunnerTagSerializer()
    {
    }

    public w serialize(ShopRunnerTag shoprunnertag, Type type, ad ad)
    {
        type = new z();
        type.a("token", shoprunnertag.getToken());
        return type;
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((ShopRunnerTag)obj, type, ad);
    }
}
