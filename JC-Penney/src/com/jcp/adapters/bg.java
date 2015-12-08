// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.c.u;
import com.jcp.c.v;
import com.jcp.g.a;
import com.jcp.productentity.PriceEntity;
import com.jcp.productentity.ProductDetailsImage;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ae;
import com.jcp.util.y;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bi, bh

public class bg extends BaseAdapter
    implements v
{

    private static final String a = com/jcp/adapters/bg.getSimpleName();
    private LayoutInflater b;
    private List c;
    private List d;
    private u e;

    public bg(Context context, List list)
    {
        c = list;
        d = new ArrayList();
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        a();
        e = new u(context);
        e.a(this);
    }

    private void a()
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            d.add(new ProductEntityContainer());
        }

    }

    public ProductEntityContainer a(int i)
    {
        return (ProductEntityContainer)d.get(i);
    }

    public void a(String s, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer == null)
        {
            return;
        } else
        {
            ae.d(a, (new StringBuilder()).append("Loaded : ").append(s).append(" Prod Id : ").append(productentitycontainer.getId()).toString());
            int i = c.indexOf(s);
            d.remove(i);
            d.add(i, productentitycontainer);
            notifyDataSetChanged();
            return;
        }
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        bi bi1;
        View view1;
        ProductEntityContainer productentitycontainer;
        viewgroup = null;
        ae.c(a, (new StringBuilder()).append("Position ").append(i).toString());
        productentitycontainer = a(i);
        if (view == null)
        {
            view1 = b.inflate(0x7f03008b, null);
            bi1 = new bi(null);
            com.jcp.adapters.bi.a(bi1, (ProgressBar)view1.findViewById(0x7f0e0334));
            com.jcp.adapters.bi.a(bi1, (RelativeLayout)view1.findViewById(0x7f0e0330));
            com.jcp.adapters.bi.a(bi1, (ImageView)view1.findViewById(0x7f0e0056));
            com.jcp.adapters.bi.a(bi1, (TextView)view1.findViewById(0x7f0e0292));
            bi.b(bi1, (TextView)view1.findViewById(0x7f0e0332));
            bi.c(bi1, (TextView)view1.findViewById(0x7f0e0333));
            bi.d(bi1, (TextView)view1.findViewById(0x7f0e00e8));
            view1.setTag(bi1);
        } else
        {
            bi1 = (bi)view.getTag();
            view1 = view;
        }
        if (!TextUtils.isEmpty(productentitycontainer.getId())) goto _L2; else goto _L1
_L1:
        ae.c(a, (new StringBuilder()).append("The url at ").append(i).append(" has not been loaded yet").toString());
        com.jcp.adapters.bi.a(bi1).setVisibility(4);
        bi.b(bi1).setVisibility(0);
        e.a((String)c.get(i), view1);
_L4:
        return view1;
_L2:
        boolean flag;
        ae.c(a, (new StringBuilder()).append("The url at ").append(i).append(" has  been loaded ").toString());
        bi.b(bi1).setVisibility(4);
        com.jcp.adapters.bi.a(bi1).setVisibility(0);
        Object obj1;
        if (productentitycontainer.getMarketingLabel() != null)
        {
            bi.c(bi1).setVisibility(0);
            bi.c(bi1).setText(productentitycontainer.getMarketingLabel());
        } else
        {
            bi.c(bi1).setVisibility(8);
        }
        if (productentitycontainer.getImages() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = productentitycontainer.getImages().iterator();
        do
        {
            if (!view.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (ProductDetailsImage)view.next();
        } while (!((ProductDetailsImage) (obj1)).getType().equals("PRIMARY"));
        view = ((ProductDetailsImage) (obj1)).getUrl();
_L5:
        ae.d(a, (new StringBuilder()).append("Image URL : ").append(view).toString());
        com.jcp.g.a.a().a(view).b(0x7f02017f).a(bi.d(bi1), new bh(this, bi1));
        flag = productentitycontainer.getManufacturerAdvertisedPrice();
        obj1 = productentitycontainer.getPrices().iterator();
        view = null;
        while (((Iterator) (obj1)).hasNext()) 
        {
            Object obj = (PriceEntity)((Iterator) (obj1)).next();
            if ("SALE".equalsIgnoreCase(((PriceEntity) (obj)).getType()))
            {
                obj = y.a(((PriceEntity) (obj)).getMax());
                view = viewgroup;
                viewgroup = ((ViewGroup) (obj));
            } else
            if ("ORIGINAL".equalsIgnoreCase(((PriceEntity) (obj)).getType()))
            {
                obj = y.a(((PriceEntity) (obj)).getMax());
                viewgroup = view;
                view = ((View) (obj));
            } else
            {
                View view2 = view;
                view = viewgroup;
                viewgroup = view2;
            }
            obj = viewgroup;
            viewgroup = view;
            view = ((View) (obj));
        }
        if (Boolean.valueOf(flag).booleanValue())
        {
            bi.e(bi1).setVisibility(8);
            bi.f(bi1).setVisibility(0);
            return view1;
        }
        ae.d(a, (new StringBuilder()).append("SALE : ").append(view).toString());
        if (!TextUtils.isEmpty(view))
        {
            bi.e(bi1).setText((new StringBuilder()).append("SALE $").append(view).toString());
        }
        ae.d(a, (new StringBuilder()).append("Original ").append(viewgroup).toString());
        if (!TextUtils.isEmpty(viewgroup))
        {
            bi.g(bi1).setText((new StringBuilder()).append("Original $").append(viewgroup).toString());
            return view1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        view = null;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

}
