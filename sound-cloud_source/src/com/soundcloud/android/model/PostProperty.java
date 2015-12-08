// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.model;

import com.soundcloud.java.collections.Property;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.model:
//            EntityProperty, Urn

public class PostProperty
{

    public static final Comparator COMPARATOR = new _cls1();
    public static final Property CREATED_AT = Property.of(com/soundcloud/android/model/PostProperty, java/util/Date);
    public static final Property IS_REPOST = Property.of(com/soundcloud/android/model/PostProperty, java/lang/Boolean);
    public static final Property REPOSTER = Property.of(com/soundcloud/android/model/PostProperty, java/lang/String);
    public static final Property REPOSTER_URN = Property.of(com/soundcloud/android/model/PostProperty, com/soundcloud/android/model/Urn);
    public static final Property TARGET_URN;

    public PostProperty()
    {
    }

    static 
    {
        TARGET_URN = EntityProperty.URN;
    }

    private class _cls1
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

        _cls1()
        {
        }
    }

}
