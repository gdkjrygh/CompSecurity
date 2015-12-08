// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            u

public final class t extends FilterInputStream
{

    private volatile byte a[];
    private int b;
    private int c;
    private int d;
    private int e;

    public t(InputStream inputstream, byte abyte0[])
    {
        super(inputstream);
        d = -1;
        if (abyte0 == null || abyte0.length == 0)
        {
            throw new IllegalArgumentException("buffer is null or empty");
        } else
        {
            a = abyte0;
            return;
        }
    }

    private int a(InputStream inputstream, byte abyte0[])
    {
        if (d == -1 || e - d >= c)
        {
            int i = inputstream.read(abyte0);
            if (i > 0)
            {
                d = -1;
                e = 0;
                b = i;
            }
            return i;
        }
        byte abyte1[];
        int k;
        int i1;
        if (d == 0 && c > abyte0.length && b == abyte0.length)
        {
            int l = abyte0.length * 2;
            int j = l;
            if (l > c)
            {
                j = c;
            }
            Log.isLoggable("BufferedIs", 3);
            abyte1 = new byte[j];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            a = abyte1;
        } else
        {
            abyte1 = abyte0;
            if (d > 0)
            {
                System.arraycopy(abyte0, d, abyte0, 0, abyte0.length - d);
                abyte1 = abyte0;
            }
        }
        e = e - d;
        d = 0;
        b = 0;
        i1 = inputstream.read(abyte1, e, abyte1.length - e);
        if (i1 <= 0)
        {
            k = e;
        } else
        {
            k = e + i1;
        }
        b = k;
        return i1;
    }

    private static IOException b()
    {
        throw new IOException("BufferedInputStream is closed");
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = a.length;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int available()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = in;
        if (a != null && obj != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        throw b();
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int i;
        int j;
        int k;
        i = b;
        j = e;
        k = ((InputStream) (obj)).available();
        this;
        JVM INSTR monitorexit ;
        return k + (i - j);
    }

    public final void close()
    {
        a = null;
        InputStream inputstream = in;
        in = null;
        if (inputstream != null)
        {
            inputstream.close();
        }
    }

    public final void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        c = Math.max(c, i);
        d = e;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean markSupported()
    {
        return true;
    }

    public final int read()
    {
        int i = -1;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        byte abyte1[];
        abyte1 = a;
        obj = in;
        if (abyte1 != null && obj != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        throw b();
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (e < b) goto _L2; else goto _L1
_L1:
        int j = a(((InputStream) (obj)), abyte1);
        if (j != -1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        byte abyte0[] = abyte1;
        if (abyte1 == a)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        abyte1 = a;
        abyte0 = abyte1;
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        throw b();
        if (b - e <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = e;
        e = i + 1;
        i = abyte0[i];
        i &= 0xff;
        if (true) goto _L3; else goto _L4
_L4:
    }

    public final int read(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte2[] = a;
        if (abyte2 != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw b();
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        if (j != 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L13:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        InputStream inputstream = in;
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        throw b();
        if (e >= b)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (b - e < j) goto _L4; else goto _L3
_L3:
        int k = j;
_L8:
        System.arraycopy(abyte2, e, abyte0, i, k);
        e = e + k;
        if (k == j) goto _L6; else goto _L5
_L5:
        if (inputstream.available() != 0) goto _L7; else goto _L6
_L4:
        k = b - e;
          goto _L8
_L18:
        if (d != -1 || k < abyte2.length) goto _L10; else goto _L9
_L9:
        int l;
        i = inputstream.read(abyte0, l, k);
        byte abyte1[];
        int i1;
        i1 = i;
        abyte1 = abyte2;
        if (i != -1) goto _L12; else goto _L11
_L11:
        if (k == j)
        {
            i = -1;
        } else
        {
            i = j - k;
        }
          goto _L13
_L10:
        if (a(inputstream, abyte2) != -1)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (k == j)
        {
            i = -1;
        } else
        {
            i = j - k;
        }
          goto _L13
        abyte1 = abyte2;
        if (abyte2 == a)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        abyte2 = a;
        abyte1 = abyte2;
        if (abyte2 != null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        throw b();
        if (b - e < k) goto _L15; else goto _L14
_L14:
        i = k;
_L17:
        System.arraycopy(abyte1, e, abyte0, l, i);
        e = e + i;
        i1 = i;
_L12:
        k -= i1;
        i = j;
        if (k == 0) goto _L13; else goto _L16
_L16:
        if (inputstream.available() != 0)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        i = j - k;
          goto _L13
_L15:
        i = b;
        i1 = e;
        i -= i1;
          goto _L17
        l += i1;
        abyte2 = abyte1;
          goto _L18
_L6:
        i = k;
          goto _L13
_L7:
        l = i + k;
        k = j - k;
          goto _L18
        k = j;
        l = i;
          goto _L18
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            throw new IOException("Stream is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (-1 == d)
        {
            throw new u("Mark has been invalidated");
        }
        e = d;
        this;
        JVM INSTR monitorexit ;
    }

    public final long skip(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        InputStream inputstream;
        obj = a;
        inputstream = in;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        throw b();
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (l >= 1L) goto _L2; else goto _L1
_L1:
        l = 0L;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        throw b();
        if ((long)(b - e) >= l)
        {
            e = (int)((long)e + l);
            continue; /* Loop/switch isn't completed */
        }
        long l1;
        l1 = b - e;
        e = b;
        if (d == -1 || l > (long)c)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (a(inputstream, ((byte []) (obj))) == -1)
        {
            l = l1;
            continue; /* Loop/switch isn't completed */
        }
        if ((long)(b - e) >= l - l1)
        {
            e = (int)((l - l1) + (long)e);
            continue; /* Loop/switch isn't completed */
        }
        l = (l1 + (long)b) - (long)e;
        e = b;
        continue; /* Loop/switch isn't completed */
        l = inputstream.skip(l - l1);
        l = l1 + l;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
