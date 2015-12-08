// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class ShopRunnerTagDeserializer
    implements v
{

    public ShopRunnerTagDeserializer()
    {
    }

    public ShopRunnerTag deserialize(w w1, Type type, u u)
    {
        type = new ShopRunnerTag();
        w1 = (z)w1;
        if (w1.a("token"))
        {
            type.setToken(w1.b("token").c());
        }
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
