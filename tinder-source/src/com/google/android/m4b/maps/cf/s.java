// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            h, m, k, d, 
//            g

public class s extends h
{

    private k a;
    private int b[];
    private volatile int c;
    private volatile int d;
    private volatile boolean e;
    private volatile int f;
    private volatile int g;
    private volatile boolean h;
    private final int i;
    private boolean n;
    private m o;

    private s()
    {
        this('\0');
    }

    public s(byte byte0)
    {
        this();
    }

    private s(char c1)
    {
        this((short)0);
    }

    private s(short word0)
    {
        super(h.a.b);
        a = null;
        b = new int[1];
        c = 9728;
        d = 9729;
        e = false;
        f = 10497;
        g = 10497;
        h = false;
        n = false;
        o = new m();
        a = null;
        n = false;
        i = 33984;
    }

    public final void a(k k1, boolean flag)
    {
        if (k)
        {
            throw new RuntimeException("Must be called BEFORE set live");
        } else
        {
            n = flag;
            a = k1;
            return;
        }
    }

    final boolean a(g g1, f.a a1)
    {
        boolean flag;
label0:
        {
            flag = super.a(g1, a1);
            if (flag)
            {
                if (!a1.d)
                {
                    break label0;
                }
                GLES20.glGenTextures(1, b, 0);
                GLES20.glBindTexture(3553, b[0]);
                a.a(a1);
                GLES20.glTexParameteri(3553, 10241, c);
                GLES20.glTexParameteri(3553, 10240, d);
                GLES20.glTexParameteri(3553, 10242, f);
                GLES20.glTexParameteri(3553, 10243, g);
                if (n)
                {
                    GLES20.glGenerateMipmap(3553);
                }
            }
            return flag;
        }
        a.a(a1);
        GLES20.glDeleteTextures(1, b, 0);
        return flag;
    }

    public final void b(int j, int l)
    {
        if (k)
        {
            com.google.android.m4b.maps.cf.d.b();
        }
        if (j != 10497 && j != 33071 && j != 33648 || l != 10497 && l != 33071 && l != 33648)
        {
            throw new IllegalArgumentException((new StringBuilder(58)).append("Illegal Wrap Mode: wrapS = ").append(j).append(" wrapT = ").append(l).toString());
        } else
        {
            f = j;
            g = l;
            h = true;
            return;
        }
    }

    public final void c(int j, int l)
    {
        if (k)
        {
            com.google.android.m4b.maps.cf.d.b();
        }
        if (j != 9729 && j != 9728 && j != 9987 && j != 9985 && j != 9986 && j != 9984 || l != 9729 && l != 9728)
        {
            throw new IllegalArgumentException((new StringBuilder(56)).append("Illegal Filter Mode: min = ").append(j).append(" mag = ").append(l).toString());
        } else
        {
            c = j;
            d = l;
            e = true;
            return;
        }
    }
}
