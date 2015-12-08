// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public class jmo
{

    final int a;
    final byte b[];
    int c;
    int d;
    jmn e[];

    public jmo(int i)
    {
        this(0x10000, 0);
    }

    public jmo(int i, int j)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        c.a(true);
        a = i;
        d = 0;
        e = new jmn[100];
        b = null;
    }

    public jmn a()
    {
        this;
        JVM INSTR monitorenter ;
        c = c + 1;
        if (d <= 0) goto _L2; else goto _L1
_L1:
        jmn ajmn[];
        int i;
        ajmn = e;
        i = d - 1;
        d = i;
        jmn jmn1 = ajmn[i];
        e[d] = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return jmn1;
_L2:
        jmn1 = new jmn(new byte[a], 0);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        int k;
        k = Math.max(0, jno.a(0, a) - c);
        i = d;
        if (k < i) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = k;
        int l;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        l = d - 1;
        i = j;
        j = l;
_L4:
        if (i > j)
        {
            break; /* Loop/switch isn't completed */
        }
        jmn jmn1 = e[i];
        if (jmn1.a == b)
        {
            i++;
            continue; /* Loop/switch isn't completed */
        }
        jmn jmn2 = e[i];
        if (jmn2.a != b)
        {
            j--;
            continue; /* Loop/switch isn't completed */
        }
        e[i] = jmn2;
        e[j] = jmn1;
        j--;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        i = Math.max(k, i);
        if (i >= d)
        {
            continue; /* Loop/switch isn't completed */
        }
        Arrays.fill(e, i, d, null);
        d = i;
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(jmn jmn1)
    {
        this;
        JVM INSTR monitorenter ;
        jmn ajmn[];
        int i;
        boolean flag;
        if (jmn1.a != b && jmn1.a.length != a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        c.a(flag);
        c = c - 1;
        if (d == e.length)
        {
            e = (jmn[])Arrays.copyOf(e, e.length << 1);
        }
        ajmn = e;
        i = d;
        d = i + 1;
        ajmn[i] = jmn1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        jmn1;
        throw jmn1;
    }

    public int b()
    {
        return a;
    }

    public void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        for (; c() > i; wait()) { }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public int c()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = c;
        j = a;
        this;
        JVM INSTR monitorexit ;
        return i * j;
        Exception exception;
        exception;
        throw exception;
    }
}
