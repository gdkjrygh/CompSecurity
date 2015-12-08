// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.jsonextract.JsonExtractor;
import com.dropbox.client2.jsonextract.JsonList;
import com.dropbox.client2.jsonextract.JsonMap;
import com.dropbox.client2.jsonextract.JsonThing;
import java.util.List;

public final class hasMore
{

    public final String cursor;
    public final List entries;
    public final boolean hasMore;
    public final boolean reset;

    public static ctor extractFromJson(JsonThing jsonthing, JsonExtractor jsonextractor)
    {
        jsonthing = jsonthing.expectMap();
        boolean flag = jsonthing.get("reset").expectBoolean();
        String s = jsonthing.get("cursor").expectString();
        boolean flag1 = jsonthing.get("has_more").expectBoolean();
        return new <init>(flag, jsonthing.get("entries").expectList().extract(new .JsonExtractor(jsonextractor)), s, flag1);
    }

    public ctor(boolean flag, List list, String s, boolean flag1)
    {
        reset = flag;
        entries = list;
        cursor = s;
        hasMore = flag1;
    }
}
