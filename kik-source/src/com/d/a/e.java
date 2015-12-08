// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d.a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.d.a:
//            d

final class e extends ByteArrayOutputStream
{

    final d a;

    e(d d1, int i)
    {
        a = d1;
        super(i);
    }

    public final String toString()
    {
        String s;
        int i;
        if (count > 0 && buf[count - 1] == 13)
        {
            i = count - 1;
        } else
        {
            i = count;
        }
        try
        {
            s = new String(buf, 0, i, d.a(a).name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError(unsupportedencodingexception);
        }
        return s;
    }
}
