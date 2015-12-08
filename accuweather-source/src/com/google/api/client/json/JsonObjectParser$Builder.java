// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import java.util.Collection;

// Referenced classes of package com.google.api.client.json:
//            JsonObjectParser, JsonFactory

public static class l
{

    final JsonFactory jsonFactory;
    Collection wrapperKeys;

    public JsonObjectParser build()
    {
        return new JsonObjectParser(this);
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final Collection getWrapperKeys()
    {
        return wrapperKeys;
    }

    public wrapperKeys setWrapperKeys(Collection collection)
    {
        wrapperKeys = collection;
        return this;
    }

    public _cls9(JsonFactory jsonfactory)
    {
        wrapperKeys = Sets.newHashSet();
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
    }
}
