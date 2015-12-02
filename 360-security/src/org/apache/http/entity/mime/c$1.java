// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;


// Referenced classes of package org.apache.http.entity.mime:
//            c, HttpMultipartMode

static class MultipartMode
{

    static final int a[];

    static 
    {
        a = new int[HttpMultipartMode.values().length];
        try
        {
            a[HttpMultipartMode.STRICT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[HttpMultipartMode.BROWSER_COMPATIBLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
