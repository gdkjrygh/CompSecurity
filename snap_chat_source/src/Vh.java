// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Vh
{

    protected String displayName;
    protected String userId;
    protected String username;
    protected String verifiedUserInfoId;

    public Vh()
    {
    }

    public final String a()
    {
        return username;
    }

    public final boolean b()
    {
        return username != null;
    }

    public final String c()
    {
        return userId;
    }

    public final boolean d()
    {
        return userId != null;
    }

    public final String e()
    {
        return verifiedUserInfoId;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Vh))
        {
            return false;
        } else
        {
            obj = (Vh)obj;
            return (new EqualsBuilder()).append(username, ((Vh) (obj)).username).append(userId, ((Vh) (obj)).userId).append(verifiedUserInfoId, ((Vh) (obj)).verifiedUserInfoId).append(displayName, ((Vh) (obj)).displayName).isEquals();
        }
    }

    public final boolean f()
    {
        return verifiedUserInfoId != null;
    }

    public final String g()
    {
        return displayName;
    }

    public final boolean h()
    {
        return displayName != null;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(username).append(userId).append(verifiedUserInfoId).append(displayName).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
