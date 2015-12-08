// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.j;
import android.widget.Toast;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.l;
import com.pandora.radio.data.o;
import com.pandora.radio.provider.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.cm.e;
import p.cm.q;
import p.cm.w;
import p.cm.x;
import p.cw.c;
import p.dd.v;
import p.de.a;

public class com.pandora.android.iap.b
    implements p.de.a
{
    private class a
        implements PurchasingListener
    {

        final com.pandora.android.iap.b a;

        public void onProductDataResponse(ProductDataResponse productdataresponse)
        {
            com.pandora.android.iap.b.d((new StringBuilder()).append("onProductDataResponse: ").append(productdataresponse.getRequestStatus().toString()).toString());
            if (productdataresponse.getRequestStatus() == com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL)
            {
                Object obj = productdataresponse.getProductData().values().iterator();
                do
                {
                    if (((Iterator) (obj)).hasNext())
                    {
                        Product product = (Product)((Iterator) (obj)).next();
                        com.pandora.android.iap.b.d((new StringBuilder()).append("got sku from Amazon: ").append(product.getSku()).toString());
                        static class _cls5
                        {

                            static final int a[];
                            static final int b[];

                            static 
                            {
                                b = new int[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.values().length];
                                try
                                {
                                    b[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror6) { }
                                try
                                {
                                    b[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror5) { }
                                try
                                {
                                    b[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror4) { }
                                try
                                {
                                    b[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                a = new int[ProductType.values().length];
                                try
                                {
                                    a[ProductType.SUBSCRIPTION.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    a[ProductType.CONSUMABLE.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[ProductType.ENTITLED.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        switch (com.pandora.android.iap._cls5.a[product.getProductType().ordinal()])
                        {
                        case 1: // '\001'
                            com.pandora.android.iap.b.a(a, product);
                            break;

                        case 2: // '\002'
                            com.pandora.android.iap.b.b(a, product);
                            break;
                        }
                        continue;
                    }
                    obj = productdataresponse.getUnavailableSkus();
                    if (((Set) (obj)).size() > 0)
                    {
                        productdataresponse = new StringBuilder("onItemDataResponse: Unavailable skus --> ");
                        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); productdataresponse.append(';'))
                        {
                            productdataresponse.append((String)((Iterator) (obj)).next());
                        }

                        p.df.a.c("AmazonInAppPurchasing", productdataresponse.toString());
                    }
                    break;
                } while (true);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseresponse)
        {
            Receipt receipt;
            boolean flag1;
            flag1 = false;
            com.pandora.android.iap.b.d((new StringBuilder()).append("onPurchaseResponse: status = ").append(purchaseresponse.getRequestStatus().toString()).toString());
            receipt = null;
            _cls5.b[purchaseresponse.getRequestStatus().ordinal()];
            JVM INSTR tableswitch 1 4: default 76
        //                       1 162
        //                       2 331
        //                       3 520
        //                       4 558;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            boolean flag;
            com.pandora.android.iap.b.k(a);
            com.pandora.android.iap.b.a(a);
            flag = flag1;
_L8:
            if (flag)
            {
                purchaseresponse = (new PandoraIntent("cmd_show_iap_error_dialog")).putExtra("intent_iap_error_dialog_type", d.c.b.toString());
                com.pandora.android.provider.b.a.C().a(purchaseresponse);
                com.pandora.android.iap.b.k(a);
                com.pandora.android.iap.b.a(a);
            }
            com.pandora.android.provider.b.a.e().a(new p.bz.c());
            return;
_L2:
            Receipt receipt1;
            com.pandora.android.iap.b.d((new StringBuilder()).append("mActivePurchaseSku: ").append(com.pandora.android.iap.b.i(a)).toString());
            receipt1 = (Receipt)com.pandora.android.iap.b.j(a).get(com.pandora.android.iap.b.i(a));
            com.pandora.android.iap.b.d((new StringBuilder()).append("check key result in: ").append(receipt1).toString());
            receipt = receipt1;
            if (receipt1 != null) goto _L3; else goto _L6
_L6:
            receipt = receipt1;
            if (!a.b().equals(com.pandora.android.iap.b.i(a))) goto _L3; else goto _L7
_L7:
            Iterator iterator = com.pandora.android.iap.b.j(a).values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_588;
                }
                receipt = (Receipt)iterator.next();
            } while (receipt.getProductType() != ProductType.SUBSCRIPTION);
_L9:
            com.pandora.android.iap.b.d((new StringBuilder()).append("check subscription result in: ").append(receipt).toString());
_L3:
            if (receipt == null)
            {
                receipt = purchaseresponse.getReceipt();
            }
            if (receipt == null)
            {
                flag = true;
            } else
            {
                com.pandora.android.iap.b.j(a).put(receipt.getSku(), receipt);
                a.b(purchaseresponse.getUserData().getUserId());
                purchaseresponse = purchaseresponse.getUserData().getUserId();
                com.pandora.android.iap.b.d(String.format("onPurchaseResponse: user = %s, token = %s, sku = %s", new Object[] {
                    purchaseresponse, receipt.getReceiptId(), receipt.getSku()
                }));
                if (receipt.getProductType() == ProductType.SUBSCRIPTION)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.pandora.android.iap.b.e(a).a("AMAZON_PURCHASE_TOKEN", receipt.getReceiptId());
                com.pandora.android.iap.b.e(a).a("AMAZON_PURCHASE_SKU", receipt.getSku());
                if (flag)
                {
                    a.a(true, receipt.getReceiptId(), receipt.getSku());
                }
                com.pandora.android.iap.b.a(a, purchaseresponse, receipt.getReceiptId(), receipt.getSku(), receipt.getProductType());
                flag = flag1;
            }
              goto _L8
_L4:
            Toast.makeText(com.pandora.android.iap.b.g(a), 0x7f08009c, 0).show();
            com.pandora.android.iap.b.k(a);
            com.pandora.android.iap.b.a(a);
            flag = flag1;
              goto _L8
_L5:
            s.e(com.pandora.android.iap.b.g(a));
            com.pandora.android.iap.b.k(a);
            com.pandora.android.iap.b.a(a);
              goto _L1
            receipt = receipt1;
              goto _L9
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseupdatesresponse)
        {
            com.pandora.android.iap.b.c((new StringBuilder()).append("onPurchaseUpdatesResponse: ").append(purchaseupdatesresponse).toString());
            com.pandora.android.iap.b.a(a, purchaseupdatesresponse.getRequestStatus());
            if (purchaseupdatesresponse.getRequestStatus() == com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL)
            {
                Iterator iterator = purchaseupdatesresponse.getReceipts().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Receipt receipt = (Receipt)iterator.next();
                    p.df.a.c("AmazonInAppPurchasing", (new StringBuilder()).append("onPurchaseUpdatesResponse got receipt[%s] : ").append(receipt.toString()).toString(), new Object[] {
                        receipt.getSku()
                    });
                    if (receipt.getCancelDate() == null)
                    {
                        com.pandora.android.iap.b.j(a).put(receipt.getSku(), receipt);
                    }
                } while (true);
                if (purchaseupdatesresponse.hasMore())
                {
                    a.a(true);
                    return;
                }
            }
            com.pandora.android.iap.b.l(a);
        }

        public void onUserDataResponse(UserDataResponse userdataresponse)
        {
            com.pandora.android.iap.b.d((new StringBuilder()).append("onUserDataResponse: ").append(userdataresponse.getRequestStatus().toString()).toString());
            if (userdataresponse.getRequestStatus() == com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL)
            {
                a.b(userdataresponse.getUserData().getUserId());
                com.pandora.android.iap.b.h(a);
            }
        }

        private a()
        {
            a = com.pandora.android.iap.b.this;
            super();
        }

    }

    public static interface b
    {

        public abstract void a(String s1, String s2, String s3, ProductType producttype);
    }


    protected b a;
    protected PurchasingListener b;
    b c;
    private Context d;
    private String e;
    private String f;
    private Product g;
    private Product h;
    private boolean i;
    private String j;
    private final f k;
    private HashMap l;
    private String m;
    private com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus n;

    com.pandora.android.iap.b(Context context)
    {
        l = new HashMap();
        a = null;
        m = null;
        n = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED;
        c = new b() {

            final com.pandora.android.iap.b a;

            public void a(String s1, String s2, String s3, ProductType producttype)
            {
                com.pandora.android.iap.b.c((new StringBuilder()).append("purchaseFromPandora: sku = ").append(s3).append("; receiptId = ").append(s2).append("; productType = ").append(producttype).toString());
                if (s3 == null || producttype == null) goto _L2; else goto _L1
_L1:
                com.pandora.android.iap._cls5.a[producttype.ordinal()];
                JVM INSTR tableswitch 1 2: default 80
            //                           1 81
            //                           2 119;
                   goto _L2 _L3 _L4
_L2:
                return;
_L3:
                (new x(new p.cm.x.a(this, s3, s2) {

                    final String a;
                    final String b;
                    final _cls4 c;

                    public void a(boolean flag)
                    {
                        com.pandora.android.iap.b.a(c.a, a, b);
                        if (flag)
                        {
                            c.a.a(b, FulfillmentResult.FULFILLED);
                            com.pandora.android.provider.b.a.b().x().a("amazonSubscriptionPending", Boolean.valueOf(false));
                            com.pandora.android.provider.b.a.d().a(false);
                            PandoraIntent pandoraintent = new PandoraIntent("hide_banner_ad");
                            com.pandora.android.provider.b.a.C().a(pandoraintent);
                            com.pandora.android.provider.b.a.C().a(new PandoraIntent("iap_complete"));
                            com.pandora.android.provider.b.a.b().k().a(null);
                            return;
                        } else
                        {
                            com.pandora.android.provider.b.a.C().a(new PandoraIntent("iap_error"));
                            com.pandora.android.iap.b.c("subscriptions unavailable");
                            Intent intent = (new PandoraIntent("cmd_show_iap_error_dialog")).putExtra("intent_iap_error_dialog_type", d.c.b.toString());
                            com.pandora.android.provider.b.a.C().a(intent);
                            return;
                        }
                    }

            
            {
                c = _pcls4;
                a = s1;
                b = s2;
                super();
            }
                })).execute(new Object[] {
                    s2, s1, s3
                });
                return;
_L4:
                (new w(new p.cm.w.a(this, s3, s2) {

                    final String a;
                    final String b;
                    final _cls4 c;

                    public void a(boolean flag)
                    {
                        com.pandora.android.iap.b.a(c.a, a, b);
                        com.pandora.android.provider.b.a.b().x().a("amazonEndOfMonthPending", Boolean.valueOf(false));
                        if (flag)
                        {
                            c.a.a(b, FulfillmentResult.FULFILLED);
                            Toast.makeText(com.pandora.android.iap.b.g(c.a), 0x7f08009b, 1).show();
                            PandoraIntent pandoraintent = new PandoraIntent("iap_complete");
                            com.pandora.android.provider.b.a.C().a(pandoraintent);
                            return;
                        } else
                        {
                            com.pandora.android.provider.b.a.C().a(new PandoraIntent("iap_error"));
                            com.pandora.android.iap.b.c("subscriptions unavailable");
                            Intent intent = (new PandoraIntent("cmd_show_iap_error_dialog")).putExtra("intent_iap_error_dialog_type", d.c.b.toString());
                            com.pandora.android.provider.b.a.C().a(intent);
                            com.pandora.android.provider.b.a.b().j().a(true);
                            return;
                        }
                    }

            
            {
                c = _pcls4;
                a = s1;
                b = s2;
                super();
            }
                })).execute(new Object[] {
                    s2, s1, s3
                });
                return;
            }

            
            {
                a = com.pandora.android.iap.b.this;
                super();
            }
        };
        d = context.getApplicationContext();
        k = com.pandora.android.provider.b.a.b().x();
        i = k.a("KEY_AMAZON_SUBSCRIBER").booleanValue();
        j = k.b("AMAZON_PURCHASE_USER");
        d((new StringBuilder()).append("constructor: isAmazonSubscriber = ").append(i).append("; userId = ").append(j).toString());
        a = c;
        a(d, new a());
        com.pandora.android.provider.b.a.b().b(this);
        StringBuilder stringbuilder = (new StringBuilder()).append("onSdkAvailable: sandbox mode = ");
        if (PurchasingService.IS_SANDBOX_MODE)
        {
            context = "true";
        } else
        {
            context = "false";
        }
        d(stringbuilder.append(context).toString());
    }

    static Product a(com.pandora.android.iap.b b1, Product product)
    {
        b1.g = product;
        return product;
    }

    static com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus a(com.pandora.android.iap.b b1, com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requeststatus)
    {
        b1.n = requeststatus;
        return requeststatus;
    }

    static String a(com.pandora.android.iap.b b1, String s1)
    {
        b1.m = s1;
        return s1;
    }

    private void a(Context context, PurchasingListener purchasinglistener)
    {
        b = purchasinglistener;
        PurchasingService.registerListener(context, purchasinglistener);
    }

    static void a(com.pandora.android.iap.b b1)
    {
        b1.q();
    }

    static void a(com.pandora.android.iap.b b1, Activity activity)
    {
        b1.c(activity);
    }

    static void a(com.pandora.android.iap.b b1, String s1, String s2)
    {
        b1.a(s1, s2);
    }

    static void a(com.pandora.android.iap.b b1, String s1, String s2, String s3, ProductType producttype)
    {
        b1.a(s1, s2, s3, producttype);
    }

    private void a(String s1, String s2)
    {
        f f1 = com.pandora.android.provider.b.a.b().x();
        f1.c("AMAZON_PURCHASE_TOKEN");
        f1.c("AMAZON_PURCHASE_SKU");
        f1.a("AMAZON_PURCHASED_SKU", s1);
        f1.a("AMAZON_PURCHASED_TOKEN", s2);
    }

    private void a(String s1, String s2, String s3, ProductType producttype)
    {
        a.a(s1, s2, s3, producttype);
        a = c;
    }

    public static void a(String s1, Throwable throwable)
    {
        p.df.a.c("AmazonInAppPurchasing", (new StringBuilder()).append("AmazonInAppPurchasing - ").append(s1).toString(), throwable);
    }

    static Product b(com.pandora.android.iap.b b1, Product product)
    {
        b1.h = product;
        return product;
    }

    static String b(com.pandora.android.iap.b b1)
    {
        return b1.e;
    }

    static String c(com.pandora.android.iap.b b1)
    {
        return b1.f;
    }

    private void c(Activity activity)
    {
        k.a("amazonEndOfMonthPending", Boolean.valueOf(true));
        e(activity);
        (new p.cm.f()).execute(new Object[] {
            Boolean.valueOf(true)
        });
    }

    public static void c(String s1)
    {
        p.df.a.a("AmazonInAppPurchasing", (new StringBuilder()).append("AmazonInAppPurchasing - ").append(s1).toString());
    }

    private void d(Activity activity)
    {
        c("purchaseSubscriptionFromAmazon");
        k.a("amazonSubscriptionPending", Boolean.valueOf(true));
        e(activity);
        (new p.cm.f()).execute(new Object[] {
            Boolean.valueOf(false)
        });
    }

    public static void d(String s1)
    {
        a(s1, ((Throwable) (null)));
    }

    static boolean d(com.pandora.android.iap.b b1)
    {
        return b1.i;
    }

    private ProductType e(String s1)
    {
        if (s1 != null)
        {
            if (s1.equals(f))
            {
                return ProductType.SUBSCRIPTION;
            }
            if (s1.equals(e))
            {
                return ProductType.CONSUMABLE;
            }
        }
        return null;
    }

    static f e(com.pandora.android.iap.b b1)
    {
        return b1.k;
    }

    private void e(Activity activity)
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("can_subscribe_result");
        com.pandora.android.provider.b.a.C().a(new BroadcastReceiver(activity) {

            final Activity a;
            final com.pandora.android.iap.b b;

            public void onReceive(Context context, Intent intent)
            {
label0:
                {
label1:
                    {
label2:
                        {
                            context = intent.getAction();
                            if (PandoraIntent.a("can_subscribe_result").equals(context))
                            {
                                com.pandora.android.provider.b.a.C().a(this);
                                boolean flag = intent.getBooleanExtra("intent_can_susbscribe", true);
                                boolean flag1 = intent.getBooleanExtra("intent_is_end_of_month", false);
                                com.pandora.android.iap.b.d((new StringBuilder()).append("subscribeUsingAmazon: canSubscribe ").append(flag).append(", hasAmazonSubscription ").append(b.d()).append(", isEndOfMonth ").append(flag1).toString());
                                if (flag1)
                                {
                                    context = com.pandora.android.iap.b.b(b);
                                } else
                                {
                                    context = com.pandora.android.iap.b.c(b);
                                }
                                if (!flag)
                                {
                                    break label0;
                                }
                                if (!com.pandora.android.iap.b.d(b))
                                {
                                    break label1;
                                }
                                intent = com.pandora.android.iap.b.e(b).b("AMAZON_PURCHASED_TOKEN");
                                if (!s.a(a))
                                {
                                    break label2;
                                }
                                com.pandora.android.activity.a.a(a, com.pandora.android.iap.b.f(b), intent, context);
                            }
                            return;
                        }
                        b.a(com.pandora.android.iap.b.f(b), intent, context);
                        return;
                    }
                    b.a(context);
                    return;
                }
                com.pandora.android.iap.b.c("subscriptions unavailable");
                s.e(com.pandora.android.iap.b.g(b));
            }

            
            {
                b = com.pandora.android.iap.b.this;
                a = activity;
                super();
            }
        }, pandoraintentfilter);
    }

    static String f(com.pandora.android.iap.b b1)
    {
        return b1.j;
    }

    static Context g(com.pandora.android.iap.b b1)
    {
        return b1.d;
    }

    static void h(com.pandora.android.iap.b b1)
    {
        b1.i();
    }

    private boolean h()
    {
        boolean flag;
        if (k.a("amazonEndOfMonthPending").booleanValue() || k.a("amazonSubscriptionPending").booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d((new StringBuilder()).append("hasPendingRequest: ").append(flag).toString());
        return flag;
    }

    static String i(com.pandora.android.iap.b b1)
    {
        return b1.m;
    }

    private void i()
    {
        j();
        String s1;
        String s2;
        if (g())
        {
            a(false);
        } else
        {
            o();
        }
        s1 = k.b("AMAZON_PURCHASE_TOKEN");
        s2 = k.b("AMAZON_PURCHASE_SKU");
        if (!s.a(s1) && !s.a(s2) && !s.a(j) || h())
        {
            a(j, s1, s2);
        }
    }

    static HashMap j(com.pandora.android.iap.b b1)
    {
        return b1.l;
    }

    private void j()
    {
        if (s.a(f) || s.a(e))
        {
            a("null sku!", new RuntimeException((new StringBuilder()).append("sku's cannot be null!  subscriptionMonthlySku: ").append(f).append("; consumableEndOfMonthP2PSku = ").append(e).toString()));
            return;
        } else
        {
            a(k());
            return;
        }
    }

    private Set k()
    {
        return new HashSet(Arrays.asList(new String[] {
            f, e
        }));
    }

    static void k(com.pandora.android.iap.b b1)
    {
        b1.n();
    }

    static void l(com.pandora.android.iap.b b1)
    {
        b1.o();
    }

    private boolean l()
    {
        return g != null && !s.a(j);
    }

    private boolean m()
    {
        return h != null && !s.a(j);
    }

    private void n()
    {
        k.c("AMAZON_PURCHASE_TOKEN");
        k.c("AMAZON_PURCHASE_SKU");
    }

    private void o()
    {
label0:
        {
            if (l.isEmpty())
            {
                break label0;
            }
            Iterator iterator = l.values().iterator();
            Receipt receipt;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                receipt = (Receipt)iterator.next();
            } while (receipt.getProductType() != ProductType.SUBSCRIPTION);
            a(true, receipt.getReceiptId(), receipt.getSku());
        }
    }

    private void p()
    {
        l.clear();
        n = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED;
    }

    private void q()
    {
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("iap_error"));
    }

    public void a()
    {
        c("refreshState");
        f();
    }

    protected void a(String s1)
    {
        PurchasingService.purchase(s1);
    }

    void a(String s1, FulfillmentResult fulfillmentresult)
    {
        PurchasingService.notifyFulfillment(s1, fulfillmentresult);
    }

    public void a(String s1, String s2, String s3)
    {
        a(s1, s2, s3, e(s3));
    }

    protected void a(Set set)
    {
        PurchasingService.getProductData(set);
    }

    protected void a(boolean flag)
    {
        PurchasingService.getPurchaseUpdates(false);
    }

    protected void a(boolean flag, String s1, String s2)
    {
        d((new StringBuilder()).append("setHasAmazonSubscription: setSubscriber = ").append(flag).append("; isAmazonSubscriber = ").append(i).append("; purchasedSku = ").append(s2).append("; token = ").append(s1).toString());
        i = flag;
        k.a("KEY_AMAZON_SUBSCRIBER", Boolean.valueOf(i));
        d((new StringBuilder()).append("setHasAmazonSubscription: updated isAmazonSubscriber to: ").append(i).toString());
        if (i)
        {
            k.a("AMAZON_PURCHASED_TOKEN", s1);
            k.a("AMAZON_PURCHASED_SKU", s2);
            c("setHasAmazonSubscription: saved sku and token to db");
            return;
        } else
        {
            k.c("AMAZON_PURCHASED_TOKEN");
            k.c("AMAZON_PURCHASED_SKU");
            c("setHasAmazonSubscription: deleted existing sku and token from the db");
            return;
        }
    }

    public boolean a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        d = activity;
        a = c;
        d((new StringBuilder()).append("purchaseSubscription: isSubscriber = ").append(i).toString());
        if (l()) goto _L2; else goto _L1
_L1:
        d("purchaseSubscription: isSubscriptionSkuAvailable = false");
        a();
        s.e(d);
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        m = b();
        d(activity);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public boolean a(Activity activity, String s1, b b1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        d = activity;
        if (e()) goto _L2; else goto _L1
_L1:
        a();
        s.f(d);
        q();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        (new e(com.pandora.android.provider.b.a.b().e(), new p.cm.e.a(s1, b1) {

            final String a;
            final b b;
            final com.pandora.android.iap.b c;

            public void a(boolean flag1, String s2)
            {
                com.pandora.android.iap.b.d((new StringBuilder()).append("CanPurchaseALaCarteProductTask[").append(flag1).append("]: reason: ").append(s2).toString());
                com.pandora.android.iap.b.a(c, a);
                if (flag1)
                {
                    c.a = b;
                    c.a(a);
                    return;
                } else
                {
                    s2 = (new PandoraIntent("cmd_show_iap_error_dialog")).putExtra("intent_iap_error_dialog_type", d.c.b.toString());
                    com.pandora.android.provider.b.a.C().a(s2);
                    com.pandora.android.iap.b.a(c);
                    return;
                }
            }

            
            {
                c = com.pandora.android.iap.b.this;
                a = s1;
                b = b2;
                super();
            }
        })).execute(new String[] {
            s1
        });
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public String b()
    {
        if (g != null)
        {
            return g.getSku();
        } else
        {
            return null;
        }
    }

    protected void b(String s1)
    {
        d((new StringBuilder()).append("setUserId: newUserId = ").append(s1).append(", userId = ").append(j).toString());
        if (!s.a(s1) && !s1.equals(j))
        {
            j = s1;
            k.a("AMAZON_PURCHASE_USER", j);
            p();
        }
    }

    public boolean b(Activity activity)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        d = activity;
        if (m()) goto _L2; else goto _L1
_L1:
        a();
        s.f(d);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a = c;
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("get_usage_result");
        com.pandora.android.provider.b.a.C().a(new BroadcastReceiver(activity) {

            final Activity a;
            final com.pandora.android.iap.b b;

            public void onReceive(Context context, Intent intent)
            {
label0:
                {
                    context = intent.getAction();
                    if (PandoraIntent.a("get_usage_result").equals(context))
                    {
                        com.pandora.android.provider.b.a.C().a(this);
                        boolean flag1 = intent.getBooleanExtra("intent_is_capped", false);
                        com.pandora.android.iap.b.d((new StringBuilder()).append("purchaseFromAmazon: isCapped: ").append(flag1).toString());
                        com.pandora.android.iap.b.a(b, b.c());
                        if (!flag1)
                        {
                            break label0;
                        }
                        com.pandora.android.iap.b.a(b, a);
                    }
                    return;
                }
                s.d(a);
            }

            
            {
                b = com.pandora.android.iap.b.this;
                a = activity;
                super();
            }
        }, pandoraintentfilter);
        (new q()).execute(new Object[] {
            (Void)null
        });
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public String c()
    {
        if (h != null)
        {
            return h.getSku();
        } else
        {
            return null;
        }
    }

    public boolean d()
    {
        return l() && i;
    }

    public boolean e()
    {
        return s.m();
    }

    protected void f()
    {
        PurchasingService.getUserData();
    }

    protected boolean g()
    {
        return n == com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED;
    }

    public void onInAppSubscriptionData(v v1)
    {
        if (!s.a(v1.a.a))
        {
            e = v1.a.a;
        }
        if (!s.a(v1.a.b))
        {
            f = v1.a.b;
        }
        c((new StringBuilder()).append("onInAppSubscriptionData: event.data.p2pSku = ").append(v1.a.a).toString());
        c((new StringBuilder()).append("onInAppSubscriptionData: event.data.monthlySku = ").append(v1.a.b).toString());
        a();
    }
}
