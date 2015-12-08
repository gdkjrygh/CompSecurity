// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0 extends AsyncCall
{

    final LyftDriverToggleService this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        LyftDriverToggleService.access$1400(LyftDriverToggleService.this);
    }

    _cls9()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
