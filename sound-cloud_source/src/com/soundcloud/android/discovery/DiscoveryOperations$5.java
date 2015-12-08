// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import java.util.ArrayList;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationItem

final class val.recommendationItem
    implements g
{

    final RecommendationItem val$recommendationItem;

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (List)obj1);
    }

    public final List call(List list, List list1)
    {
        ArrayList arraylist = new ArrayList(list.size() + list1.size() + 1);
        arraylist.addAll(list);
        arraylist.add(val$recommendationItem.getSeedTrackUrn());
        arraylist.addAll(list1);
        return arraylist;
    }

    ()
    {
        val$recommendationItem = recommendationitem;
        super();
    }
}
