// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class SH
{

    protected String color;
    protected String dropshadowColor;
    protected SX dropshadowOffset;
    protected String font;
    protected String textSize;

    public SH()
    {
    }

    public final String a()
    {
        return textSize;
    }

    public final boolean b()
    {
        return textSize != null;
    }

    public final String c()
    {
        return color;
    }

    public final boolean d()
    {
        return color != null;
    }

    public final String e()
    {
        return dropshadowColor;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SH))
        {
            return false;
        } else
        {
            obj = (SH)obj;
            return (new EqualsBuilder()).append(font, ((SH) (obj)).font).append(textSize, ((SH) (obj)).textSize).append(color, ((SH) (obj)).color).append(dropshadowColor, ((SH) (obj)).dropshadowColor).append(dropshadowOffset, ((SH) (obj)).dropshadowOffset).isEquals();
        }
    }

    public final boolean f()
    {
        return dropshadowColor != null;
    }

    public final SX g()
    {
        return dropshadowOffset;
    }

    public final boolean h()
    {
        return dropshadowOffset != null;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(font).append(textSize).append(color).append(dropshadowColor).append(dropshadowOffset).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
