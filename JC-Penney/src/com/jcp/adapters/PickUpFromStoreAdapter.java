// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.c.n;
import com.jcp.e.aq;
import com.jcp.g.a;
import com.jcp.h.f;
import com.jcp.h.g;
import com.jcp.http.b;
import com.jcp.storepickup.pojo.Inventory;
import com.jcp.storepickup.pojo.Items;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.ap;
import com.jcp.views.TypefaceButton;
import com.jcp.views.TypefaceTextView;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bo, bp, bq, br

public class PickUpFromStoreAdapter extends BaseAdapter
    implements aq
{

    private List a;
    private Context b;
    private LayoutInflater c;
    private n d;
    private Stores e;
    private int f;
    private List g;

    public PickUpFromStoreAdapter(Context context, List list)
    {
        g = new ArrayList();
        b = context;
        a = list;
        c = (LayoutInflater)b.getSystemService("layout_inflater");
        d = new n(b);
        d.a(this);
    }

    static int a(PickUpFromStoreAdapter pickupfromstoreadapter, int i)
    {
        pickupfromstoreadapter.f = i;
        return i;
    }

    static int a(PickUpFromStoreAdapter pickupfromstoreadapter, Stores stores)
    {
        return pickupfromstoreadapter.a(stores);
    }

    private int a(Stores stores)
    {
        int i = 0;
        int j;
        int k;
        for (j = 0; i < stores.getItems().size(); j = k)
        {
            k = j;
            if ("AVAILABLE".equalsIgnoreCase(((Items)stores.getItems().get(i)).getInventory().getPickupStatus()))
            {
                k = j + 1;
            }
            i++;
        }

        return j;
    }

    static n a(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        return pickupfromstoreadapter.d;
    }

    private String a(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() > 0)
            {
                s1 = s;
                if (s.contains(".tif"))
                {
                    s1 = s.replace(".tif", "");
                }
            }
        }
        return s1;
    }

    static int b(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        return pickupfromstoreadapter.f;
    }

    static Stores b(PickUpFromStoreAdapter pickupfromstoreadapter, Stores stores)
    {
        pickupfromstoreadapter.e = stores;
        return stores;
    }

    private void b(int i)
    {
        int j = 0;
        if (e.getItems() != null)
        {
            j = e.getItems().size();
        }
        com.jcp.h.g.a("SELECT THIS STORE", "Change Pickup Store", com.jcp.h.f.a((new StringBuilder()).append(e.getNumber()).append("|").append(j).append("|").append(i).toString()));
    }

    static void b(PickUpFromStoreAdapter pickupfromstoreadapter, int i)
    {
        pickupfromstoreadapter.b(i);
    }

    static List c(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        return pickupfromstoreadapter.a;
    }

    private List c(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(list);
        Collections.sort(arraylist, new bo(this));
        return arraylist;
    }

    private void c()
    {
        if (g.contains("Distance"))
        {
            a = c(a);
        } else
        if (g.contains("Product Availability"))
        {
            a = d(a);
            return;
        }
    }

    static Context d(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        return pickupfromstoreadapter.b;
    }

    private List d(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(list);
        Collections.sort(arraylist, new bp(this));
        return arraylist;
    }

    private void d()
    {
        if (b != null)
        {
            Intent intent = new Intent();
            intent.putExtra("checkout", Boolean.TRUE);
            intent.putExtra("type", "ActionBar");
            intent.putExtra("no_of_pickup_items", f);
            ((Activity)b).setResult(1000, intent);
            ((Activity)b).finish();
        }
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("Product Availability");
        arraylist.add("Distance");
        return arraylist;
    }

    public void a(int i)
    {
        if (com.jcp.http.b.a(i))
        {
            ap.a(b, e, true);
            e = null;
            d();
        }
    }

    public void a(List list)
    {
        if (!g.isEmpty())
        {
            g.clear();
        }
        g.addAll(list);
        c();
        notifyDataSetChanged();
    }

    public void b()
    {
        a.clear();
        notifyDataSetChanged();
    }

    public void b(List list)
    {
        a = list;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = 0;
        Stores stores = (Stores)getItem(i);
        String s;
        int k;
        if (view == null)
        {
            view = c.inflate(0x7f030042, null);
            viewgroup = new ViewHolder(view);
            ((ViewHolder) (viewgroup)).llview.setTag(Integer.valueOf(i));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        ((ViewHolder) (viewgroup)).nameView.setText(stores.getName());
        ((ViewHolder) (viewgroup)).streetView.setText(stores.getStreet());
        ((ViewHolder) (viewgroup)).hsvimages.setVisibility(0);
        ((ViewHolder) (viewgroup)).storepick.setVisibility(0);
        ((ViewHolder) (viewgroup)).itemsAvailable.setVisibility(0);
        s = String.format("%s, %s, %s", new Object[] {
            stores.getCity(), stores.getState(), stores.getZip()
        });
        ((ViewHolder) (viewgroup)).addressView.setText(s);
        ((ViewHolder) (viewgroup)).distanceView.setText(String.format(b.getString(0x7f070175), new Object[] {
            stores.getDistance()
        }));
        k = a(stores);
        if (k == 0)
        {
            ((ViewHolder) (viewgroup)).itemsAvailable.setTextColor(b.getResources().getColor(0x7f0d006c));
            ((ViewHolder) (viewgroup)).itemsAvailable.setText(b.getResources().getString(0x7f0703c1));
            ((ViewHolder) (viewgroup)).storepick.setVisibility(8);
            ((ViewHolder) (viewgroup)).hsvimages.setVisibility(8);
        } else
        if (stores.getItems().size() == 1)
        {
            ((ViewHolder) (viewgroup)).itemsAvailable.setVisibility(8);
            ((ViewHolder) (viewgroup)).hsvimages.setVisibility(8);
        } else
        {
            ((ViewHolder) (viewgroup)).itemsAvailable.setTextColor(b.getResources().getColor(0x7f0d00bb));
            ((ViewHolder) (viewgroup)).itemsAvailable.setText((new StringBuilder()).append(k).append(b.getResources().getString(0x7f0702be)).append(stores.getItems().size()).append(b.getResources().getString(0x7f070255)).toString());
            ((ViewHolder) (viewgroup)).hsvimages.setVisibility(0);
        }
        ((ViewHolder) (viewgroup)).llview.removeAllViews();
        for (; j < ((Stores)a.get(i)).getItems().size(); j++)
        {
            if ("AVAILABLE".equalsIgnoreCase(((Items)stores.getItems().get(j)).getInventory().getPickupStatus()))
            {
                ImageView imageview = new ImageView(b);
                Object obj = new android.widget.LinearLayout.LayoutParams(180, 180);
                ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(20, 10, 20, 20);
                imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                imageview.setBackgroundResource(0x7f0201ae);
                obj = ((Items)stores.getItems().get(j)).getImageUrl();
                com.jcp.g.a.a().a(a(((String) (obj)))).b(0x7f02017f).a(imageview);
                ((ViewHolder) (viewgroup)).llview.addView(imageview);
            }
        }

        ((ViewHolder) (viewgroup)).storepick.setOnClickListener(new bq(this, stores, i));
        ((ViewHolder) (viewgroup)).storeInfoLayout.setOnClickListener(new br(this, stores));
        return view;
    }

    private class ViewHolder
    {

        protected TypefaceTextView addressView;
        protected TypefaceTextView distanceView;
        protected HorizontalScrollView hsvimages;
        protected TextView itemsAvailable;
        protected LinearLayout llview;
        protected TypefaceTextView nameView;
        protected RelativeLayout storeInfoLayout;
        protected TypefaceButton storepick;
        protected TypefaceTextView streetView;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
