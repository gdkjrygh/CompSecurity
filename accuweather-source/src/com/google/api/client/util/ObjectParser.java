// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public interface ObjectParser
{

    public abstract Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
        throws IOException;

    public abstract Object parseAndClose(InputStream inputstream, Charset charset, Type type)
        throws IOException;

    public abstract Object parseAndClose(Reader reader, Class class1)
        throws IOException;

    public abstract Object parseAndClose(Reader reader, Type type)
        throws IOException;
}
