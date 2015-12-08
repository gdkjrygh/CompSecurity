// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.android.slyce.f.a;
import com.android.slyce.k;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.adapters.ProductListAdapter;
import com.jcp.b.b;
import com.jcp.c.g;
import com.jcp.e.o;
import com.jcp.e.w;
import com.jcp.http.c;
import com.jcp.model.Product;
import com.jcp.pojo.CameraImageInfoResponse;
import com.jcp.pojo.ProductScan;
import com.jcp.pojo.ProductScanOrder;
import com.jcp.pojo.Response;
import com.jcp.pojo.SlyceSimilarSearchResponse;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productlistentity.ProductListEntityContainer;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.util.aa;
import com.jcp.util.ab;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.views.HorizontalListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.activities:
//            an, bx, bw, VisualSearchTutorialActivity

public class SlyceScanActivity extends an
    implements a, o, w
{

    private static final String a = com/jcp/activities/SlyceScanActivity.getSimpleName();
    private AnimationDrawable b;
    private g c;
    private k d;
    protected HorizontalListView lvScannedItems;
    protected View lytScannedItemsContainer;
    protected ImageView mCancelSearch;
    protected ImageView mSimilarSearchLoaderImage;
    protected View mSimilarSearchProgress;
    protected SurfaceView surfaceView;
    protected TextView tvScannedItems;

    public SlyceScanActivity()
    {
    }

    private SharedPreferences a(Activity activity)
    {
        return activity.getSharedPreferences("com.jcp.activities", 0);
    }

    static k a(SlyceScanActivity slycescanactivity)
    {
        return slycescanactivity.d;
    }

    private boolean a(ProductScan productscan, ProductListProductEntity productlistproductentity)
    {
        return productlistproductentity != null && productlistproductentity.getId() != null && (productlistproductentity.getId().equalsIgnoreCase(productscan.getProductId()) || productlistproductentity.getId().equalsIgnoreCase(productscan.getSku()));
    }

    private void b(ProductScanOrder productscanorder)
    {
        a(this).edit().putString("scannedItems", (new j()).a(productscanorder)).apply();
    }

    private void f(String s)
    {
        au.a(this, s, new bx(this));
    }

    private void h()
    {
        k();
        ab.a(true, "user cancel");
        if (d != null)
        {
            d.f();
        }
    }

    private ProductScanOrder i()
    {
        ProductScanOrder productscanorder;
        Object obj;
        obj = a(this);
        productscanorder = new ProductScanOrder();
        obj = ((SharedPreferences) (obj)).getString("scannedItems", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = (ProductScanOrder)aa.a(((String) (obj)), com/jcp/pojo/ProductScanOrder);
        return ((ProductScanOrder) (obj));
        ClassCastException classcastexception;
        classcastexception;
        g();
        return productscanorder;
    }

    private void j()
    {
        mSimilarSearchProgress.setVisibility(0);
        mSimilarSearchLoaderImage.setImageDrawable(b);
        b.start();
    }

    private void k()
    {
        mSimilarSearchProgress.setVisibility(8);
        b.stop();
    }

    public ProductListAdapter a(List list)
    {
        ArrayList arraylist;
        Object obj;
        int l;
        obj = i();
        l = ((ProductScanOrder) (obj)).getProductScans().size();
        arraylist = new ArrayList(list.size());
        if (l <= 0 || l != list.size()) goto _L2; else goto _L1
_L1:
        obj = ((ProductScanOrder) (obj)).getProductScans().iterator();
_L5:
        if (((Iterator) (obj)).hasNext())
        {
            ProductScan productscan1 = (ProductScan)((Iterator) (obj)).next();
            int i1 = 0;
            do
            {
                if (i1 >= list.size())
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (a(productscan1, (ProductListProductEntity)list.get(i1)))
                {
                    arraylist.add(list.get(i1));
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
          goto _L3
_L2:
        if (list.size() > 0)
        {
            arraylist.addAll(list);
            for (list = ((ProductScanOrder) (obj)).getProductScans().iterator(); list.hasNext();)
            {
                ProductScan productscan = (ProductScan)list.next();
                int j1 = 0;
                while (j1 < arraylist.size()) 
                {
                    if (a(productscan, (ProductListProductEntity)arraylist.get(j1)))
                    {
                        arraylist.remove(j1);
                    }
                    j1++;
                }
            }

        }
_L3:
        list = new ProductListAdapter(this, arraylist, null, null);
        list.b(true);
        list.d(true);
        return list;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected String a()
    {
        return "VISUALSEARCH";
    }

    public void a(float f1, float f2)
    {
        ae.e(a, "onTap");
    }

    public void a(long l)
    {
    }

    public void a(long l, String s, String s1)
    {
        ae.e(a, (new StringBuilder()).append("onCameraSlyceProgress: Progress: [").append(l).append("] Message: [").append(s).append("] Token: [").append(s1).append("]").toString());
    }

    public void a(Bitmap bitmap)
    {
        ae.e(a, "onSnap");
        ab.b("visual search");
        j();
        lytScannedItemsContainer.setVisibility(8);
    }

    public void a(com.android.slyce.d.b b1)
    {
        ae.e(a, (new StringBuilder()).append("onCameraSlyceRequestStage ").append(b1).toString());
    }

    public void a(com.android.slyce.j j1)
    {
        if (j1 == null || TextUtils.isEmpty(j1.b()))
        {
            ae.a(a, "Slyce returned a null barcode");
            return;
        }
        d.d();
        if (j1.a() == com.android.slyce.d.a.m)
        {
            ab.a("qr code", j1.b());
            ab.a(true);
            f(getResources().getString(0x7f070330));
            return;
        } else
        {
            j1 = j1.b().trim();
            ab.a("barcode", j1);
            ae.e(a, (new StringBuilder()).append("onCameraBarcodeDetected ").append(j1).toString());
            j();
            e(j1);
            return;
        }
    }

    public void a(ProductScan productscan)
    {
        ProductScanOrder productscanorder = i();
        if ((new HashSet(productscanorder.getProductScans())).contains(productscan))
        {
            productscanorder.getProductScans().remove(productscan);
        }
        productscanorder.getProductScans().add(0, productscan);
        b(productscanorder);
        a(productscanorder);
        lytScannedItemsContainer.setVisibility(0);
    }

    public void a(ProductScanOrder productscanorder)
    {
        c.f();
        ArrayList arraylist = new ArrayList();
        productscanorder = productscanorder.getProductScans().iterator();
        do
        {
            if (!productscanorder.hasNext())
            {
                break;
            }
            ProductScan productscan = (ProductScan)productscanorder.next();
            if (!TextUtils.isEmpty(productscan.getProductId()))
            {
                arraylist.add(productscan.getProductId());
            } else
            if (!TextUtils.isEmpty(productscan.getSku()))
            {
                arraylist.add(productscan.getSku());
            }
        } while (true);
        c.a(arraylist);
    }

    public void a(Response response)
    {
        boolean flag = true;
        if (response.getStatusCode() == 200)
        {
            d.e();
            response = (ProductEntityContainer)aa.a(response.getResponseBody(), com/jcp/productentity/ProductEntityContainer);
            if (response != null)
            {
                a(new ProductScan(response.getId(), response.getSkuId()));
            }
            flag = false;
        } else
        {
            k();
            f(getResources().getString(0x7f0700a3));
        }
        ab.a(flag);
    }

    public void a(String s)
    {
        ae.e(a, (new StringBuilder()).append("onCameraImageDetected ").append(s).toString());
        ab.b("print product search");
    }

    public void a(JSONArray jsonarray)
    {
        ae.e(a, "onCameraImageInfoReceived");
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        CameraImageInfoResponse cameraimageinforesponse;
        boolean flag;
        int l;
        l = 0;
        flag = true;
        cameraimageinforesponse = null;
_L4:
        boolean flag1;
        flag1 = flag;
        if (l >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        CameraImageInfoResponse cameraimageinforesponse1 = (CameraImageInfoResponse)aa.a(jsonarray.get(l).toString(), com/jcp/pojo/CameraImageInfoResponse);
        cameraimageinforesponse = cameraimageinforesponse1;
_L5:
        if (cameraimageinforesponse != null)
        {
            ProductScan productscan = new ProductScan(com.jcp.b.b.C(cameraimageinforesponse.getUrlWeb()), cameraimageinforesponse.getSku());
            a(productscan);
            c.a(Collections.singletonList(productscan.getProductId()));
            flag = false;
        }
        l++;
        if (true) goto _L4; else goto _L3
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
          goto _L5
_L2:
        flag1 = true;
_L3:
        if (flag1)
        {
            ab.a(true, "slyce error");
        }
        return;
    }

    public void a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            ae.a(a, "onCameraResultsReceived received null response");
            ab.a(true, "slyce error");
        } else
        {
            ae.e(a, (new StringBuilder()).append("onCameraResultsReceived ").append(jsonobject).toString());
            Object obj = (SlyceSimilarSearchResponse)aa.a(jsonobject.toString(), com/jcp/pojo/SlyceSimilarSearchResponse);
            if (obj != null)
            {
                jsonobject = new ArrayList();
                for (obj = ((SlyceSimilarSearchResponse) (obj)).getProducts().iterator(); ((Iterator) (obj)).hasNext(); jsonobject.add(((Product)((Iterator) (obj)).next()).getId())) { }
                ae.d(a, (new StringBuilder()).append("Slyce returned ").append(jsonobject.size()).append(" products").toString());
                if (jsonobject.isEmpty())
                {
                    c();
                    return;
                }
                if (jsonobject.size() == 1)
                {
                    d((String)jsonobject.get(0));
                    return;
                } else
                {
                    c.a(jsonobject);
                    return;
                }
            }
        }
    }

    public void a(boolean flag)
    {
        ae.e(a, (new StringBuilder()).append("onCameraPreviewMode, front = ").append(flag).toString());
    }

    public void a_(int l)
    {
        com.jcp.b.a.i();
        k();
        ab.a(true, "api error");
        au.a(this, getResources().getString(0x7f0701bb), getResources().getString(0x7f07023b));
    }

    public void b(String s)
    {
        ae.e(a, (new StringBuilder()).append("onSlyceCameraError ").append(s).toString());
        a_(500);
        ab.a(true, "slyce error");
    }

    public void b(JSONObject jsonobject)
    {
        ae.e(a, "OnCameraBarcodeInfoReceived");
        if (jsonobject != null)
        {
            jsonobject = jsonobject.toString();
            if (!TextUtils.isEmpty(jsonobject))
            {
                ae.e(a, (new StringBuilder()).append("BarcodeInfo = ").append(jsonobject).toString());
            }
        }
    }

    public void c()
    {
        k();
        ab.a(true, "api error");
        au.a(this, getResources().getString(0x7f0702af), getResources().getString(0x7f0702ae));
    }

    public void c(String s)
    {
        k();
        s = (ProductListEntityContainer)aa.a(s, com/jcp/productlistentity/ProductListEntityContainer);
        boolean flag;
        if (s != null && s.getProducts() != null && !s.getProducts().isEmpty())
        {
            ae.d(a, (new StringBuilder()).append("imageSearchMultipleItemsFound products found = ").append(s.getCount()).toString());
            s = a(s.getProducts());
            lvScannedItems.setAdapter(s);
            tvScannedItems.setText(String.format("Scanned Items (%d)", new Object[] {
                Integer.valueOf(s.getCount())
            }));
            if (s.getCount() > 0)
            {
                lytScannedItemsContainer.setVisibility(0);
            }
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            c();
            return;
        } else
        {
            ab.a(false);
            return;
        }
    }

    public void d(String s)
    {
        k();
        if (!TextUtils.isEmpty(s))
        {
            ae.d(a, (new StringBuilder()).append("imageSearchSingleItemFound ppId = ").append(s).toString());
            ab.a(false);
            setResult(-1, ab.a(s));
            finish();
            return;
        } else
        {
            c();
            return;
        }
    }

    public void d_()
    {
        ae.e(a, "onCameraFinished");
    }

    public void e(String s)
    {
        c c1 = new c(this, this);
        c1.b(0);
        c1.a(43);
        c1.a(true);
        c1.b(com.jcp.b.b.a(s, b.i));
        c1.execute(new String[0]);
    }

    public void g()
    {
        a(this).edit().remove("scannedItems").apply();
    }

    public void onCaptureClick()
    {
        if (d != null)
        {
            d.a();
        }
    }

    public void onClearScannedItemsClick()
    {
        g();
        lvScannedItems.setAdapter(a(new ArrayList()));
        lytScannedItemsContainer.setVisibility(8);
    }

    public void onCloseClick()
    {
        h();
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030025);
        ButterKnife.inject(this);
        b = new AnimationDrawable();
        com.jcp.util.a.a(b, mSimilarSearchLoaderImage, this);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        c = new g(this, this);
        d = new k(this, JCP.w(), surfaceView, null, this);
        d.b(true);
        d.a(false);
        a(i());
        lvScannedItems.setOnItemClickListener(new bw(this));
        mCancelSearch.setVisibility(8);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        c.d();
    }

    public void onFlipCameraClick()
    {
        if (d != null)
        {
            d.g();
        }
    }

    public void onHelpClick()
    {
        startActivity(new Intent(this, com/jcp/activities/VisualSearchTutorialActivity));
    }

    protected void onPause()
    {
        super.onPause();
        if (d != null)
        {
            d.c();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (d != null)
        {
            d.b();
        }
    }

}
