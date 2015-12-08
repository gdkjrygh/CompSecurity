// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.infrastructure.lyft.signing.SignedUrlDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.settings:
//            SignUrlService

class this._cls0
    implements Func1
{

    final SignUrlService this$0;

    public volatile Object call(Object obj)
    {
        return call((SignedUrlDTO)obj);
    }

    public Observable call(SignedUrlDTO signedurldto)
    {
        return Observable.just(signedurldto.getSignedUrl());
    }

    TO()
    {
        this$0 = SignUrlService.this;
        super();
    }
}
