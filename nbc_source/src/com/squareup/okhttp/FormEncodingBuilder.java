// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import okio.Buffer;

// Referenced classes of package com.squareup.okhttp:
//            MediaType, HttpUrl, RequestBody

public final class FormEncodingBuilder
{

    private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    private final Buffer content = new Buffer();

    public FormEncodingBuilder()
    {
    }

    public FormEncodingBuilder add(String s, String s1)
    {
        if (content.size() > 0L)
        {
            content.writeByte(38);
        }
        HttpUrl.canonicalize(content, s, 0, s.length(), " \"'<>#&=", false, true);
        content.writeByte(61);
        HttpUrl.canonicalize(content, s1, 0, s1.length(), " \"'<>#&=", false, true);
        return this;
    }

    public FormEncodingBuilder addEncoded(String s, String s1)
    {
        if (content.size() > 0L)
        {
            content.writeByte(38);
        }
        HttpUrl.canonicalize(content, s, 0, s.length(), " \"'<>#&=", true, true);
        content.writeByte(61);
        HttpUrl.canonicalize(content, s1, 0, s1.length(), " \"'<>#&=", true, true);
        return this;
    }

    public RequestBody build()
    {
        if (content.size() == 0L)
        {
            throw new IllegalStateException("Form encoded body must have at least one part.");
        } else
        {
            return RequestBody.create(CONTENT_TYPE, content.snapshot());
        }
    }

}
