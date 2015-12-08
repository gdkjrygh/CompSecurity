// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import android.text.TextUtils;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoService, AnvatoResponse

class this._cls0 extends Subscriber
{

    final AnvatoService this$0;

    public void onCompleted()
    {
        AnvatoService.access$000(AnvatoService.this).onCompleted();
    }

    public void onError(Throwable throwable)
    {
        AnvatoService.access$000(AnvatoService.this).onError(new Exception(getBaseContext().getString(0x7f0700d8), throwable));
    }

    public void onNext(AnvatoResponse anvatoresponse)
    {
        if (!TextUtils.isEmpty(anvatoresponse.exception))
        {
            onError(new Exception(anvatoresponse.exception));
            return;
        }
        if (anvatoresponse.isEntitled())
        {
            AnvatoService.access$000(AnvatoService.this).onNext(null);
            AnvatoService.access$000(AnvatoService.this).onCompleted();
            return;
        } else
        {
            AnvatoService.access$000(AnvatoService.this).onNext(anvatoresponse.description);
            AnvatoService.access$000(AnvatoService.this).onCompleted();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((AnvatoResponse)obj);
    }

    _cls9()
    {
        this$0 = AnvatoService.this;
        super();
    }
}
