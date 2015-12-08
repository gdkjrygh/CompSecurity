// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sj extends Qy
{

    protected Long captionOrientation;
    protected Double captionPosition;
    protected String captionText;
    protected Long deliveredTimestamp;
    protected Double displayTime;
    protected String esId;
    protected String filterId;
    protected Integer mediaType;
    protected Long sentTimestamp;
    protected String snapId;
    protected Integer status;
    protected Boolean zipped;

    public Sj()
    {
    }

    public final Long a()
    {
        return sentTimestamp;
    }

    public final Long b()
    {
        return deliveredTimestamp;
    }

    public final Integer c()
    {
        return status;
    }

    public final String d()
    {
        return snapId;
    }

    public final Boolean e()
    {
        return zipped;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sj))
        {
            return false;
        } else
        {
            obj = (Sj)obj;
            return (new EqualsBuilder()).append(type, ((Sj) (obj)).type).append(id, ((Sj) (obj)).id).append(header, ((Sj) (obj)).header).append(retried, ((Sj) (obj)).retried).append(type, ((Sj) (obj)).type).append(id, ((Sj) (obj)).id).append(sentTimestamp, ((Sj) (obj)).sentTimestamp).append(deliveredTimestamp, ((Sj) (obj)).deliveredTimestamp).append(status, ((Sj) (obj)).status).append(snapId, ((Sj) (obj)).snapId).append(zipped, ((Sj) (obj)).zipped).append(captionText, ((Sj) (obj)).captionText).append(captionOrientation, ((Sj) (obj)).captionOrientation).append(captionPosition, ((Sj) (obj)).captionPosition).append(mediaType, ((Sj) (obj)).mediaType).append(displayTime, ((Sj) (obj)).displayTime).append(filterId, ((Sj) (obj)).filterId).append(esId, ((Sj) (obj)).esId).isEquals();
        }
    }

    public final String f()
    {
        return captionText;
    }

    public final Integer g()
    {
        return mediaType;
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(type).append(id).append(header).append(retried).append(type).append(id).append(sentTimestamp).append(deliveredTimestamp).append(status).append(snapId).append(zipped).append(captionText).append(captionOrientation).append(captionPosition).append(mediaType).append(displayTime).append(filterId).append(esId).toHashCode();
    }

    public final Double m()
    {
        return displayTime;
    }

    public final String n()
    {
        return filterId;
    }

    public final String o()
    {
        return esId;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
