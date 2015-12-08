// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsHomePresenter

class this._cls0
    implements f
{

    final StationsHomePresenter this$0;

    public Boolean call(List list)
    {
        boolean flag;
        if (!list.isEmpty())
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
        return call((List)obj);
    }

    ()
    {
        this$0 = StationsHomePresenter.this;
        super();
    }
}
