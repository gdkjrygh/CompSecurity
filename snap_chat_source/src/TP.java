// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class TP
{

    protected List dsnapsData;
    protected Long editionId;
    protected String filledIcon;
    protected String introMovie;
    protected Qa introVideoAdMetadata;
    protected String invertedIcon;
    protected String loadingIcon;
    protected String name;
    protected Integer position;
    protected String primaryColor;
    protected Integer promotedStoriesPagePosition;
    protected String publisherFormalName;
    protected String publisherName;
    protected String secondaryColor;
    protected Boolean sponsored;
    protected SG sponsoredSlug;
    protected Integer storiesPagePosition;

    public TP()
    {
    }

    public final String a()
    {
        return name;
    }

    public final Integer b()
    {
        return storiesPagePosition;
    }

    public final Integer c()
    {
        return promotedStoriesPagePosition;
    }

    public final String d()
    {
        return publisherName;
    }

    public final String e()
    {
        return publisherFormalName;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TP))
        {
            return false;
        } else
        {
            obj = (TP)obj;
            return (new EqualsBuilder()).append(name, ((TP) (obj)).name).append(position, ((TP) (obj)).position).append(storiesPagePosition, ((TP) (obj)).storiesPagePosition).append(promotedStoriesPagePosition, ((TP) (obj)).promotedStoriesPagePosition).append(publisherName, ((TP) (obj)).publisherName).append(publisherFormalName, ((TP) (obj)).publisherFormalName).append(filledIcon, ((TP) (obj)).filledIcon).append(invertedIcon, ((TP) (obj)).invertedIcon).append(loadingIcon, ((TP) (obj)).loadingIcon).append(introMovie, ((TP) (obj)).introMovie).append(primaryColor, ((TP) (obj)).primaryColor).append(secondaryColor, ((TP) (obj)).secondaryColor).append(editionId, ((TP) (obj)).editionId).append(dsnapsData, ((TP) (obj)).dsnapsData).append(introVideoAdMetadata, ((TP) (obj)).introVideoAdMetadata).append(sponsored, ((TP) (obj)).sponsored).append(sponsoredSlug, ((TP) (obj)).sponsoredSlug).isEquals();
        }
    }

    public final String f()
    {
        return filledIcon;
    }

    public final String g()
    {
        return invertedIcon;
    }

    public final String h()
    {
        return loadingIcon;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(name).append(position).append(storiesPagePosition).append(promotedStoriesPagePosition).append(publisherName).append(publisherFormalName).append(filledIcon).append(invertedIcon).append(loadingIcon).append(introMovie).append(primaryColor).append(secondaryColor).append(editionId).append(dsnapsData).append(introVideoAdMetadata).append(sponsored).append(sponsoredSlug).toHashCode();
    }

    public final String i()
    {
        return introMovie;
    }

    public final String j()
    {
        return primaryColor;
    }

    public final String k()
    {
        return secondaryColor;
    }

    public final Long l()
    {
        return editionId;
    }

    public final boolean m()
    {
        return editionId != null;
    }

    public final List n()
    {
        return dsnapsData;
    }

    public final Qa o()
    {
        return introVideoAdMetadata;
    }

    public final Boolean p()
    {
        return sponsored;
    }

    public final boolean q()
    {
        return sponsored != null;
    }

    public final SG r()
    {
        return sponsoredSlug;
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
