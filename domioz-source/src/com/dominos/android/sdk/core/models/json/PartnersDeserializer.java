// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.extension.model.Partners;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class PartnersDeserializer
    implements v
{

    public PartnersDeserializer()
    {
    }

    public Partners deserialize(w w, Type type, u u1)
    {
        type = new Partners();
        w = (z)w;
        if (w.a("ShopRunner") && (w.b("ShopRunner") instanceof z))
        {
            type.setShopRunner((Shoprunner)u1.a(w.d("ShopRunner"), com/dominos/android/sdk/extension/model/Shoprunner));
        }
        return type;
    }

    public volatile Object deserialize(w w, Type type, u u1)
    {
        return deserialize(w, type, u1);
    }
}
