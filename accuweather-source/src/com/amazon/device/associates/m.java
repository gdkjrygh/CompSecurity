// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingService, ay, av, ar, 
//            ReceiptsRequest, SearchRequest, SearchByIdRequest, PurchaseRequest, 
//            x, ServiceStatusResponse, ShoppingListener, ReceiptsResponse, 
//            SearchResponse, SearchByIdResponse, PurchaseResponse, NoListenerException, 
//            RequestId, bg, bc, an, 
//            ShoppingServiceRequest, ShoppingServiceResponse

class m
    implements ShoppingService, ay
{

    private static final String a = com/amazon/device/associates/m.getName();
    private String b;
    private Context c;
    private Handler d;
    private ShoppingListener e;
    private Map f;

    protected m(Context context, boolean flag)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = new ConcurrentHashMap();
        b = "1.0.45.0";
        c = context;
        av.a(flag);
    }

    private RequestId a(ay.a a1, RequestId requestid, ShoppingServiceRequest shoppingservicerequest, ar ar1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ay.a.values().length];
                try
                {
                    a[ay.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[ay.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[ay.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ay.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ay.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ay.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ay.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return requestid;

        case 1: // '\001'
            ar1.a(requestid, this);
            return requestid;

        case 2: // '\002'
            ar1.a(requestid, (ReceiptsRequest)shoppingservicerequest, this);
            return requestid;

        case 3: // '\003'
            ar1.a(requestid, (SearchRequest)shoppingservicerequest, this);
            return requestid;

        case 4: // '\004'
            ar1.a(requestid, (SearchByIdRequest)shoppingservicerequest, this);
            return requestid;

        case 5: // '\005'
            ar1.a(requestid, (PurchaseRequest)shoppingservicerequest, this);
            return requestid;

        case 6: // '\006'
            ar1.b(requestid, this);
            return requestid;

        case 7: // '\007'
            ar1.c(requestid, this);
            break;
        }
        return requestid;
    }

    static RequestId a(m m1, ay.a a1, RequestId requestid, ShoppingServiceRequest shoppingservicerequest, ar ar1)
    {
        return m1.a(a1, requestid, shoppingservicerequest, ar1);
    }

    static Map a(m m1)
    {
        return m1.f;
    }

    private void a(ay.a a1, Object obj)
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        x.b(a, "No listener has been registered.");
_L10:
        return;
_L2:
        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 203
    //                   1 60
    //                   2 101
    //                   3 115
    //                   4 129
    //                   5 143;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L4:
        e.onServiceStatusResponse((ServiceStatusResponse)obj);
        return;
_L5:
        try
        {
            e.onReceiptsResponse((ReceiptsResponse)obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ay.a a1)
        {
            x.a(a, (new StringBuilder()).append("Error in callListener: ").append(a1).toString());
            return;
        }
_L6:
        e.onSearchResponse((SearchResponse)obj);
        return;
_L7:
        e.onSearchByIdResponse((SearchByIdResponse)obj);
        return;
_L8:
        e.onPurchaseResponse((PurchaseResponse)obj);
        a1 = (PurchaseResponse)obj;
        obj = a1.getReceipts();
        if (a1.getStatus() != PurchaseResponse.Status.SUCCESSFUL || obj == null) goto _L10; else goto _L9
_L9:
        if (((List) (obj)).size() <= 0) goto _L10; else goto _L11
_L11:
        a(ay.a.g, a1.getRequestId(), ((ShoppingServiceRequest) (null)));
        return;
_L3:
    }

    static void a(m m1, ay.a a1, Object obj)
    {
        m1.a(a1, obj);
    }

    static String c()
    {
        return a;
    }

    private void d()
        throws NoListenerException
    {
        if (e == null)
        {
            throw new NoListenerException();
        } else
        {
            return;
        }
    }

    public RequestId a(ay.a a1, RequestId requestid, ShoppingServiceRequest shoppingservicerequest)
    {
        if (shoppingservicerequest != null)
        {
            f.put(requestid.toString(), shoppingservicerequest);
        }
        return a(a1, requestid, shoppingservicerequest, av.a());
    }

    public String a()
    {
        return b;
    }

    protected void a(Context context, Intent intent)
    {
        av.c().a(context, intent, this);
    }

    public void a(ay.a a1, ShoppingServiceResponse shoppingserviceresponse)
    {
        d = bc.a();
        d.post(new Runnable(shoppingserviceresponse, a1) {

            final ShoppingServiceResponse a;
            final ay.a b;
            final m c;

            public void run()
            {
                RequestId requestid;
                ShoppingServiceRequest shoppingservicerequest;
                boolean flag1;
                requestid = a.getRequestId();
                shoppingservicerequest = (ShoppingServiceRequest)m.a(c).remove(requestid.toString());
                flag1 = a.a();
                if (shoppingservicerequest == null)
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                Object obj;
                PurchaseResponse purchaseresponse;
                if (!(shoppingservicerequest instanceof PurchaseRequest))
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                obj = (PurchaseRequest)shoppingservicerequest;
                purchaseresponse = (PurchaseResponse)a;
                if (((PurchaseRequest) (obj)).getPurchaseExperience() == null && purchaseresponse.getStatus() == PurchaseResponse.Status.INVALID_ID)
                {
                    flag1 = true;
                }
                obj = av.b();
                if (shoppingservicerequest == null || !flag1 || obj == null) goto _L2; else goto _L1
_L1:
                _cls1.a[b.ordinal()];
                boolean flag;
                JVM INSTR tableswitch 2 5: default 212
            //                           2 161
            //                           3 161
            //                           4 161
            //                           5 161;
                   goto _L2 _L3 _L3 _L3 _L3
_L3:
                m.a(c, b, requestid, shoppingservicerequest, ((ar) (obj)));
                flag = false;
                continue; /* Loop/switch isn't completed */
_L5:
                if (flag)
                {
                    try
                    {
                        m.a(c, b, a);
                        return;
                    }
                    catch (Exception exception)
                    {
                        x.a(m.c(), (new StringBuilder()).append("Error in sendResponse: ").append(exception).toString());
                    }
                }
                return;
_L2:
                flag = true;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                c = m.this;
                a = shoppingserviceresponse;
                b = a1;
                super();
            }
        });
    }

    public Context b()
    {
        return c;
    }

    public RequestId getReceipts(ReceiptsRequest receiptsrequest)
        throws NoListenerException
    {
        an.a(receiptsrequest, "request");
        d();
        return a(ay.a.b, new RequestId(), receiptsrequest);
    }

    public RequestId getServiceStatus()
        throws NoListenerException
    {
        d();
        return a(ay.a.a, new RequestId(), ((ShoppingServiceRequest) (null)));
    }

    public RequestId purchase(PurchaseRequest purchaserequest)
        throws NoListenerException
    {
        an.a(purchaserequest, "request");
        d();
        return a(ay.a.e, new RequestId(), purchaserequest);
    }

    public RequestId search(SearchRequest searchrequest)
        throws NoListenerException
    {
        an.a(searchrequest, "request");
        d();
        return a(ay.a.c, new RequestId(), searchrequest);
    }

    public RequestId searchById(SearchByIdRequest searchbyidrequest)
        throws NoListenerException
    {
        an.a(searchbyidrequest, "request");
        d();
        return a(ay.a.d, new RequestId(), searchbyidrequest);
    }

    public void setListener(ShoppingListener shoppinglistener)
    {
        an.a(shoppinglistener, "listener");
        e = shoppinglistener;
    }

}
