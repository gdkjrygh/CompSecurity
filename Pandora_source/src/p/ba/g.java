// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import p.ax.a;
import p.ax.b;
import p.bb.d;
import p.bb.e;

// Referenced classes of package p.ba:
//            a, e, d, f, 
//            b, c

public class g extends p.ba.a
{
    protected class a
    {

        protected boolean a;
        protected boolean b;
        protected ByteArrayOutputStream c;
        protected int d;
        protected int e;
        final g f;

        private void e(p.ba.d d1, byte abyte0[])
        {
            f.b(d1.i(), d1.e());
        }

        private void f(p.ba.d d1, byte abyte0[])
        {
            if (d1.d() == p.bb.a.h.a())
            {
                e(d1, abyte0);
            } else
            {
                if (d1.d() == p.bb.a.b.a())
                {
                    p.ba.g.a(f, d1.i(), d1.e());
                    return;
                }
                if (d1.d() == p.bb.a.c.a())
                {
                    if (f.l.get(Byte.valueOf(d1.e())) == null)
                    {
                        abyte0 = ((byte []) (new Object()));
                        f.l.put(Byte.valueOf(d1.e()), abyte0);
                    }
                    if (f.a > 1)
                    {
                        f.h = d1.g();
                    }
                    f.a(d1.i(), d1.e(), f.a, "");
                    return;
                }
                if (d1.d() == p.bb.a.d.a())
                {
                    f.a((new StringBuilder()).append("Got StartSessionNACK for protocol sessionID=").append(d1.e()).toString(), null);
                    return;
                }
                if (d1.d() != p.bb.a.e.a())
                {
                    continue;
                }
                if (f.a > 1)
                {
                    if (f.h == d1.g())
                    {
                        f.a(d1.i(), d1.e(), "");
                        return;
                    }
                } else
                {
                    f.a(d1.i(), d1.e(), "");
                    return;
                }
            }
            do
            {
                return;
            } while (d1.d() != p.bb.a.f.a());
            f.a(d1.i(), d1.e(), "");
        }

        private void g(p.ba.d d1, byte abyte0[])
        {
            f f1 = new f();
            if (d1.i() == e.c)
            {
                f1.a(d.c);
            } else
            if (d1.i() == e.d)
            {
                f1.a(d.b);
            }
            f1.a(d1.i());
            f1.b(d1.e());
            if (f.a > 1)
            {
                abyte0 = p.ba.b.a(abyte0);
                f1.a(f.a);
                f1.c(abyte0.b());
                f1.a(abyte0.c());
                f1.b(abyte0.d());
                if (abyte0.e() > 0)
                {
                    f1.a(abyte0.f());
                }
                if (abyte0.g() != null)
                {
                    f1.b(abyte0.g());
                }
            } else
            {
                f1.a(abyte0);
            }
            f.j.remove(Integer.valueOf(d1.g()));
            try
            {
                f.b(f1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (p.ba.d d1)
            {
                p.bn.d.a((new StringBuilder()).append("Failure propagating onProtocolMessageReceived: ").append(d1.toString()).toString(), d1);
            }
            f.a("Failure propagating onProtocolMessageReceived: ", d1);
        }

        protected void a(p.ba.d d1)
        {
            if (d1.h() == p.bb.b.e && d1.d() == 0)
            {
                f f1 = new f();
                f1.a(d1.i());
                f1.b(d1.e());
                if (f.a > 1)
                {
                    p.ba.b b1 = p.ba.b.a(c.toByteArray());
                    f1.a(f.a);
                    f1.c(b1.b());
                    f1.a(b1.c());
                    f1.b(b1.d());
                    if (b1.e() > 0)
                    {
                        f1.a(b1.f());
                    }
                    if (b1.g() != null)
                    {
                        f1.b(b1.g());
                    }
                } else
                {
                    f1.a(c.toByteArray());
                }
                f.j.remove(Integer.valueOf(d1.g()));
                try
                {
                    f.b(f1);
                }
                // Misplaced declaration of an exception variable
                catch (p.ba.d d1)
                {
                    p.bn.d.a((new StringBuilder()).append("Failure propagating onProtocolMessageReceived: ").append(d1.toString()).toString(), d1);
                }
                a = false;
                b = false;
                c = null;
            }
        }

        protected void a(p.ba.d d1, byte abyte0[])
        {
            a = true;
            d = p.bn.b.a(abyte0, 0) - p.ba.g.a();
            e = p.bn.b.a(abyte0, 4);
            c = new ByteArrayOutputStream(d);
        }

        protected void b(p.ba.d d1, byte abyte0[])
        {
            c.write(abyte0, 0, d1.f());
            a(d1);
        }

        protected void c(p.ba.d d1, byte abyte0[])
        {
            if (d1.h() == p.bb.b.d)
            {
                a(d1, abyte0);
                return;
            } else
            {
                b(d1, abyte0);
                return;
            }
        }

        protected void d(p.ba.d d1, byte abyte0[])
        {
            if (d1.h().a(p.bb.b.b))
            {
                f(d1, abyte0);
                return;
            }
            if (d1.h() == p.bb.b.d || d1.h() == p.bb.b.e)
            {
                c(d1, abyte0);
                return;
            } else
            {
                g(d1, abyte0);
                return;
            }
        }

        protected a()
        {
            f = g.this;
            super();
            a = false;
            b = false;
            c = null;
            d = 0;
            e = 0;
        }
    }


    private static int m;
    private static int n;
    byte a;
    boolean b;
    byte c[];
    int d;
    p.ba.d e;
    byte f[];
    int g;
    int h;
    int i;
    Hashtable j;
    Hashtable k;
    Hashtable l;
    private int o;
    private int p;

    private g()
    {
        super(null);
        a = 1;
        b = false;
        c = new byte[m];
        d = 0;
        e = null;
        f = null;
        g = 0;
        h = 0;
        i = 0;
        o = 0;
        p = 0;
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
    }

    public g(c c1)
    {
        super(c1);
        a = 1;
        b = false;
        c = new byte[m];
        d = 0;
        e = null;
        f = null;
        g = 0;
        h = 0;
        i = 0;
        o = 0;
        p = 0;
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
    }

    static int a()
    {
        return m;
    }

    static void a(g g1, e e1, byte byte0)
    {
        g1.c(e1, byte0);
    }

    private void b(p.ba.d d1)
    {
        a(d1, null, 0, 0);
    }

    private void c(e e1, byte byte0)
    {
        b(p.ba.e.a(e1, byte0, 0, a));
    }

    protected a a(p.ba.d d1)
    {
        if ((Hashtable)k.get(Byte.valueOf(d1.e())) == null)
        {
            Hashtable hashtable = new Hashtable();
            k.put(Byte.valueOf(d1.e()), hashtable);
        }
        a a2 = (a)j.get(Integer.valueOf(d1.g()));
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
            j.put(Integer.valueOf(d1.g()), a1);
        }
        return a1;
    }

    public void a(byte byte0)
    {
        b(p.ba.e.a(e.b, byte0, a));
    }

    public void a(f f1)
    {
        byte byte2;
        byte abyte0[];
        byte abyte1[];
        f1.c((byte)0);
        abyte0 = f1.e();
        byte2 = f1.b();
        if (a > 1)
        {
            if (f1.d() != null)
            {
                abyte1 = new byte[f1.i() + 12 + f1.d().length];
                abyte0 = e.d;
            } else
            {
                abyte1 = new byte[f1.i() + 12];
            }
            new p.ba.b();
            System.arraycopy(p.ba.e.a(f1.f(), f1.g(), f1.h(), f1.i()).a(), 0, abyte1, 0, 12);
            System.arraycopy(f1.c(), 0, abyte1, 12, f1.i());
            if (f1.d() != null)
            {
                System.arraycopy(f1.d(), 0, abyte1, f1.i() + 12, f1.d().length);
            }
            f1 = abyte0;
            abyte0 = abyte1;
        } else
        {
            abyte1 = f1.c();
            f1 = abyte0;
            abyte0 = abyte1;
        }
        abyte1 = ((byte []) (l.get(Byte.valueOf(byte2))));
        if (abyte1 == null)
        {
            a("Error sending protocol message to SYNC.", ((Exception) (new p.ax.a("Attempt to send protocol message prior to startSession ACK.", b.o))));
            return;
        }
        abyte1;
        JVM INSTR monitorenter ;
        if (abyte0.length <= n) goto _L2; else goto _L1
_L1:
        p.ba.d d1;
        int i1;
        i = i + 1;
        d1 = p.ba.e.c(f1, byte2, i, a);
        i1 = abyte0.length / n;
        if (abyte0.length % n > 0)
        {
            i1++;
        }
        byte abyte2[] = new byte[8];
        System.arraycopy(p.bn.b.a(abyte0.length), 0, abyte2, 0, 4);
        System.arraycopy(p.bn.b.a(i1), 0, abyte2, 4, 4);
        a(d1, abyte2, 0, abyte2.length);
        int j1;
        int k1;
        int l1;
        j1 = 0;
        l1 = 0;
        k1 = 0;
          goto _L3
_L7:
        int i2 = abyte0.length - k1;
        l1 = i2;
        byte byte0;
        if (i2 > n)
        {
            l1 = n;
        }
        a(p.ba.e.a(f1, byte2, l1, byte0, i, a), abyte0, k1, l1);
        j1++;
        k1 += l1;
        l1 = byte0;
          goto _L3
_L2:
        i = i + 1;
        a(p.ba.e.a(f1, byte2, abyte0.length, i, a), abyte0, 0, abyte0.length);
_L5:
        abyte1;
        JVM INSTR monitorexit ;
        return;
        f1;
        abyte1;
        JVM INSTR monitorexit ;
        throw f1;
_L3:
        if (j1 >= i1) goto _L5; else goto _L4
_L4:
        if (j1 < i1 - 1)
        {
            byte byte1 = (byte)(l1 + 1);
            byte0 = byte1;
            if (byte1 == 0)
            {
                byte0 = (byte)(byte1 + 1);
            }
        } else
        {
            byte0 = 0;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(e e1)
    {
        b(p.ba.e.a(e1, 0, a, (byte)0));
    }

    public void a(e e1, byte byte0)
    {
        b(p.ba.e.b(e1, byte0, h, a));
    }

    public void a(byte abyte0[], int i1)
    {
        int k1;
        if (a == 1)
        {
            if (d == 0 && (byte)(abyte0[0] >>> 4) > 1)
            {
                b((byte)(abyte0[0] >>> 4));
            } else
            if ((byte)(c[0] >>> 4) > 1)
            {
                byte abyte1[] = new byte[d];
                abyte1 = c;
                b((byte)(c[0] >>> 4));
                c = abyte1;
            } else
            if (a == 1 && m == 12)
            {
                b((byte)1);
            }
        }
        if (b)
        {
            break MISSING_BLOCK_LABEL_845;
        }
        k1 = c.length - d;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        System.arraycopy(abyte0, 0, c, d, i1);
        d = d + i1;
_L4:
        return;
_L2:
        int j1;
        System.arraycopy(abyte0, 0, c, d, k1);
        d = d + k1;
        j1 = 0 + k1;
        b = true;
        e = p.ba.d.a(c);
        int l1 = e.f();
        if (l1 <= 4000)
        {
            f = new byte[l1];
            g = 0;
            break MISSING_BLOCK_LABEL_233;
        } else
        {
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("Corrupt header found, request to allocate a byte array of size: ").append(l1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("_headerBuf: ").append(c.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("_currentHeader: ").append(e.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("receivedBytes: ").append(abyte0.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("receivedBytesReadPos: ").append(j1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("_headerBufWritePos: ").append(d).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder()).append("headerBytesNeeded: ").append(k1).toString());
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new p.ax.a("Error handling protocol message from sync, header invalid.", b.p))));
            return;
        }
_L5:
        if (f == null)
        {
            Log.e("HandleReceivedBytes", "Error: Databuffer is null, logging debug info.");
            try
            {
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("_headerBuf: ").append(c.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("_currentHeader: ").append(e.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("receivedBytes: ").append(abyte0.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("receivedBytesReadPos: ").append(j1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("receivedBytesLength: ").append(i1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("_headerBufWritePos: ").append(d).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e("HandleReceivedBytes", (new StringBuilder()).append("Null Pointer Encountered: ").append(abyte0).toString());
            }
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new p.ax.a("Error handling protocol message from sync, data buffer is null.", b.q))));
            return;
        }
        k1 = i1 - j1;
        int i2 = f.length - g;
        if (k1 < i2)
        {
            System.arraycopy(abyte0, j1, f, g, k1);
            g = g + k1;
            return;
        }
        System.arraycopy(abyte0, j1, f, g, i2);
        j1 += i2;
        a a1 = a(e);
        a(e, f, a1);
        f = null;
        g = 0;
        b = false;
        c = new byte[m];
        e = null;
        d = 0;
        i1 -= j1;
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        byte abyte2[] = new byte[i1];
        System.arraycopy(abyte0, j1, abyte2, 0, i1);
        a(abyte2, i1);
        return;
        j1 = 0;
          goto _L5
    }

    public void b(byte byte0)
    {
        a = byte0;
        if (byte0 > 1)
        {
            a = 2;
            m = 12;
            n = 1500 - m;
            c = new byte[m];
        } else
        if (byte0 == 1)
        {
            m = 8;
            n = 1500 - m;
            c = new byte[m];
            return;
        }
    }

    static 
    {
        m = 8;
        n = 1500 - m;
    }
}
