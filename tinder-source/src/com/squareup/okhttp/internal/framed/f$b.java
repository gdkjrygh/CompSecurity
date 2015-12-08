// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import okio.c;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            f, e

static final class a
{

    private final c a;

    private void a(int i, int j)
        throws IOException
    {
        if (i < j)
        {
            a.b(i | 0);
            return;
        }
        a.b(j | 0);
        for (i -= j; i >= 128; i >>>= 7)
        {
            a.b(i & 0x7f | 0x80);
        }

        a.b(i);
    }

    private void a(ByteString bytestring)
        throws IOException
    {
        a(bytestring.c.length, 127);
        a.a(bytestring);
    }

    final void a(List list)
        throws IOException
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            ByteString bytestring = ((e)list.get(i)).h.c();
            Integer integer = (Integer)f.b().get(bytestring);
            if (integer != null)
            {
                a(integer.intValue() + 1, 15);
                a(((e)list.get(i)).i);
            } else
            {
                a.b(0);
                a(bytestring);
                a(((e)list.get(i)).i);
            }
            i++;
        }
    }

    (c c1)
    {
        a = c1;
    }
}
