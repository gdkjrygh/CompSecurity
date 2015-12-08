// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.FilterWriter;
import java.io.Writer;

public final class pg extends FilterWriter
{

    private final String a;
    private final int b;
    private final int c;
    private int d;
    private boolean e;
    private int f;

    public pg(Writer writer, int i)
    {
        this(writer, i, "");
    }

    public pg(Writer writer, int i, String s)
    {
        super(writer);
        if (writer == null)
        {
            throw new NullPointerException("out == null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("width < 0");
        }
        if (s == null)
        {
            throw new NullPointerException("prefix == null");
        }
        int j;
        if (i != 0)
        {
            j = i;
        } else
        {
            j = 0x7fffffff;
        }
        b = j;
        c = i >> 1;
        writer = s;
        if (s.length() == 0)
        {
            writer = null;
        }
        a = writer;
        a();
    }

    private void a()
    {
        d = 0;
        boolean flag;
        if (c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = 0;
    }

    public final void write(int i)
    {
        int j = 0;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (i != 32)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        f = f + 1;
        if (f < c)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        f = c;
        e = false;
        if (d != b || i == 10)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        out.write(10);
        d = 0;
        if (d != 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        if (a != null)
        {
            out.write(a);
        }
        if (e)
        {
            break MISSING_BLOCK_LABEL_155;
        }
_L1:
        if (j >= f)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        out.write(32);
        j++;
          goto _L1
        d = f;
        out.write(i);
        if (i != 10)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        a();
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        d = d + 1;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
        throw exception;
    }

    public final void write(String s, int i, int j)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
_L2:
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        write(s.charAt(i));
        i++;
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void write(char ac[], int i, int j)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
_L2:
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        write(ac[i]);
        i++;
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        ac;
        obj;
        JVM INSTR monitorexit ;
        throw ac;
    }
}
