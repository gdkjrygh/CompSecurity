// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;


public final class Timestamped
{

    private final long timestampMillis;
    private final Object value;

    public Timestamped(long l, Object obj)
    {
        value = obj;
        timestampMillis = l;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Timestamped))
        {
            return false;
        }
        obj = (Timestamped)obj;
        if (timestampMillis != ((Timestamped) (obj)).timestampMillis)
        {
            return false;
        }
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Timestamped) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((Timestamped) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public long getTimestampMillis()
    {
        return timestampMillis;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = (int)(timestampMillis ^ timestampMillis >>> 32);
        int i;
        if (value == null)
        {
            i = 0;
        } else
        {
            i = value.hashCode();
        }
        return i + (j + 31) * 31;
    }

    public String toString()
    {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", new Object[] {
            Long.valueOf(timestampMillis), value.toString()
        });
    }
}
