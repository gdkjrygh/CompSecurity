// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import p.ap.h;
import p.n.a;
import p.n.c;
import p.n.d;
import p.q.e;
import p.s.k;

// Referenced classes of package p.af:
//            a, d, b

public class i
    implements e
{
    static class a
    {

        private final Queue a = h.a(0);

        public p.n.a a(p.n.a.a a1)
        {
            this;
            JVM INSTR monitorenter ;
            p.n.a a3 = (p.n.a)a.poll();
            p.n.a a2;
            a2 = a3;
            if (a3 != null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            a2 = new p.n.a(a1);
            this;
            JVM INSTR monitorexit ;
            return a2;
            a1;
            throw a1;
        }

        public void a(p.n.a a1)
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
    private final p.t.c e;
    private final a f;
    private final p.af.a g;

    public i(Context context, p.t.c c1)
    {
        this(context, c1, a, b);
    }

    i(Context context, p.t.c c1, b b1, a a1)
    {
        c = context;
        e = c1;
        f = a1;
        g = new p.af.a(c1);
        d = b1;
    }

    private Bitmap a(p.n.a a1, c c1, byte abyte0[])
    {
        a1.a(c1, abyte0);
        a1.a();
        return a1.f();
    }

    private p.af.d a(byte abyte0[], int j, int k, d d1, p.n.a a1)
    {
        d1 = d1.b();
        if (d1.a() > 0 && d1.b() == 0)
        {
            if ((a1 = a(a1, ((c) (d1)), abyte0)) != null)
            {
                p.aa.d d2 = p.aa.d.b();
                return new p.af.d(new p.af.b(c, g, e, d2, j, k, d1, abyte0, a1));
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

    public String a()
    {
        return "";
    }

    public p.af.d a(InputStream inputstream, int j, int k)
    {
        p.n.a a1;
        byte abyte0[];
        abyte0 = a(inputstream);
        inputstream = d.a(abyte0);
        a1 = f.a(g);
        p.af.d d1 = a(abyte0, j, k, ((d) (inputstream)), a1);
        d.a(inputstream);
        f.a(a1);
        return d1;
        Exception exception;
        exception;
        d.a(inputstream);
        f.a(a1);
        throw exception;
    }

    public volatile k a(Object obj, int j, int k)
        throws IOException
    {
        return a((InputStream)obj, j, k);
    }

}
