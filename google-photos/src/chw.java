// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.util.LinkedList;
import java.util.concurrent.Callable;

final class chw
    implements cin
{

    private final chv a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private chq h;

    chw(chq chq1, int i, int j, int k)
    {
        this(chq1, chq.h(chq1), false);
        e = b.a(i, "width");
        f = b.a(j, "height");
        g = b.a(k, "filterMode", 0, 1);
        chq.a(c, b, e, f);
    }

    chw(chq chq1, Bitmap bitmap, int i)
    {
        this(chq1, chq.h(chq1), false);
        e = b.a(bitmap.getWidth(), "bitmap.getWidth()");
        f = b.a(bitmap.getHeight(), "bitmap.getHeight()");
        g = b.a(i, "filterMode", 0, 1);
        chq.a(c, b, bitmap);
    }

    private chw(chq chq1, chv chv1, boolean flag)
    {
        h = chq1;
        super();
        a = (chv)b.a(chv1, "surfacePresentingRenderSink", null);
        e = a.d();
        f = a.e();
        g = 1;
        chv.a(a);
        c = chq.i();
        int i;
        if (flag)
        {
            i = 36197;
        } else
        {
            i = 3553;
        }
        b = i;
        chq.i(chq1).add(this);
    }

    chw(chq chq1, boolean flag)
    {
        this(chq1, chq.h(chq1), flag);
    }

    public final Object a(Callable callable)
    {
        c.b(c, "mTexId", 0, null);
        if (d == 0)
        {
            a.g();
            d = chq.j();
            GLES20.glBindFramebuffer(36160, d);
            b.i("glBindFrameBuffer");
            GLES20.glFramebufferTexture2D(36160, 36064, b, c, 0);
            b.i("glFramebufferTexture2D");
        }
        a.a(d);
        GLES20.glViewport(0, 0, e, f);
        b.i("glViewport");
        return callable.call();
    }

    public final void a()
    {
        if (c == 0)
        {
            return;
        }
        a.g();
        if (d != 0)
        {
            GLES20.glDeleteFramebuffers(1, new int[] {
                d
            }, 0);
            b.i("glDeleteFramebuffers");
        }
        if (GLES20.glIsTexture(c))
        {
            GLES20.glDeleteTextures(1, new int[] {
                c
            }, 0);
            b.i("glDeleteTextures");
        }
        c = 0;
        chq.i(h).remove(this);
        chq.h(h).g();
    }

    public final void a(cia cia)
    {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public final void b(cia cia)
    {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public final boolean b()
    {
        return b == 36197;
    }

    public final int c()
    {
        return c.b(c, "mTexId", 0, null);
    }

    public final int d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final boolean f()
    {
        return false;
    }

    public final int g()
    {
        return g;
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Integer.valueOf(c), Integer.valueOf(e), Integer.valueOf(f), a, Integer.valueOf(b), Integer.valueOf(d)
        });
    }
}
