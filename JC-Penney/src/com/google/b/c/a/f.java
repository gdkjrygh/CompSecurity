// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;

import com.google.b.b.b;
import com.google.b.b.b.a;
import com.google.b.b.b.c;
import com.google.b.b.b.e;
import com.google.b.d;

// Referenced classes of package com.google.b.c.a:
//            a, b, c

public final class f
{

    private final c a;

    public f()
    {
        a = new c(a.f);
    }

    private void a(byte abyte0[], int i)
    {
        boolean flag = false;
        int l = abyte0.length;
        int ai[] = new int[l];
        for (int j = 0; j < l; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        int k = abyte0.length;
        try
        {
            a.a(ai, k - i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw d.a();
        }
        for (k = ((flag) ? 1 : 0); k < i; k++)
        {
            abyte0[k] = (byte)ai[k];
        }

    }

    public com.google.b.b.e a(b b1)
    {
        b1 = new com.google.b.c.a.a(b1);
        g g = b1.a();
        b1 = com.google.b.c.a.b.a(b1.b(), g);
        int i1 = b1.length;
        int j1 = b1.length;
        int i = 0;
        int k = 0;
        for (; i < j1; i++)
        {
            k += b1[i].a();
        }

        byte abyte0[] = new byte[k];
        for (int j = 0; j < i1; j++)
        {
            com.google.b.c.a.b b2 = b1[j];
            byte abyte1[] = b2.b();
            int k1 = b2.a();
            a(abyte1, k1);
            for (int l = 0; l < k1; l++)
            {
                abyte0[l * i1 + j] = abyte1[l];
            }

        }

        return com.google.b.c.a.c.a(abyte0);
    }
}
