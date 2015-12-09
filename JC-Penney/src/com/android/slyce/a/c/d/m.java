// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.aj;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.android.slyce.a.c.d:
//            n, g, l

class m
{

    Inflater a;

    public m()
    {
        a = new n(this);
    }

    private static g a(aj aj1)
    {
        return g.a(aj1.a(aj1.f()));
    }

    public List a(aj aj1, int i)
    {
        byte abyte0[] = new byte[i];
        aj1.a(abyte0);
        a.setInput(abyte0);
        aj1 = (new aj()).a(ByteOrder.BIG_ENDIAN);
        while (!a.needsInput()) 
        {
            ByteBuffer bytebuffer = aj.c(8192);
            try
            {
                bytebuffer.limit(a.inflate(bytebuffer.array()));
                aj1.a(bytebuffer);
            }
            // Misplaced declaration of an exception variable
            catch (aj aj1)
            {
                throw new IOException(aj1);
            }
        }
        int j = aj1.f();
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            g g1 = a(aj1).c();
            g g2 = a(aj1);
            if (g1.d() == 0)
            {
                throw new IOException("name.size == 0");
            }
            arraylist.add(new l(g1, g2));
        }

        return arraylist;
    }
}
