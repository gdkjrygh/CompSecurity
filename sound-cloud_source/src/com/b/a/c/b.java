// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class b
{
    public static interface a
    {

        public abstract boolean a(int i, int j);
    }


    public static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    private static boolean a(a a1, int i, int j)
    {
        return a1 != null && !a1.a(i, j) && (i * 100) / j < 75;
    }

    public static boolean a(InputStream inputstream, OutputStream outputstream, a a1, int i)
        throws IOException
    {
        int l = inputstream.available();
        byte abyte0[] = new byte[i];
        if (a(a1, 0, l))
        {
            return false;
        }
        int j = 0;
        do
        {
            int k = inputstream.read(abyte0, 0, i);
            if (k != -1)
            {
                outputstream.write(abyte0, 0, k);
                k = j + k;
                j = k;
                if (a(a1, k, l))
                {
                    return false;
                }
            } else
            {
                outputstream.flush();
                return true;
            }
        } while (true);
    }
}
