// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

// Referenced classes of package com.microsoft.onlineid.internal:
//            k

public final class o
{

    public static final Charset a = Charset.forName("UTF-8");

    public static String a(InputStream inputstream, Charset charset)
        throws IOException
    {
        char ac[];
        inputstream = new InputStreamReader(inputstream, charset);
        charset = new StringBuilder();
        ac = new char[1024];
_L1:
        int i = inputstream.read(ac);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        charset.append(ac, 0, i);
          goto _L1
        charset;
        inputstream.close();
        throw charset;
        inputstream.close();
        return charset.toString();
    }

    public static void a(String s, String s1)
    {
        k.a(s, s1);
        if (s.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s1).append(" must not be empty.").toString());
        } else
        {
            return;
        }
    }

    public static boolean b(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        if (s == null || s1 == null)
        {
            return false;
        } else
        {
            return s.equalsIgnoreCase(s1);
        }
    }

}
