// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.ActivationTask;

public final class goa
    implements Runnable
{

    private ActivationTask a;

    public goa(ActivationTask activationtask)
    {
        a = activationtask;
        super();
    }

    public final void run()
    {
        ActivationTask activationtask = a;
        activationtask.a.resolve(RequestBuilder.postBytes("hm://payment-iap/telco/1/activate_premium", activationtask.d.getBytes()).build(), new com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.ActivationTask._cls1(activationtask, new Handler(), com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/ActivationTask$ResponseMessage));
    }
}
