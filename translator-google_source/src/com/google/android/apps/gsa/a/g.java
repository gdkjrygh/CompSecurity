// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.a.b.c;
import com.google.android.apps.gsa.shared.exception.GsaBaseIOException;
import com.google.android.apps.gsa.shared.io.HttpException;
import com.google.android.apps.gsa.shared.io.h;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.a.d;
import com.google.common.base.p;
import com.google.g.a.a.m;
import com.google.g.a.a.t;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.google.android.apps.gsa.a:
//            f, l, e, c

final class g extends f
{

    private final e a;
    private final t b;
    private final String c;
    private final h d;
    private final com.google.android.apps.gsa.a.c e;

    g(e e1, t t1, String s, h h1, com.google.android.apps.gsa.a.c c1)
    {
        super("PairHttpDown");
        a = e1;
        b = t1;
        c = s;
        d = h1;
        e = c1;
    }

    public final void c()
    {
        Object obj3 = null;
        Object obj;
        obj = l.a(b.a, c);
        obj = d.b(((com.google.android.apps.gsa.shared.io.l) (obj)));
        Object obj1 = obj;
        Object obj2 = ((com.google.android.apps.gsa.shared.io.g) (obj)).b();
        obj1 = obj2;
        obj2 = null;
_L5:
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        MalformedURLException malformedurlexception;
        try
        {
            throw obj2;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally
        {
            obj1 = obj;
        }
        if (a.a(3) && !(obj1 instanceof com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException)) goto _L4; else goto _L3
_L3:
        e.b(((NetworkRecognizeException) (obj1)));
_L10:
        if (obj != null)
        {
            ((com.google.android.apps.gsa.shared.io.g) (obj)).a();
        }
_L9:
        return;
        malformedurlexception;
        obj = null;
_L25:
        obj1 = obj;
        L.a(5, "PairHttpConnection", "Malformed URL '%s' with suffix '%s'", new Object[] {
            b.a.a, c
        });
        obj1 = obj;
        malformedurlexception = new NetworkRecognizeException(malformedurlexception, 0x10001);
        obj1 = null;
          goto _L5
_L24:
        obj1 = obj;
        malformedurlexception = malformedurlexception.getResponseData();
        Object obj4 = null;
        obj1 = malformedurlexception;
        malformedurlexception = obj4;
          goto _L5
_L23:
        obj1 = obj;
        malformedurlexception = new NetworkRecognizeException(malformedurlexception, 0x10023);
        obj1 = null;
          goto _L5
_L2:
        p.a(obj1);
        l.a(((com.google.android.apps.gsa.shared.io.o) (obj1)), "Download");
        p.a(obj);
        obj1 = new c(((com.google.android.apps.gsa.shared.io.g) (obj)).c());
_L13:
        malformedurlexception = ((MalformedURLException) (obj1));
        b();
        malformedurlexception = ((MalformedURLException) (obj1));
        obj3 = ((c) (obj1)).a();
        malformedurlexception = ((MalformedURLException) (obj1));
        if (a.a(2)) goto _L7; else goto _L6
_L6:
        malformedurlexception = ((MalformedURLException) (obj1));
        e.b(new NetworkRecognizeException(0x1000c));
_L12:
        com.google.common.a.d.a(((java.io.Closeable) (obj1)));
_L16:
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((com.google.android.apps.gsa.shared.io.g) (obj)).a();
        return;
_L4:
        e.a(new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.DownloadStreamException(((NetworkRecognizeException) (obj1))));
          goto _L10
        obj = malformedurlexception;
_L19:
        if (obj1 != null)
        {
            ((com.google.android.apps.gsa.shared.io.g) (obj1)).a();
        }
        throw obj;
_L7:
        malformedurlexception = ((MalformedURLException) (obj1));
        e.a(((com.google.f.e.m) (obj3)));
        malformedurlexception = ((MalformedURLException) (obj1));
        if (((com.google.f.e.m) (obj3)).a == 2) goto _L12; else goto _L11
_L11:
        malformedurlexception = ((MalformedURLException) (obj1));
        int i = ((com.google.f.e.m) (obj3)).a;
        if (i != 1) goto _L13; else goto _L12
        obj1;
        malformedurlexception = ((MalformedURLException) (obj3));
_L22:
        obj3 = obj1;
        obj1 = malformedurlexception;
_L18:
        malformedurlexception = ((MalformedURLException) (obj1));
        b();
        malformedurlexception = ((MalformedURLException) (obj1));
        L.a(5, "PairHttpConnection", "[Download] exception - exit %s", new Object[] {
            ((Exception) (obj3)).getMessage()
        });
        malformedurlexception = ((MalformedURLException) (obj1));
        a.a(3);
        i = 0x1000e;
        malformedurlexception = ((MalformedURLException) (obj1));
        if (!(obj3 instanceof EOFException)) goto _L15; else goto _L14
_L14:
        i = 0x10025;
_L17:
        malformedurlexception = ((MalformedURLException) (obj1));
        e.b(new NetworkRecognizeException(((Throwable) (obj3)), i));
        com.google.common.a.d.a(((java.io.Closeable) (obj1)));
          goto _L16
_L15:
        malformedurlexception = ((MalformedURLException) (obj1));
        if (!(obj3 instanceof IndexOutOfBoundsException))
        {
            break MISSING_BLOCK_LABEL_462;
        }
        i = 0x10026;
          goto _L17
        malformedurlexception = ((MalformedURLException) (obj1));
        boolean flag = obj3 instanceof InvalidProtocolBufferNanoException;
        if (flag)
        {
            i = 0x10027;
        }
          goto _L17
        obj1;
        malformedurlexception = null;
_L20:
        com.google.common.a.d.a(malformedurlexception);
        throw obj1;
        malformedurlexception;
        obj1 = null;
_L21:
        obj3 = malformedurlexception;
          goto _L18
        obj;
        obj1 = null;
          goto _L19
        obj;
          goto _L19
        obj1;
          goto _L20
        malformedurlexception;
          goto _L21
        IOException ioexception;
        ioexception;
        malformedurlexception = ((MalformedURLException) (obj1));
        obj1 = ioexception;
          goto _L22
        malformedurlexception;
          goto _L23
        malformedurlexception;
          goto _L24
        malformedurlexception;
          goto _L25
        malformedurlexception;
        obj = null;
          goto _L24
        malformedurlexception;
        obj = null;
          goto _L23
    }
}
