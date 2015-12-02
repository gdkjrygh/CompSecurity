// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;


public final class v extends Enum
{

    private static final v $VALUES[];
    public static final v CACHE;
    public static final v DOWNLOADED;
    public static final v ERROR;
    public static final v MEMORY_CACHE;
    public static final v NOT_IN_CACHE_NOT_DOWNLOADED;
    public static final v UNDERLYING_IMAGE_IN_CACHE;

    private v(String s, int i)
    {
        super(s, i);
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/facebook/ui/images/b/v, s);
    }

    public static v[] values()
    {
        return (v[])$VALUES.clone();
    }

    static 
    {
        NOT_IN_CACHE_NOT_DOWNLOADED = new v("NOT_IN_CACHE_NOT_DOWNLOADED", 0);
        MEMORY_CACHE = new v("MEMORY_CACHE", 1);
        CACHE = new v("CACHE", 2);
        UNDERLYING_IMAGE_IN_CACHE = new v("UNDERLYING_IMAGE_IN_CACHE", 3);
        DOWNLOADED = new v("DOWNLOADED", 4);
        ERROR = new v("ERROR", 5);
        $VALUES = (new v[] {
            NOT_IN_CACHE_NOT_DOWNLOADED, MEMORY_CACHE, CACHE, UNDERLYING_IMAGE_IN_CACHE, DOWNLOADED, ERROR
        });
    }
}
