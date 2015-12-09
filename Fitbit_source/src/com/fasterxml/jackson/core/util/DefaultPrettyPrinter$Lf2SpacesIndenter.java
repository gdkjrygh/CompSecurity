// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            DefaultPrettyPrinter

public static class  extends 
{

    public static final c a;
    static final int b = 64;
    static final char c[];
    private static final String e;

    public void a(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        jsongenerator.c(e);
        if (i > 0)
        {
            for (i += i; i > 64; i -= c.length)
            {
                jsongenerator.b(c, 0, 64);
            }

            jsongenerator.b(c, 0, i);
        }
    }

    public boolean a()
    {
        return false;
    }

    static 
    {
        String s;
        a = new <init>();
        s = null;
        String s1 = System.getProperty("line.separator");
        s = s1;
_L2:
        String s2 = s;
        if (s == null)
        {
            s2 = "\n";
        }
        e = s2;
        c = new char[64];
        Arrays.fill(c, ' ');
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
