// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.model.GraphObject;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter

class val.collator
    implements Comparator
{

    final GraphObjectAdapter this$0;
    private final Collator val$collator;

    public int compare(GraphObject graphobject, GraphObject graphobject1)
    {
        return GraphObjectAdapter.access$1(graphobject, graphobject1, GraphObjectAdapter.access$0(GraphObjectAdapter.this), val$collator);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((GraphObject)obj, (GraphObject)obj1);
    }

    ()
    {
        this$0 = final_graphobjectadapter;
        val$collator = Collator.this;
        super();
    }
}
