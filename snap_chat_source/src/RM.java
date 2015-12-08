// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class RM
{

    protected String iconUrl;
    protected String subtitle;
    protected String title;
    protected String url;

    public RM()
    {
    }

    public final String a()
    {
        return title;
    }

    public final boolean b()
    {
        return title != null;
    }

    public final String c()
    {
        return subtitle;
    }

    public final String d()
    {
        return iconUrl;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RM))
        {
            return false;
        } else
        {
            obj = (RM)obj;
            return (new EqualsBuilder()).append(url, ((RM) (obj)).url).append(title, ((RM) (obj)).title).append(subtitle, ((RM) (obj)).subtitle).append(iconUrl, ((RM) (obj)).iconUrl).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(url).append(title).append(subtitle).append(iconUrl).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
