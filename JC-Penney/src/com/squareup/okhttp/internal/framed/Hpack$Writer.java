// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.f;
import c.k;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            Header, Hpack

final class out
{

    private final f out;

    void writeByteString(k k1)
    {
        writeInt(k1.f(), 127, 0);
        out.a(k1);
    }

    void writeHeaders(List list)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            k k1 = ((Header)list.get(i)).name.e();
            Integer integer = (Integer)Hpack.access$200().get(k1);
            if (integer != null)
            {
                writeInt(integer.intValue() + 1, 15, 0);
                writeByteString(((Header)list.get(i)).value);
            } else
            {
                out.b(0);
                writeByteString(k1);
                writeByteString(((Header)list.get(i)).value);
            }
            i++;
        }
    }

    void writeInt(int i, int j, int l)
    {
        if (i < j)
        {
            out.b(l | i);
            return;
        }
        out.b(l | j);
        for (i -= j; i >= 128; i >>>= 7)
        {
            out.b(i & 0x7f | 0x80);
        }

        out.b(i);
    }

    (f f1)
    {
        out = f1;
    }
}
