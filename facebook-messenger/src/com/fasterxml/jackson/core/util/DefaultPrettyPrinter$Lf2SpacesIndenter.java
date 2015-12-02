// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Arrays;

public class 
    implements 
{

    static final char SPACES[];
    static final int SPACE_COUNT = 64;
    static final String SYSTEM_LINE_SEPARATOR;

    public boolean isInline()
    {
        return false;
    }

    public void writeIndentation(JsonGenerator jsongenerator, int i)
    {
        jsongenerator.writeRaw(SYSTEM_LINE_SEPARATOR);
        for (i += i; i > 64; i -= SPACES.length)
        {
            jsongenerator.writeRaw(SPACES, 0, 64);
        }

        jsongenerator.writeRaw(SPACES, 0, i);
    }

    static 
    {
        String s = null;
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
