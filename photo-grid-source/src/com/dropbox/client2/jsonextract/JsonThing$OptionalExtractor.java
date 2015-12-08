// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;


// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonExtractor, JsonThing

public final class elementExtractor extends JsonExtractor
{

    public final JsonExtractor elementExtractor;

    public final Object extract(JsonThing jsonthing)
    {
        return jsonthing.optionalExtract(elementExtractor);
    }

    public A(JsonExtractor jsonextractor)
    {
        elementExtractor = jsonextractor;
    }
}
