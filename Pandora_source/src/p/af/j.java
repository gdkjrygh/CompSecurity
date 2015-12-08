// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import p.n.a;
import p.n.d;
import p.q.f;
import p.q.g;
import p.s.k;
import p.t.c;

// Referenced classes of package p.af:
//            a, b

public class j
    implements f
{
    static class a
    {

        public p.n.a a(p.n.a.a a1)
        {
            return new p.n.a(a1);
        }

        public d a()
        {
            return new d();
        }

        public k a(Bitmap bitmap, c c1)
        {
            return new p.ab.c(bitmap, c1);
        }

        public p.o.a b()
        {
            return new p.o.a();
        }

        a()
        {
        }
    }


    private static final a a = new a();
    private final p.n.a.a b;
    private final c c;
    private final a d;

    public j(c c1)
    {
        this(c1, a);
    }

    j(c c1, a a1)
    {
        c = c1;
        b = new p.af.a(c1);
        d = a1;
    }

    private p.n.a a(byte abyte0[])
    {
        Object obj = d.a();
        ((d) (obj)).a(abyte0);
        obj = ((d) (obj)).b();
        p.n.a a1 = d.a(b);
        a1.a(((p.n.c) (obj)), abyte0);
        a1.a();
        return a1;
    }

    private k a(Bitmap bitmap, g g1, b b1)
    {
        bitmap = d.a(bitmap, c);
        g1 = g1.a(bitmap, b1.getIntrinsicWidth(), b1.getIntrinsicHeight());
        if (!bitmap.equals(g1))
        {
            bitmap.d();
        }
        return g1;
    }

    private boolean a(byte abyte0[], OutputStream outputstream)
    {
        try
        {
            outputstream.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (Log.isLoggable("GifEncoder", 3))
            {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", abyte0);
            }
            return false;
        }
        return true;
    }

    public String a()
    {
        return "";
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((k)obj, outputstream);
    }

    public boolean a(k k1, OutputStream outputstream)
    {
        g g1;
        long l;
        boolean flag;
        flag = false;
        l = p.ap.d.a();
        k1 = (b)k1.b();
        g1 = k1.c();
        if (!(g1 instanceof p.aa.d)) goto _L2; else goto _L1
_L1:
        flag = a(k1.d(), outputstream);
_L6:
        return flag;
_L2:
        p.n.a a1;
        p.o.a a2;
        int i;
        a1 = a(k1.d());
        a2 = d.b();
        if (!a2.a(outputstream))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L4:
        if (i >= a1.c())
        {
            break; /* Loop/switch isn't completed */
        }
        outputstream = a(a1.f(), g1, ((b) (k1)));
        flag = a2.a((Bitmap)outputstream.b());
        if (!flag)
        {
            outputstream.d();
            return false;
        }
        a2.a(a1.a(a1.d()));
        a1.a();
        outputstream.d();
        i++;
        if (true) goto _L4; else goto _L3
        k1;
        outputstream.d();
        throw k1;
_L3:
        boolean flag1 = a2.a();
        flag = flag1;
        if (Log.isLoggable("GifEncoder", 2))
        {
            Log.v("GifEncoder", (new StringBuilder()).append("Encoded gif with ").append(a1.c()).append(" frames and ").append(k1.d().length).append(" bytes in ").append(p.ap.d.a(l)).append(" ms").toString());
            return flag1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
