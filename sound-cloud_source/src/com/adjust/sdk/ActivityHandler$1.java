// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, AdjustConfig, OnAttributionChangedListener

class this._cls0
    implements Runnable
{

    final ActivityHandler this$0;

    public void run()
    {
        ActivityHandler.access$100(ActivityHandler.this).onAttributionChangedListener.onAttributionChanged(ActivityHandler.access$000(ActivityHandler.this));
    }

    edListener()
    {
        this$0 = ActivityHandler.this;
        super();
    }
}
