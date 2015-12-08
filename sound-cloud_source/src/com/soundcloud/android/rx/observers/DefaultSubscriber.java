// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx.observers;

import com.soundcloud.android.utils.CallsiteToken;
import com.soundcloud.android.utils.ErrorUtils;
import rx.X;
import rx.Y;
import rx.b;

public class DefaultSubscriber extends X
{

    private final CallsiteToken callsiteToken = CallsiteToken.build();

    public DefaultSubscriber()
    {
    }

    public static Y fireAndForget(b b1)
    {
        return b1.subscribe(new DefaultSubscriber());
    }

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        ErrorUtils.handleThrowable(throwable, callsiteToken);
    }

    public void onNext(Object obj)
    {
    }
}
