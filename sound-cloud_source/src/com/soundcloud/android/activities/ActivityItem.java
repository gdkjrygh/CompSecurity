// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.api.model.Timestamped;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityProperty, ActivityKind

class ActivityItem
    implements Timestamped, ListItem
{

    private final PropertySet sourceSet;

    ActivityItem(PropertySet propertyset)
    {
        sourceSet = propertyset;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ActivityItem) && ((ActivityItem)obj).sourceSet.equals(sourceSet);
    }

    public Date getCreatedAt()
    {
        return (Date)sourceSet.get(ActivityProperty.DATE);
    }

    public Urn getEntityUrn()
    {
        return (Urn)sourceSet.get(ActivityProperty.USER_URN);
    }

    ActivityKind getKind()
    {
        return (ActivityKind)sourceSet.get(ActivityProperty.KIND);
    }

    String getPlayableTitle()
    {
        return (String)sourceSet.getOrElse(ActivityProperty.PLAYABLE_TITLE, "");
    }

    String getUserName()
    {
        return (String)sourceSet.get(ActivityProperty.USER_NAME);
    }

    public int hashCode()
    {
        return sourceSet.hashCode();
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("sourceSet", sourceSet).toString();
    }

    public ActivityItem update(PropertySet propertyset)
    {
        sourceSet.update(propertyset);
        return this;
    }

    public volatile ListItem update(PropertySet propertyset)
    {
        return update(propertyset);
    }
}
