// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.a.b.a;
import com.google.android.apps.gsa.a.c.d;
import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.speech.c.a.b;
import com.google.android.apps.gsa.speech.c.a.c;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.f.e.l;
import com.google.g.a.a.m;
import com.google.protobuf.nano.g;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.gsa.a:
//            f, e, c, l

final class h extends f
{

    private final e a;
    private final m b;
    private final String c;
    private final com.google.android.apps.gsa.shared.io.h d;
    private final s e;
    private final com.google.android.apps.gsa.a.c f;

    public h(e e1, m m1, String s1, com.google.android.apps.gsa.shared.io.h h1, s s2, com.google.android.apps.gsa.a.c c1)
    {
        super("PairHttpUp");
        a = (e)p.a(e1);
        b = (m)p.a(m1);
        c = (String)p.a(s1);
        d = (com.google.android.apps.gsa.shared.io.h)p.a(h1);
        e = (s)p.a(s2);
        f = (com.google.android.apps.gsa.a.c)p.a(c1);
    }

    private com.google.android.apps.gsa.shared.io.g d()
    {
        Object obj;
        try
        {
            obj = com.google.android.apps.gsa.a.l.a(b, c);
            obj = d.a(((com.google.android.apps.gsa.shared.io.l) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            L.a(5, "PairHttpConnection", "Malformed URL '%s' with suffix '%s'", new Object[] {
                b.a, c
            });
            throw new NetworkRecognizeException(malformedurlexception, 0x10002);
        }
        catch (GsaIOException gsaioexception)
        {
            throw new NetworkRecognizeException(gsaioexception, 0x10004);
        }
        return ((com.google.android.apps.gsa.shared.io.g) (obj));
    }

    public final void c()
    {
        Object obj;
        int j;
        int k;
        obj = null;
        k = 0;
        j = 0;
        Object obj1;
        b();
        com.google.android.apps.gsa.shared.b.h.b(7);
        obj1 = d();
        obj = obj1;
        Object obj2;
        Object obj3;
        com.google.android.apps.gsa.shared.b.h.b(8);
        b();
        obj2 = new a(((com.google.android.apps.gsa.shared.io.g) (obj)), b.d);
        obj3 = ((b)e.get()).a();
        int i = 0;
_L21:
        byte abyte0[];
        b();
        abyte0 = ((c) (obj3)).a.iterator();
_L7:
        if (!abyte0.hasNext()) goto _L2; else goto _L1
_L1:
        d d1;
        d1 = (d)abyte0.next();
        obj1 = d1.b();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        b();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (((l) (obj1)).getSerializedSize() > 16384)
        {
            L.a("PairHttpConnection", "S3 request >16K, will probabily fail (size=%d) http://b/15866117", new Object[] {
                Integer.valueOf(((l) (obj1)).getSerializedSize())
            });
        }
        boolean flag1 = ((l) (obj1)).b;
        boolean flag;
        if (((a) (obj2)).e.position() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (((a) (obj2)).d)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        if (!((a) (obj2)).d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (((a) (obj2)).e.position() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        ((a) (obj2)).e.put(a.a);
        ((a) (obj2)).e.put(com.google.android.apps.gsa.a.d.a.a(((a) (obj2)).c.replace("_", "")));
        obj2.d = true;
        p.b(((a) (obj2)).d);
        abyte0 = g.toByteArray(((g) (obj1)));
        ((a) (obj2)).e.putInt(abyte0.length);
        ((a) (obj2)).b.a(((a) (obj2)).e.array(), ((a) (obj2)).e.position(), false);
        ((a) (obj2)).b.a(abyte0, abyte0.length, flag1);
        ((a) (obj2)).e.clear();
        if (!((l) (obj1)).b)
        {
            break MISSING_BLOCK_LABEL_816;
        }
        com.google.android.apps.gsa.shared.b.h.b(23);
        b();
        obj1 = ((com.google.android.apps.gsa.shared.io.g) (obj)).b();
        com.google.android.apps.gsa.a.l.a(((com.google.android.apps.gsa.shared.io.o) (obj1)), "Upload");
        b();
        obj2 = new com.google.android.apps.gsa.a.b.c(((com.google.android.apps.gsa.shared.io.g) (obj)).c());
_L6:
        obj1 = obj2;
        i = j;
        b();
        obj1 = obj2;
        i = j;
        obj3 = ((com.google.android.apps.gsa.a.b.c) (obj2)).a();
        obj1 = obj2;
        i = j;
        p.a(obj3);
        j++;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj1 = obj2;
        i = j;
        a.a(1);
        obj1 = obj2;
        i = j;
        f.a(((com.google.f.e.m) (obj3)));
        obj1 = obj2;
        i = j;
        if (((com.google.f.e.m) (obj3)).a == 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        i = j;
        k = ((com.google.f.e.m) (obj3)).a;
        if (k != 1) goto _L6; else goto _L5
_L5:
        com.google.common.a.d.a(((java.io.Closeable) (obj2)));
_L16:
        if (obj != null)
        {
            ((com.google.android.apps.gsa.shared.io.g) (obj)).a();
        }
_L9:
        return;
_L4:
        com.google.common.a.d.a(d1);
        abyte0.remove();
          goto _L7
_L13:
        f.b(((NetworkRecognizeException) (obj1)));
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((com.google.android.apps.gsa.shared.io.g) (obj)).a();
        return;
_L2:
        if (((c) (obj3)).b) goto _L11; else goto _L10
_L10:
        obj3.b = true;
        for (obj1 = ((c) (obj3)).a.iterator(); ((Iterator) (obj1)).hasNext(); com.google.common.a.d.a((d)((Iterator) (obj1)).next())) { }
          goto _L12
_L17:
        if (obj1 != null)
        {
            ((com.google.android.apps.gsa.shared.io.g) (obj1)).a();
        }
        throw obj;
_L12:
        ((c) (obj3)).a.clear();
        obj1 = com.google.android.apps.gsa.a.b.b.a();
        obj1.b = true;
        obj1.a = ((l) (obj1)).a | 8;
          goto _L3
_L11:
        obj1 = null;
          goto _L3
        obj1;
        ((a) (obj2)).e.clear();
        throw obj1;
        obj1;
        Object obj4;
        if (i == 0)
        {
            i = 0x10006;
        } else
        {
            i = 0x1000a;
        }
        try
        {
            throw new NetworkRecognizeException(((Throwable) (obj1)), i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally
        {
            obj1 = obj;
            obj = obj2;
        }
          goto _L13
        obj1;
        throw new NetworkRecognizeException(((Throwable) (obj1)), 0x10009);
        obj4;
        obj2 = null;
        i = k;
_L19:
        obj1 = obj2;
        b();
        if (i <= 0) goto _L15; else goto _L14
_L14:
        obj1 = obj2;
        L.a(5, "PairHttpConnection", "[Upload] exception - exit: %s", new Object[] {
            obj4
        });
        obj1 = obj2;
        throw new NetworkRecognizeException(((Throwable) (obj4)), 0x1000d);
        obj4;
        obj2 = obj1;
        obj1 = obj4;
_L18:
        com.google.common.a.d.a(((java.io.Closeable) (obj2)));
        throw obj1;
_L15:
        com.google.common.a.d.a(((java.io.Closeable) (obj2)));
          goto _L16
        obj;
        obj1 = null;
          goto _L17
        obj2;
        obj1 = obj;
        obj = obj2;
          goto _L17
        obj1;
          goto _L13
        obj1;
        obj2 = null;
          goto _L18
        obj4;
          goto _L19
        i++;
        if (true) goto _L21; else goto _L20
_L20:
    }
}
