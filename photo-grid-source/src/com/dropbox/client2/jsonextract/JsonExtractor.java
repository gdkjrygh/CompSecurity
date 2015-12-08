// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;


// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonThing

public abstract class JsonExtractor
{

    public JsonExtractor()
    {
    }

    public abstract Object extract(JsonThing jsonthing);
}
