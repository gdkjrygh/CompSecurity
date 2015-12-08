// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.model;

import com.soundcloud.java.collections.PropertySet;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.model:
//            PostProperty, Urn

final class 
    implements Comparator
{

    public final int compare(PropertySet propertyset, PropertySet propertyset1)
    {
        int j = ((Urn)propertyset.get(PostProperty.TARGET_URN)).compareTo((Urn)propertyset1.get(PostProperty.TARGET_URN));
        int i = j;
        if (j == 0)
        {
            i = ((Boolean)propertyset.get(PostProperty.IS_REPOST)).compareTo((Boolean)propertyset1.get(PostProperty.IS_REPOST));
        }
        j = i;
        if (i == 0)
        {
            j = ((Date)propertyset.get(PostProperty.CREATED_AT)).compareTo((Date)propertyset1.get(PostProperty.CREATED_AT));
        }
        return j;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((PropertySet)obj, (PropertySet)obj1);
    }

    ()
    {
    }
}
