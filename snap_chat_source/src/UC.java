// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class UC extends Qd
{

    protected String captchaId;
    protected String captchaSolution;

    public UC()
    {
    }

    public final UC a(String s)
    {
        captchaId = s;
        return this;
    }

    public final UC b(String s)
    {
        captchaSolution = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UC))
        {
            return false;
        } else
        {
            obj = (UC)obj;
            return (new EqualsBuilder()).append(timestamp, ((UC) (obj)).timestamp).append(reqToken, ((UC) (obj)).reqToken).append(username, ((UC) (obj)).username).append(captchaId, ((UC) (obj)).captchaId).append(captchaSolution, ((UC) (obj)).captchaSolution).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(captchaId).append(captchaSolution).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
