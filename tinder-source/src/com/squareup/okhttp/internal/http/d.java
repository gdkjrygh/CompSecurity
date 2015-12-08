// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.c;
import com.squareup.okhttp.internal.framed.e;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.o;
import com.squareup.okhttp.p;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.l;
import okio.q;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            q, l, n, h, 
//            m, k, p

public final class d
    implements com.squareup.okhttp.internal.http.q
{

    private static final List a = k.a(new ByteString[] {
        ByteString.a("connection"), ByteString.a("host"), ByteString.a("keep-alive"), ByteString.a("proxy-connection"), ByteString.a("transfer-encoding")
    });
    private static final List b = k.a(new ByteString[] {
        ByteString.a("connection"), ByteString.a("host"), ByteString.a("keep-alive"), ByteString.a("proxy-connection"), ByteString.a("te"), ByteString.a("transfer-encoding"), ByteString.a("encoding"), ByteString.a("upgrade")
    });
    private final h c;
    private final c d;
    private com.squareup.okhttp.internal.framed.d e;

    public d(h h1, c c1)
    {
        c = h1;
        d = c1;
    }

    private static boolean a(Protocol protocol, ByteString bytestring)
    {
        if (protocol == Protocol.c)
        {
            return a.contains(bytestring);
        }
        if (protocol == Protocol.d)
        {
            return b.contains(bytestring);
        } else
        {
            throw new AssertionError(protocol);
        }
    }

    public final w a(v v1)
        throws IOException
    {
        return new com.squareup.okhttp.internal.http.l(v1.f, l.a(e.f));
    }

    public final q a(t t1, long l1)
        throws IOException
    {
        return e.d();
    }

    public final void a()
        throws IOException
    {
        e.d().close();
    }

    public final void a(h h1)
        throws IOException
    {
        if (e != null)
        {
            e.a(ErrorCode.l);
        }
    }

    public final void a(n n1)
        throws IOException
    {
        n1.a(e.d());
    }

    public final void a(t t1)
        throws IOException
    {
        c c1;
        ArrayList arraylist;
        Object obj;
        String s1;
        boolean flag;
        if (e != null)
        {
            return;
        }
        c.b();
        flag = c.c();
        obj = m.a(c.c.g);
        c1 = d;
        Protocol protocol = d.a;
        o o1 = t1.c;
        arraylist = new ArrayList(o1.a.length / 2 + 10);
        arraylist.add(new e(e.b, t1.b));
        arraylist.add(new e(e.c, m.a(t1.a)));
        s1 = k.a(t1.a);
        int j;
        int j1;
        if (Protocol.c == protocol)
        {
            arraylist.add(new e(e.g, ((String) (obj))));
            arraylist.add(new e(e.f, s1));
        } else
        if (Protocol.d == protocol)
        {
            arraylist.add(new e(e.e, s1));
        } else
        {
            throw new AssertionError();
        }
        arraylist.add(new e(e.d, t1.a.a));
        t1 = new LinkedHashSet();
        j1 = o1.a.length / 2;
        j = 0;
        if (j >= j1)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj = ByteString.a(o1.a(j).toLowerCase(Locale.US));
        s1 = o1.b(j);
        if (!a(protocol, ((ByteString) (obj))) && !((ByteString) (obj)).equals(e.b) && !((ByteString) (obj)).equals(e.c) && !((ByteString) (obj)).equals(e.d) && !((ByteString) (obj)).equals(e.e) && !((ByteString) (obj)).equals(e.f) && !((ByteString) (obj)).equals(e.g))
        {
            if (!t1.add(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(new e(((ByteString) (obj)), s1));
        }
_L6:
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_227;
_L1:
        int i1 = 0;
_L4:
        if (i1 < arraylist.size())
        {
label0:
            {
                if (!((e)arraylist.get(i1)).h.equals(obj))
                {
                    break label0;
                }
                arraylist.set(i1, new e(((ByteString) (obj)), (new StringBuilder(((e)arraylist.get(i1)).i.a())).append('\0').append(s1).toString()));
            }
        }
        continue; /* Loop/switch isn't completed */
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        e = c1.a(arraylist, flag);
        e.h.a(c.b.x, TimeUnit.MILLISECONDS);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final com.squareup.okhttp.v.a b()
        throws IOException
    {
        List list = e.c();
        Protocol protocol = d.a;
        Object obj = null;
        Object obj1 = "HTTP/1.1";
        com.squareup.okhttp.o.a a1 = new com.squareup.okhttp.o.a();
        a1.b(k.d, protocol.toString());
        int l1 = list.size();
        int j = 0;
        do
        {
            if (j >= l1)
            {
                break;
            }
            ByteString bytestring = ((e)list.get(j)).h;
            String s2 = ((e)list.get(j)).i.a();
            int i1 = 0;
            while (i1 < s2.length()) 
            {
                int k1 = s2.indexOf('\0', i1);
                int j1 = k1;
                if (k1 == -1)
                {
                    j1 = s2.length();
                }
                String s1 = s2.substring(i1, j1);
                if (bytestring.equals(e.a))
                {
                    obj = s1;
                } else
                if (bytestring.equals(e.g))
                {
                    obj1 = s1;
                } else
                if (!a(protocol, bytestring))
                {
                    a1.a(bytestring.a(), s1);
                }
                i1 = j1 + 1;
            }
            j++;
        } while (true);
        if (obj == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        } else
        {
            obj = p.a((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString());
            obj1 = new com.squareup.okhttp.v.a();
            obj1.b = protocol;
            obj1.c = ((com.squareup.okhttp.internal.http.p) (obj)).b;
            obj1.d = ((com.squareup.okhttp.internal.http.p) (obj)).c;
            return ((com.squareup.okhttp.v.a) (obj1)).a(a1.a());
        }
    }

    public final void c()
    {
    }

    public final boolean d()
    {
        return true;
    }

}
