// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.jobs:
//            GoogleNowAuthorizationJob

class gleNowAuthCodeDTO extends SimpleSubscriber
{

    final GoogleNowAuthorizationJob this$0;
    final GoogleNowAuthCodeDTO val$googleNowAuthCode;

    public void onError(Throwable throwable)
    {
        preferences.setGoogleNowAuthCode(val$googleNowAuthCode);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Unit)obj);
    }

    public void onNext(Unit unit)
    {
        preferences.setGoogleNowAuthCode(null);
    }

    gleNowAuthCodeDTO()
    {
        this$0 = final_googlenowauthorizationjob;
        val$googleNowAuthCode = GoogleNowAuthCodeDTO.this;
        super();
    }
}
