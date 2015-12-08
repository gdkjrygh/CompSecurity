// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.a.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.c.a.c:
//            j, k, g, i, 
//            a, n

abstract class b
    implements j
{
    protected static abstract class a extends com.c.a.c.a
    {

        private final ByteBuffer a;
        private final int b;
        private final int c;

        private void c()
        {
            a.flip();
            for (; a.remaining() >= c; a(a)) { }
            a.compact();
        }

        public final i a()
        {
            c();
            a.flip();
            if (a.remaining() > 0)
            {
                b(a);
            }
            return b();
        }

        public final k a(char c1)
        {
            a.putChar(c1);
            if (a.remaining() < 8)
            {
                c();
            }
            return this;
        }

        public final k a(CharSequence charsequence)
        {
            for (int i = 0; i < charsequence.length(); i++)
            {
                a(charsequence.charAt(i));
            }

            return this;
        }

        public final k a(Object obj, g g1)
        {
            g1.a(obj, this);
            return this;
        }

        protected abstract void a(ByteBuffer bytebuffer);

        abstract i b();

        public final n b(CharSequence charsequence)
        {
            return a(charsequence);
        }

        protected void b(ByteBuffer bytebuffer)
        {
            bytebuffer.position(bytebuffer.limit());
            bytebuffer.limit(c + 7);
            for (; bytebuffer.position() < c; bytebuffer.putLong(0L)) { }
            bytebuffer.limit(c);
            bytebuffer.flip();
            a(bytebuffer);
        }

        protected a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            u.a(true);
            a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
            b = 16;
            c = 16;
        }
    }


    b()
    {
    }

    public final i a(Object obj, g g)
    {
        return a().a(obj, g).a();
    }
}
