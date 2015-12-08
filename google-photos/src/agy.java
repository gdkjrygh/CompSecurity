// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class agy extends agw
{

    private ByteBuffer f;

    agy()
    {
        f = null;
    }

    public final int a()
    {
        return 1;
    }

    public final Object a(int i)
    {
        return f.rewind();
    }

    public final void a(agw agw1)
    {
        int i = agw1.a();
        if ((i & 2) != 0)
        {
            b.a((ajv)agw1.a(4), f, a[0], a[1]);
        } else
        if ((i & 0x10) != 0)
        {
            ((Bitmap)agw1.a(16)).copyPixelsToBuffer(f);
            f.rewind();
        } else
        if ((i & 1) != 0)
        {
            ByteBuffer bytebuffer = (ByteBuffer)agw1.a(1);
            f.put(bytebuffer);
            bytebuffer.rewind();
        } else
        if ((i & 0x20) != 0 && agv.i())
        {
            Allocation allocation = (Allocation)agw1.a(32);
            if (super.c == 301)
            {
                allocation.copyTo(f.array());
            } else
            if (super.c == 200)
            {
                float af[] = new float[h() / 4];
                allocation.copyTo(af);
                f.asFloatBuffer().put(af);
            } else
            {
                int j = super.c;
                throw new RuntimeException((new StringBuilder(75)).append("Trying to sync to an allocation with an unsupported element id: ").append(j).toString());
            }
        } else
        {
            throw new RuntimeException("Cannot sync bytebuffer backing!");
        }
        agw1.d();
        f.rewind();
        d = false;
    }

    public final void a(aif aif1)
    {
        int j = aif1.d();
        aif1 = a;
        int k = aif1.length;
        for (int i = 0; i < k; i++)
        {
            j *= aif1[i];
        }

        f = ByteBuffer.allocateDirect(j);
    }

    public final int b()
    {
        return 1;
    }

    public final boolean c()
    {
        return false;
    }

    public final void d()
    {
        f.rewind();
    }

    public final int e()
    {
        return 1;
    }

    public final boolean f()
    {
        return true;
    }

    public final void g()
    {
        f = null;
    }

    public final int h()
    {
        if (f == null)
        {
            return 0;
        } else
        {
            return f.remaining();
        }
    }
}
