// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Comparator;
import java.util.Date;

class this._cls0
    implements Comparator
{

    final compare this$0;

    private Date getAssociationDate(PropertySet propertyset)
    {
        if (propertyset.contains(LikeProperty.CREATED_AT))
        {
            return (Date)propertyset.get(LikeProperty.CREATED_AT);
        } else
        {
            return (Date)propertyset.get(PostProperty.CREATED_AT);
        }
    }

    public int compare(PropertySet propertyset, PropertySet propertyset1)
    {
        return getAssociationDate(propertyset1).compareTo(getAssociationDate(propertyset));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PropertySet)obj, (PropertySet)obj1);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
