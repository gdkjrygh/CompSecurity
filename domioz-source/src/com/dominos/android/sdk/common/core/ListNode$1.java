// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.google.a.a.t;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            MapNode, ListNode

class this._cls0
    implements t
{

    final ListNode this$0;

    public MapNode apply(Object obj)
    {
        if (obj instanceof Map)
        {
            return new MapNode((Map)obj);
        } else
        {
            return null;
        }
    }

    public volatile Object apply(Object obj)
    {
        return apply(obj);
    }

    ()
    {
        this$0 = ListNode.this;
        super();
    }
}
