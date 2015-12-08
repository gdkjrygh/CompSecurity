// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import android.util.Log;
import com.google.android.m4b.maps.as.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.g;
import java.nio.ByteBuffer;
import javax.microedition.khronos.opengles.GL10;

public class a
{

    protected byte a[];
    protected int b;
    ByteBuffer c;
    protected int d;
    protected b e;
    private int f;
    private int g;
    private boolean h;
    private int i;

    public a(int j)
    {
        this(j, false);
    }

    public a(int j, boolean flag)
    {
        d = 0;
        i = 0;
        h = flag;
        f = j;
        g = 0;
        if (a != null) goto _L2; else goto _L1
_L1:
        j = f * 4;
        if (j < 4096 || h)
        {
            a = new byte[j];
        } else
        {
            e = new b(j);
            c();
        }
_L4:
        b = 0;
        c = null;
        return;
_L2:
        if (e != null)
        {
            e.a();
            c();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        if (e != null)
        {
            e.b(g);
            a = (byte[])e.c;
            g = e.d;
        }
    }

    public final int a()
    {
        return d;
    }

    public final void a(int j)
    {
        if (j > f)
        {
            j = Math.max(j, f * 2);
            int k = j * 4;
            if (e == null)
            {
                if (k < 4096 || h)
                {
                    if (h && ab.a("ColorBuffer", 5))
                    {
                        Log.w("ColorBuffer", "Attempt to grow fixed size buffer");
                    }
                    byte abyte0[] = new byte[k];
                    System.arraycopy(a, 0, abyte0, 0, g);
                    a = abyte0;
                } else
                {
                    e = new b(k);
                    e.a(a, g);
                    a = (byte[])e.c;
                    g = e.d;
                }
            } else
            {
                e.c(k);
            }
            f = j;
        }
    }

    public final void a(int j, int k)
    {
        byte byte0 = (byte)(j >>> 24);
        byte byte1 = (byte)(j >>> 16);
        byte byte2 = (byte)(j >>> 8);
        byte byte3 = (byte)j;
        for (j = 0; j < k; j++)
        {
            byte abyte0[] = a;
            int l = g;
            g = l + 1;
            abyte0[l] = byte0;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte1;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte2;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte3;
            if (g >= 4096)
            {
                c();
            }
        }

        b = b + k;
    }

    protected final void a(int j, boolean flag)
    {
        if (e == null)
        {
            a(a, j);
        } else
        {
            c();
            e.a(new com.google.android.m4b.maps.as.b.a() {

                private a a;

                public final void a(byte abyte0[], int k)
                {
                    a.a(abyte0, k);
                }

            
            {
                a = a.this;
                super();
            }
            });
        }
        c.limit(j);
        c.position(0);
        if (flag)
        {
            if (e != null)
            {
                e.c();
                e = null;
            }
            a = null;
        }
    }

    public void a(d d1)
    {
    }

    final void a(byte abyte0[], int j)
    {
        int k = 0;
        if (i > 0)
        {
            for (; k < j; k++)
            {
                int i1 = abyte0[k];
                int l = i;
                i1 = ((i1 & 0xff) * (255 - i)) / 255;
                c.put((byte)(i1 + l));
            }

        } else
        {
            c.put(abyte0, 0, j);
        }
    }

    public int b()
    {
        int j = 32;
        if (e == null) goto _L2; else goto _L1
_L1:
        j = e.b() + 32;
_L4:
        int k = j;
        if (c != null)
        {
            k = j + c.capacity();
        }
        return k;
_L2:
        if (a != null)
        {
            j = a.length + 16 + 32;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(int j, int k)
    {
        byte byte0 = (byte)(j >>> 24);
        byte byte1 = (byte)(j >>> 16);
        byte byte2 = (byte)(j >>> 8);
        byte byte3 = (byte)j;
        for (j = 0; j < k; j++)
        {
            byte abyte0[] = a;
            int l = g;
            g = l + 1;
            abyte0[l] = byte1;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte2;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte3;
            abyte0 = a;
            l = g;
            g = l + 1;
            abyte0[l] = byte0;
            if (g >= 4096)
            {
                c();
            }
        }

        b = b + k;
    }

    public final void b(d d1)
    {
        a(d1);
        if (e != null)
        {
            e.c();
            e = null;
        }
        a = null;
    }

    public void c(d d1)
    {
        if (c == null)
        {
            d(d1);
        }
        d = c.limit();
        d1.a.glColorPointer(4, 5121, 0, c);
    }

    protected void d(d d1)
    {
        int j = b * 4;
        c = d1.c.a(j);
        a(j, true);
    }
}
