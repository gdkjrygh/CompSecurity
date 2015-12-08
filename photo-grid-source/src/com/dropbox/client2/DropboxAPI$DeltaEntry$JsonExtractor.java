// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.jsonextract.JsonExtractor;
import com.dropbox.client2.jsonextract.JsonList;
import com.dropbox.client2.jsonextract.JsonThing;

public final class mdExtractor extends JsonExtractor
{

    public final JsonExtractor mdExtractor;

    public static mdExtractor extract(JsonThing jsonthing, JsonExtractor jsonextractor)
    {
        jsonthing = jsonthing.expectList();
        return new mdExtractor(jsonthing.get(0).expectString(), jsonthing.get(1).optionalExtract(jsonextractor));
    }

    public final t extract(JsonThing jsonthing)
    {
        return extract(jsonthing, mdExtractor);
    }

    public final volatile Object extract(JsonThing jsonthing)
    {
        return extract(jsonthing);
    }

    public (JsonExtractor jsonextractor)
    {
        mdExtractor = jsonextractor;
    }
}
