// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.xzdecoder;

import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.io.InputStream;

public class XzInputStream extends InputStream
{

    private byte a[];
    private byte b[];
    private int c;
    private int d;
    private int e;
    private int f;
    private InputStream g;
    private long h;

    public XzInputStream(InputStream inputstream)
    {
        g = inputstream;
        a = new byte[32768];
        b = new byte[32768];
        h = initializeState();
    }

    private int a(byte abyte0[], int i, int j)
    {
        j = Math.min(j, e - f);
        System.arraycopy(b, f, abyte0, i, j);
        f = f + j;
        return j;
    }

    private boolean a()
    {
        d = 0;
        c = 0;
        do
        {
            int i;
label0:
            {
label1:
                {
                    if (d < 32768)
                    {
                        i = g.read(a, d, a.length - d);
                        if (i != -1)
                        {
                            break label0;
                        }
                        if (d <= 0)
                        {
                            break label1;
                        }
                    }
                    return true;
                }
                return false;
            }
            d = i + d;
        } while (true);
    }

    private void b()
    {
        long l = decompressStream(h, a, c, d, b, 0, b.length);
        c = (int)(l >>> 32);
        e = (int)l;
        f = 0;
    }

    private static native long decompressStream(long l, byte abyte0[], int i, int j, byte abyte1[], int k, int i1);

    private static native void end(long l);

    private static native void initializeLibrary();

    private static native long initializeState();

    public void close()
    {
        g.close();
        if (h != 0L)
        {
            end(h);
        }
    }

    public int read()
    {
        if (h == 0L)
        {
            throw new IOException("Stream closed");
        }
        if (f == e)
        {
            if (c == d && !a())
            {
                return -1;
            }
            b();
        }
        byte abyte0[] = b;
        int i = f;
        f = i + 1;
        return abyte0[i];
    }

    public int read(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (j < 0 || i < 0 || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        if (h == 0L)
        {
            throw new IOException("Stream closed");
        }
        int l = j;
        int k = i;
        i = ((flag) ? 1 : 0);
        do
        {
label0:
            {
                int i1 = i;
                if (i < j)
                {
                    if (f < e)
                    {
                        i1 = a(abyte0, k, l);
                        l -= i1;
                        k += i1;
                        i += i1;
                        continue;
                    }
                    if (c != d || a())
                    {
                        break label0;
                    }
                    i1 = i;
                    if (i == 0)
                    {
                        i1 = -1;
                    }
                }
                return i1;
            }
            b();
        } while (true);
    }

    static 
    {
        SoLoader.a("fb_xzdecoder");
        initializeLibrary();
    }
}
