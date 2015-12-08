// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.ByteString;

final class gtc
{

    final List a = new ArrayList();
    final hcj b;
    int c;
    int d;
    gta e[];
    private int f;
    private int g;
    private int h;

    gtc(hcw hcw)
    {
        e = new gta[8];
        f = e.length - 1;
        g = 0;
        h = 0;
        c = 4096;
        d = 4096;
        b = hcq.a(hcw);
    }

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
        return i >= 0 && i <= gtb.a().length - 1;
    }

    private int d()
    {
        return b.g() & 0xff;
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

    final void a(gta gta1)
    {
        a.add(gta1);
        int i = gta1.j;
        if (i > d)
        {
            c();
            return;
        }
        d((h + i) - d);
        if (g + 1 > e.length)
        {
            gta agta[] = new gta[e.length << 1];
            System.arraycopy(e, 0, agta, e.length, e.length);
            f = e.length - 1;
            e = agta;
        }
        int j = f;
        f = j - 1;
        e[j] = gta1;
        g = g + 1;
        h = i + h;
    }

    final ByteString b()
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
            gtj gtj1 = gtj.a();
            byte abyte0[] = b.e(k);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            gtk gtk1 = gtj1.a;
            k = 0;
            i = 0;
            gtk gtk3;
            int l;
            do
            {
                l = i;
                gtk3 = gtk1;
                if (j >= abyte0.length)
                {
                    break;
                }
                k = k << 8 | abyte0[j] & 0xff;
                for (i += 8; i >= 8;)
                {
                    gtk1 = gtk1.a[k >>> i - 8 & 0xff];
                    if (gtk1.a == null)
                    {
                        bytearrayoutputstream.write(gtk1.b);
                        i -= gtk1.c;
                        gtk1 = gtj1.a;
                    } else
                    {
                        i -= 8;
                    }
                }

                j++;
            } while (true);
            do
            {
                if (l <= 0)
                {
                    break;
                }
                gtk gtk2 = gtk3.a[k << 8 - l & 0xff];
                if (gtk2.a != null || gtk2.c > l)
                {
                    break;
                }
                bytearrayoutputstream.write(gtk2.b);
                l -= gtk2.c;
                gtk3 = gtj1.a;
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
            return gtb.a()[i].h;
        } else
        {
            return e[a(i - gtb.a().length)].h;
        }
    }
}
