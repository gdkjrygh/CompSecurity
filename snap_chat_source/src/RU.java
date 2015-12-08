// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class RU
{

    protected List collabStories;
    protected String displayName;
    protected List stories;
    protected String userId;
    protected String username;

    public RU()
    {
    }

    public final String a()
    {
        return username;
    }

    public final String b()
    {
        return userId;
    }

    public final String c()
    {
        return displayName;
    }

    public final List d()
    {
        return stories;
    }

    public final List e()
    {
        return collabStories;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RU))
        {
            return false;
        } else
        {
            obj = (RU)obj;
            return (new EqualsBuilder()).append(username, ((RU) (obj)).username).append(userId, ((RU) (obj)).userId).append(displayName, ((RU) (obj)).displayName).append(stories, ((RU) (obj)).stories).append(collabStories, ((RU) (obj)).collabStories).isEquals();
        }
    }

    public final boolean f()
    {
        return collabStories != null;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(username).append(userId).append(displayName).append(stories).append(collabStories).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
