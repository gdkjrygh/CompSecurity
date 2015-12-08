// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import com.google.android.gms.common.api.GoogleApiClient;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationOnSubscribe

class val.apiClient
    implements Action0
{

    final LocationOnSubscribe this$0;
    final GoogleApiClient val$apiClient;

    public void call()
    {
        if (val$apiClient.d() || val$apiClient.e())
        {
            onUnsubscribed(val$apiClient);
            val$apiClient.c();
        }
    }

    ()
    {
        this$0 = final_locationonsubscribe;
        val$apiClient = GoogleApiClient.this;
        super();
    }
}
