// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class SC extends Sb
{

    protected Map snaps;
    protected Boolean success;

    public SC()
    {
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SC))
        {
            return false;
        } else
        {
            obj = (SC)obj;
            return (new EqualsBuilder()).append(serverInfo, ((SC) (obj)).serverInfo).append(json, ((SC) (obj)).json).append(groupStories, ((SC) (obj)).groupStories).append(verifiedStories, ((SC) (obj)).verifiedStories).append(verifiedStoriesWithCollabs, ((SC) (obj)).verifiedStoriesWithCollabs).append(success, ((SC) (obj)).success).append(snaps, ((SC) (obj)).snaps).isEquals();
        }
    }

    public final Boolean h()
    {
        return success;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(serverInfo).append(json).append(groupStories).append(verifiedStories).append(verifiedStoriesWithCollabs).append(success).append(snaps).toHashCode();
    }

    public final Map i()
    {
        return snaps;
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
