// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.p;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.common.a:
//            b

public final class a
{

    private static final OutputStream a = new b();

    public static int a(InputStream inputstream, byte abyte0[], int i)
    {
        p.a(inputstream);
        p.a(abyte0);
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            int k = inputstream.read(abyte0, j, i - j);
            if (k == -1)
            {
                break;
            }
            j += k;
        } while (true);
        return j;
    }

}
