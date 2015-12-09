// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.b.a;
import com.bumptech.glide.b.c;
import com.bumptech.glide.b.d;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            a, d, b

public class i
    implements e
{
    static class a
    {

        private final Queue a = h.a(0);

        public com.bumptech.glide.b.a a(com.bumptech.glide.b.a.a a1)
        {
            this;
            JVM INSTR monitorenter ;
            com.bumptech.glide.b.a a3 = (com.bumptech.glide.b.a)a.poll();
            com.bumptech.glide.b.a a2;
            a2 = a3;
            if (a3 != null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            a2 = new com.bumptech.glide.b.a(a1);
            this;
            JVM INSTR monitorexit ;
            return a2;
            a1;
            throw a1;
        }

        public void a(com.bumptech.glide.b.a a1)
        {
            this;
            JVM INSTR monitorenter ;
            a1.g();
            a.offer(a1);
            this;
            JVM INSTR monitorexit ;
            return;
            a1;
            throw a1;
        }

        a()
        {
        }
    }

    static class b
    {

        private final Queue a = h.a(0);

        public d a(byte abyte0[])
        {
            this;
            JVM INSTR monitorenter ;
            d d2 = (d)a.poll();
            d d1;
            d1 = d2;
            if (d2 != null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            d1 = new d();
            abyte0 = d1.a(abyte0);
            this;
            JVM INSTR monitorexit ;
            return abyte0;
            abyte0;
            throw abyte0;
        }

        public void a(d d1)
        {
            this;
            JVM INSTR monitorenter ;
            d1.a();
            a.offer(d1);
            this;
            JVM INSTR monitorexit ;
            return;
            d1;
            throw d1;
        }

        b()
        {
        }
    }


    private static final b a = new b();
    private static final a b = new a();
    private final Context c;
    private final b d;
    private final com.bumptech.glide.load.engine.a.c e;
    private final a f;
    private final com.bumptech.glide.load.resource.c.a g;

    public i(Context context, com.bumptech.glide.load.engine.a.c c1)
    {
        this(context, c1, a, b);
    }

    i(Context context, com.bumptech.glide.load.engine.a.c c1, b b1, a a1)
    {
        c = context;
        e = c1;
        f = a1;
        g = new com.bumptech.glide.load.resource.c.a(c1);
        d = b1;
    }

    private Bitmap a(com.bumptech.glide.b.a a1, c c1, byte abyte0[])
    {
        a1.a(c1, abyte0);
        a1.a();
        return a1.f();
    }

    private com.bumptech.glide.load.resource.c.d a(byte abyte0[], int j, int k, d d1, com.bumptech.glide.b.a a1)
    {
        d1 = d1.b();
        if (d1.a() > 0 && d1.b() == 0)
        {
            if ((a1 = a(a1, ((c) (d1)), abyte0)) != null)
            {
                com.bumptech.glide.load.resource.d d2 = com.bumptech.glide.load.resource.d.b();
                return new com.bumptech.glide.load.resource.c.d(new com.bumptech.glide.load.resource.c.b(c, g, e, d2, j, k, d1, abyte0, a1));
            }
        }
        return null;
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(16384);
        byte abyte0[] = new byte[16384];
_L3:
        int j = inputstream.read(abyte0);
        if (j == -1) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write(abyte0, 0, j);
          goto _L3
_L5:
        return bytearrayoutputstream.toByteArray();
_L2:
        try
        {
            bytearrayoutputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.w("GifResourceDecoder", "Error reading data from stream", inputstream);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public volatile j a(Object obj, int j, int k)
        throws IOException
    {
        return a((InputStream)obj, j, k);
    }

    public com.bumptech.glide.load.resource.c.d a(InputStream inputstream, int j, int k)
    {
        com.bumptech.glide.b.a a1;
        byte abyte0[];
        abyte0 = a(inputstream);
        inputstream = d.a(abyte0);
        a1 = f.a(g);
        com.bumptech.glide.load.resource.c.d d1 = a(abyte0, j, k, ((d) (inputstream)), a1);
        d.a(inputstream);
        f.a(a1);
        return d1;
        Exception exception;
        exception;
        d.a(inputstream);
        f.a(a1);
        throw exception;
    }

    public String a()
    {
        return "";
    }

}
