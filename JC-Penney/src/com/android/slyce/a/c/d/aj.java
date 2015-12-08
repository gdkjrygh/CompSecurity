// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import android.net.Uri;
import android.text.TextUtils;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import com.android.slyce.a.ap;
import com.android.slyce.a.b.a;
import com.android.slyce.a.b.j;
import com.android.slyce.a.c.ac;
import com.android.slyce.a.c.ai;
import com.android.slyce.a.c.av;
import com.android.slyce.a.c.bj;
import com.android.slyce.a.c.bn;
import com.android.slyce.a.c.l;
import com.android.slyce.a.c.n;
import com.android.slyce.a.c.q;
import com.android.slyce.a.c.s;
import com.android.slyce.a.c.u;
import com.android.slyce.a.d.b;
import com.android.slyce.a.d.e;
import com.android.slyce.a.h;
import com.android.slyce.a.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

// Referenced classes of package com.android.slyce.a.c.d:
//            ar, ak, a, l, 
//            at, as, an, ao, 
//            al, b, aq, ap

public class aj extends ac
{

    private static final ar z = new ar(null);
    boolean n;
    Field o;
    Field p;
    Field q;
    Field r;
    Field s;
    Field t;
    Field u;
    Method v;
    Method w;
    Hashtable x;
    boolean y;

    public aj(com.android.slyce.a.c.a a1)
    {
        super(a1);
        x = new Hashtable();
        a(new ak(this));
    }

    static a a(aj aj1, l l1)
    {
        return aj1.ai.a(l1);
    }

    static void a(aj aj1, l l1, com.android.slyce.a.c.d.a a1, c c1)
    {
        aj1.a(l1, a1, c1);
    }

    static void a(aj aj1, String s1)
    {
        aj1.a(s1);
    }

    static void a(aj aj1, String s1, c c1, Exception exception, h h)
    {
        aj1.a(s1, c1, exception, h);
    }

    static void a(aj aj1, SSLEngine sslengine, l l1, String s1, int i)
    {
        aj1.a(sslengine, l1, s1, i);
    }

    private void a(l l1, com.android.slyce.a.c.d.a a1, c c1)
    {
        u u1 = l1.j;
        l1.c = a1.g.toString();
        l1 = l1.j.g();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new com.android.slyce.a.c.d.l(com.android.slyce.a.c.d.l.b, u1.c()));
        arraylist.add(new com.android.slyce.a.c.d.l(com.android.slyce.a.c.d.l.c, b(u1.d())));
        Object obj = u1.e().a("Host");
        Iterator iterator;
        if (bn.c == a1.g)
        {
            arraylist.add(new com.android.slyce.a.c.d.l(l.g, "HTTP/1.1"));
            arraylist.add(new com.android.slyce.a.c.d.l(l.f, ((String) (obj))));
        } else
        if (bn.d == a1.g)
        {
            arraylist.add(new com.android.slyce.a.c.d.l(com.android.slyce.a.c.d.l.e, ((String) (obj))));
        } else
        {
            throw new AssertionError();
        }
        arraylist.add(new com.android.slyce.a.c.d.l(l.d, u1.d().getScheme()));
        obj = u1.e().a();
        iterator = ((bj) (obj)).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!com.android.slyce.a.c.d.at.a(a1.g, s1))
            {
                Iterator iterator1 = ((List)((bj) (obj)).get(s1)).iterator();
                while (iterator1.hasNext()) 
                {
                    String s2 = (String)iterator1.next();
                    arraylist.add(new com.android.slyce.a.c.d.l(s1.toLowerCase(), s2));
                }
            }
        } while (true);
        u1.b((new StringBuilder()).append("\n").append(u1).toString());
        boolean flag;
        if (l1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.a(null, a1.a(arraylist, flag, true));
    }

    private void a(String s1)
    {
        s1 = (as)x.remove(s1);
        if (s1 != null)
        {
            s1.a(z);
        }
    }

    private void a(String s1, c c1, Exception exception, h h)
    {
        s1 = (as)x.get(s1);
        if (s1 == null || ((as) (s1)).c.f())
        {
            c1.a(exception, h);
        }
    }

    private void a(SSLEngine sslengine, l l1, String s1, int i)
    {
        if (!n && y)
        {
            n = true;
            try
            {
                o = sslengine.getClass().getSuperclass().getDeclaredField("peerHost");
                p = sslengine.getClass().getSuperclass().getDeclaredField("peerPort");
                q = sslengine.getClass().getDeclaredField("sslParameters");
                r = q.getType().getDeclaredField("npnProtocols");
                s = q.getType().getDeclaredField("alpnProtocols");
                u = q.getType().getDeclaredField("useSni");
                t = sslengine.getClass().getDeclaredField("sslNativePointer");
                String s2 = (new StringBuilder()).append(q.getType().getPackage().getName()).append(".NativeCrypto").toString();
                v = Class.forName(s2, true, q.getType().getClassLoader()).getDeclaredMethod("SSL_get_npn_negotiated_protocol", new Class[] {
                    Long.TYPE
                });
                w = Class.forName(s2, true, q.getType().getClassLoader()).getDeclaredMethod("SSL_get0_alpn_selected", new Class[] {
                    Long.TYPE
                });
                o.setAccessible(true);
                p.setAccessible(true);
                q.setAccessible(true);
                r.setAccessible(true);
                s.setAccessible(true);
                u.setAccessible(true);
                t.setAccessible(true);
                v.setAccessible(true);
                w.setAccessible(true);
            }
            catch (Exception exception)
            {
                q = null;
                r = null;
                s = null;
                u = null;
                t = null;
                v = null;
                w = null;
            }
        }
        while (!b(l1) || q == null) 
        {
            return;
        }
        try
        {
            l1 = a(new bn[] {
                bn.b, bn.c
            });
            o.set(sslengine, s1);
            p.set(sslengine, Integer.valueOf(i));
            sslengine = ((SSLEngine) (q.get(sslengine)));
            s.set(sslengine, l1);
            u.set(sslengine, Boolean.valueOf(true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SSLEngine sslengine)
        {
            sslengine.printStackTrace();
        }
    }

    static transient byte[] a(bn abn[])
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(8192);
        int k = abn.length;
        int i = 0;
        while (i < k) 
        {
            bn bn1 = abn[i];
            if (bn1 != bn.a)
            {
                bytebuffer.put((byte)bn1.toString().length());
                bytebuffer.put(bn1.toString().getBytes(b.b));
            }
            i++;
        }
        bytebuffer.flip();
        return (new com.android.slyce.a.aj(new ByteBuffer[] {
            bytebuffer
        })).a();
    }

    private static String b(Uri uri)
    {
        String s2 = uri.getEncodedPath();
        if (s2 != null) goto _L2; else goto _L1
_L1:
        String s1 = "/";
_L4:
        s2 = s1;
        if (!TextUtils.isEmpty(uri.getEncodedQuery()))
        {
            s2 = (new StringBuilder()).append(s1).append("?").append(uri.getEncodedQuery()).toString();
        }
        return s2;
_L2:
        s1 = s2;
        if (!s2.startsWith("/"))
        {
            s1 = (new StringBuilder()).append("/").append(s2).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean b(l l1)
    {
        return l1.j.g() == null;
    }

    protected c a(l l1, Uri uri, int i, boolean flag, c c1)
    {
        uri = super.a(l1, uri, i, flag, c1);
        l1 = (String)l1.i.a("spdykey");
        if (l1 == null)
        {
            return uri;
        } else
        {
            return new an(this, l1, uri);
        }
    }

    public a a(l l1)
    {
        Object obj = l1.j.d();
        int i = a(l1.j.d());
        if (i == -1)
        {
            l1 = null;
        } else
        {
            if (!y)
            {
                return super.a(l1);
            }
            if (!b(l1))
            {
                return super.a(l1);
            }
            String s1 = (new StringBuilder()).append(((Uri) (obj)).getHost()).append(i).toString();
            obj = (as)x.get(s1);
            if (obj != null)
            {
                if (((as) (obj)).i() instanceof ar)
                {
                    return super.a(l1);
                }
                if (((as) (obj)).j() != null && !((com.android.slyce.a.c.d.a)((as) (obj)).j()).a.i())
                {
                    x.remove(s1);
                    obj = null;
                }
            }
            if (obj == null)
            {
                l1.i.a("spdykey", s1);
                obj = super.a(l1);
                l1 = ((l) (obj));
                if (!((a) (obj)).isDone())
                {
                    l1 = ((l) (obj));
                    if (!((a) (obj)).isCancelled())
                    {
                        l1 = new as(null);
                        x.put(s1, l1);
                        return ((as) (l1)).c;
                    }
                }
            } else
            {
                l1.j.b((new StringBuilder()).append("waiting for potential spdy connection for host: ").append(l1.j.d().getHost()).toString());
                j j1 = new j();
                ((as) (obj)).c(new ao(this, l1, j1));
                return j1;
            }
        }
        return l1;
    }

    protected p a(l l1, c c1)
    {
        String s1 = (String)l1.i.a("spdykey");
        if (s1 == null)
        {
            return super.a(l1, c1);
        } else
        {
            return new al(this, l1, s1, c1);
        }
    }

    public void a(q q1)
    {
        while (!(q1.e instanceof com.android.slyce.a.c.d.b) || q1.j.g() == null) 
        {
            return;
        }
        q1.f.c_().a();
    }

    public boolean a(n n1)
    {
        if (!(n1.e instanceof com.android.slyce.a.c.d.b))
        {
            return super.a(n1);
        }
        if (n1.j.g() != null)
        {
            n1.f.a(n1.e);
        }
        n1.g.a(null);
        com.android.slyce.a.c.d.b b1 = (com.android.slyce.a.c.d.b)n1.e;
        ((aq)b1.c().b(new aq(this, n1))).d(new com.android.slyce.a.c.d.ap(this, n1, b1));
        return true;
    }

}
