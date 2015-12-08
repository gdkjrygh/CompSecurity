// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.as:
//            a, c

public final class d extends a
{

    private static final c e = new c() {

        protected final Object a()
        {
            return new int[1034];
        }

    };

    public d(int i)
    {
        super(i, 10, e);
    }

    public final void a(ByteBuffer bytebuffer, int i)
    {
        boolean flag = false;
        for (int j = 0; j < b; j++)
        {
            int ai[] = (int[])a.get(j);
            for (int l = 0; l < 1024; l++)
            {
                bytebuffer.put((byte)(ai[l] / i));
            }

        }

        if (b != a.size())
        {
            for (int k = ((flag) ? 1 : 0); k < d; k++)
            {
                bytebuffer.put((byte)(((int[])c)[k] / i));
            }

        }
    }

    public final void a(IntBuffer intbuffer)
    {
        for (int i = 0; i < b; i++)
        {
            intbuffer.put((int[])a.get(i), 0, 1024);
        }

        if (b != a.size())
        {
            intbuffer.put((int[])c, 0, d);
        }
    }

    public final void a(ShortBuffer shortbuffer, int i)
    {
        boolean flag = false;
        for (int j = 0; j < b; j++)
        {
            int ai[] = (int[])a.get(j);
            for (int l = 0; l < 1024; l++)
            {
                shortbuffer.put((short)(ai[l] / i));
            }

        }

        if (b != a.size())
        {
            for (int k = ((flag) ? 1 : 0); k < d; k++)
            {
                shortbuffer.put((short)(((int[])c)[k] / i));
            }

        }
    }

}
