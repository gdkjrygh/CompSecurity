// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.Context;
import dbr;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            c

abstract class a
    implements c
{

    protected Context a;
    protected int b;
    protected int c;

    public a(Context context, int i, int j)
    {
        a = null;
        b = 0;
        c = 0;
        a = context;
        b = i;
        c = j;
    }

    private byte[] c()
    {
        byte abyte0[] = b();
        if (abyte0 == null)
        {
            return null;
        } else
        {
            byte abyte1[] = dbr.a(0);
            byte abyte2[] = dbr.a(b);
            byte abyte3[] = dbr.a(c);
            byte abyte4[] = dbr.a(abyte0.length << 3);
            byte abyte5[] = new byte[abyte0.length + 8];
            System.arraycopy(abyte1, 0, abyte5, 0, 2);
            System.arraycopy(abyte2, 0, abyte5, 2, 2);
            System.arraycopy(abyte3, 0, abyte5, 4, 2);
            System.arraycopy(abyte4, 0, abyte5, 6, 2);
            System.arraycopy(abyte0, 0, abyte5, 8, abyte0.length);
            return abyte5;
        }
    }

    public String a()
    {
        byte abyte0[] = c();
        if (abyte0 != null)
        {
            StringBuffer stringbuffer = new StringBuffer();
            int j = abyte0.length;
            for (int i = 0; i < j; i++)
            {
                stringbuffer.append(String.format("%02x", new Object[] {
                    Byte.valueOf(abyte0[i])
                }));
            }

            return stringbuffer.toString();
        } else
        {
            return "";
        }
    }

    abstract byte[] b();
}
