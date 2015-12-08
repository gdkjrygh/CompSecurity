// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import java.nio.ByteBuffer;

final class agx extends agw
{

    private Bitmap f;

    agx()
    {
        f = null;
    }

    private void i()
    {
        f = Bitmap.createBitmap(a[0], a[1], android.graphics.Bitmap.Config.ARGB_8888);
    }

    public final int a()
    {
        return 16;
    }

    public final Object a(int j)
    {
        return f;
    }

    public final void a(agw agw1)
    {
        int j = agw1.a();
        if ((j & 0x10) != 0)
        {
            f = (Bitmap)agw1.a(16);
        } else
        if ((j & 1) != 0)
        {
            i();
            ByteBuffer bytebuffer = (ByteBuffer)agw1.a(1);
            f.copyPixelsFromBuffer(bytebuffer);
            bytebuffer.rewind();
        } else
        if ((j & 2) != 0)
        {
            i();
            ajv ajv1 = (ajv)agw1.a(4);
            Bitmap bitmap = f;
            j = a[0];
            int k = a[1];
            ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(j * k << 2);
            b.a(ajv1, bytebuffer1, j, k);
            bitmap.copyPixelsFromBuffer(bytebuffer1);
        } else
        if ((j & 0x20) != 0 && agv.i())
        {
            i();
            ((Allocation)agw1.a(32)).copyTo(f);
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
    }

    public final void a(Object obj)
    {
        f = (Bitmap)obj;
    }

    public final int b()
    {
        return 16;
    }

    public final boolean c()
    {
        return false;
    }

    public final int e()
    {
        return 4;
    }

    public final boolean f()
    {
        return false;
    }

    public final void g()
    {
        f = null;
    }

    public final int h()
    {
        return a[0] * 4 * a[1];
    }
}
