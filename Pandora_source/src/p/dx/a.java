// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package p.dx:
//            d, f

public class a
{

    public static boolean a(ByteBuffer bytebuffer, d d1, ByteChannel bytechannel)
        throws IOException
    {
        bytebuffer.clear();
        int i = bytechannel.read(bytebuffer);
        bytebuffer.flip();
        if (i == -1)
        {
            d1.f();
        } else
        if (i != 0)
        {
            return true;
        }
        return false;
    }

    public static boolean a(ByteBuffer bytebuffer, d d1, f f1)
        throws IOException
    {
        bytebuffer.clear();
        int i = f1.a(bytebuffer);
        bytebuffer.flip();
        if (i == -1)
        {
            d1.f();
            return false;
        } else
        {
            return f1.c();
        }
    }

    public static boolean a(d d1, ByteChannel bytechannel)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj1 = (ByteBuffer)d1.f.peek();
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (!(bytechannel instanceof f)) goto _L4; else goto _L3
_L3:
        obj1 = (f)bytechannel;
        obj = obj1;
        if (((f) (obj1)).a())
        {
            ((f) (obj1)).b();
            obj = obj1;
        }
_L8:
        if (!d1.f.isEmpty() || !d1.h() || d1.j().d() != b.b.b) goto _L6; else goto _L5
_L5:
        d1;
        JVM INSTR monitorenter ;
        d1.e();
        d1;
        JVM INSTR monitorexit ;
_L6:
        if (obj != null)
        {
            return !((f)bytechannel).a();
        } else
        {
            return true;
        }
_L2:
        do
        {
            bytechannel.write(((ByteBuffer) (obj)));
            if (((ByteBuffer) (obj)).remaining() > 0)
            {
                return false;
            }
            d1.f.poll();
            obj1 = (ByteBuffer)d1.f.peek();
            obj = obj1;
        } while (obj1 != null);
_L4:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
        bytechannel;
        d1;
        JVM INSTR monitorexit ;
        throw bytechannel;
    }
}
