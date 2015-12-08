// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionStateProvider

class this._cls0
    implements f
{

    final PlaySessionStateProvider this$0;

    public Boolean call(this._cls0 _pcls0)
    {
        boolean flag;
        if (!ULT.ls(_pcls0))
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
        return call((call)obj);
    }

    ()
    {
        this$0 = PlaySessionStateProvider.this;
        super();
    }
}
