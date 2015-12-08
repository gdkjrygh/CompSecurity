// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class ShopRunnerDeserializer
    implements v
{

    public ShopRunnerDeserializer()
    {
    }

    public Shoprunner deserialize(w w, Type type, u u1)
    {
        type = new Shoprunner();
        w = (z)w;
        if (w.a("Tags") && (w.b("Tags") instanceof z))
        {
            type.setTag((ShopRunnerTag)u1.a(w.d("Tags"), com/dominos/android/sdk/extension/model/ShopRunnerTag));
        }
        return type;
    }

    public volatile Object deserialize(w w, Type type, u u1)
    {
        return deserialize(w, type, u1);
    }
}
