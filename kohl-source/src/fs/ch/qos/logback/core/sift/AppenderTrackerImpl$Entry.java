// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;

// Referenced classes of package fs.ch.qos.logback.core.sift:
//            AppenderTrackerImpl

private class timestamp
{

    String key;
    value next;
    value prev;
    final AppenderTrackerImpl this$0;
    long timestamp;
    Appender value;

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
        obj = (timestamp)obj;
        if (key == null)
        {
            if (((key) (obj)).key != null)
            {
                return false;
            }
        } else
        if (!key.equals(((key) (obj)).key))
        {
            return false;
        }
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((value) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((value) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int i;
        if (key == null)
        {
            i = 0;
        } else
        {
            i = key.hashCode();
        }
        return i + 31;
    }

    public void setTimestamp(long l)
    {
        timestamp = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(key).append(", ").append(value).append(")").toString();
    }

    (String s, Appender appender, long l)
    {
        this$0 = AppenderTrackerImpl.this;
        super();
        key = s;
        value = appender;
        timestamp = l;
    }
}
