// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration:
//            PlanStorage

class this._cls0
    implements f
{

    final PlanStorage this$0;

    public Boolean call(String s)
    {
        return Boolean.valueOf(s.equals("upsells"));
    }

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    ()
    {
        this$0 = PlanStorage.this;
        super();
    }
}
