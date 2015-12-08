// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationItem

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public final List call(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new RecommendationItem((PropertySet)list.next()))) { }
        return arraylist;
    }

    ()
    {
    }
}
