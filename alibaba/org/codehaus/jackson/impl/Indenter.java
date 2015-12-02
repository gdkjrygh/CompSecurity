// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.impl;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;

public interface Indenter
{

    public abstract boolean isInline();

    public abstract void writeIndentation(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException;
}
