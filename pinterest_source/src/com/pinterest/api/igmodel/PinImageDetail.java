// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.network.json.PinterestJsonObject;

class PinImageDetail
{

    public String a;
    public int b;
    public int c;

    PinImageDetail()
    {
    }

    final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("url", a);
        pinterestjsonobject.a("width", Integer.valueOf(b));
        pinterestjsonobject.a("height", Integer.valueOf(c));
        return pinterestjsonobject;
    }
}
