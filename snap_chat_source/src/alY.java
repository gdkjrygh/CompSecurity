// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class alY
    implements alP, Serializable, Comparable
{

    public volatile int d;

    public alY(int i)
    {
        d = i;
    }

    public abstract alA a();

    public abstract alH b();

    public final int c()
    {
        return d;
    }

    public int compareTo(Object obj)
    {
        obj = (alY)obj;
        if (obj.getClass() != getClass())
        {
            throw new ClassCastException((new StringBuilder()).append(getClass()).append(" cannot be compared to ").append(obj.getClass()).toString());
        }
        int i = ((alY) (obj)).d;
        int j = d;
        if (j > i)
        {
            return 1;
        }
        return j >= i ? 0 : -1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof alP))
            {
                return false;
            }
            obj = (alP)obj;
            if (((alP) (obj)).b() != b() || ((alP) (obj)).c() != d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (d + 459) * 27 + a().hashCode();
    }
}
