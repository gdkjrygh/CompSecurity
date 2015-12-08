// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class ams extends ByteArrayOutputStream
{

    private amr a;

    ams(amr amr1, int i)
    {
        a = amr1;
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
            s = new String(buf, 0, i, a.a.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError(unsupportedencodingexception);
        }
        return s;
    }
}
