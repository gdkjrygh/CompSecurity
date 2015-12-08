// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.lyft:
//            LyftApi, AppStateDTO

class this._cls0
    implements Action1
{

    final LyftApi this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        LyftApi.access$000(LyftApi.this).onAppStateReceived(appstatedto);
    }

    O()
    {
        this$0 = LyftApi.this;
        super();
    }
}
