// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.e.q;
import com.jcp.fragments.el;
import com.jcp.g.a;
import com.jcp.model.ListenersForGallery;
import com.jcp.productentity.Videos;
import com.jcp.productlistentity.ProductListImageEntity;
import com.jcp.productlistentity.ProductListPriceEntity;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.util.y;
import com.jcp.views.JcpBrightcoveVideoView;
import com.jcp.widget.ProductRating;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            cb, cd, ca, cc

public class ProductListAdapter extends BaseAdapter
{

    private static WeakReference g;
    private static int h;
    private static View i;
    private static View j;
    private static boolean m;
    private static String n;
    private static boolean o;
    private static WeakReference p = new WeakReference(null);
    private WeakReference a;
    private final LayoutInflater b;
    private List c;
    private WeakReference d;
    private int e;
    private boolean f;
    private boolean k;
    private ListenersForGallery l;
    private int q;

    public ProductListAdapter(Context context, List list, el el1, q q1)
    {
        a = new WeakReference(null);
        d = new WeakReference(null);
        a = new WeakReference(context);
        c = list;
        d = new WeakReference(el1);
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        f = false;
        g = new WeakReference(q1);
        h = -1;
        l = new ListenersForGallery();
        o = false;
    }

    public static int a()
    {
        return h;
    }

    static int a(ProductListAdapter productlistadapter, int i1)
    {
        productlistadapter.e = i1;
        return i1;
    }

    private android.view.View.OnClickListener a(ProductListProductEntity productlistproductentity)
    {
        return new cb(this, productlistproductentity);
    }

    static String a(String s)
    {
        n = s;
        return s;
    }

    private static String a(String s, Context context)
    {
        if ("sale".equalsIgnoreCase(s))
        {
            return context.getResources().getString(0x7f070391);
        }
        if ("clearance".equalsIgnoreCase(s))
        {
            return context.getResources().getString(0x7f0700f7);
        } else
        {
            return "";
        }
    }

    static List a(ProductListAdapter productlistadapter)
    {
        return productlistadapter.c;
    }

    private static void a(TextView textview, ProductListPriceEntity productlistpriceentity, Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((int)productlistpriceentity.getMinPercentOff());
        if (productlistpriceentity.getMinPercentOff() != productlistpriceentity.getMaxPercentOff())
        {
            stringbuilder.append(context.getResources().getString(0x7f0702f9));
            stringbuilder.append((int)productlistpriceentity.getMaxPercentOff());
        }
        stringbuilder.append(context.getResources().getString(0x7f0702bf));
        textview.setText(stringbuilder.toString());
        textview.setVisibility(0);
    }

    private static void a(TextView textview, ProductListPriceEntity productlistpriceentity, String s, Context context)
    {
        s = new StringBuilder(s);
        s.append(y.a(productlistpriceentity.getMin()));
        if (productlistpriceentity.getMin() != productlistpriceentity.getMax())
        {
            s.append(context.getResources().getString(0x7f07014a));
            s.append(y.a(productlistpriceentity.getMax()));
        }
        textview.setText(s.toString());
    }

    private static void a(ViewHolder viewholder, View view, ProductListProductEntity productlistproductentity, int i1)
    {
        String s;
        if (productlistproductentity.getVideos() != null && productlistproductentity.getVideos().size() > 0)
        {
            s = ((Videos)productlistproductentity.getVideos().get(0)).getId();
        } else
        {
            s = null;
        }
        if (s != null && !s.isEmpty())
        {
            viewholder.btnvideoplay.setVisibility(0);
        } else
        {
            viewholder.btnvideoplay.setVisibility(8);
        }
        viewholder.btnvideoplay.setOnClickListener(new cd(productlistproductentity, s, view, i1, viewholder));
    }

    static void a(ProductListAdapter productlistadapter, ProductListProductEntity productlistproductentity)
    {
        productlistadapter.c(productlistproductentity);
    }

    static void a(ProductListAdapter productlistadapter, boolean flag, String s, int i1)
    {
        productlistadapter.a(flag, s, i1);
    }

    private void a(ProductListProductEntity productlistproductentity, ViewHolder viewholder)
    {
        productlistproductentity = productlistproductentity.getImages();
        if (productlistproductentity != null && productlistproductentity.size() > 0)
        {
            ProductListImageEntity productlistimageentity = (ProductListImageEntity)productlistproductentity.get(0);
            if (productlistimageentity != null && !TextUtils.isEmpty(productlistimageentity.getUrl()))
            {
                com.jcp.g.a.a().a(productlistimageentity.getUrl()).b(0x7f02017f).a(viewholder.productImage);
            }
            if (productlistproductentity.size() <= 2)
            {
                viewholder.color.setVisibility(8);
                return;
            } else
            {
                viewholder.color.setVisibility(0);
                viewholder.color.setText((new StringBuilder()).append(productlistproductentity.size() - 1).append(" Colors").toString());
                return;
            }
        } else
        {
            viewholder.color.setText("");
            return;
        }
    }

    public static void a(ProductListProductEntity productlistproductentity, ViewHolder viewholder, Context context)
    {
        Object obj;
        boolean flag;
        obj = productlistproductentity.getPrices();
        flag = productlistproductentity.getManufacturerAdvertisedPrice().booleanValue();
        if (obj == null || ((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        ProductListPriceEntity productlistpriceentity;
        if (!flag)
        {
            int j1 = Math.min(2, ((List) (obj)).size());
            int i1 = 0;
            while (i1 < j1) 
            {
                boolean flag1 = flag;
                if (i1 < ((List) (obj)).size())
                {
                    if (flag || com.jcp.b.a.b(((ProductListPriceEntity)((List) (obj)).get(i1)).getType()))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
                i1++;
                flag = flag1;
            }
        }
        productlistpriceentity = (ProductListPriceEntity)((List) (obj)).get(0);
        if (!com.jcp.b.a.b(productlistpriceentity.getType())) goto _L4; else goto _L3
_L3:
        boolean flag2;
        viewholder.salePrice.setVisibility(0);
        a(viewholder.salePrice, productlistpriceentity, a(productlistpriceentity.getType(), context), context);
        if (productlistpriceentity.getMinPercentOff() > 0.0D || productlistpriceentity.getMaxPercentOff() > 0.0D)
        {
            a(viewholder.percentOff, productlistpriceentity, context);
            flag2 = flag;
        } else
        {
            viewholder.percentOff.setVisibility(8);
            flag2 = flag;
        }
_L16:
        if (((List) (obj)).size() <= 1) goto _L6; else goto _L5
_L5:
        obj = (ProductListPriceEntity)((List) (obj)).get(1);
        if (!com.jcp.b.a.b(((ProductListPriceEntity) (obj)).getType()) && !productlistproductentity.getManufacturerAdvertisedPrice().booleanValue()) goto _L8; else goto _L7
_L7:
        viewholder.salePrice.setVisibility(0);
        if (productlistproductentity.getManufacturerAdvertisedPrice().booleanValue()) goto _L10; else goto _L9
_L9:
        a(viewholder.salePrice, ((ProductListPriceEntity) (obj)), a(((ProductListPriceEntity) (obj)).getType(), context), context);
        if (((ProductListPriceEntity) (obj)).getMinPercentOff() <= 0.0D && ((ProductListPriceEntity) (obj)).getMaxPercentOff() <= 0.0D) goto _L12; else goto _L11
_L11:
        a(viewholder.percentOff, ((ProductListPriceEntity) (obj)), context);
_L2:
        return;
_L4:
        if (flag)
        {
            a(viewholder.originalPrice, productlistpriceentity, context.getResources().getString(0x7f0702d3), context);
            flag = false;
        } else
        {
            a(viewholder.originalPrice, productlistpriceentity, context.getResources().getString(0x7f070176), context);
            viewholder.salePrice.setVisibility(8);
        }
        flag2 = flag;
        if (((List) (obj)).size() == 1)
        {
            flag2 = flag;
            if (productlistproductentity.getManufacturerAdvertisedPrice().booleanValue())
            {
                viewholder.salePrice.setVisibility(0);
                viewholder.salePrice.setText(context.getResources().getString(0x7f07046c));
                flag2 = flag;
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        viewholder.percentOff.setVisibility(8);
        return;
_L10:
        viewholder.salePrice.setText(context.getResources().getString(0x7f07046c));
        return;
_L8:
        if (!"sale".equalsIgnoreCase(((ProductListPriceEntity) (obj)).getType())) goto _L2; else goto _L13
_L13:
        if (flag2)
        {
            a(viewholder.salePrice, ((ProductListPriceEntity) (obj)), context.getResources().getString(0x7f0702d3), context);
            return;
        } else
        {
            a(viewholder.originalPrice, ((ProductListPriceEntity) (obj)), context.getResources().getString(0x7f070176), context);
            viewholder.salePrice.setVisibility(8);
            return;
        }
_L6:
        if (!productlistproductentity.getManufacturerAdvertisedPrice().booleanValue()) goto _L2; else goto _L14
_L14:
        viewholder.salePrice.setText(context.getResources().getString(0x7f07046c));
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static void a(String s, View view, int i1, ImageView imageview, ImageView imageview1, ViewHolder viewholder)
    {
        b(s, view, i1, imageview, imageview1, viewholder);
    }

    private void a(boolean flag, String s, int i1)
    {
        if (flag)
        {
            a(true);
        }
        ((el)d.get()).a(flag, s, i1);
    }

    private android.view.View.OnClickListener b(int i1)
    {
        return new ca(this, i1);
    }

    public static View b()
    {
        return j;
    }

    private String b(ProductListProductEntity productlistproductentity)
    {
        if (productlistproductentity != null)
        {
            productlistproductentity = productlistproductentity.getImages();
            if (productlistproductentity.size() > 0 && !TextUtils.isEmpty(((ProductListImageEntity)productlistproductentity.get(0)).getUrl()))
            {
                return ((ProductListImageEntity)productlistproductentity.get(0)).getUrl();
            }
        }
        return null;
    }

    private static void b(ProductListProductEntity productlistproductentity, ViewHolder viewholder)
    {
        if (productlistproductentity.getPromotionMessages().size() > 0)
        {
            viewholder.productPromotionMessage.setVisibility(0);
            viewholder.productPromotionMessage.setText((CharSequence)productlistproductentity.getPromotionMessages().get(0));
            return;
        } else
        {
            viewholder.productPromotionMessage.setVisibility(8);
            return;
        }
    }

    private static void b(String s, View view, int i1, ImageView imageview, ImageView imageview1, ViewHolder viewholder)
    {
        h = i1;
        i = view;
        m = true;
        if (viewholder.a == null)
        {
            viewholder.a = new JCPVideoStub(viewholder.stub.inflate());
        }
        viewholder.a.loaderLayout.setVisibility(0);
        viewholder.a.videoView.setVideoListener((q)g.get());
        viewholder.a.videoView.setTag((new StringBuilder()).append("video").append(i1).toString());
        viewholder.a.loaderLayout.setTag((new StringBuilder()).append("relative_loader").append(i1).toString());
        j = viewholder.a.loaderLayout;
        viewholder.a.videoView.setVisibility(0);
        imageview.setVisibility(8);
        imageview1.setVisibility(8);
        viewholder.a.videoView.a(s);
    }

    public static void c()
    {
        if (i != null)
        {
            JcpBrightcoveVideoView jcpbrightcovevideoview = (JcpBrightcoveVideoView)i.findViewWithTag((new StringBuilder()).append("video").append(h).toString());
            ImageView imageview = (ImageView)i.findViewWithTag((new StringBuilder()).append("list_image").append(h).toString());
            ImageView imageview1 = (ImageView)i.findViewWithTag((new StringBuilder()).append("play_button").append(h).toString());
            RelativeLayout relativelayout = (RelativeLayout)i.findViewWithTag((new StringBuilder()).append("relative_loader").append(h).toString());
            h = -1;
            i = null;
            n = null;
            m = false;
            if (jcpbrightcovevideoview != null)
            {
                jcpbrightcovevideoview.stopPlayback();
                jcpbrightcovevideoview.seekTo(0);
                jcpbrightcovevideoview.setVisibility(8);
            }
            if (imageview != null)
            {
                imageview.setVisibility(0);
            }
            if (imageview1 != null)
            {
                imageview1.setVisibility(0);
            }
            if (relativelayout != null)
            {
                relativelayout.setVisibility(8);
            }
        }
    }

    private void c(ProductListProductEntity productlistproductentity)
    {
        productlistproductentity = b(productlistproductentity);
        if (!TextUtils.isEmpty(productlistproductentity))
        {
            ((el)d.get()).e(productlistproductentity);
        }
    }

    private static void c(ProductListProductEntity productlistproductentity, ViewHolder viewholder)
    {
        viewholder.productRating.setProduct(productlistproductentity);
    }

    static WeakReference h()
    {
        return p;
    }

    static int i()
    {
        return h;
    }

    private boolean j()
    {
        return c.size() > e;
    }

    public View a(View view, ProductListProductEntity productlistproductentity, LayoutInflater layoutinflater, ListenersForGallery listenersforgallery, boolean flag, Context context, int i1)
    {
        ViewHolder viewholder;
        if (view == null)
        {
            int j1;
            if (o)
            {
                j1 = 0x7f0300c6;
            } else
            {
                j1 = 0x7f0300c5;
            }
            layoutinflater = layoutinflater.inflate(j1, null);
            viewholder = new ViewHolder(layoutinflater, null);
            layoutinflater.setTag(viewholder);
        } else
        {
            viewholder = (ViewHolder)view.getTag();
            layoutinflater = view;
        }
        viewholder.productImage.setTag((new StringBuilder()).append("list_image").append(i1).toString());
        if (!JCP.e().a(productlistproductentity.getId()).equals("null"))
        {
            productlistproductentity.setSaved(true);
        }
        viewholder.percentOff.setVisibility(8);
        viewholder.description.setText(productlistproductentity.getName());
        if (productlistproductentity.getMarketingLabel() != null)
        {
            viewholder.productMarketingLabel.setVisibility(0);
            viewholder.productMarketingLabel.setText(productlistproductentity.getMarketingLabel());
        } else
        {
            viewholder.productMarketingLabel.setVisibility(8);
        }
        if (productlistproductentity.getIsNew() != null && productlistproductentity.getIsNew().booleanValue())
        {
            viewholder.newImage.setVisibility(0);
        } else
        {
            viewholder.newImage.setVisibility(8);
        }
        a(productlistproductentity, viewholder);
        b(productlistproductentity, viewholder);
        a(productlistproductentity, viewholder, context);
        c(productlistproductentity, viewholder);
        if (!o)
        {
            viewholder.btnvideoplay.setTag((new StringBuilder()).append("play_button").append(i1).toString());
            a(viewholder, ((View) (layoutinflater)), productlistproductentity, i1);
            if (listenersforgallery.getSaveOnClick() == null)
            {
                viewholder.saveIcon.setVisibility(8);
            } else
            {
                if (productlistproductentity.isSaved())
                {
                    viewholder.saveIcon.setBackgroundResource(0x7f0201dd);
                    viewholder.saveIcon.setTag("checked");
                } else
                {
                    viewholder.saveIcon.setBackgroundResource(0x7f0201dc);
                    viewholder.saveIcon.setTag("unchecked");
                }
                viewholder.saveIcon.setOnClickListener(listenersforgallery.getSaveOnClick());
            }
            if (listenersforgallery.getSelectOnClick() == null || flag)
            {
                viewholder.searchSimilar.setVisibility(8);
            } else
            {
                viewholder.searchSimilar.setVisibility(0);
                viewholder.searchSimilar.setOnClickListener(listenersforgallery.getSelectOnClick());
            }
        }
        layoutinflater.setOnClickListener(new cc(this, view, i1));
        return layoutinflater;
    }

    public void a(int i1)
    {
        q = i1;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        p = new WeakReference(onitemclicklistener);
    }

    public void a(boolean flag)
    {
        if (c != null && c.get(e) != null)
        {
            com.jcp.h.a.a(flag, ((ProductListProductEntity)c.get(e)).getName());
        }
    }

    public void b(boolean flag)
    {
        k = flag;
    }

    public void c(boolean flag)
    {
        m = flag;
    }

    public void d(boolean flag)
    {
        o = flag;
    }

    public boolean d()
    {
        return m;
    }

    public String e()
    {
        return n;
    }

    public void e(boolean flag)
    {
        f = flag;
    }

    public void f()
    {
        if (j())
        {
            ((ProductListProductEntity)c.get(e)).setSaved(false);
            notifyDataSetChanged();
        }
    }

    public void g()
    {
        if (j())
        {
            ((ProductListProductEntity)c.get(e)).setSaved(true);
            notifyDataSetChanged();
        }
    }

    public int getCount()
    {
        if (c != null)
        {
            return c.size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i1)
    {
        if (c != null && i1 >= 0 && i1 < c.size())
        {
            return c.get(i1);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i1)
    {
        return 0L;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        Object obj = null;
        if (!k)
        {
            viewgroup = b(i1);
            obj = (ProductListProductEntity)c.get(i1);
            if (!((ProductListProductEntity) (obj)).isExcludedFromSimilarSearch())
            {
                android.view.View.OnClickListener onclicklistener = a(((ProductListProductEntity) (obj)));
                obj = viewgroup;
                viewgroup = onclicklistener;
            } else
            {
                Object obj1 = null;
                obj = viewgroup;
                viewgroup = obj1;
            }
        } else
        {
            viewgroup = null;
        }
        l.setSaveOnClick(((android.view.View.OnClickListener) (obj)));
        l.setSelectOnClick(viewgroup);
        return a(view, (ProductListProductEntity)c.get(i1), b, l, f, (Context)a.get(), i1);
    }


    private class ViewHolder
    {

        JCPVideoStub a;
        protected ImageView btnvideoplay;
        protected TextView color;
        protected TextView description;
        protected TextView newImage;
        protected TextView originalPrice;
        protected TextView percentOff;
        protected ImageView productImage;
        protected TextView productMarketingLabel;
        protected TextView productPromotionMessage;
        protected ProductRating productRating;
        protected TextView salePrice;
        protected ImageView saveIcon;
        protected TextView searchSimilar;
        protected ViewStub stub;

        private ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }

        ViewHolder(View view, ca ca1)
        {
            this(view);
        }
    }


    private class JCPVideoStub
    {

        protected RelativeLayout loaderLayout;
        protected ProgressBar videoLoader;
        protected JcpBrightcoveVideoView videoView;

        JCPVideoStub(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
