// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.a.a;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.g;
import java.io.IOException;

public abstract class b extends a
{

    protected static final int g[] = com.fasterxml.jackson.core.io.b.f();
    protected final c h;
    protected int i[];
    protected int j;
    protected CharacterEscapes k;
    protected f l;

    public b(c c, int i1, d d1)
    {
        super(i1, d1);
        i = g;
        l = DefaultPrettyPrinter.a;
        h = c;
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.g))
        {
            a(127);
        }
    }

    public JsonGenerator a(int i1)
    {
        int j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        j = j1;
        return this;
    }

    public JsonGenerator a(f f)
    {
        l = f;
        return this;
    }

    public JsonGenerator a(CharacterEscapes characterescapes)
    {
        k = characterescapes;
        if (characterescapes == null)
        {
            i = g;
            return this;
        } else
        {
            i = characterescapes.a();
            return this;
        }
    }

    public final void a(String s, String s1)
        throws IOException, JsonGenerationException
    {
        a(s);
        b(s1);
    }

    public Version d()
    {
        return com.fasterxml.jackson.core.util.g.a(getClass());
    }

    public int g()
    {
        return j;
    }

    public CharacterEscapes h()
    {
        return k;
    }

}
