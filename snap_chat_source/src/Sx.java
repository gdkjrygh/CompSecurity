// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sx
{

    protected String id;
    protected Integer m;
    protected Integer st;
    protected Long sts;
    protected Long ts;
    protected Boolean zipped;

    public Sx()
    {
        ts = Long.valueOf(0L);
        sts = Long.valueOf(0L);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sx))
        {
            return false;
        } else
        {
            obj = (Sx)obj;
            return (new EqualsBuilder()).append(id, ((Sx) (obj)).id).append(st, ((Sx) (obj)).st).append(m, ((Sx) (obj)).m).append(ts, ((Sx) (obj)).ts).append(sts, ((Sx) (obj)).sts).append(zipped, ((Sx) (obj)).zipped).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(id).append(st).append(m).append(ts).append(sts).append(zipped).toHashCode();
    }

    public final String q()
    {
        return id;
    }

    public final Integer r()
    {
        return st;
    }

    public final Integer s()
    {
        return m;
    }

    public final Long t()
    {
        return ts;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    public final Long u()
    {
        return sts;
    }

    public final Boolean v()
    {
        return zipped;
    }
}
