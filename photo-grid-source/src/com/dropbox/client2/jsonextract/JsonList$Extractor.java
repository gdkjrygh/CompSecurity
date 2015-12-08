// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import java.util.List;

// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonExtractor, JsonThing, JsonList

public final class elementExtractor extends JsonExtractor
{

    public final JsonExtractor elementExtractor;

    public final volatile Object extract(JsonThing jsonthing)
    {
        return extract(jsonthing);
    }

    public final List extract(JsonThing jsonthing)
    {
        return jsonthing.expectList().extract(elementExtractor);
    }

    public (JsonExtractor jsonextractor)
    {
        elementExtractor = jsonextractor;
    }
}
