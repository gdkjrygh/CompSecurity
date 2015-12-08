// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UI
{

    protected Boolean logged;
    protected String message;
    protected List suggestedFriendResults;

    public UI()
    {
    }

    public final List a()
    {
        return suggestedFriendResults;
    }

    public final boolean b()
    {
        return suggestedFriendResults != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UI))
        {
            return false;
        } else
        {
            obj = (UI)obj;
            return (new EqualsBuilder()).append(suggestedFriendResults, ((UI) (obj)).suggestedFriendResults).append(message, ((UI) (obj)).message).append(logged, ((UI) (obj)).logged).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(suggestedFriendResults).append(message).append(logged).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
