// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItem

public class NotificationItem
    implements StreamItem
{

    public NotificationItem()
    {
    }

    public Date getCreatedAt()
    {
        return new Date();
    }

    public Urn getEntityUrn()
    {
        return Urn.NOT_SET;
    }

    public StreamItem.Kind getKind()
    {
        return StreamItem.Kind.NOTIFICATION;
    }

    public int getLayout()
    {
        throw new IllegalArgumentException("layout not set");
    }

    public ListItem update(PropertySet propertyset)
    {
        return this;
    }
}
