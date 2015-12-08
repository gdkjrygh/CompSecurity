// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class TZ
{

    protected Integer bitrate;
    protected String codec;
    protected String container;
    protected Integer duration;
    protected Integer height;
    protected Integer size;
    protected String url;
    protected Integer width;

    public TZ()
    {
    }

    public final Integer a()
    {
        return bitrate;
    }

    public final Integer b()
    {
        return height;
    }

    public final Integer c()
    {
        return width;
    }

    public final Integer d()
    {
        return duration;
    }

    public final String e()
    {
        return url;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TZ))
        {
            return false;
        } else
        {
            obj = (TZ)obj;
            return (new EqualsBuilder()).append(bitrate, ((TZ) (obj)).bitrate).append(height, ((TZ) (obj)).height).append(width, ((TZ) (obj)).width).append(size, ((TZ) (obj)).size).append(duration, ((TZ) (obj)).duration).append(url, ((TZ) (obj)).url).append(codec, ((TZ) (obj)).codec).append(container, ((TZ) (obj)).container).isEquals();
        }
    }

    public final String f()
    {
        return container;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(bitrate).append(height).append(width).append(size).append(duration).append(url).append(codec).append(container).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
