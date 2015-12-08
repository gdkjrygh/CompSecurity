// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.c.a.c:
//            b, k, i

final class m extends b
    implements Serializable
{
    private static final class a extends b.a
    {

        private long a;
        private long b;
        private int c;

        private static long a(long l)
        {
            l = (l >>> 33 ^ l) * 0xff51afd7ed558ccdL;
            l = (l ^ l >>> 33) * 0xc4ceb9fe1a85ec53L;
            return l ^ l >>> 33;
        }

        private static long b(long l)
        {
            return Long.rotateLeft(0x87c37b91114253d5L * l, 31) * 0x4cf5ad432745937fL;
        }

        private static long c(long l)
        {
            return Long.rotateLeft(0x4cf5ad432745937fL * l, 33) * 0x87c37b91114253d5L;
        }

        protected final void a(ByteBuffer bytebuffer)
        {
            long l = bytebuffer.getLong();
            long l1 = bytebuffer.getLong();
            long l2 = a;
            a = b(l) ^ l2;
            a = Long.rotateLeft(a, 27);
            a = a + b;
            a = a * 5L + 0x52dce729L;
            b = b ^ c(l1);
            b = Long.rotateLeft(b, 31);
            b = b + a;
            b = b * 5L + 0x38495ab5L;
            c = c + 16;
        }

        public final i b()
        {
            a = a ^ (long)c;
            b = b ^ (long)c;
            a = a + b;
            b = b + a;
            a = a(a);
            b = a(b);
            a = a + b;
            b = b + a;
            return i.a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(a).putLong(b).array());
        }

        protected final void b(ByteBuffer bytebuffer)
        {
            c = c + bytebuffer.remaining();
            bytebuffer.remaining();
            JVM INSTR tableswitch 1 15: default 92
        //                       1 438
        //                       2 433
        //                       3 428
        //                       4 423
        //                       5 418
        //                       6 413
        //                       7 262
        //                       8 408
        //                       9 403
        //                       10 398
        //                       11 393
        //                       12 388
        //                       13 383
        //                       14 378
        //                       15 102;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
            throw new AssertionError("Should never get here.");
_L16:
            long l = (long)(bytebuffer.get(14) & 0xff) << 48 ^ 0L;
_L18:
            l ^= (long)(bytebuffer.get(13) & 0xff) << 40;
_L19:
            l ^= (long)(bytebuffer.get(12) & 0xff) << 32;
_L20:
            l ^= (long)(bytebuffer.get(11) & 0xff) << 24;
_L21:
            l ^= (long)(bytebuffer.get(10) & 0xff) << 16;
_L22:
            l ^= (long)(bytebuffer.get(9) & 0xff) << 8;
_L23:
            l ^= bytebuffer.get(8) & 0xff;
_L24:
            long l1 = 0L ^ bytebuffer.getLong();
_L17:
            long l2 = a;
            a = b(l1) ^ l2;
            l1 = b;
            b = c(l) ^ l1;
            return;
_L8:
            l = (long)(bytebuffer.get(6) & 0xff) << 48 ^ 0L;
_L25:
            l ^= (long)(bytebuffer.get(5) & 0xff) << 40;
_L26:
            l ^= (long)(bytebuffer.get(4) & 0xff) << 32;
_L27:
            l ^= (long)(bytebuffer.get(3) & 0xff) << 24;
_L28:
            l ^= (long)(bytebuffer.get(2) & 0xff) << 16;
_L29:
            l ^= (long)(bytebuffer.get(1) & 0xff) << 8;
_L30:
            l1 = l ^ (long)(bytebuffer.get(0) & 0xff);
            l = 0L;
              goto _L17
_L15:
            l = 0L;
              goto _L18
_L14:
            l = 0L;
              goto _L19
_L13:
            l = 0L;
              goto _L20
_L12:
            l = 0L;
              goto _L21
_L11:
            l = 0L;
              goto _L22
_L10:
            l = 0L;
              goto _L23
_L9:
            l = 0L;
              goto _L24
_L7:
            l = 0L;
              goto _L25
_L6:
            l = 0L;
              goto _L26
_L5:
            l = 0L;
              goto _L27
_L4:
            l = 0L;
              goto _L28
_L3:
            l = 0L;
              goto _L29
_L2:
            l = 0L;
              goto _L30
        }

        a(int j)
        {
            a = j;
            b = j;
            c = 0;
        }
    }


    private final int a;

    m(int i)
    {
        a = i;
    }

    public final k a()
    {
        return new a(a);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof m)
        {
            obj = (m)obj;
            flag = flag1;
            if (a == ((m) (obj)).a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return getClass().hashCode() ^ a;
    }

    public final String toString()
    {
        int i = a;
        return (new StringBuilder(32)).append("Hashing.murmur3_128(").append(i).append(")").toString();
    }
}
