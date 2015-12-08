// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class amS extends alz
    implements Serializable
{

    final alA a;

    public amS(alA ala)
    {
        if (ala == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            a = ala;
            return;
        }
    }

    public final alA a()
    {
        return a;
    }

    public int b(long l, long l1)
    {
        return amX.a(c(l, l1));
    }

    public final boolean b()
    {
        return true;
    }

    public int compareTo(Object obj)
    {
        long l = ((alz)obj).d();
        long l1 = d();
        if (l1 == l)
        {
            return 0;
        }
        return l1 >= l ? 1 : -1;
    }

    public String toString()
    {
        return (new StringBuilder("DurationField[")).append(a.a).append(']').toString();
    }
}
