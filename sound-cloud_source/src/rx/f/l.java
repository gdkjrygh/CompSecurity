// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;


public final class l
{

    public final long a;
    public final Object b;

    public l(long l1, Object obj)
    {
        b = obj;
        a = l1;
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
        if (!(obj instanceof l))
        {
            return false;
        }
        obj = (l)obj;
        if (a != ((l) (obj)).a)
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((l) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((l) (obj)).b)) goto _L1; else goto _L4
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
        return String.format("Timestamped(timestampMillis = %d, value = %s)", new Object[] {
            Long.valueOf(a), b.toString()
        });
    }
}
