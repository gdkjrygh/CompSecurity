// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.d.a;
import com.fasterxml.jackson.core.d.b;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonProcessingException, g, JsonParser, JsonGenerator, 
//            JsonFactory

public abstract class d
{

    protected d()
    {
    }

    public abstract JsonParser a(g g);

    public abstract g a();

    public abstract g a(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract Object a(JsonParser jsonparser, a a1)
        throws IOException, JsonProcessingException;

    public abstract Object a(JsonParser jsonparser, b b1)
        throws IOException, JsonProcessingException;

    public abstract Object a(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract Object a(g g, Class class1)
        throws JsonProcessingException;

    public abstract void a(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException;

    public abstract g b();

    public abstract Iterator b(JsonParser jsonparser, a a1)
        throws IOException, JsonProcessingException;

    public abstract Iterator b(JsonParser jsonparser, b b1)
        throws IOException, JsonProcessingException;

    public abstract Iterator b(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract JsonFactory c();

    public JsonFactory d()
    {
        return c();
    }
}
