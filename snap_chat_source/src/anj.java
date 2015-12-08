// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;

public final class anj extends alz
    implements Serializable
{

    private static HashMap a;
    private final alA b;

    private anj(alA ala)
    {
        b = ala;
    }

    public static anj a(alA ala)
    {
        anj;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new HashMap(7);
        anj anj1 = null;
_L4:
        anj anj2;
        anj2 = anj1;
        if (anj1 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        anj2 = new anj(ala);
        a.put(ala, anj2);
        anj;
        JVM INSTR monitorexit ;
        return anj2;
_L2:
        anj1 = (anj)a.get(ala);
        if (true) goto _L4; else goto _L3
_L3:
        ala;
        throw ala;
    }

    private UnsupportedOperationException e()
    {
        return new UnsupportedOperationException((new StringBuilder()).append(b).append(" field is unsupported").toString());
    }

    public final long a(long l, int i)
    {
        throw e();
    }

    public final long a(long l, long l1)
    {
        throw e();
    }

    public final alA a()
    {
        return b;
    }

    public final int b(long l, long l1)
    {
        throw e();
    }

    public final boolean b()
    {
        return false;
    }

    public final long c(long l, long l1)
    {
        throw e();
    }

    public final boolean c()
    {
        return true;
    }

    public final volatile int compareTo(Object obj)
    {
        return 0;
    }

    public final long d()
    {
        return 0L;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof anj)
            {
                obj = (anj)obj;
                if (((anj) (obj)).b.a == null)
                {
                    if (b.a != null)
                    {
                        return false;
                    }
                } else
                {
                    return ((anj) (obj)).b.a.equals(b.a);
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("UnsupportedDurationField[")).append(b.a).append(']').toString();
    }
}
