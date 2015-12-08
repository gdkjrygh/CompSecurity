// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.ByteString;
import okio.e;
import okio.l;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            f, e, h

static final class b
{

    final List a = new ArrayList();
    final e b;
    int c;
    int d;
    com.squareup.okhttp.internal.framed.e e[];
    int f;
    int g;
    int h;

    private void c()
    {
        a.clear();
        Arrays.fill(e, null);
        f = e.length - 1;
        g = 0;
        h = 0;
    }

    static boolean c(int i)
    {
        return i >= 0 && i <= com.squareup.okhttp.internal.framed.f.a().length - 1;
    }

    private int d()
        throws IOException
    {
        return b.f() & 0xff;
    }

    private int d(int i)
    {
        int j = 0;
        boolean flag = false;
        if (i > 0)
        {
            j = e.length - 1;
            int k = i;
            i = ((flag) ? 1 : 0);
            for (; j >= f && k > 0; j--)
            {
                k -= e[j].j;
                h = h - e[j].j;
                g = g - 1;
                i++;
            }

            System.arraycopy(e, f + 1, e, f + 1 + i, g);
            f = f + i;
            j = i;
        }
        return j;
    }

    final int a(int i)
    {
        return f + 1 + i;
    }

    final int a(int i, int j)
        throws IOException
    {
        i &= j;
        if (i < j)
        {
            return i;
        }
        i = 0;
        do
        {
            int k = d();
            if ((k & 0x80) != 0)
            {
                j += (k & 0x7f) << i;
                i += 7;
            } else
            {
                return (k << i) + j;
            }
        } while (true);
    }

    final void a()
    {
label0:
        {
            if (d < h)
            {
                if (d != 0)
                {
                    break label0;
                }
                c();
            }
            return;
        }
        d(h - d);
    }

    final void a(com.squareup.okhttp.internal.framed.e e1)
    {
        a.add(e1);
        int i = e1.j;
        if (i > d)
        {
            c();
            return;
        }
        d((h + i) - d);
        if (g + 1 > e.length)
        {
            com.squareup.okhttp.internal.framed.e ae[] = new com.squareup.okhttp.internal.framed.e[e.length * 2];
            System.arraycopy(e, 0, ae, e.length, e.length);
            f = e.length - 1;
            e = ae;
        }
        int j = f;
        f = j - 1;
        e[j] = e1;
        g = g + 1;
        h = i + h;
    }

    final ByteString b()
        throws IOException
    {
        int j = 0;
        int k = d();
        int i;
        if ((k & 0x80) == 128)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = a(k, 127);
        if (i != 0)
        {
            h h4 = com.squareup.okhttp.internal.framed.h.a();
            byte abyte0[] = b.e(k);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            h h1 = h4.a;
            k = 0;
            i = 0;
            h h3;
            int i1;
            do
            {
                i1 = i;
                h3 = h1;
                if (j >= abyte0.length)
                {
                    break;
                }
                k = k << 8 | abyte0[j] & 0xff;
                for (i += 8; i >= 8;)
                {
                    h1 = h1.a[k >>> i - 8 & 0xff];
                    if (h1.a == null)
                    {
                        bytearrayoutputstream.write(h1.b);
                        i -= h1.c;
                        h1 = h4.a;
                    } else
                    {
                        i -= 8;
                    }
                }

                j++;
            } while (true);
            do
            {
                if (i1 <= 0)
                {
                    break;
                }
                h h2 = h3.a[k << 8 - i1 & 0xff];
                if (h2.a != null || h2.c > i1)
                {
                    break;
                }
                bytearrayoutputstream.write(h2.b);
                i1 -= h2.c;
                h3 = h4.a;
            } while (true);
            return ByteString.a(bytearrayoutputstream.toByteArray());
        } else
        {
            return b.c(k);
        }
    }

    final ByteString b(int i)
    {
        if (c(i))
        {
            return com.squareup.okhttp.internal.framed.f.a()[i].h;
        } else
        {
            return e[a(i - com.squareup.okhttp.internal.framed.f.a().length)].h;
        }
    }

    (r r)
    {
        e = new com.squareup.okhttp.internal.framed.e[8];
        f = e.length - 1;
        g = 0;
        h = 0;
        c = 4096;
        d = 4096;
        b = l.a(r);
    }
}
