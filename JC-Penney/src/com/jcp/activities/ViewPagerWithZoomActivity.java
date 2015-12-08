// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jcp.fragments.cf;
import com.jcp.g.a;
import com.jcp.productentity.Image;
import com.jcp.productentity.OptionEntity;
import com.jcp.productentity.OptionValueEntity;
import com.jcp.productentity.ProductDetailsImage;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ac;
import com.jcp.util.k;
import com.jcp.views.CarouselPageIndicator;
import com.jcp.views.ExtendedViewPager;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            an, cc, ca

public class ViewPagerWithZoomActivity extends an
    implements android.view.View.OnClickListener
{

    private static final String a = com/jcp/activities/ViewPagerWithZoomActivity.getSimpleName();
    private static List b;
    private static List g = new ArrayList();
    private static List h;
    private CarouselPageIndicator c;
    private ExtendedViewPager d;
    private int e;
    private OptionValueEntity f;
    private String i;
    private ProductEntityContainer j;
    private Object k;
    private HorizontalScrollView l;

    public ViewPagerWithZoomActivity()
    {
        i = "";
    }

    static OptionValueEntity a(ViewPagerWithZoomActivity viewpagerwithzoomactivity)
    {
        return viewpagerwithzoomactivity.f;
    }

    static OptionValueEntity a(ViewPagerWithZoomActivity viewpagerwithzoomactivity, OptionValueEntity optionvalueentity)
    {
        viewpagerwithzoomactivity.f = optionvalueentity;
        return optionvalueentity;
    }

    static ProductEntityContainer a(ViewPagerWithZoomActivity viewpagerwithzoomactivity, ProductEntityContainer productentitycontainer)
    {
        viewpagerwithzoomactivity.j = productentitycontainer;
        return productentitycontainer;
    }

    static String a(ViewPagerWithZoomActivity viewpagerwithzoomactivity, String s)
    {
        viewpagerwithzoomactivity.i = s;
        return s;
    }

    static void a(ViewPagerWithZoomActivity viewpagerwithzoomactivity, List list)
    {
        viewpagerwithzoomactivity.d(list);
    }

    static void a(ViewPagerWithZoomActivity viewpagerwithzoomactivity, boolean flag)
    {
        viewpagerwithzoomactivity.a(flag);
    }

    public static void a(List list)
    {
        b = list;
    }

    private void a(boolean flag)
    {
        int i1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_495;
        }
        if (j.getOptions() == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        i1 = 0;
_L7:
        if (i1 >= j.getOptions().size()) goto _L2; else goto _L1
_L1:
        if (((OptionEntity)j.getOptions().get(i1)).getDisplayText() == null || ((OptionEntity)j.getOptions().get(i1)).getOptionValues() == null || !"COLOR".equalsIgnoreCase(((OptionEntity)j.getOptions().get(i1)).getDisplayText()))
        {
            continue; /* Loop/switch isn't completed */
        }
        e = 0;
_L4:
        Object obj;
        Boolean boolean1;
        if (e >= ((OptionEntity)j.getOptions().get(i1)).getOptionValues().size())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((OptionValueEntity)((OptionEntity)j.getOptions().get(i1)).getOptionValues().get(e)).getAvailable();
        boolean1 = ((OptionValueEntity)((OptionEntity)j.getOptions().get(i1)).getOptionValues().get(e)).getSelected();
        if (!((Boolean) (obj)).booleanValue() || !boolean1.booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((OptionValueEntity)((OptionEntity)j.getOptions().get(i1)).getOptionValues().get(e)).getImage();
        if (obj != null)
        {
            g.add(0, ((Image) (obj)).getUrl());
        }
_L6:
        e = e + 1;
        if (true) goto _L4; else goto _L3
_L3:
        if (((Boolean) (obj)).booleanValue() || !boolean1.booleanValue()) goto _L6; else goto _L5
_L5:
        Image image = ((OptionValueEntity)((OptionEntity)j.getOptions().get(i1)).getOptionValues().get(e)).getImage();
        if (image != null)
        {
            g.add(0, image.getUrl());
        }
          goto _L6
        i1++;
          goto _L7
_L2:
        if (j.getImages() != null)
        {
            for (int j1 = 0; j1 < j.getImages().size(); j1++)
            {
                if (((ProductDetailsImage)j.getImages().get(j1)).getUrl() != null && "ALTERNATE".equalsIgnoreCase(((ProductDetailsImage)j.getImages().get(j1)).getType()))
                {
                    g.add(((ProductDetailsImage)j.getImages().get(j1)).getUrl());
                }
            }

        }
        d.setAdapter(new cc(g));
        c.setViewPager(d);
        d.invalidate();
        if (g.size() <= 1)
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            return;
        }
    }

    static String b(ViewPagerWithZoomActivity viewpagerwithzoomactivity)
    {
        return viewpagerwithzoomactivity.i;
    }

    public static void b(List list)
    {
        g.clear();
        g.addAll(list);
    }

    static ProductEntityContainer c(ViewPagerWithZoomActivity viewpagerwithzoomactivity)
    {
        return viewpagerwithzoomactivity.j;
    }

    public static List c()
    {
        return h;
    }

    public static void c(List list)
    {
        h = list;
    }

    private void d(List list)
    {
        l = (HorizontalScrollView)findViewById(0x7f0e028f);
        l.removeAllViews();
        l.scrollTo(l.getWidth(), 3);
        l.setHorizontalScrollBarEnabled(false);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setGravity(17);
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearlayout.setOrientation(0);
        l.setBackgroundColor(Color.parseColor("#f5f5f5"));
        l.addView(linearlayout);
        if (list != null)
        {
label0:
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                if (((OptionEntity)list.get(i1)).getDisplayText() == null || ((OptionEntity)list.get(i1)).getOptionValues() == null || !"COLOR".equalsIgnoreCase(((OptionEntity)list.get(i1)).getDisplayText()))
                {
                    continue;
                }
                e = 0;
                do
                {
                    if (e >= ((OptionEntity)list.get(i1)).getOptionValues().size())
                    {
                        continue label0;
                    }
                    Object obj;
                    ImageView imageview;
                    if (((OptionValueEntity)((OptionEntity)list.get(i1)).getOptionValues().get(e)).getUrl() != null)
                    {
                        obj = (OptionValueEntity)((OptionEntity)list.get(i1)).getOptionValues().get(e);
                    } else
                    {
                        obj = null;
                    }
                    imageview = new ImageView(this);
                    imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
                    imageview.setPadding(30, 0, 30, 0);
                    imageview.setTag(obj);
                    obj = ((OptionValueEntity)((OptionEntity)list.get(i1)).getOptionValues().get(e)).getImage();
                    if (obj != null)
                    {
                        obj = ((Image) (obj)).getSwatchUrl();
                        if (obj != null && ((String) (obj)).length() > 0)
                        {
                            com.jcp.g.a.a().a(((String) (obj))).a(ac.a((OptionValueEntity)((OptionEntity)list.get(i1)).getOptionValues().get(e))).b(0x7f02017f).a(imageview);
                        }
                        if (((OptionValueEntity)((OptionEntity)list.get(i1)).getOptionValues().get(e)).getSelected().booleanValue())
                        {
                            k = imageview.getTag();
                        }
                        if (((OptionEntity)list.get(i1)).getOptionValues().size() != 1)
                        {
                            imageview.setOnClickListener(new ca(this));
                        }
                    }
                    linearlayout.addView(imageview);
                    e = e + 1;
                } while (true);
            }

        }
    }

    static String g()
    {
        return a;
    }

    static List h()
    {
        return g;
    }

    private void i()
    {
        Object obj = getSharedPreferences("com.jcp.activities", 0);
        if (i.length() == 0)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("color_changed", false);
            ((android.content.SharedPreferences.Editor) (obj)).putString("ProductURL", null);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            finish();
            return;
        } else
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("color_changed", true);
            ((android.content.SharedPreferences.Editor) (obj)).putString("ProductURL", i);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            finish();
            return;
        }
    }

    protected String a()
    {
        return "VIEWPAGERWITHZOOM";
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        i();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131624920: 
        default:
            return;

        case 2131624919: 
            i();
            return;

        case 2131624921: 
            com.jcp.util.k.a(this, b);
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300c7);
        getActionBar().hide();
        h = c();
        d = (ExtendedViewPager)findViewById(0x7f0e031c);
        c = (CarouselPageIndicator)findViewById(0x7f0e028c);
        d(h);
        a(false);
        bundle = (ImageView)findViewById(0x7f0e03d7);
        Object obj = (ImageView)findViewById(0x7f0e03d9);
        bundle.setOnClickListener(this);
        int i1;
        if (b == null)
        {
            ((ImageView) (obj)).setVisibility(8);
        } else
        {
            ((ImageView) (obj)).setOnClickListener(this);
        }
        bundle = getWindowManager().getDefaultDisplay();
        obj = new Point();
        bundle.getSize(((Point) (obj)));
        i1 = ((Point) (obj)).x;
        l.post(new cf(l, k, i1));
    }

    protected void onDestroy()
    {
        com.jcp.b.a.i();
        super.onDestroy();
    }

}
