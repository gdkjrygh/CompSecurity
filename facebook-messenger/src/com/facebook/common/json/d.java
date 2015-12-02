// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class d
{

    public d()
    {
    }

    public static final JsonToken a(JsonParser jsonparser)
    {
        jsonparser = jsonparser.nextToken();
        a(((JsonToken) (jsonparser)));
        return jsonparser;
    }

    public static final void a(JsonToken jsontoken)
    {
        if (jsontoken == null)
        {
            throw new IOException("Unexpected end of json input");
        } else
        {
            return;
        }
    }
}
