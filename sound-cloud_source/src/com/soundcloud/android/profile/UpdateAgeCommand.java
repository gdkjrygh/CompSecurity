// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiResponse;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.rx.ScSchedulers;
import java.util.HashMap;
import java.util.Map;
import rx.X;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            BirthdayInfo

class UpdateAgeCommand extends LegacyCommand
{

    private final ApiClient apiClient;

    public UpdateAgeCommand(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    public Boolean call()
        throws Exception
    {
        Object obj = new HashMap(2);
        ((Map) (obj)).put("month", Integer.valueOf(((BirthdayInfo)input).getMonth()));
        ((Map) (obj)).put("year", Integer.valueOf(((BirthdayInfo)input).getYear()));
        obj = ApiRequest.put(ApiEndpoints.MY_DOB.path()).forPrivateApi(1).withContent(obj).build();
        return Boolean.valueOf(apiClient.fetchResponse(((ApiRequest) (obj))).isSuccess());
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public void call(BirthdayInfo birthdayinfo, X x)
    {
        call(birthdayinfo).subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER).observeOn(a.a()).subscribe(x);
    }
}
