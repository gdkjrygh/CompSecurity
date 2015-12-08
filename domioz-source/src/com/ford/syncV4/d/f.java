// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import android.util.Log;
import com.ford.syncV4.d.a.a;
import com.ford.syncV4.d.a.b;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.d:
//            a, d, e, b, 
//            g, c

public final class f extends com.ford.syncV4.d.a
{

    private static int m;
    private static int n;
    byte a;
    boolean b;
    byte c[];
    int d;
    d e;
    byte f[];
    int g;
    int h;
    int i;
    Hashtable j;
    Hashtable k;
    Hashtable l;
    private int o;
    private int p;

    private f()
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

    public f(c c1)
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

    private void a(d d1)
    {
        a(d1, null, 0, 0);
    }

    static void a(f f1, com.ford.syncV4.d.a.f f2, byte byte0)
    {
        byte byte1 = f1.a;
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(f2);
        d1.c(byte0);
        d1.b(a.c.c());
        d1.b(0);
        f1.a(d1);
    }

    private void c(byte byte0)
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

    public final void a(byte byte0)
    {
        com.ford.syncV4.d.a.f f1 = com.ford.syncV4.d.a.f.b;
        byte byte1 = a;
        a a1 = a.a;
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(f1);
        d1.c(byte0);
        d1.b(a1.c());
        a(d1);
    }

    public final void a(com.ford.syncV4.d.a.f f1)
    {
        byte byte0 = a;
        d d1 = new d();
        d1.a(byte0);
        d1.a(b.b);
        d1.a(f1);
        d1.b(a.b.c());
        d1.b(0);
        d1.c((byte)0);
        a(d1);
    }

    public final void a(com.ford.syncV4.d.a.f f1, byte byte0)
    {
        int i1 = h;
        byte byte1 = a;
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(f1);
        d1.c(byte0);
        d1.b(a.e.c());
        d1.b(i1);
        a(d1);
    }

    public final void a(e e1)
    {
        byte byte3;
        byte abyte2[];
        com.ford.syncV4.d.a.f f2;
        e1.c((byte)0);
        com.ford.syncV4.d.a.f f1 = e1.e();
        byte3 = e1.b();
        if (a > 1)
        {
            byte byte0;
            byte abyte0[];
            com.ford.syncV4.d.b b1;
            int i1;
            int k1;
            int i2;
            if (e1.d() != null)
            {
                abyte0 = new byte[e1.i() + 12 + e1.d().length];
                f1 = com.ford.syncV4.d.a.f.d;
            } else
            {
                abyte0 = new byte[e1.i() + 12];
            }
            new com.ford.syncV4.d.b();
            byte0 = e1.f();
            i1 = e1.g();
            k1 = e1.h();
            i2 = e1.i();
            b1 = new com.ford.syncV4.d.b();
            b1.a(byte0);
            b1.a(i1);
            b1.b(k1);
            b1.c(i2);
            System.arraycopy(b1.a(), 0, abyte0, 0, 12);
            System.arraycopy(e1.c(), 0, abyte0, 12, e1.i());
            abyte2 = abyte0;
            f2 = f1;
            if (e1.d() != null)
            {
                System.arraycopy(e1.d(), 0, abyte0, e1.i() + 12, e1.d().length);
                f2 = f1;
                abyte2 = abyte0;
            }
        } else
        {
            abyte2 = e1.c();
            f2 = f1;
        }
        e1 = ((e) (l.get(Byte.valueOf(byte3))));
        if (e1 == null)
        {
            a("Error sending protocol message to SYNC.", ((Exception) (new com.ford.syncV4.a.a("Attempt to send protocol message prior to startSession ACK.", com.ford.syncV4.a.b.o))));
            return;
        }
        e1;
        JVM INSTR monitorenter ;
        if (abyte2.length <= n) goto _L2; else goto _L1
_L1:
        d d1;
        int j1;
        i = i + 1;
        j1 = i;
        byte byte1 = a;
        d1 = new d();
        d1.a(byte1);
        d1.a(b.d);
        d1.a(f2);
        d1.b((byte)0);
        d1.c(byte3);
        d1.a(8);
        d1.b(j1);
        j1 = abyte2.length / n;
        if (abyte2.length % n > 0)
        {
            j1++;
        }
        byte abyte1[] = new byte[8];
        System.arraycopy(com.ford.syncV4.util.a.a(abyte2.length), 0, abyte1, 0, 4);
        System.arraycopy(com.ford.syncV4.util.a.a(j1), 0, abyte1, 4, 4);
        a(d1, abyte1, 0, 8);
        int l1;
        int j2;
        int k2;
        l1 = 0;
        k2 = 0;
        j2 = 0;
          goto _L3
_L7:
        int l2 = abyte2.length - j2;
        k2 = l2;
        byte byte2;
        if (l2 > n)
        {
            k2 = n;
        }
        l2 = i;
        byte byte4 = a;
        d d2 = new d();
        d2.a(byte4);
        d2.a(b.e);
        d2.a(f2);
        d2.b(byte2);
        d2.c(byte3);
        d2.a(k2);
        d2.b(l2);
        a(d2, abyte2, j2, k2);
        j2 += k2;
        l1++;
        k2 = byte2;
          goto _L3
_L2:
        i = i + 1;
        j1 = abyte2.length;
        l1 = i;
        byte2 = a;
        d d3 = new d();
        d3.a(byte2);
        d3.a(b.c);
        d3.a(f2);
        d3.b((byte)0);
        d3.c(byte3);
        d3.a(j1);
        d3.b(l1);
        a(d3, abyte2, 0, abyte2.length);
_L5:
        e1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        if (l1 >= j1) goto _L5; else goto _L4
_L4:
        if (l1 < j1 - 1)
        {
            byte2 = (byte)(k2 + 1);
            if (byte2 == 0)
            {
                byte2++;
            }
        } else
        {
            byte2 = 0;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(byte abyte0[], int i1)
    {
_L5:
        int k1;
        if (a == 1)
        {
            if (d == 0 && (byte)(abyte0[0] >>> 4) > 1)
            {
                c((byte)(abyte0[0] >>> 4));
            } else
            if ((byte)(c[0] >>> 4) > 1)
            {
                byte abyte1[] = c;
                c((byte)(c[0] >>> 4));
                c = abyte1;
            } else
            if (a == 1 && m == 12)
            {
                c((byte)1);
            }
        }
        if (b)
        {
            break MISSING_BLOCK_LABEL_909;
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
        j1 = k1 + 0;
        b = true;
        e = com.ford.syncV4.d.d.a(c);
        int l1 = e.f();
        if (l1 <= 4000)
        {
            f = new byte[l1];
            g = 0;
            break MISSING_BLOCK_LABEL_226;
        } else
        {
            Log.e("HandleReceivedBytes", (new StringBuilder("Corrupt header found, request to allocate a byte array of size: ")).append(l1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_headerBuf: ")).append(c.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_currentHeader: ")).append(e.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytes: ")).append(abyte0.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesReadPos: ")).append(j1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_headerBufWritePos: ")).append(d).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("headerBytesNeeded: ")).append(k1).toString());
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new com.ford.syncV4.a.a("Error handling protocol message from sync, header invalid.", com.ford.syncV4.a.b.p))));
            return;
        }
_L6:
        if (f == null)
        {
            Log.e("HandleReceivedBytes", "Error: Databuffer is null, logging debug info.");
            try
            {
                Log.e("HandleReceivedBytes", (new StringBuilder("_headerBuf: ")).append(c.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("_currentHeader: ")).append(e.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytes: ")).append(abyte0.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesReadPos: ")).append(j1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesLength: ")).append(i1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("_headerBufWritePos: ")).append(d).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e("HandleReceivedBytes", (new StringBuilder("Null Pointer Encountered: ")).append(abyte0).toString());
            }
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new com.ford.syncV4.a.a("Error handling protocol message from sync, data buffer is null.", com.ford.syncV4.a.b.q))));
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
        d d1 = e;
        if ((Hashtable)k.get(new Byte(d1.e())) == null)
        {
            Hashtable hashtable = new Hashtable();
            k.put(new Byte(d1.e()), hashtable);
        }
        g g2 = (g)j.get(new Integer(d1.g()));
        g g1 = g2;
        if (g2 == null)
        {
            g1 = new g(this);
            j.put(new Integer(d1.g()), g1);
        }
        a(e, f, g1);
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
        abyte0 = abyte2;
          goto _L5
        j1 = 0;
          goto _L6
    }

    static 
    {
        m = 8;
        n = 1500 - m;
    }
}
