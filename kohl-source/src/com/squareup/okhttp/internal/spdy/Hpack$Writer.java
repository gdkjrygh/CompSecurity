// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Hpack

static class out
{

    private final OutputStream out;

    public void writeHeaders(List list)
        throws IOException
    {
        int i = 0;
        for (int j = list.size(); i < j; i += 2)
        {
            out.write(96);
            writeString((String)list.get(i));
            writeString((String)list.get(i + 1));
        }

    }

    public void writeInt(int i, int j, int k)
        throws IOException
    {
        if (i < j)
        {
            out.write(k | i);
            return;
        }
        out.write(k | j);
        for (i -= j; i >= 128; i >>>= 7)
        {
            out.write(i & 0x7f | 0x80);
        }

        out.write(i);
    }

    public void writeString(String s)
        throws IOException
    {
        s = s.getBytes("UTF-8");
        writeInt(s.length, 255, 0);
        out.write(s);
    }

    (OutputStream outputstream)
    {
        out = outputstream;
    }
}
