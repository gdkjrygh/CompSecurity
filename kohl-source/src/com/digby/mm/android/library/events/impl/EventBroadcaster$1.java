// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;


// Referenced classes of package com.digby.mm.android.library.events.impl:
//            EventBroadcaster

class this._cls0
    implements nverter
{

    final EventBroadcaster this$0;

    public Integer convert(Object obj)
    {
        return Integer.valueOf(obj.toString());
    }

    public volatile Object convert(Object obj)
    {
        return convert(obj);
    }

    nverter()
    {
        this$0 = EventBroadcaster.this;
        super();
    }
}
