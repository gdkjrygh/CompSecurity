// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.jsonextract.JsonExtractor;
import com.dropbox.client2.jsonextract.JsonMap;
import com.dropbox.client2.jsonextract.JsonThing;
import java.util.Map;

final class ng extends JsonExtractor
{

    public final ng extract(JsonThing jsonthing)
    {
        return new nit>((Map)jsonthing.expectMap().internal);
    }

    public final volatile Object extract(JsonThing jsonthing)
    {
        return extract(jsonthing);
    }

    ng()
    {
    }
}
