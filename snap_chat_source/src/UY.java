// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class UY
{

    protected String background;
    protected String backgroundType;
    protected String docking;
    protected String file;
    protected List images;
    protected String mode;
    protected String overlay;
    protected String sponsoredOverlay;
    protected String videoFirstFrame;
    protected String videoId;
    protected String videoShareFrame;
    protected Integer zIndex;

    public UY()
    {
    }

    public final String a()
    {
        return file;
    }

    public final String b()
    {
        return background;
    }

    public final String c()
    {
        return backgroundType;
    }

    public final String d()
    {
        return overlay;
    }

    public final String e()
    {
        return videoId;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UY))
        {
            return false;
        } else
        {
            obj = (UY)obj;
            return (new EqualsBuilder()).append(file, ((UY) (obj)).file).append(images, ((UY) (obj)).images).append(background, ((UY) (obj)).background).append(backgroundType, ((UY) (obj)).backgroundType).append(overlay, ((UY) (obj)).overlay).append(videoId, ((UY) (obj)).videoId).append(mode, ((UY) (obj)).mode).append(docking, ((UY) (obj)).docking).append(sponsoredOverlay, ((UY) (obj)).sponsoredOverlay).append(videoFirstFrame, ((UY) (obj)).videoFirstFrame).append(videoShareFrame, ((UY) (obj)).videoShareFrame).append(zIndex, ((UY) (obj)).zIndex).isEquals();
        }
    }

    public final String f()
    {
        return mode;
    }

    public final String g()
    {
        return docking;
    }

    public final String h()
    {
        return videoFirstFrame;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(file).append(images).append(background).append(backgroundType).append(overlay).append(videoId).append(mode).append(docking).append(sponsoredOverlay).append(videoFirstFrame).append(videoShareFrame).append(zIndex).toHashCode();
    }

    public final String i()
    {
        return videoShareFrame;
    }

    public final Integer j()
    {
        return zIndex;
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
