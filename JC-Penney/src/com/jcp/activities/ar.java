// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jcp.adapters.af;
import com.jcp.adapters.ah;
import com.jcp.adapters.ak;
import com.jcp.helper.y;
import com.jcp.model.ProductFilterModal;
import com.jcp.productfilter.pojo.Filters;
import com.jcp.productfilter.pojo.ProductList;
import com.jcp.productfilter.pojo.Values;
import com.jcp.util.z;
import com.jcp.views.c;
import com.jcp.views.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.jcp.activities:
//            an, au, as, at

public class ar extends an
    implements android.view.View.OnClickListener
{

    private ProductList a;
    private ScrollView b;
    private LinearLayout c;
    private TextView d;
    private TextView e;
    private TextView f;
    private List g;
    private Map h;
    private int i;
    private SharedPreferences j;

    public ar()
    {
        g = new ArrayList();
        h = new HashMap();
    }

    private void a(Filters filters, Typeface typeface, ProductFilterModal productfiltermodal)
    {
        RelativeLayout relativelayout = j();
        Object obj = new android.widget.RelativeLayout.LayoutParams(-1, (int)getResources().getDimension(0x7f0800f3));
        relativelayout.setBackgroundColor(getResources().getColor(0x7f0d0094));
        int i1 = (int)getResources().getDimension(0x7f0800e5);
        relativelayout.setPadding(i1, 0, i1, 0);
        relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = b(9, 15, filters.getName());
        ((TextView) (obj)).setTypeface(typeface);
        filters = d(filters, productfiltermodal);
        filters.setOnClickListener(new au(this));
        filters.setVisibility(8);
        relativelayout.addView(((View) (obj)));
        relativelayout.addView(filters);
        c.addView(relativelayout);
    }

    private void a(Filters filters, List list)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setPadding(15, 10, 15, 10);
        GridView gridview = new GridView(this);
        linearlayout.setLayoutParams(layoutparams);
        linearlayout.setBackgroundColor(getResources().getColor(0x106000b));
        gridview.setLayoutParams(layoutparams);
        gridview.setNumColumns(5);
        gridview.setVerticalSpacing(10);
        gridview.setHorizontalSpacing(10);
        gridview.setGravity(17);
        gridview.setStretchMode(2);
        gridview.setAdapter(new af(this, filters.getValues()));
        y.a(gridview, list.size());
        linearlayout.addView(gridview);
        c.addView(linearlayout);
    }

    private void a(List list)
    {
        list = list.listIterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Values values = (Values)list.next();
            if (values.isSelectedStatus())
            {
                values.setSelectedStatus(false);
            }
        } while (true);
    }

    private void a(boolean flag, Filters filters, List list, ProductFilterModal productfiltermodal)
    {
        Object obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        list = new LinearLayout(this);
        list.setPadding(15, 10, 15, 10);
        GridView gridview = new GridView(this);
        int i1 = i;
        i = i1 + 1;
        gridview.setId(i1);
        list.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        list.setBackgroundColor(getResources().getColor(0x106000b));
        gridview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        gridview.setNumColumns(3);
        gridview.setVerticalSpacing(10);
        gridview.setHorizontalSpacing(10);
        gridview.setGravity(17);
        gridview.setStretchMode(2);
        obj = filters.getValues();
        i1 = y.a(((List) (obj)));
        a(((List) (obj)));
        obj = new ah(this, ((List) (obj)), i1, filters.getName(), gridview, flag, false);
        gridview.setAdapter(((android.widget.ListAdapter) (obj)));
        y.a(gridview, ((ah) (obj)).getCount());
        list.addView(gridview);
        c.addView(list);
        productfiltermodal.setCustomFilterGridAdapter(((ah) (obj)));
        productfiltermodal.setGridView(gridview);
        h.put(filters.getName(), productfiltermodal);
    }

    static Map b(ar ar1)
    {
        return ar1.h;
    }

    private void b(Filters filters, ProductFilterModal productfiltermodal)
    {
        productfiltermodal = j();
        Object obj = i();
        int i1 = (int)getResources().getDimension(0x7f0800e9);
        int j1 = (int)getResources().getDimension(0x7f0800e9);
        productfiltermodal.setPadding(j1, i1, j1, i1);
        RelativeLayout relativelayout = j();
        relativelayout.setPadding(10, 10, 10, 10);
        relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        relativelayout.setId(1);
        obj = filters.getValues();
        filters = ((Values)((List) (obj)).get(0)).getName();
        obj = String.valueOf(((Values)((List) (obj)).get(((List) (obj)).size() - 1)).getName());
        filters = y.a(filters);
        obj = y.b(((String) (obj)));
        filters = a(9, 15, filters);
        obj = a(11, 15, ((String) (obj)));
        (new android.widget.RelativeLayout.LayoutParams(-1, -2)).addRule(3, 1);
        relativelayout.addView(filters);
        relativelayout.addView(((View) (obj)));
        productfiltermodal.addView(relativelayout);
        filters = a(this);
        filters.setPadding(10, 5, 10, 10);
        c.addView(productfiltermodal);
        c.addView(filters);
    }

    private void c(Filters filters, ProductFilterModal productfiltermodal)
    {
        Object obj = filters.getValues();
        ListView listview = new ListView(this);
        listview.setId(n());
        listview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        listview.setDivider(getResources().getDrawable(0x7f020165));
        listview.setDividerHeight(2);
        int i1 = y.a(((List) (obj)));
        a(((List) (obj)));
        obj = new ak(this, ((List) (obj)), i1, listview, filters.getName());
        productfiltermodal.setCustomFilterAdapter(((ak) (obj)));
        productfiltermodal.setId(listview.getId());
        listview.setAdapter(((android.widget.ListAdapter) (obj)));
        y.a(listview);
        c.addView(listview);
        productfiltermodal.setType(((ak) (obj)).a());
        h.put(filters.getName(), productfiltermodal);
    }

    private TextView d(Filters filters, ProductFilterModal productfiltermodal)
    {
        TextView textview = b(11, 15, "Clear");
        textview.setBackgroundDrawable(getResources().getDrawable(0x7f02008a));
        textview.setPadding(10, 10, 10, 10);
        textview.setClickable(true);
        textview.setTag(filters.getName());
        productfiltermodal.setClearTxv(textview);
        return textview;
    }

    private void m()
    {
        ActionBar actionbar = getActionBar();
        actionbar.setDisplayShowHomeEnabled(false);
        actionbar.setDisplayShowTitleEnabled(false);
        View view = LayoutInflater.from(this).inflate(0x7f030054, null);
        Typeface typeface = z.a(this, 5);
        d = (TextView)view.findViewById(0x7f0e021e);
        e = (TextView)view.findViewById(0x7f0e021f);
        f = (TextView)view.findViewById(0x7f0e0220);
        d.setOnClickListener(this);
        f.setOnClickListener(this);
        d.setTypeface(typeface);
        e.setTypeface(typeface);
        f.setTypeface(typeface);
        actionbar.setCustomView(view);
        actionbar.setDisplayShowCustomEnabled(true);
    }

    private int n()
    {
        return (new Random()).nextInt(100);
    }

    public android.widget.RelativeLayout.LayoutParams a(TextView textview)
    {
        return (android.widget.RelativeLayout.LayoutParams)textview.getLayoutParams();
    }

    public TextView a(int i1, int j1, String s)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = l();
        TextView textview = k();
        textview.setLayoutParams(layoutparams);
        layoutparams = a(textview);
        layoutparams.addRule(i1);
        layoutparams.addRule(j1);
        textview.setTextSize(2, 15F);
        textview.setTextColor(getResources().getColor(0x106000c));
        textview.setText(s);
        return textview;
    }

    public c a(ar ar1)
    {
        ar1 = new m(Integer.valueOf(200), Integer.valueOf(1000), Integer.valueOf(50), this);
        ar1.setOnRangeSeekBarChangeListener(new as(this));
        return ar1;
    }

    protected String a()
    {
        return "PRODUCTFILTER";
    }

    public void a(int i1, List list, GridView gridview, ah ah1, boolean flag, boolean flag1)
    {
        ah1.a(i1, flag, flag1);
        ah1.notifyDataSetChanged();
        y.a(gridview, ah1.getCount());
    }

    public void a(int i1, List list, ListView listview, ak ak1, boolean flag)
    {
        ak1.a(i1, flag);
        ak1.notifyDataSetChanged();
        y.a(listview);
    }

    protected void a(ProductFilterModal productfiltermodal, String s)
    {
        int i1 = y.c(s);
        if (productfiltermodal == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 0 4: default 44
    //                   0 60
    //                   1 44
    //                   2 45
    //                   3 44
    //                   4 108;
           goto _L2 _L3 _L2 _L4 _L2 _L5
_L2:
        return;
_L4:
        if ((productfiltermodal = productfiltermodal.getRatingBar()) != null)
        {
            productfiltermodal.setRating(0.0F);
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        boolean flag = a(s);
        s = productfiltermodal.getGridView();
        if (s != null)
        {
            a(productfiltermodal.getCustomFilterGridAdapter().a());
            a(productfiltermodal.getCustomFilterGridAdapter().b(), null, ((GridView) (s)), productfiltermodal.getCustomFilterGridAdapter(), true, flag);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        s = (ListView)findViewById(productfiltermodal.getId());
        if (s != null)
        {
            a(productfiltermodal.getCustomFilterAdapter().b());
            a(productfiltermodal.getCustomFilterAdapter().a(), null, ((ListView) (s)), productfiltermodal.getCustomFilterAdapter(), true);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a(Filters filters, ProductFilterModal productfiltermodal)
    {
        RatingBar ratingbar = new RatingBar(new ContextThemeWrapper(this, 0x7f090158));
        ratingbar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        ratingbar.setPadding(20, 0, 0, 0);
        ratingbar.setNumStars(filters.getValues().size() - 1);
        ratingbar.setStepSize(1.0F);
        ratingbar.setOnRatingBarChangeListener(new at(this, filters));
        productfiltermodal.setRatingBar(ratingbar);
        c.addView(ratingbar);
        h.put(filters.getName(), productfiltermodal);
    }

    public void a(String s, int i1)
    {
        if (i1 > 0)
        {
            ((ProductFilterModal)h.get(s)).getClearTxv().setVisibility(0);
            return;
        } else
        {
            ((ProductFilterModal)h.get(s)).getClearTxv().setVisibility(8);
            return;
        }
    }

    public void a(String s, String s1)
    {
        e.setText((new StringBuilder()).append(s1).append(" Results").toString());
    }

    public boolean a(String s)
    {
        boolean flag = false;
        if (s.equalsIgnoreCase("Top Construction"))
        {
            flag = true;
        }
        return flag;
    }

    public TextView b(int i1, int j1, String s)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = l();
        TextView textview = k();
        textview.setLayoutParams(layoutparams);
        layoutparams = a(textview);
        layoutparams.addRule(i1);
        layoutparams.addRule(j1);
        textview.setTextSize(getResources().getDimension(0x7f0800f4));
        textview.setTextColor(getResources().getColor(0x7f0d0092));
        textview.setText(s);
        textview.setClickable(true);
        return textview;
    }

    public void c()
    {
        g();
        h();
        m();
    }

    public void g()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        b = new ScrollView(this);
        c = new LinearLayout(this);
        c.setLayoutParams(layoutparams);
        c.setOrientation(1);
        c.setBackgroundColor(getResources().getColor(0x106000b));
        b.addView(c);
    }

    public void h()
    {
label0:
        do
        {
            for (ListIterator listiterator = a.getFilters().listIterator(); listiterator.hasNext();)
            {
                ProductFilterModal productfiltermodal = new ProductFilterModal();
                Filters filters = (Filters)listiterator.next();
                a(filters, z.a(this, 17), productfiltermodal);
                int i1 = y.c(filters.getName());
                if (filters != null)
                {
                    switch (i1)
                    {
                    case 0: // '\0'
                        a(a(filters.getName()), filters, g, productfiltermodal);
                        break;

                    case 2: // '\002'
                        a(filters, productfiltermodal);
                        break;

                    case 1: // '\001'
                        b(filters, productfiltermodal);
                        break;

                    case 3: // '\003'
                        a(filters, g);
                        break;

                    case 4: // '\004'
                        c(filters, productfiltermodal);
                        break;
                    }
                    continue label0;
                }
            }

            setContentView(b);
            return;
        } while (true);
    }

    public android.widget.LinearLayout.LayoutParams i()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -2);
    }

    public RelativeLayout j()
    {
        return new RelativeLayout(this);
    }

    public TextView k()
    {
        return new TextView(this);
    }

    public android.widget.RelativeLayout.LayoutParams l()
    {
        return new android.widget.RelativeLayout.LayoutParams(-2, -2);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131624479: 
        default:
            return;

        case 2131624478: 
            c();
            b.invalidate();
            return;

        case 2131624480: 
            finish();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = getSharedPreferences("com.jcp.activities", 0);
        a = (ProductList)getIntent().getSerializableExtra("ProductList");
        c();
    }
}
