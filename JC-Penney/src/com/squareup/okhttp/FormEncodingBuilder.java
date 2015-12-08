// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.f;

// Referenced classes of package com.squareup.okhttp:
//            MediaType, HttpUrl, RequestBody

public final class FormEncodingBuilder
{

    private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    private final f content = new f();

    public FormEncodingBuilder()
    {
    }

    public FormEncodingBuilder add(String s, String s1)
    {
        if (content.a() > 0L)
        {
            content.b(38);
        }
        HttpUrl.canonicalize(content, s, 0, s.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        content.b(61);
        HttpUrl.canonicalize(content, s1, 0, s1.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        return this;
    }

    public FormEncodingBuilder addEncoded(String s, String s1)
    {
        if (content.a() > 0L)
        {
            content.b(38);
        }
        HttpUrl.canonicalize(content, s, 0, s.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        content.b(61);
        HttpUrl.canonicalize(content, s1, 0, s1.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        return this;
    }

    public RequestBody build()
    {
        return RequestBody.create(CONTENT_TYPE, content.v());
    }

}
