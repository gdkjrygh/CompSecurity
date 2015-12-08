// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;


// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonExtractionException

abstract class JsonBase
{

    public final Object internal;
    public final String path;

    public JsonBase(Object obj)
    {
        this(obj, null);
    }

    public JsonBase(Object obj, String s)
    {
        internal = obj;
        path = s;
    }

    public JsonExtractionException error(String s)
    {
        return new JsonExtractionException(path, s, internal);
    }
}
