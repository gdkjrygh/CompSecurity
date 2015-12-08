// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;


public final class HttpMultipartMode extends Enum
{

    private static final HttpMultipartMode $VALUES[];
    public static final HttpMultipartMode BROWSER_COMPATIBLE;
    public static final HttpMultipartMode STRICT;

    private HttpMultipartMode(String s, int i)
    {
        super(s, i);
    }

    public static HttpMultipartMode valueOf(String s)
    {
        return (HttpMultipartMode)Enum.valueOf(org/apache/http/entity/mime/HttpMultipartMode, s);
    }

    public static HttpMultipartMode[] values()
    {
        return (HttpMultipartMode[])$VALUES.clone();
    }

    static 
    {
        STRICT = new HttpMultipartMode("STRICT", 0);
        BROWSER_COMPATIBLE = new HttpMultipartMode("BROWSER_COMPATIBLE", 1);
        $VALUES = (new HttpMultipartMode[] {
            STRICT, BROWSER_COMPATIBLE
        });
    }
}
