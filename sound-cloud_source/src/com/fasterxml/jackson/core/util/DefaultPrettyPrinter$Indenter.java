// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            DefaultPrettyPrinter

public static interface 
{

    public abstract boolean isInline();

    public abstract void writeIndentation(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException;
}
