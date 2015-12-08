// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;


public final class k
{

    private final long a;
    private final Object b;

    public k(long l, Object obj)
    {
        b = obj;
        a = l;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (k)obj;
        if (a != ((k) (obj)).a)
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((k) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((k) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = (int)(a ^ a >>> 32);
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return i + (j + 31) * 31;
    }

    public final String toString()
    {
        return (new StringBuilder("TimeInterval [intervalInMilliseconds=")).append(a).append(", value=").append(b).append("]").toString();
    }
}
