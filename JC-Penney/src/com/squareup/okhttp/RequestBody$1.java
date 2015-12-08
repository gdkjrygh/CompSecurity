// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.i;
import c.k;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType

final class nit> extends RequestBody
{

    final k val$content;
    final MediaType val$contentType;

    public long contentLength()
    {
        return (long)val$content.f();
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public void writeTo(i j)
    {
        j.b(val$content);
    }

    ()
    {
        val$contentType = mediatype;
        val$content = k1;
        super();
    }
}
