// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.pinterest.network.json.PinterestJsonObject;

class TypeTime
{

    public int a;
    public int b;

    TypeTime()
    {
        a = 0;
        b = 0;
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.a("h", Integer.valueOf(a));
        pinterestjsonobject.a("m", Integer.valueOf(b));
        return pinterestjsonobject;
    }
}
