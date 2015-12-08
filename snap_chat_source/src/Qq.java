// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Qq
{

    protected String conversationsChecksum;
    protected String friendsChecksum;
    protected String storiesChecksum;
    protected String studySettingsChecksum;
    protected String updatesChecksum;

    public Qq()
    {
    }

    public final Qq a(String s)
    {
        storiesChecksum = s;
        return this;
    }

    public final String a()
    {
        return storiesChecksum;
    }

    public final Qq b(String s)
    {
        updatesChecksum = s;
        return this;
    }

    public final String b()
    {
        return updatesChecksum;
    }

    public final Qq c(String s)
    {
        friendsChecksum = s;
        return this;
    }

    public final String c()
    {
        return friendsChecksum;
    }

    public final Qq d(String s)
    {
        conversationsChecksum = s;
        return this;
    }

    public final String d()
    {
        return conversationsChecksum;
    }

    public final Qq e(String s)
    {
        studySettingsChecksum = s;
        return this;
    }

    public final String e()
    {
        return studySettingsChecksum;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Qq))
        {
            return false;
        } else
        {
            obj = (Qq)obj;
            return (new EqualsBuilder()).append(storiesChecksum, ((Qq) (obj)).storiesChecksum).append(updatesChecksum, ((Qq) (obj)).updatesChecksum).append(friendsChecksum, ((Qq) (obj)).friendsChecksum).append(conversationsChecksum, ((Qq) (obj)).conversationsChecksum).append(studySettingsChecksum, ((Qq) (obj)).studySettingsChecksum).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(storiesChecksum).append(updatesChecksum).append(friendsChecksum).append(conversationsChecksum).append(studySettingsChecksum).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
