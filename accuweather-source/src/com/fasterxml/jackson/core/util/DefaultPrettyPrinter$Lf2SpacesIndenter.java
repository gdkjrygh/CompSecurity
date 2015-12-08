// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            DefaultPrettyPrinter

public static class 
    implements , Serializable
{

    static final char SPACES[];
    static final int SPACE_COUNT = 64;
    static final String SYSTEM_LINE_SEPARATOR;
    public static SPACES instance;
    private static final long serialVersionUID = 1L;

    public boolean isInline()
    {
        return false;
    }

    public void writeIndentation(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(SYSTEM_LINE_SEPARATOR);
        if (i > 0)
        {
            for (i += i; i > 64; i -= SPACES.length)
            {
                jsongenerator.writeRaw(SPACES, 0, 64);
            }

            jsongenerator.writeRaw(SPACES, 0, i);
        }
    }

    static 
    {
        String s;
        instance = new <init>();
        s = null;
        String s1 = System.getProperty("line.separator");
        s = s1;
_L2:
        String s2 = s;
        if (s == null)
        {
            s2 = "\n";
        }
        SYSTEM_LINE_SEPARATOR = s2;
        SPACES = new char[64];
        Arrays.fill(SPACES, ' ');
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ()
    {
    }
}
