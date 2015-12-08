// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import rx.Observable;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoRequest, AuthService, AnvatoResponse, AuthDelegate

public class AnvatoService extends ContextWrapper
{

    private final Anvato.API anvatoApi;
    private IAccessEnablerDelegate blackoutDelegate;
    private String blackoutId;
    private Subscriber blackoutSubscriber;
    private String channel;
    private IAccessEnablerDelegate entitlementDelegate;
    private String entitlementId;
    private Handler handler;
    private boolean hasRequestedBlackout;
    private boolean hasRequestedEntitlement;
    private Mvpd mvpd;
    private final AuthService pass;
    public int retry;
    private Subscriber subscriber;

    public AnvatoService(Anvato.API api, AuthService authservice, Context context)
    {
        super(context);
        handler = new Handler(Looper.getMainLooper());
        entitlementDelegate = new AuthDelegate() {

            final AnvatoService this$0;

            public void selectedProvider(Mvpd mvpd1)
            {
                super.selectedProvider(mvpd1);
                if (mvpd1 == null)
                {
                    subscriber.onError(new Error("Selected MVPD was null"));
                    return;
                } else
                {
                    mvpd = mvpd1;
                    pass.getUserMetadata();
                    return;
                }
            }

            public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
            {
                super.setMetadataStatus(metadatakey, metadatastatus);
                metadatakey = pass.getZipData();
                if (metadatakey != null)
                {
                    retry = 0;
                    requestEntitlementStatus(metadatakey);
                    pass.unregister(entitlementDelegate);
                    return;
                } else
                {
                    subscriber.onError(new Exception(getBaseContext().getString(0x7f0700d8)));
                    return;
                }
            }

            
            {
                this$0 = AnvatoService.this;
                super();
            }
        };
        blackoutDelegate = new AuthDelegate() {

            final AnvatoService this$0;

            public void selectedProvider(Mvpd mvpd1)
            {
                super.selectedProvider(mvpd1);
                if (mvpd1 == null)
                {
                    subscriber.onError(new Error("Selected MVPD was null"));
                    return;
                } else
                {
                    mvpd = mvpd1;
                    requestBlackoutStatus();
                    return;
                }
            }

            
            {
                this$0 = AnvatoService.this;
                super();
            }
        };
        anvatoApi = api;
        pass = authservice;
    }

    private void requestBlackoutStatus()
    {
        if (hasRequestedBlackout)
        {
            return;
        }
        hasRequestedBlackout = true;
        if (TextUtils.isEmpty(blackoutId) || blackoutId.equals("0"))
        {
            blackoutSubscriber.onNext(null);
            blackoutSubscriber.onCompleted();
            return;
        } else
        {
            final AnvatoRequest anvatoRequest = AnvatoRequest.buildBlackoutRequest(mvpd, channel);
            anvatoApi.eventLookup(blackoutId, anvatoRequest).subscribe(new Subscriber() {

                final AnvatoService this$0;
                final AnvatoRequest val$anvatoRequest;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable)
                {
                    blackoutSubscriber.onError(new Exception(getBaseContext().getString(0x7f0700d8), throwable));
                }

                public void onNext(AnvatoResponse anvatoresponse)
                {
                    anvatoresponse.setRequest(anvatoRequest);
                    if (!TextUtils.isEmpty(anvatoresponse.exception))
                    {
                        onError(new Exception(anvatoresponse.exception));
                        return;
                    }
                    if (anvatoresponse.isEntitled())
                    {
                        blackoutSubscriber.onNext(null);
                        blackoutSubscriber.onCompleted();
                        return;
                    } else
                    {
                        blackoutSubscriber.onNext(anvatoresponse);
                        blackoutSubscriber.onCompleted();
                        return;
                    }
                }

                public volatile void onNext(Object obj)
                {
                    onNext((AnvatoResponse)obj);
                }

            
            {
                this$0 = AnvatoService.this;
                anvatoRequest = anvatorequest;
                super();
            }
            });
            return;
        }
    }

    private void requestEntitlementStatus(String s)
    {
        if (hasRequestedEntitlement)
        {
            return;
        }
        hasRequestedEntitlement = true;
        if (TextUtils.isEmpty(entitlementId) || entitlementId.equals("0"))
        {
            subscriber.onNext(null);
            subscriber.onCompleted();
            return;
        } else
        {
            s = AnvatoRequest.buildEntitlementRequest(channel, mvpd, s, pass.isComcast());
            anvatoApi.eventLookup(entitlementId, s).subscribe(new Subscriber() {

                final AnvatoService this$0;

                public void onCompleted()
                {
                    subscriber.onCompleted();
                }

                public void onError(Throwable throwable)
                {
                    subscriber.onError(new Exception(getBaseContext().getString(0x7f0700d8), throwable));
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
                        subscriber.onNext(null);
                        subscriber.onCompleted();
                        return;
                    } else
                    {
                        subscriber.onNext(anvatoresponse.description);
                        subscriber.onCompleted();
                        return;
                    }
                }

                public volatile void onNext(Object obj)
                {
                    onNext((AnvatoResponse)obj);
                }

            
            {
                this$0 = AnvatoService.this;
                super();
            }
            });
            return;
        }
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        pass.unregister(entitlementDelegate);
        pass.unregister(blackoutDelegate);
    }

    Observable getEntitlementStatus(final String entitlementId, String s)
    {
        this.entitlementId = entitlementId;
        channel = s;
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AnvatoService this$0;
            final String val$entitlementId;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber1)
            {
                subscriber = subscriber1;
                if (TextUtils.isEmpty(entitlementId) || entitlementId.equals("0"))
                {
                    subscriber1.onNext(null);
                    subscriber1.onCompleted();
                    return;
                } else
                {
                    pass.register(entitlementDelegate);
                    handler.post(new Runnable() {

                        final _cls1 this$1;

                        public void run()
                        {
                            pass.getInstance().getSelectedProvider();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = AnvatoService.this;
                entitlementId = s;
                super();
            }
        });
    }

    Observable getMvpdBlackoutStatus(String s, String s1)
    {
        blackoutId = s;
        channel = s1;
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AnvatoService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber1)
            {
                blackoutSubscriber = subscriber1;
                if (TextUtils.isEmpty(blackoutId) || blackoutId.equals("0"))
                {
                    blackoutSubscriber.onNext(null);
                    blackoutSubscriber.onCompleted();
                    return;
                } else
                {
                    pass.register(blackoutDelegate);
                    handler.post(new Runnable() {

                        final _cls2 this$1;

                        public void run()
                        {
                            pass.getInstance().getSelectedProvider();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = AnvatoService.this;
                super();
            }
        });
    }



/*
    static Subscriber access$002(AnvatoService anvatoservice, Subscriber subscriber1)
    {
        anvatoservice.subscriber = subscriber1;
        return subscriber1;
    }

*/






/*
    static Subscriber access$402(AnvatoService anvatoservice, Subscriber subscriber1)
    {
        anvatoservice.blackoutSubscriber = subscriber1;
        return subscriber1;
    }

*/




/*
    static Mvpd access$702(AnvatoService anvatoservice, Mvpd mvpd1)
    {
        anvatoservice.mvpd = mvpd1;
        return mvpd1;
    }

*/


}
