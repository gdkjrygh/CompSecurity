// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.pinterest.common.utils.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class 
    implements Function
{

    public final volatile Object apply(Object obj)
    {
        return apply((JsonElement)obj);
    }

    public final List apply(JsonElement jsonelement)
    {
        ArrayList arraylist = new ArrayList();
        for (jsonelement = jsonelement.getAsJsonArray().iterator(); jsonelement.hasNext(); arraylist.add(((JsonElement)jsonelement.next()).getAsString())) { }
        return arraylist;
    }

    ()
    {
    }
}
