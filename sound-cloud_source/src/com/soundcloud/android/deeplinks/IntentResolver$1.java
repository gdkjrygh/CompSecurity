// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            IntentResolver, DeepLink

class ber extends DefaultSubscriber
{

    final IntentResolver this$0;
    final Context val$context;
    final Referrer val$referrer;
    final Uri val$uri;

    public void onError(Throwable throwable)
    {
        throwable = IntentResolver.access$100(IntentResolver.this, throwable, val$uri);
        DeepLink deeplink = DeepLink.fromUri(throwable);
        if (DeepLink.WEB_VIEW.equals(deeplink))
        {
            IntentResolver.access$200(IntentResolver.this, val$context, throwable, val$referrer);
            return;
        } else
        {
            IntentResolver.access$300(IntentResolver.this, val$context, val$referrer, 0x7f07012a);
            return;
        }
    }

    public void onNext(PublicApiResource publicapiresource)
    {
        IntentResolver.access$000(IntentResolver.this, val$context, publicapiresource, val$referrer);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PublicApiResource)obj);
    }

    esource()
    {
        this$0 = final_intentresolver;
        val$context = context1;
        val$referrer = referrer1;
        val$uri = Uri.this;
        super();
    }
}
