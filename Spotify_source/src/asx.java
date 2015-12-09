// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import java.util.Hashtable;

public final class asx extends ass
{

    private static int f;
    private static int g;
    byte b;
    int c;
    Hashtable d;
    Hashtable e;
    private boolean h;
    private byte i[];
    private int j;
    private asv k;
    private byte l[];
    private int m;
    private int n;
    private Hashtable o;

    private asx()
    {
        super(null);
        b = 1;
        h = false;
        i = new byte[f];
        j = 0;
        k = null;
        l = null;
        m = 0;
        c = 0;
        n = 0;
        d = new Hashtable();
        o = new Hashtable();
        e = new Hashtable();
    }

    public asx(asu asu)
    {
        super(asu);
        b = 1;
        h = false;
        i = new byte[f];
        j = 0;
        k = null;
        l = null;
        m = 0;
        c = 0;
        n = 0;
        d = new Hashtable();
        o = new Hashtable();
        e = new Hashtable();
    }

    static int a()
    {
        return f;
    }

    private void a(asv asv1)
    {
        a(asv1, null, 0, 0);
    }

    static void a(asx asx1, atc atc1, byte byte0)
    {
        byte byte1 = asx1.b;
        asv asv1 = new asv();
        asv1.a = byte1;
        asv1.c = ata.a;
        asv1.d = atc1;
        asv1.f = byte0;
        asv1.e = ((axs) (asz.c)).h;
        asv1.h = 0;
        asx1.a(asv1);
    }

    private void b(byte byte0)
    {
        b = byte0;
        if (byte0 > 1)
        {
            b = 2;
            f = 12;
            g = 1500 - f;
            i = new byte[f];
        } else
        if (byte0 == 1)
        {
            f = 8;
            g = 1500 - f;
            i = new byte[f];
            return;
        }
    }

    public final void a(byte byte0)
    {
        atc atc1 = atc.a;
        byte byte1 = b;
        asz asz1 = asz.a;
        asv asv1 = new asv();
        asv1.a = byte1;
        asv1.c = ata.a;
        asv1.d = atc1;
        asv1.f = byte0;
        asv1.e = ((axs) (asz1)).h;
        a(asv1);
    }

    public final void a(asw asw1)
    {
        byte byte3;
        byte abyte2[];
        atc atc2;
        asw1.d = 0;
        atc atc1 = asw1.b;
        byte3 = asw1.c;
        if (b > 1)
        {
            byte byte0;
            byte abyte0[];
            ast ast1;
            byte abyte3[];
            int i1;
            int k1;
            int i2;
            if (asw1.i != null)
            {
                abyte0 = new byte[asw1.g + 12 + asw1.i.length];
                atc1 = atc.c;
            } else
            {
                abyte0 = new byte[asw1.g + 12];
            }
            new ast();
            byte0 = asw1.d;
            i1 = asw1.e;
            k1 = asw1.f;
            i2 = asw1.g;
            ast1 = new ast();
            ast1.a = byte0;
            ast1.b = i1;
            ast1.c = k1;
            ast1.d = i2;
            i1 = ast1.b;
            k1 = ast1.a;
            abyte3 = new byte[12];
            System.arraycopy(axr.a(i1 & 0xfffffff | k1 << 28), 0, abyte3, 0, 4);
            System.arraycopy(axr.a(ast1.c), 0, abyte3, 4, 4);
            System.arraycopy(axr.a(ast1.d), 0, abyte3, 8, 4);
            System.arraycopy(abyte3, 0, abyte0, 0, 12);
            System.arraycopy(asw1.h, 0, abyte0, 12, asw1.g);
            abyte2 = abyte0;
            atc2 = atc1;
            if (asw1.i != null)
            {
                System.arraycopy(asw1.i, 0, abyte0, asw1.g + 12, asw1.i.length);
                atc2 = atc1;
                abyte2 = abyte0;
            }
        } else
        {
            abyte2 = asw1.h;
            atc2 = atc1;
        }
        asw1 = ((asw) (e.get(Byte.valueOf(byte3))));
        if (asw1 == null)
        {
            a("Error sending protocol message to SYNC.", ((Exception) (new SyncException("Attempt to send protocol message prior to startSession ACK.", SyncExceptionCause.m))));
            return;
        }
        asw1;
        JVM INSTR monitorenter ;
        if (abyte2.length <= g) goto _L2; else goto _L1
_L1:
        asv asv1;
        int j1;
        n = n + 1;
        j1 = n;
        byte byte1 = b;
        asv1 = new asv();
        asv1.a = byte1;
        asv1.c = ata.c;
        asv1.d = atc2;
        asv1.e = 0;
        asv1.f = byte3;
        asv1.g = 8;
        asv1.h = j1;
        j1 = abyte2.length / g;
        if (abyte2.length % g > 0)
        {
            j1++;
        }
        byte abyte1[] = new byte[8];
        System.arraycopy(axr.a(abyte2.length), 0, abyte1, 0, 4);
        System.arraycopy(axr.a(j1), 0, abyte1, 4, 4);
        a(asv1, abyte1, 0, 8);
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
        if (l2 > g)
        {
            k2 = g;
        }
        l2 = n;
        byte byte4 = b;
        asv asv2 = new asv();
        asv2.a = byte4;
        asv2.c = ata.d;
        asv2.d = atc2;
        asv2.e = byte2;
        asv2.f = byte3;
        asv2.g = k2;
        asv2.h = l2;
        a(asv2, abyte2, j2, k2);
        j2 += k2;
        l1++;
        k2 = byte2;
          goto _L3
_L2:
        n = n + 1;
        j1 = abyte2.length;
        l1 = n;
        byte2 = b;
        asv asv3 = new asv();
        asv3.a = byte2;
        asv3.c = ata.b;
        asv3.d = atc2;
        asv3.e = 0;
        asv3.f = byte3;
        asv3.g = j1;
        asv3.h = l1;
        a(asv3, abyte2, 0, abyte2.length);
_L5:
        asw1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        asw1;
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

    public final void a(atc atc1)
    {
        byte byte0 = b;
        asv asv1 = new asv();
        asv1.a = byte0;
        asv1.c = ata.a;
        asv1.d = atc1;
        asv1.e = ((axs) (asz.b)).h;
        asv1.h = 0;
        asv1.f = 0;
        a(asv1);
    }

    public final void a(atc atc1, byte byte0)
    {
        int i1 = c;
        byte byte1 = b;
        asv asv1 = new asv();
        asv1.a = byte1;
        asv1.c = ata.a;
        asv1.d = atc1;
        asv1.f = byte0;
        asv1.e = ((axs) (asz.e)).h;
        asv1.h = i1;
        a(asv1);
    }

    public final void a(byte abyte0[], int i1)
    {
_L5:
        int j1;
        if (b == 1)
        {
            if (j == 0 && (byte)(abyte0[0] >>> 4) > 1)
            {
                b((byte)(abyte0[0] >>> 4));
            } else
            if ((byte)(i[0] >>> 4) > 1)
            {
                byte abyte1[] = i;
                b((byte)(i[0] >>> 4));
                i = abyte1;
            } else
            if (b == 1 && f == 12)
            {
                b((byte)1);
            }
        }
        if (h)
        {
            break MISSING_BLOCK_LABEL_1045;
        }
        j1 = i.length - j;
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        System.arraycopy(abyte0, 0, i, j, i1);
        j = j + i1;
_L4:
        return;
_L2:
        System.arraycopy(abyte0, 0, i, j, j1);
        j = j + j1;
        h = true;
        byte abyte2[] = i;
        asv asv1 = new asv();
        byte byte0 = (byte)(abyte2[0] >>> 4);
        asv1.a = byte0;
        int k1;
        boolean flag;
        if (1 == (abyte2[0] & 8) >>> 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        asv1.b = flag;
        asv1.c = ata.a((byte)(abyte2[0] & 7));
        asv1.d = atc.a(abyte2[1]);
        asv1.e = abyte2[2];
        asv1.f = abyte2[3];
        asv1.g = axr.a(abyte2, 4);
        if (byte0 > 1)
        {
            asv1.h = axr.a(abyte2, 8);
        } else
        {
            asv1.h = 0;
        }
        k = asv1;
        k1 = k.g;
        if (k1 <= 4000)
        {
            l = new byte[k1];
            m = 0;
            break MISSING_BLOCK_LABEL_343;
        } else
        {
            Log.e("HandleReceivedBytes", (new StringBuilder("Corrupt header found, request to allocate a byte array of size: ")).append(k1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_headerBuf: ")).append(i.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_currentHeader: ")).append(k.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytes: ")).append(abyte0.toString()).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesReadPos: ")).append(j1).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("_headerBufWritePos: ")).append(j).toString());
            Log.e("HandleReceivedBytes", (new StringBuilder("headerBytesNeeded: ")).append(j1).toString());
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new SyncException("Error handling protocol message from sync, header invalid.", SyncExceptionCause.n))));
            return;
        }
_L6:
        if (l == null)
        {
            Log.e("HandleReceivedBytes", "Error: Databuffer is null, logging debug info.");
            try
            {
                Log.e("HandleReceivedBytes", (new StringBuilder("_headerBuf: ")).append(i.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("_currentHeader: ")).append(k.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytes: ")).append(abyte0.toString()).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesReadPos: ")).append(j1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("receivedBytesLength: ")).append(i1).toString());
                Log.e("HandleReceivedBytes", (new StringBuilder("_headerBufWritePos: ")).append(j).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e("HandleReceivedBytes", (new StringBuilder("Null Pointer Encountered: ")).append(abyte0).toString());
            }
            a("Error handling protocol message from sync, header invalid.", ((Exception) (new SyncException("Error handling protocol message from sync, data buffer is null.", SyncExceptionCause.o))));
            return;
        }
        int l1 = i1 - j1;
        int i2 = l.length - m;
        if (l1 < i2)
        {
            System.arraycopy(abyte0, j1, l, m, l1);
            m = m + l1;
            return;
        }
        System.arraycopy(abyte0, j1, l, m, i2);
        j1 += i2;
        asv asv2 = k;
        if ((Hashtable)o.get(new Byte(asv2.f)) == null)
        {
            Hashtable hashtable = new Hashtable();
            o.put(new Byte(asv2.f), hashtable);
        }
        asy asy2 = (asy)d.get(new Integer(asv2.h));
        asy asy1 = asy2;
        if (asy2 == null)
        {
            asy1 = new asy(this);
            d.put(new Integer(asv2.h), asy1);
        }
        a(k, l, asy1);
        l = null;
        m = 0;
        h = false;
        i = new byte[f];
        k = null;
        j = 0;
        i1 -= j1;
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        byte abyte3[] = new byte[i1];
        System.arraycopy(abyte0, j1, abyte3, 0, i1);
        abyte0 = abyte3;
          goto _L5
        j1 = 0;
          goto _L6
    }

    static 
    {
        f = 8;
        g = 1500 - f;
    }
}
