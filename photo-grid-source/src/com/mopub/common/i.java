// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.mopub.common:
//            h

final class i extends ByteArrayOutputStream
{

    final h a;

    i(h h1, int j)
    {
        a = h1;
        super(j);
    }

    public final String toString()
    {
        String s;
        int j;
        if (count > 0 && buf[count - 1] == 13)
        {
            j = count - 1;
        } else
        {
            j = count;
        }
        try
        {
            s = new String(buf, 0, j, h.a(a).name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError(unsupportedencodingexception);
        }
        return s;
    }
}
