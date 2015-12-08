// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package org.a.a.a:
//            c, n

public final class k
{

    private static final String a = "\"";
    private static final char b[] = {
        ',', '"', '\r', '\n'
    };

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringWriter stringwriter;
        try
        {
            stringwriter = new StringWriter((int)((double)s.length() * 1.5D));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new n(s);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        c.e.a(stringwriter, s);
        s = stringwriter.toString();
        return s;
    }

}
