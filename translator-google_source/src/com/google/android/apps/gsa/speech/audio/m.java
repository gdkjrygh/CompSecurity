// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.shared.util.e;
import com.google.common.base.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            n, o, c

public final class m
{

    final InputStream a;
    final InputStream b = new n(this);
    boolean c;
    private final int d;
    private final int e;
    private int f;
    private final byte g[];
    private int h;
    private int i;
    private GsaIOException j;
    private final int k[] = new int[16];
    private final boolean l;
    private boolean m;

    public m(InputStream inputstream, int i1, boolean flag)
    {
        f = 0;
        p.a(true);
        a = inputstream;
        g = new byte[i1 * 1000];
        e = i1 * 500;
        h = 0;
        i = 0;
        c = false;
        d = i1;
        Arrays.fill(k, 0x7fffffff);
        l = flag;
        k[0] = 0;
    }

    private int b(int i1)
    {
        int j1 = g.length;
        boolean flag;
        if (i1 >= j1)
        {
            i1 -= j1;
        }
        if (j1 - i1 >= d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        i1 = com.google.android.apps.gsa.shared.util.e.a(a, g, i1, d);
        return i1;
        Object obj;
        obj;
        this;
        JVM INSTR monitorenter ;
        j = new GsaIOException(((Throwable) (obj)), 0x60015);
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw new GsaIOException(((Throwable) (obj)), 0x60015);
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private void b(int i1, byte abyte0[], int j1, int k1)
    {
        byte abyte1[] = g;
        int l1 = abyte1.length;
        if (i1 + k1 <= l1)
        {
            System.arraycopy(abyte1, i1, abyte0, j1, k1);
            return;
        }
        if (i1 >= abyte1.length)
        {
            System.arraycopy(abyte1, i1 - l1, abyte0, j1, k1);
            return;
        } else
        {
            l1 -= i1;
            System.arraycopy(abyte1, i1, abyte0, j1, l1);
            System.arraycopy(abyte1, 0, abyte0, l1 + j1, k1 - l1);
            return;
        }
    }

    final int a(int i1, byte abyte0[], int j1, int k1)
    {
        int l1 = 0;
        int i2 = 0;
_L3:
        this;
        JVM INSTR monitorenter ;
_L1:
        if (j != null)
        {
            throw j;
        }
        break MISSING_BLOCK_LABEL_25;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        int j2 = k[i1];
        if (j2 != 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        this;
        JVM INSTR monitorexit ;
        return 0;
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        j2 += l1;
        k[i1] = j2;
        l1 = 0;
        if (i2 != k1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        this;
        JVM INSTR monitorexit ;
        return k1;
        int k2 = i;
        if (k2 != j2)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (!c)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        this;
        JVM INSTR monitorexit ;
        return i2;
        wait();
          goto _L1
        abyte0;
        Thread.currentThread().interrupt();
        throw new GsaIOException((new StringBuilder(44)).append("Interrupted waiting for buffers: ").append(i1).toString(), 0x60014);
        this;
        JVM INSTR monitorexit ;
        l1 = k2 - j2;
        k2 = k1 - i2;
        if (l1 >= k2)
        {
            l1 = k2;
        }
        b(j2, abyte0, j1 + i2, l1);
        i2 += l1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    final int a(byte abyte0[], int i1, int j1)
    {
        int l1;
        int j2;
        int k3;
        k3 = g.length;
        j2 = 0;
        l1 = 0;
        int k1 = -1;
_L14:
        this;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            throw j;
        }
        break MISSING_BLOCK_LABEL_35;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        int i2 = k[0];
        if (i2 != 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        return j2 - l1;
        this;
        JVM INSTR monitorexit ;
        return j2;
        if (l1 == 0) goto _L2; else goto _L1
_L1:
        l1 += i2;
        k[0] = l1;
_L16:
        i2 = i;
        if (k1 == -1) goto _L4; else goto _L3
_L3:
        i2 += k1;
        i = i2;
        notifyAll();
        if (k1 >= d) goto _L6; else goto _L5
_L5:
        c = true;
        this;
        JVM INSTR monitorexit ;
        return j2;
_L4:
        if (j2 != j1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        this;
        JVM INSTR monitorexit ;
        return j1;
        if (i2 != l1) goto _L8; else goto _L7
_L7:
        if (!c)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        this;
        JVM INSTR monitorexit ;
        return j2;
        if ((d + i2) - h <= k3) goto _L8; else goto _L9
_L9:
        int ai[];
        int l3;
        int i4;
        int j4;
        boolean flag;
        if (k[0] >= e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        l3 = k[0];
        i4 = e;
        l1 = 0x7fffffff;
        ai = k;
        j4 = ai.length;
        break MISSING_BLOCK_LABEL_233;
_L17:
        if (l1 <= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        i2 = Math.min(l1, l3 - i4);
        k2 = g.length;
        if ((i + d) - i2 > k2) goto _L11; else goto _L10
_L10:
        m = true;
        l1 = i2;
        if (i2 < k2) goto _L13; else goto _L12
_L12:
        l1 = 0;
_L18:
        if (l1 == k.length)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (k[l1] == 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_562;
        }
        ai = k;
        ai[l1] = ai[l1] - k2;
        break MISSING_BLOCK_LABEL_562;
        l1 = i2 - k2;
        i = i - k2;
_L13:
        h = l1;
        l1 = k[0];
        i2 = l1;
_L15:
        this;
        JVM INSTR monitorexit ;
        if (l1 == i2)
        {
            k1 = b(l1);
            l1 += k1;
        }
        l1 -= i2;
        int l2 = j1 - j2;
        if (l1 >= l2)
        {
            l1 = l2;
        }
        b(i2, abyte0, i1 + j2, l1);
        j2 += l1;
          goto _L14
_L11:
        j = new GsaIOException("Buffer overflow, no available space.", 0x60016);
        throw j;
_L8:
        int i3 = l1;
        l1 = i2;
        i2 = i3;
          goto _L15
_L2:
        l1 = i2;
          goto _L16
_L6:
        k1 = -1;
          goto _L4
        int k2;
        i2 = 0;
        while (i2 < j4) 
        {
            int j3 = ai[i2];
            if (j3 < l1)
            {
                l1 = j3;
            }
            i2++;
        }
          goto _L17
        l1++;
          goto _L18
    }

    public final c a()
    {
        boolean flag = false;
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        int i1 = ((flag1) ? 1 : 0);
        if (!m) goto _L2; else goto _L1
_L1:
        if (!l || f == 0) goto _L4; else goto _L3
_L3:
        i1 = f;
        if (i1 <= i && i1 >= h) goto _L6; else goto _L5
_L5:
        L.a(5, "Tee", "Incorrect start position: startPosition: %d, mBufferBegin: %d, mBufferEnd: %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(h), Integer.valueOf(i)
        });
_L7:
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        throw new GsaIOException("No splits possible, buffers rewound.", 0x60019);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        flag = true;
        if (true) goto _L7; else goto _L2
_L4:
        throw new GsaIOException("No splits possible, buffers rewound.", 0x60018);
_L2:
        for (; i1 != k.length && k[i1] != 0x7fffffff; i1++) { }
        Object obj;
        if (i1 == k.length)
        {
            throw new GsaIOException("No splits possible, too many siblings.", 0x6001a);
        }
        obj = new o(this, i1);
        k[i1] = f;
        obj = new c(((InputStream) (obj)), i1);
        this;
        JVM INSTR monitorexit ;
        return ((c) (obj));
    }

    final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        k[i1] = 0x7fffffff;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
