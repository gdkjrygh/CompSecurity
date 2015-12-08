// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.associations.LoadFollowingCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.Map;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations, SearchResult

class this._cls0
    implements f
{

    final SearchOperations this$0;

    public SearchResult call(SearchResult searchresult)
    {
        Map map = SearchOperations.access$100(SearchOperations.this).call(searchresult);
        Iterator iterator = searchresult.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)iterator.next();
            Urn urn = (Urn)propertyset.getOrElse(UserProperty.URN, Urn.NOT_SET);
            if (map.containsKey(urn))
            {
                propertyset.update((PropertySet)map.get(urn));
            }
        } while (true);
        return searchresult;
    }

    public volatile Object call(Object obj)
    {
        return call((SearchResult)obj);
    }

    Command()
    {
        this$0 = SearchOperations.this;
        super();
    }
}
