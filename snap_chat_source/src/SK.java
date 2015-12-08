// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class SK extends Qd
{

    protected String checksum;
    protected String featuresMap;
    protected Float screenHeightIn;
    protected Integer screenHeightPx;
    protected Float screenWidthIn;
    protected Integer screenWidthPx;

    public SK()
    {
    }

    public final SK a(Float float1)
    {
        screenWidthIn = float1;
        return this;
    }

    public final SK a(Integer integer)
    {
        screenWidthPx = integer;
        return this;
    }

    public final SK a(String s)
    {
        featuresMap = s;
        return this;
    }

    public final SK b(Float float1)
    {
        screenHeightIn = float1;
        return this;
    }

    public final SK b(Integer integer)
    {
        screenHeightPx = integer;
        return this;
    }

    public final SK b(String s)
    {
        checksum = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SK))
        {
            return false;
        } else
        {
            obj = (SK)obj;
            return (new EqualsBuilder()).append(timestamp, ((SK) (obj)).timestamp).append(reqToken, ((SK) (obj)).reqToken).append(username, ((SK) (obj)).username).append(featuresMap, ((SK) (obj)).featuresMap).append(checksum, ((SK) (obj)).checksum).append(screenWidthIn, ((SK) (obj)).screenWidthIn).append(screenHeightIn, ((SK) (obj)).screenHeightIn).append(screenWidthPx, ((SK) (obj)).screenWidthPx).append(screenHeightPx, ((SK) (obj)).screenHeightPx).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(featuresMap).append(checksum).append(screenWidthIn).append(screenHeightIn).append(screenWidthPx).append(screenHeightPx).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
