// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.os.Handler;
import android.text.TextUtils;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoService, AuthService

class val.entitlementId
    implements rx.scribe
{

    final AnvatoService this$0;
    final String val$entitlementId;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        AnvatoService.access$002(AnvatoService.this, subscriber);
        if (TextUtils.isEmpty(val$entitlementId) || val$entitlementId.equals("0"))
        {
            subscriber.onNext(null);
            subscriber.onCompleted();
            return;
        } else
        {
            AnvatoService.access$200(AnvatoService.this).register(AnvatoService.access$100(AnvatoService.this));
            AnvatoService.access$300(AnvatoService.this).post(new Runnable() {

                final AnvatoService._cls1 this$1;

                public void run()
                {
                    AnvatoService.access$200(this$0).getInstance().getSelectedProvider();
                }

            
            {
                this$1 = AnvatoService._cls1.this;
                super();
            }
            });
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_anvatoservice;
        val$entitlementId = String.this;
        super();
    }
}
