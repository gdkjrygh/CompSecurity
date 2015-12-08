// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerScrollListener

class this._cls0
    implements f
{

    final PlayerPagerScrollListener this$0;

    public Boolean call(Integer integer)
    {
        boolean flag;
        if (PlayerPagerScrollListener.access$400(PlayerPagerScrollListener.this) && integer.intValue() == 0)
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
        return call((Integer)obj);
    }

    ()
    {
        this$0 = PlayerPagerScrollListener.this;
        super();
    }
}
