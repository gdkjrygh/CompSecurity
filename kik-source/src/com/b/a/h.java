// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InputStream;

// Referenced classes of package com.b.a:
//            m, t, j, u, 
//            r, c, l, g, 
//            x, p, a, f

public final class h
{

    public static int a(DataOutput dataoutput, Object obj, u u1)
    {
        m m1 = new m(256);
        t t1 = new t(m1);
        u1.a(new j(t1), obj);
        r.a(dataoutput, t1.c);
        m.a(dataoutput, m1);
        return t1.c;
    }

    public static void a(DataInput datainput, Object obj, u u1)
    {
        int i = datainput.readByte();
        if ((i & 0x80) != 0) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        byte byte0;
        if (i != 0)
        {
            if (i > 4096 && (datainput instanceof InputStream))
            {
                datainput = new c(new l((InputStream)datainput, i));
                u1.a(new g(datainput), obj);
                datainput.a(0);
            } else
            {
                byte abyte0[] = new byte[i];
                datainput.readFully(abyte0, 0, i);
                datainput = new a(abyte0, i, true);
                f f1 = new f(datainput);
                try
                {
                    u1.a(f1, obj);
                }
                // Misplaced declaration of an exception variable
                catch (DataInput datainput)
                {
                    throw p.a(datainput);
                }
                datainput.a(0);
            }
        }
        if (!u1.a(obj))
        {
            throw new x(obj, u1);
        } else
        {
            return;
        }
_L2:
        i &= 0x7f;
        k = 7;
_L6:
        i1 = k;
        if (k >= 32) goto _L4; else goto _L3
_L3:
        byte0 = datainput.readByte();
        if (byte0 == -1)
        {
            throw p.a();
        }
        i1 = i | (byte0 & 0x7f) << k;
        i = i1;
        if ((byte0 & 0x80) == 0) goto _L1; else goto _L5
_L5:
        k += 7;
        i = i1;
          goto _L6
_L9:
        i1 += 7;
_L4:
        if (i1 >= 64) goto _L8; else goto _L7
_L7:
        k = datainput.readByte();
        if (k == -1)
        {
            throw p.a();
        }
        if ((k & 0x80) != 0) goto _L9; else goto _L1
_L8:
        throw p.d();
    }
}
