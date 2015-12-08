// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.c:
//            c, b

public final class a
{

    private int a;
    private int b;
    private Integer c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private OutputStream h;
    private Bitmap i;
    private byte j[];
    private byte k[];
    private int l;
    private byte m[];
    private boolean n[];
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;

    public a()
    {
        c = null;
        e = -1;
        f = 0;
        g = false;
        n = new boolean[256];
        o = 7;
        p = -1;
        q = false;
        r = true;
        s = false;
        t = 10;
    }

    private void a(String s1)
    {
        for (int i1 = 0; i1 < s1.length(); i1++)
        {
            h.write((byte)s1.charAt(i1));
        }

    }

    private int b(int i1)
    {
        int k1 = 0;
        if (m != null) goto _L2; else goto _L1
_L1:
        int i2 = -1;
_L4:
        return i2;
_L2:
        int j2 = Color.red(i1);
        int k2 = Color.green(i1);
        int l2 = Color.blue(i1);
        int j1 = 0x1000000;
        int i3 = m.length;
        i1 = 0;
        do
        {
            i2 = i1;
            if (k1 >= i3)
            {
                continue;
            }
            byte abyte0[] = m;
            i2 = k1 + 1;
            k1 = j2 - (abyte0[k1] & 0xff);
            abyte0 = m;
            int j3 = i2 + 1;
            i2 = k2 - (abyte0[i2] & 0xff);
            int k3 = l2 - (m[j3] & 0xff);
            k1 = k1 * k1 + i2 * i2 + k3 * k3;
            i2 = j3 / 3;
            if (n[i2] && k1 < j1)
            {
                j1 = i2;
                i1 = k1;
            } else
            {
                int l1 = i1;
                i1 = j1;
                j1 = l1;
            }
            i2 = j1;
            k1 = j3 + 1;
            j1 = i1;
            i1 = i2;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        int i1 = j.length;
        int k1 = i1 / 3;
        k = new byte[k1];
        c c1 = new c(j, i1, t);
        c1.c();
        c1.d();
        c1.b();
        m = c1.a();
        for (i1 = 0; i1 < m.length; i1 += 3)
        {
            byte byte0 = m[i1];
            m[i1] = m[i1 + 2];
            m[i1 + 2] = byte0;
            n[i1 / 3] = false;
        }

        i1 = 0;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            byte abyte0[] = j;
            int j2 = j1 + 1;
            int l1 = abyte0[j1];
            abyte0 = j;
            int i2 = j2 + 1;
            j2 = abyte0[j2];
            abyte0 = j;
            j1 = i2 + 1;
            l1 = c1.a(l1 & 0xff, j2 & 0xff, abyte0[i2] & 0xff);
            n[l1] = true;
            k[i1] = (byte)l1;
        }

        j = null;
        l = 8;
        o = 7;
        if (c != null)
        {
            d = b(c.intValue());
        } else
        if (u)
        {
            d = b(0);
            return;
        }
    }

    private void c()
    {
        h.write(m, 0, m.length);
        int j1 = m.length;
        for (int i1 = 0; i1 < 768 - j1; i1++)
        {
            h.write(0);
        }

    }

    private void c(int i1)
    {
        h.write(i1 & 0xff);
        h.write(i1 >> 8 & 0xff);
    }

    public final void a(int i1)
    {
        f = Math.round((float)i1 / 10F);
    }

    public final boolean a()
    {
        if (!g)
        {
            return false;
        }
        g = false;
        h.write(59);
        h.flush();
        if (q)
        {
            h.close();
        }
        boolean flag = true;
_L2:
        d = 0;
        h = null;
        i = null;
        j = null;
        k = null;
        m = null;
        q = false;
        r = true;
        return flag;
        IOException ioexception;
        ioexception;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a(Bitmap bitmap)
    {
        int k1;
        int j2;
        int l2;
        int i3;
        int j3;
        boolean flag;
        if (bitmap == null || !g)
        {
            return false;
        }
        double d1;
        byte abyte0[];
        int k2;
        int k3;
        try
        {
            if (!s)
            {
                int i1 = bitmap.getWidth();
                int l1 = bitmap.getHeight();
                if (!g || r)
                {
                    a = i1;
                    b = l1;
                    if (a <= 0)
                    {
                        a = 320;
                    }
                    if (b <= 0)
                    {
                        b = 240;
                    }
                    s = true;
                }
            }
            i = bitmap;
            int j1 = i.getWidth();
            int i2 = i.getHeight();
            if (j1 != a || i2 != b)
            {
                bitmap = Bitmap.createBitmap(a, b, android.graphics.Bitmap.Config.ARGB_8888);
                (new Canvas(bitmap)).drawBitmap(bitmap, 0.0F, 0.0F, null);
                i = bitmap;
            }
            bitmap = new int[j1 * i2];
            i.getPixels(bitmap, 0, j1, 0, 0, j1, i2);
            j = new byte[bitmap.length * 3];
            u = false;
            i3 = bitmap.length;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return false;
        }
        k2 = 0;
        j2 = 0;
        l2 = 0;
          goto _L1
_L6:
        abyte0 = j;
        j2 = k2 + 1;
        abyte0[k2] = (byte)(j3 & 0xff);
        abyte0 = j;
        k3 = j2 + 1;
        abyte0[j2] = (byte)(j3 >> 8 & 0xff);
        abyte0 = j;
        k2 = k3 + 1;
        abyte0[k3] = (byte)(j3 >> 16 & 0xff);
        l2++;
        j2 = k1;
          goto _L1
_L4:
        d1 = (double)(j2 * 100) / (double)i3;
        if (d1 > 4D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = flag;
        if (Log.isLoggable("AnimatedGifEncoder", 3))
        {
            (new StringBuilder("got pixels for frame with ")).append(d1).append("% transparent pixels");
        }
        b();
        if (r)
        {
            c(a);
            c(b);
            h.write(o | 0xf0);
            h.write(0);
            h.write(0);
            c();
            if (e >= 0)
            {
                h.write(33);
                h.write(255);
                h.write(11);
                a("NETSCAPE2.0");
                h.write(3);
                h.write(1);
                c(e);
                h.write(0);
            }
        }
        h.write(33);
        h.write(249);
        h.write(4);
        if (c == null && !u)
        {
            k1 = 0;
            j2 = 0;
        } else
        {
            k1 = 2;
            j2 = 1;
        }
        if (p >= 0)
        {
            k1 = p & 7;
        }
        h.write(k1 << 2 | 0 | 0 | j2);
        c(f);
        h.write(d);
        h.write(0);
        h.write(44);
        c(0);
        c(0);
        c(a);
        c(b);
        if (!r)
        {
            break MISSING_BLOCK_LABEL_711;
        }
        h.write(0);
_L2:
        if (!r)
        {
            c();
        }
        (new b(a, b, k, l)).a(h);
        r = false;
        return true;
        h.write(o | 0x80);
          goto _L2
_L1:
        if (l2 >= i3) goto _L4; else goto _L3
_L3:
        j3 = bitmap[l2];
        k1 = j2;
        if (j3 == 0)
        {
            k1 = j2 + 1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            return false;
        }
        boolean flag = true;
        q = false;
        h = outputstream;
        try
        {
            a("GIF89a");
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            flag = false;
        }
        g = flag;
        return flag;
    }
}
