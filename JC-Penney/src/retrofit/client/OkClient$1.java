// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import c.i;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import retrofit.mime.TypedOutput;

final class Body extends RequestBody
{

    final TypedOutput val$body;
    final MediaType val$mediaType;

    public long contentLength()
    {
        return val$body.length();
    }

    public MediaType contentType()
    {
        return val$mediaType;
    }

    public void writeTo(i j)
    {
        val$body.writeTo(j.c());
    }

    pe()
    {
        val$mediaType = mediatype;
        val$body = typedoutput;
        super();
    }
}
