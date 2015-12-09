// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerationException, JsonGenerator

public interface e
{

    public abstract void a(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void a(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException;

    public abstract void b(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void b(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException;

    public abstract void c(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void d(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void e(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void f(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void g(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;

    public abstract void h(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException;
}
