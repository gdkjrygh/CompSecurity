// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class TQ extends Qd
{

    protected String bodyType;
    protected String mediaEncIv;
    protected String mediaEncKey;
    protected Integer mediaHeight;
    protected String mediaId;
    protected String mediaType;
    protected Integer mediaWidth;
    protected String recipientIds;
    protected String recipients;
    protected String seqNums;

    public TQ()
    {
    }

    public final TQ a(Integer integer)
    {
        mediaWidth = integer;
        return this;
    }

    public final TQ a(String s)
    {
        recipients = s;
        return this;
    }

    public final TQ b(Integer integer)
    {
        mediaHeight = integer;
        return this;
    }

    public final void b(String s)
    {
        recipientIds = s;
    }

    public final TQ c(String s)
    {
        mediaId = s;
        return this;
    }

    public final TQ d(String s)
    {
        mediaType = s;
        return this;
    }

    public final TQ e(String s)
    {
        bodyType = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TQ))
        {
            return false;
        } else
        {
            obj = (TQ)obj;
            return (new EqualsBuilder()).append(timestamp, ((TQ) (obj)).timestamp).append(reqToken, ((TQ) (obj)).reqToken).append(username, ((TQ) (obj)).username).append(recipients, ((TQ) (obj)).recipients).append(recipientIds, ((TQ) (obj)).recipientIds).append(mediaId, ((TQ) (obj)).mediaId).append(mediaType, ((TQ) (obj)).mediaType).append(bodyType, ((TQ) (obj)).bodyType).append(mediaEncKey, ((TQ) (obj)).mediaEncKey).append(mediaEncIv, ((TQ) (obj)).mediaEncIv).append(mediaWidth, ((TQ) (obj)).mediaWidth).append(mediaHeight, ((TQ) (obj)).mediaHeight).append(seqNums, ((TQ) (obj)).seqNums).isEquals();
        }
    }

    public final TQ f(String s)
    {
        mediaEncKey = s;
        return this;
    }

    public final TQ g(String s)
    {
        mediaEncIv = s;
        return this;
    }

    public final TQ h(String s)
    {
        seqNums = s;
        return this;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(recipients).append(recipientIds).append(mediaId).append(mediaType).append(bodyType).append(mediaEncKey).append(mediaEncIv).append(mediaWidth).append(mediaHeight).append(seqNums).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
