// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import hfw;

// Referenced classes of package com.spotify.cosmos.android:
//            RxResolver, Router

class this._cls0
    implements hfw
{

    final RxResolver this$0;

    public Boolean call(Router router)
    {
        boolean flag;
        if (router != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Router)obj);
    }

    ()
    {
        this$0 = RxResolver.this;
        super();
    }
}
