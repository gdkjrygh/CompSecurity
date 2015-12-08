// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sz extends Qd
{

    protected String cameraFrontFacing;
    protected String filterId;
    protected String lensId;
    protected String mediaId;
    protected Integer orientation;
    protected Double time;
    protected String zipped;

    public Sz()
    {
    }

    public final void a(Double double1)
    {
        time = double1;
    }

    public final void c(Integer integer)
    {
        orientation = integer;
    }

    public final void d(String s)
    {
        mediaId = s;
    }

    public final void e(String s)
    {
        zipped = s;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sz))
        {
            return false;
        } else
        {
            obj = (Sz)obj;
            return (new EqualsBuilder()).append(timestamp, ((Sz) (obj)).timestamp).append(reqToken, ((Sz) (obj)).reqToken).append(username, ((Sz) (obj)).username).append(mediaId, ((Sz) (obj)).mediaId).append(orientation, ((Sz) (obj)).orientation).append(zipped, ((Sz) (obj)).zipped).append(filterId, ((Sz) (obj)).filterId).append(lensId, ((Sz) (obj)).lensId).append(cameraFrontFacing, ((Sz) (obj)).cameraFrontFacing).append(time, ((Sz) (obj)).time).isEquals();
        }
    }

    public final void f(String s)
    {
        filterId = s;
    }

    public final void g(String s)
    {
        lensId = s;
    }

    public final void h(String s)
    {
        cameraFrontFacing = s;
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(mediaId).append(orientation).append(zipped).append(filterId).append(lensId).append(cameraFrontFacing).append(time).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
