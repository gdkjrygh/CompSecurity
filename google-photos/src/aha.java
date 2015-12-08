// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.renderscript.Allocation;
import java.nio.ByteBuffer;

final class aha extends agw
{

    private ajv f;
    private ajz g;

    aha()
    {
        f = null;
        g = null;
    }

    private ajz i()
    {
        if (!g.c)
        {
            g.a(a[0], a[1]);
        }
        return g;
    }

    private ajv j()
    {
        if (f == null)
        {
            ajv ajv1 = ajv.a();
            ajz ajz1 = i();
            int k = b.c();
            GLES20.glBindFramebuffer(36160, k);
            b.b("glBindFramebuffer");
            GLES20.glFramebufferTexture2D(36160, 36064, ajz1.b, ajz1.a, 0);
            b.b("glFramebufferTexture2D");
            f = new ajv(ajv1.b, ajv1.c, ajv1.h(), k, false, false);
        }
        return f;
    }

    public final int a()
    {
        return 2;
    }

    public final Object a(int k)
    {
        switch (k)
        {
        case 3: // '\003'
        default:
            throw new RuntimeException("Illegal access to texture!");

        case 2: // '\002'
            return i();

        case 4: // '\004'
            return j();
        }
    }

    public final void a(agw agw1)
    {
        int k = agw1.a();
        if ((k & 1) != 0)
        {
            ByteBuffer bytebuffer = (ByteBuffer)agw1.a(1);
            g.a(bytebuffer, a[0], a[1]);
        } else
        if ((k & 0x10) != 0)
        {
            Bitmap bitmap = (Bitmap)agw1.a(16);
            ajz ajz2 = g;
            b.a(ajz2.a, ajz2.b, bitmap);
            ajz2.c = true;
        } else
        if ((k & 2) != 0)
        {
            ajz ajz1 = (ajz)agw1.a(2);
            k = a[0];
            int l = a[1];
            ajv ajv1 = j();
            ajv.a().g().a(ajz1, ajv1, k, l);
        } else
        if ((k & 0x20) != 0 && agv.i())
        {
            Allocation allocation = (Allocation)agw1.a(32);
            ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(h());
            allocation.copyTo(bytebuffer1.array());
            g.a(bytebuffer1, a[0], a[1]);
        } else
        {
            throw new RuntimeException("Cannot sync bytebuffer backing!");
        }
        agw1.d();
        d = false;
    }

    public final void a(aif aif)
    {
        b(aif);
        g = ajz.a();
    }

    public final int b()
    {
        return 4;
    }

    public final boolean c()
    {
        return true;
    }

    public final int e()
    {
        return 2;
    }

    public final boolean f()
    {
        return true;
    }

    public final void g()
    {
        if (f != null)
        {
            f.f();
        }
        if (g.c)
        {
            g.e();
        }
    }

    public final int h()
    {
        return a[0] * 4 * a[1];
    }
}
