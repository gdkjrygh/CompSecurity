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

class this._cls1
    implements Runnable
{

    final tSelectedProvider this$1;

    public void run()
    {
        AnvatoService.access$200(_fld0).getInstance().getSelectedProvider();
    }

    l.entitlementId()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/AnvatoService$1

/* anonymous class */
    class AnvatoService._cls1
        implements rx.Observable.OnSubscribe
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
            if (TextUtils.isEmpty(entitlementId) || entitlementId.equals("0"))
            {
                subscriber.onNext(null);
                subscriber.onCompleted();
                return;
            } else
            {
                AnvatoService.access$200(AnvatoService.this).register(AnvatoService.access$100(AnvatoService.this));
                AnvatoService.access$300(AnvatoService.this).post(new AnvatoService._cls1._cls1());
                return;
            }
        }

            
            {
                this$0 = final_anvatoservice;
                entitlementId = String.this;
                super();
            }
    }

}
