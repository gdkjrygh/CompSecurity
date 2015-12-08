// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import com.roidapp.baselib.c.x;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Random;

// Referenced classes of package com.roidapp.baselib.e:
//            f

final class e
{

    private static final char a[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private Iterable b;
    private String c;

    e(Iterable iterable)
    {
        b = iterable;
        c = b();
    }

    private static String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        int j = random.nextInt(11);
        for (int i = 0; i < j + 30; i++)
        {
            stringbuilder.append(a[random.nextInt(a.length)]);
        }

        return stringbuilder.toString();
    }

    final void a(OutputStream outputstream)
    {
        if (outputstream == null || b == null)
        {
            return;
        }
        byte abyte0[] = (new StringBuilder("--")).append(c).append("\r\n").toString().getBytes();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            if (f1 != null)
            {
                outputstream.write(abyte0);
                f1.a(outputstream);
                outputstream.write("\r\n".getBytes());
            }
        } while (true);
        outputstream.write((new StringBuilder("--")).append(c).append("--\r\n").toString().getBytes());
    }

    final x[] a()
    {
        return (new x[] {
            new x("Connection", "keep-alive"), new x("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append(c).toString())
        });
    }

}
