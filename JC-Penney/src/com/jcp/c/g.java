// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.os.AsyncTask;
import com.android.slyce.a;
import com.android.slyce.f.c;
import com.android.slyce.u;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.e.o;
import com.jcp.e.w;
import com.jcp.model.Product;
import com.jcp.pojo.Response;
import com.jcp.pojo.SlyceSimilarSearchResponse;
import com.jcp.productentity.PriceEntity;
import com.jcp.productentity.ProductDetailsImage;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productlistentity.ProductListEntityContainer;
import com.jcp.productlistentity.ProductListImageEntity;
import com.jcp.productlistentity.ProductListPriceEntity;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.util.aa;
import com.jcp.util.ab;
import com.jcp.util.ae;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public class g extends com.jcp.c.b
    implements c, w
{

    private static final String a = com/jcp/c/g.getName();
    private int b;
    private int c;
    private List d;
    private WeakReference e;
    private u f;
    private com.jcp.http.c g;

    public g(Context context, o o1)
    {
        d = new ArrayList();
        a(context);
        a(o1);
        b = 0;
        c = 0;
        e = new WeakReference(JCP.w());
        if (e.get() == null)
        {
            throw new UnsupportedOperationException("Slyce object must be initialized");
        } else
        {
            return;
        }
    }

    private ProductListImageEntity a(ProductDetailsImage productdetailsimage)
    {
        ProductListImageEntity productlistimageentity = new ProductListImageEntity();
        productlistimageentity.setUrl(productdetailsimage.getUrl());
        productlistimageentity.setSwatchUrl(productdetailsimage.getSwatchUrl());
        productlistimageentity.setType(productdetailsimage.getType());
        productlistimageentity.setAltText(productdetailsimage.getAltText());
        return productlistimageentity;
    }

    private ProductListPriceEntity a(PriceEntity priceentity)
    {
        ProductListPriceEntity productlistpriceentity = new ProductListPriceEntity();
        productlistpriceentity.setType(priceentity.getType());
        productlistpriceentity.setMin(priceentity.getMin());
        productlistpriceentity.setMax(priceentity.getMax());
        return productlistpriceentity;
    }

    private ProductListProductEntity a(ProductEntityContainer productentitycontainer)
    {
        ProductListProductEntity productlistproductentity = new ProductListProductEntity();
        productlistproductentity.setId(productentitycontainer.getId());
        productlistproductentity.setUrl(productentitycontainer.getUrl());
        productlistproductentity.setName(productentitycontainer.getName());
        productlistproductentity.setIsNew(Boolean.valueOf(productentitycontainer.getIsNew()));
        productlistproductentity.setIsPreOrder(Boolean.valueOf(productentitycontainer.getIsPreOrder()));
        productlistproductentity.setMarketingLabel(productentitycontainer.getMarketingLabel());
        productlistproductentity.setBrandLogoUrl(productentitycontainer.getBrandLogoUrl());
        productlistproductentity.setRating(productentitycontainer.getRating());
        productlistproductentity.setReviewCount(productentitycontainer.getReviewCount());
        Object obj1 = productentitycontainer.getImages();
        if (obj1 != null && ((List) (obj1)).size() > 0)
        {
            List list = productlistproductentity.getImages();
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); list.add(a((ProductDetailsImage)((Iterator) (obj1)).next()))) { }
        }
        Object obj = productentitycontainer.getPrices();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            productentitycontainer = productlistproductentity.getPrices();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); productentitycontainer.add(a((PriceEntity)((Iterator) (obj)).next()))) { }
        }
        return productlistproductentity;
    }

    private String b(List list)
    {
        list = c(list);
        if (list == null || list.size() <= 0)
        {
            return null;
        } else
        {
            ProductListEntityContainer productlistentitycontainer = new ProductListEntityContainer();
            productlistentitycontainer.setProducts(list);
            productlistentitycontainer.setCount(Integer.valueOf(list.size()));
            return (new j()).a(productlistentitycontainer, com/jcp/productlistentity/ProductListEntityContainer);
        }
    }

    private List c(List list)
    {
        Object obj = null;
        ArrayList arraylist = obj;
        if (list != null)
        {
            arraylist = obj;
            if (list.size() > 0)
            {
                arraylist = new ArrayList();
                for (list = list.iterator(); list.hasNext(); arraylist.add(a((ProductEntityContainer)list.next()))) { }
            }
        }
        return arraylist;
    }

    private void d(String s)
    {
        d.add(aa.a(s, com/jcp/productentity/ProductEntityContainer));
    }

    public void a()
    {
        ae.e(a, "onFinished");
    }

    public void a(long l, String s, String s1)
    {
        ae.e(a, (new StringBuilder()).append("onSlyceProgress: Progress: [").append(l).append("] Message: [").append(s).append("] Token: [").append(s1).append("]").toString());
        if (c() != null)
        {
            ((o)c()).a(l);
        }
    }

    public void a(com.android.slyce.d.b b1)
    {
        ae.e(a, (new StringBuilder()).append("onSlyceRequestStage: Message: ").append(b1).toString());
    }

    public void a(com.android.slyce.j j1)
    {
        ae.e(a, (new StringBuilder()).append("onBarcodeDetected: Barcode Type: [").append(j1.a()).append("] Barcode: [").append(j1.b()).append("]").toString());
    }

    public void a(Response response)
    {
        int i;
        int k;
        i = response.getReJcpRequestTypes();
        k = response.getStatusCode();
        response = response.getResponseBody();
        ae.d(a, (new StringBuilder()).append("OnTaskCompleted->reqType: ").append(i).toString());
        ae.d(a, (new StringBuilder()).append("OnTaskCompleted->statusCode: ").append(k).toString());
        ae.d(a, (new StringBuilder()).append("OnTaskCompleted->response: ").append(response).toString());
        if (c() == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 54 54: default 120
    //                   54 121;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (g == null || !g.isCancelled())
        {
            d(response);
            c = c + 1;
            boolean flag;
            if (c == b)
            {
                response = b(d);
                flag = true;
            } else
            {
                response = null;
                flag = false;
            }
            if (flag)
            {
                boolean flag1;
                if (response != null)
                {
                    if (c() != null)
                    {
                        ((o)c()).c(response);
                        flag1 = false;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                {
                    if (c() != null)
                    {
                        ((o)c()).a_(k);
                    }
                    flag1 = true;
                }
                ab.a(flag1);
                return;
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void a(String s)
    {
        ae.e(a, (new StringBuilder()).append("onImageDetected: Product Info: ").append(s).toString());
    }

    public void a(List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L6:
        if (!list.hasNext()) goto _L2; else goto _L3
_L3:
        String s = (String)list.next();
        if (g == null || !g.isCancelled()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        g = new com.jcp.http.c(b(), this);
        g.a(54);
        g.b(0);
        g.a(true);
        g.b(com.jcp.b.b.a(s, b.i));
        g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        b = b + 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(JSONArray jsonarray)
    {
        ae.e(a, (new StringBuilder()).append("onImageInfoReceived: Products: ").append(jsonarray).toString());
    }

    public void a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            ae.a(a, "Slyce returned a null response");
            ab.a(true);
        } else
        {
            Object obj = (SlyceSimilarSearchResponse)aa.a(jsonobject.toString(), com/jcp/pojo/SlyceSimilarSearchResponse);
            if (obj != null)
            {
                jsonobject = new ArrayList();
                for (obj = ((SlyceSimilarSearchResponse) (obj)).getProducts().iterator(); ((Iterator) (obj)).hasNext(); jsonobject.add(((Product)((Iterator) (obj)).next()).getId())) { }
                ae.d(a, (new StringBuilder()).append("Slyce returned ").append(jsonobject.size()).append(" products").toString());
                if (c() != null)
                {
                    if (jsonobject.isEmpty())
                    {
                        ((o)c()).c();
                        return;
                    }
                    if (jsonobject.size() == 1)
                    {
                        ((o)c()).d((String)jsonobject.get(0));
                        return;
                    } else
                    {
                        a(((List) (jsonobject)));
                        return;
                    }
                }
            }
        }
    }

    public void b(String s)
    {
        ae.e(a, (new StringBuilder()).append("onError: Message: ").append(s).toString());
        ab.a(true);
        if (c() != null)
        {
            ((o)c()).a_(500);
        }
    }

    public void b(JSONObject jsonobject)
    {
        ae.e(a, (new StringBuilder()).append("onItemDescriptionReceived: Keywords: ").append(jsonobject).toString());
    }

    public void c(String s)
    {
        a a1 = (a)e.get();
        if (a1 != null && a1.e())
        {
            ab.a("similar items search", s);
            f = new u(a1, this, null);
            f.a(s);
        }
    }

    public void c(JSONObject jsonobject)
    {
        ae.e(a, "onBarcodeInfoReceived");
    }

    public void d()
    {
        a a1;
        try
        {
            a1 = (a)e.get();
        }
        catch (Exception exception)
        {
            ae.a(a, "Exception", exception);
            return;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        a1.f();
    }

    public void e()
    {
        if (g != null)
        {
            g.cancel(true);
        }
        if (f != null)
        {
            f.a();
        }
    }

    public void f()
    {
        if (d != null)
        {
            d.clear();
        }
    }

}
