// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Tj extends Qd
{

    protected String conversationId;
    protected byte data[];
    protected String id;
    protected String recipient;
    protected String type;

    public Tj()
    {
    }

    public final Tj a(String s)
    {
        id = s;
        return this;
    }

    public final Tj a(byte abyte0[])
    {
        data = abyte0;
        return this;
    }

    public final Tj b(String s)
    {
        type = s;
        return this;
    }

    public final Tj c(String s)
    {
        conversationId = s;
        return this;
    }

    public final Tj d(String s)
    {
        recipient = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Tj))
        {
            return false;
        } else
        {
            obj = (Tj)obj;
            return (new EqualsBuilder()).append(timestamp, ((Tj) (obj)).timestamp).append(reqToken, ((Tj) (obj)).reqToken).append(username, ((Tj) (obj)).username).append(id, ((Tj) (obj)).id).append(type, ((Tj) (obj)).type).append(data, ((Tj) (obj)).data).append(conversationId, ((Tj) (obj)).conversationId).append(recipient, ((Tj) (obj)).recipient).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(id).append(type).append(data).append(conversationId).append(recipient).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
