// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class TK extends Qd
{

    protected String conversationId;
    protected Boolean saved;
    protected String transactionId;
    protected Integer version;

    public TK()
    {
    }

    public final TK a(Boolean boolean1)
    {
        saved = boolean1;
        return this;
    }

    public final TK a(Integer integer)
    {
        version = integer;
        return this;
    }

    public final TK a(String s)
    {
        transactionId = s;
        return this;
    }

    public final TK b(String s)
    {
        conversationId = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TK))
        {
            return false;
        } else
        {
            obj = (TK)obj;
            return (new EqualsBuilder()).append(timestamp, ((TK) (obj)).timestamp).append(reqToken, ((TK) (obj)).reqToken).append(username, ((TK) (obj)).username).append(transactionId, ((TK) (obj)).transactionId).append(conversationId, ((TK) (obj)).conversationId).append(saved, ((TK) (obj)).saved).append(version, ((TK) (obj)).version).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(transactionId).append(conversationId).append(saved).append(version).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
