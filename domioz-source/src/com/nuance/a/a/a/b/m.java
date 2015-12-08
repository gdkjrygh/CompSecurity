// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import android.content.Context;
import com.nuance.a.a.a.a.d.a.a;
import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.h;
import com.nuance.a.a.a.a.d.a.i;
import com.nuance.a.a.a.a.d.a.j;
import com.nuance.a.a.a.a.d.a.k;
import com.nuance.a.a.a.a.d.a.l;
import com.nuance.a.a.a.a.d.a.n;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.b:
//            p, n, o

public class m
    implements c, h
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/b/m);
    private static final Integer c = new Integer(0);
    private static final Integer d = new Integer(1);
    private static final Integer e = new Integer(2);
    private static final Integer f = new Integer(3);
    private a b;
    private Object g;

    public m(a a1)
    {
        b = null;
        g = new Object();
        b = a1;
    }

    static e a()
    {
        return a;
    }

    static Object a(m m1)
    {
        return m1.g;
    }

    static void a(m m1, Object aobj[])
    {
        m1.a(aobj);
    }

    private void a(Object aobj[])
    {
        b.a(((Object) (aobj)), this, b.b(), b.a()[0]);
    }

    static Integer b()
    {
        return c;
    }

    static Integer c()
    {
        return e;
    }

    public final com.nuance.a.a.a.a.d.a.m a(Object obj, l l1, byte abyte0[], int i1, k k1, Object obj1)
    {
        if (l1 != l.b)
        {
            if (a.e())
            {
                a.b("Blackberry NetworkSystem only supports NETWORK_READ_FULL");
            }
            return com.nuance.a.a.a.a.d.a.m.b;
        }
        obj = (p)obj;
        if (((p) (obj)).f != null)
        {
            if (!com.nuance.a.a.a.b.n.a(((p) (obj)).f))
            {
                l1 = new o(abyte0, i1, k1, obj1);
                return ((p) (obj)).f.a(l1);
            }
            if (a.e())
            {
                a.b("socket read thread is stopping");
            }
            return com.nuance.a.a.a.a.d.a.m.b;
        } else
        {
            a.b();
            return com.nuance.a.a.a.a.d.a.m.b;
        }
    }

    public final com.nuance.a.a.a.a.d.a.m a(Object obj, byte abyte0[], int i1, i j1, Object obj1)
    {
        if (a.b())
        {
            (new StringBuilder("socketWrite(bufferLen:")).append(i1).append(") start");
        }
        Object obj2 = (p)obj;
        if (((p) (obj2)).a == null || ((p) (obj2)).d == null)
        {
            return com.nuance.a.a.a.a.d.a.m.b;
        }
        obj2 = ((p) (obj2)).d;
        try
        {
            ((OutputStream) (obj2)).write(abyte0, 0, i1);
            ((OutputStream) (obj2)).flush();
        }
        catch (Exception exception)
        {
            if (a.e())
            {
                a.b((new StringBuilder("Socket Write Exception - [")).append(exception.getClass().getName()).append("] Message - [").append(exception.getMessage()).append("]").toString());
            }
            a(new Object[] {
                f, j1, com.nuance.a.a.a.a.d.a.m.b, obj, abyte0, new Integer(0), new Integer(i1), new Integer(0), obj1
            });
            a(obj);
            return com.nuance.a.a.a.a.d.a.m.b;
        }
        a(new Object[] {
            f, j1, com.nuance.a.a.a.a.d.a.m.a, obj, abyte0, new Integer(0), new Integer(i1), new Integer(i1), obj1
        });
        if (a.b())
        {
            (new StringBuilder("socketWrite(bufferLen:")).append(i1).append(") end");
        }
        return com.nuance.a.a.a.a.d.a.m.a;
    }

    public final void a(Object obj)
    {
        p p1 = (p)obj;
        if (p1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            synchronized (g)
            {
                if (p1.f != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (com.nuance.a.a.a.b.n.a(p1.f))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        p1.f.a();
        p1.f = null;
        boolean flag = true;
_L3:
        obj1;
        JVM INSTR monitorexit ;
        if (p1.a != null && flag)
        {
            try
            {
                p1.c.close();
                p1.c = null;
                p1.a.close();
                p1.a = null;
            }
            catch (Throwable throwable)
            {
                if (a.e())
                {
                    a.b((new StringBuilder("Socket Close Expception - [")).append(throwable.getClass().getName()).append("] Message - [").append(throwable.getMessage()).append("]").toString());
                }
                a(new Object[] {
                    d, p1.b, com.nuance.a.a.a.a.d.a.m.b, obj, p1.e
                });
                return;
            }
            a(new Object[] {
                d, p1.b, com.nuance.a.a.a.a.d.a.m.a, obj, p1.e
            });
            return;
        }
          goto _L1
        flag = false;
          goto _L3
    }

    public final void a(Object obj, Object obj1)
    {
        obj = ((Object) ((Object[])obj));
        if (obj[0] == c)
        {
            ((j)obj[1]).a((com.nuance.a.a.a.a.d.a.m)obj[2], obj[3]);
        } else
        {
            if (obj[0] == d)
            {
                ((n)obj[1]).a();
                return;
            }
            if (obj[0] == e)
            {
                ((k)obj[1]).a((com.nuance.a.a.a.a.d.a.m)obj[2], (byte[])obj[4], ((Integer)obj[6]).intValue(), ((Integer)obj[7]).intValue(), obj[8]);
                return;
            }
            if (obj[0] == f)
            {
                ((i)obj[1]).a((com.nuance.a.a.a.a.d.a.m)obj[2], obj[3], ((Integer)obj[6]).intValue(), ((Integer)obj[7]).intValue(), obj[8]);
                return;
            }
        }
    }

    public final void a(String s, int i1, Vector vector, j j1, n n1)
    {
        com.nuance.a.a.a.b.b.c c1 = new com.nuance.a.a.a.b.b.c();
        new com.nuance.a.a.a.b.b.a.a();
        vector = vector.elements();
        do
        {
            if (!vector.hasMoreElements())
            {
                break;
            }
            com.nuance.a.a.a.c.c.c c2 = (com.nuance.a.a.a.c.c.c)vector.nextElement();
            if (c2.a().equals("Use_Device_ProxySetting_If_Available") && ((new String(c2.b())).equals("TRUE") || (new String(c2.b())).equals("true")))
            {
                c1.a = com.nuance.a.a.a.b.b.d.c;
            }
            if (c2.a().equals("Use_Device_ProxySetting_Only") && ((new String(c2.b())).equals("TRUE") || (new String(c2.b())).equals("true")))
            {
                c1.a = com.nuance.a.a.a.b.b.d.b;
            }
            if (c2.a().equals("Android_Context"))
            {
                c1.b = (Context)c2.c();
            }
        } while (true);
        s = new com.nuance.a.a.a.b.n(this, s, i1, c1, j1, n1);
        try
        {
            s.start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (a.e())
        {
            a.b((new StringBuilder("Open Socket Exception - [")).append(s.getClass().getName()).append("] Message - [").append(s.getMessage()).append("]").toString());
        }
        a(new Object[] {
            c, j1, com.nuance.a.a.a.a.d.a.m.b, null, null
        });
    }

    public final void b(Object obj)
    {
        p p1 = (p)obj;
        if (p1.f != null)
        {
            p1.f.b();
            return;
        } else
        {
            a.b();
            a(obj);
            return;
        }
    }

    public final void b(String s, int i1, Vector vector, j j1, n n1)
    {
        com.nuance.a.a.a.b.b.c c1 = new com.nuance.a.a.a.b.b.c();
        c1.c = true;
        c1.d = new com.nuance.a.a.a.b.b.a.a();
        vector = vector.elements();
        do
        {
            if (!vector.hasMoreElements())
            {
                break;
            }
            com.nuance.a.a.a.c.c.c c2 = (com.nuance.a.a.a.c.c.c)vector.nextElement();
            if (c2.a().equals("SSL_SelfSigned_Cert") && ((new String(c2.b())).equals("TRUE") || (new String(c2.b())).equals("true")))
            {
                c1.d.a = true;
            }
            if (c2.a().equals("SSL_Cert_Summary"))
            {
                c1.d.b = new String(c2.b());
            }
            if (c2.a().equals("SSL_Cert_Data"))
            {
                c1.d.c = new String(c2.b());
            }
            if (c2.a().equals("Use_Device_ProxySetting_If_Available") && ((new String(c2.b())).equals("TRUE") || (new String(c2.b())).equals("true")))
            {
                c1.a = com.nuance.a.a.a.b.b.d.c;
            }
            if (c2.a().equals("Use_Device_ProxySetting_Only") && ((new String(c2.b())).equals("TRUE") || (new String(c2.b())).equals("true")))
            {
                c1.a = com.nuance.a.a.a.b.b.d.b;
            }
            if (c2.a().equals("Android_Context"))
            {
                c1.b = (Context)c2.c();
            }
        } while (true);
        s = new com.nuance.a.a.a.b.n(this, s, i1, c1, j1, n1);
        try
        {
            s.start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (a.e())
        {
            a.b((new StringBuilder("Open Socket Exception - [")).append(s.getClass().getName()).append("] Message - [").append(s.getMessage()).append("]").toString());
        }
        a(new Object[] {
            c, j1, com.nuance.a.a.a.a.d.a.m.b, null, null
        });
    }

}
