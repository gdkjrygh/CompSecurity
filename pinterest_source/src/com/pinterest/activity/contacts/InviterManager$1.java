// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.google.gson.JsonElement;
import com.pinterest.common.utils.Function;

// Referenced classes of package com.pinterest.activity.contacts:
//            InviterManager

class this._cls0
    implements Function
{

    final InviterManager this$0;

    public Double apply(JsonElement jsonelement)
    {
        return Double.valueOf(jsonelement.getAsDouble());
    }

    public volatile Object apply(Object obj)
    {
        return apply((JsonElement)obj);
    }

    ()
    {
        this$0 = InviterManager.this;
        super();
    }
}
