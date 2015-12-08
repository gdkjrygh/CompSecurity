// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import java.util.Collections;
import java.util.List;
import rx.b.f;

final class _cls1
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public final List call(List list)
    {
        class _cls1
            implements Comparator
        {

            final CollectionsOperations._cls1 this$0;

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

            _cls1()
            {
                this$0 = CollectionsOperations._cls1.this;
                super();
            }
        }

        Collections.sort(list, new _cls1());
        return list;
    }

    _cls1()
    {
    }
}
