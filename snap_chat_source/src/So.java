// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class So extends Sz
{

    protected byte data[];
    protected String iv;
    protected String key;
    protected List recipientIds;
    protected List recipients;
    protected Integer type;
    protected String uploadUrl;

    public So()
    {
    }

    public final So a(byte abyte0[])
    {
        data = abyte0;
        return this;
    }

    public final void a(Integer integer)
    {
        type = integer;
    }

    public final void a(String s)
    {
        uploadUrl = s;
    }

    public final void a(List list)
    {
        recipients = list;
    }

    public final So b(Integer integer)
    {
        type = integer;
        return this;
    }

    public final void b(String s)
    {
        key = s;
    }

    public final void b(List list)
    {
        recipientIds = list;
    }

    public final void c(String s)
    {
        iv = s;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof So))
        {
            return false;
        } else
        {
            obj = (So)obj;
            return (new EqualsBuilder()).append(timestamp, ((So) (obj)).timestamp).append(reqToken, ((So) (obj)).reqToken).append(username, ((So) (obj)).username).append(mediaId, ((So) (obj)).mediaId).append(orientation, ((So) (obj)).orientation).append(zipped, ((So) (obj)).zipped).append(filterId, ((So) (obj)).filterId).append(lensId, ((So) (obj)).lensId).append(cameraFrontFacing, ((So) (obj)).cameraFrontFacing).append(time, ((So) (obj)).time).append(timestamp, ((So) (obj)).timestamp).append(reqToken, ((So) (obj)).reqToken).append(username, ((So) (obj)).username).append(recipients, ((So) (obj)).recipients).append(recipientIds, ((So) (obj)).recipientIds).append(type, ((So) (obj)).type).append(data, ((So) (obj)).data).append(uploadUrl, ((So) (obj)).uploadUrl).append(key, ((So) (obj)).key).append(iv, ((So) (obj)).iv).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(mediaId).append(orientation).append(zipped).append(filterId).append(lensId).append(cameraFrontFacing).append(time).append(timestamp).append(reqToken).append(username).append(recipients).append(recipientIds).append(type).append(data).append(uploadUrl).append(key).append(iv).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
