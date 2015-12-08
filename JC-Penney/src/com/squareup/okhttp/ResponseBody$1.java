// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.j;

// Referenced classes of package com.squareup.okhttp:
//            ResponseBody, MediaType

final class nit> extends ResponseBody
{

    final j val$content;
    final long val$contentLength;
    final MediaType val$contentType;

    public long contentLength()
    {
        return val$contentLength;
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public j source()
    {
        return val$content;
    }

    ()
    {
        val$contentType = mediatype;
        val$contentLength = l;
        val$content = j;
        super();
    }
}
