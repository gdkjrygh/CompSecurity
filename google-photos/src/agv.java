// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class agv extends agw
{

    private final RenderScript f;
    private Allocation g;

    public agv(RenderScript renderscript)
    {
        g = null;
        f = renderscript;
    }

    public static boolean i()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public final int a()
    {
        return 32;
    }

    public final Object a(int j)
    {
        return g;
    }

    public final void a(agw agw1)
    {
        int j = agw1.a();
        if ((j & 2) != 0)
        {
            ajv ajv1 = (ajv)agw1.a(4);
            ByteBuffer bytebuffer = ByteBuffer.allocateDirect(h());
            b.a(ajv1, bytebuffer, a[0], a[1]);
            g.copyFrom(bytebuffer.array());
        } else
        if ((j & 0x10) != 0)
        {
            Bitmap bitmap = (Bitmap)agw1.a(16);
            g.copyFrom(bitmap);
        } else
        if ((j & 1) != 0)
        {
            ByteBuffer bytebuffer1 = (ByteBuffer)agw1.a(1);
            if (bytebuffer1.order() != ByteOrder.nativeOrder())
            {
                throw new RuntimeException("Trying to sync to the ByteBufferBacking with non-native byte order!");
            }
            byte abyte0[];
            if (bytebuffer1.hasArray())
            {
                abyte0 = bytebuffer1.array();
            } else
            {
                abyte0 = new byte[h()];
                bytebuffer1.get(abyte0);
                bytebuffer1.rewind();
            }
            g.copyFromUnchecked(abyte0);
        } else
        {
            throw new RuntimeException("Cannot sync allocation backing!");
        }
        agw1.d();
        d = false;
    }

    public final void a(aif aif1)
    {
        Object obj;
        boolean flag;
        flag = true;
        if (aif1.a != 301 && aif1.a != 200)
        {
            throw new RuntimeException("Cannot allocate allocation with a non-RGBA or non-float data type!");
        }
        if (a == null || a.length > 2)
        {
            throw new RuntimeException("Cannot create an allocation with more than 2 dimensions!");
        }
        obj = null;
        aif1.a;
        JVM INSTR lookupswitch 2: default 92
    //                   200: 182
    //                   301: 171;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_182;
_L1:
        aif1 = obj;
_L4:
        aif1 = new android.renderscript.Type.Builder(f, aif1);
        int j;
        if (a.length > 0)
        {
            j = a[0];
        } else
        {
            j = 1;
        }
        aif1.setX(j);
        j = ((flag) ? 1 : 0);
        if (a.length == 2)
        {
            j = a[1];
        }
        aif1.setY(j);
        aif1 = aif1.create();
        g = Allocation.createTyped(f, aif1);
        return;
_L3:
        aif1 = Element.RGBA_8888(f);
          goto _L4
        aif1 = Element.F32(f);
          goto _L4
    }

    public final int b()
    {
        return 32;
    }

    public final boolean c()
    {
        return false;
    }

    public final void d()
    {
    }

    public final int e()
    {
        return 5;
    }

    public final boolean f()
    {
        return true;
    }

    public final void g()
    {
        if (g != null)
        {
            g.destroy();
            g = null;
        }
    }

    public final int h()
    {
        int k = 1;
        int ai[] = a;
        int l = ai.length;
        for (int j = 0; j < l; j++)
        {
            k *= ai[j];
        }

        return super.b * k;
    }
}
