// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.i;
import c.r;
import com.squareup.okhttp.internal.Util;
import java.io.File;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType

final class nit> extends RequestBody
{

    final MediaType val$contentType;
    final File val$file;

    public long contentLength()
    {
        return val$file.length();
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public void writeTo(i j)
    {
        c.ad ad = null;
        c.ad ad1 = r.a(val$file);
        ad = ad1;
        j.a(ad1);
        Util.closeQuietly(ad1);
        return;
        j;
        Util.closeQuietly(ad);
        throw j;
    }

    ()
    {
        val$contentType = mediatype;
        val$file = file1;
        super();
    }
}
