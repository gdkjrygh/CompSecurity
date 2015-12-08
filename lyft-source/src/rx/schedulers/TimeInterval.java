// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;


public class TimeInterval
{

    private final long intervalInMilliseconds;
    private final Object value;

    public TimeInterval(long l, Object obj)
    {
        value = obj;
        intervalInMilliseconds = l;
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
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (TimeInterval)obj;
        if (intervalInMilliseconds != ((TimeInterval) (obj)).intervalInMilliseconds)
        {
            return false;
        }
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((TimeInterval) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((TimeInterval) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public long getIntervalInMilliseconds()
    {
        return intervalInMilliseconds;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = (int)(intervalInMilliseconds ^ intervalInMilliseconds >>> 32);
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
        return (new StringBuilder()).append("TimeInterval [intervalInMilliseconds=").append(intervalInMilliseconds).append(", value=").append(value).append("]").toString();
    }
}
