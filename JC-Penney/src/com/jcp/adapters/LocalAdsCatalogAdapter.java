// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.e.p;
import com.jcp.g.a;
import com.jcp.model.LocalAdsCatalogs;
import com.jcp.pojo.LocalAdPromotion;
import com.squareup.a.ak;
import com.squareup.a.ba;
import com.squareup.a.bi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bd, be

public class LocalAdsCatalogAdapter extends ArrayAdapter
{

    private final p a;
    private Context b;
    private List c;
    private LayoutInflater d;
    private final bi e = new bd(this);

    public LocalAdsCatalogAdapter(Context context, List list, p p)
    {
        super(context, 0x7f030038, list);
        b = context;
        c = list;
        a = p;
        d = (LayoutInflater)b.getSystemService("layout_inflater");
    }

    private float a(float f, Context context)
    {
        return ((float)context.getResources().getDisplayMetrics().densityDpi / 160F) * f;
    }

    static float a(LocalAdsCatalogAdapter localadscatalogadapter, float f, Context context)
    {
        return localadscatalogadapter.a(f, context);
    }

    static Context a(LocalAdsCatalogAdapter localadscatalogadapter)
    {
        return localadscatalogadapter.b;
    }

    private View a(ViewGroup viewgroup, LocalAdPromotion localadpromotion)
    {
        viewgroup = d.inflate(0x7f030037, viewgroup, false);
        Object obj = (ImageView)viewgroup.findViewById(0x7f0e01cc);
        com.jcp.g.a.a().a(localadpromotion.getThumbnailImageUrl()).b(0x7f02017f).a(e).a(((ImageView) (obj)));
        ((ImageView) (obj)).setOnClickListener(new be(this, localadpromotion));
        obj = (TextView)viewgroup.findViewById(0x7f0e01cd);
        String s = a(localadpromotion.getValidFrom());
        localadpromotion = a(localadpromotion.getValidTo());
        ((TextView) (obj)).setText((new StringBuilder()).append(s).append(" - ").append(localadpromotion).toString());
        return viewgroup;
    }

    private String a(String s)
    {
        SimpleDateFormat simpledateformat;
        SimpleDateFormat simpledateformat1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        simpledateformat1 = new SimpleDateFormat("MMM dd");
        s = simpledateformat1.format(simpledateformat.parse(s));
        return s;
        s;
        s.printStackTrace();
        return "";
    }

    static p b(LocalAdsCatalogAdapter localadscatalogadapter)
    {
        return localadscatalogadapter.a;
    }

    public LocalAdsCatalogs a(int i)
    {
        return (LocalAdsCatalogs)c.get(i);
    }

    public int getCount()
    {
        return super.getCount();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = a(i);
        AdsCatalogsViewHolder adscatalogsviewholder;
        if (view == null)
        {
            view = d.inflate(0x7f030038, viewgroup, false);
            adscatalogsviewholder = new AdsCatalogsViewHolder(view);
            view.setTag(adscatalogsviewholder);
        } else
        {
            adscatalogsviewholder = (AdsCatalogsViewHolder)view.getTag();
        }
        adscatalogsviewholder.adsCatalogsItemTitleText.setText(((LocalAdsCatalogs) (obj)).getPromotionType());
        adscatalogsviewholder.a = new LinearLayout(b);
        View view1;
        for (obj = ((LocalAdsCatalogs) (obj)).getAdsCatalogs().iterator(); ((Iterator) (obj)).hasNext(); adscatalogsviewholder.a.addView(view1))
        {
            view1 = a(viewgroup, (LocalAdPromotion)((Iterator) (obj)).next());
        }

        adscatalogsviewholder.adsCatalogsItemHorizontalView.removeAllViews();
        adscatalogsviewholder.adsCatalogsItemHorizontalView.addView(adscatalogsviewholder.a);
        adscatalogsviewholder.adsCatalogsItemHorizontalView.setHorizontalScrollBarEnabled(false);
        return view;
    }

    private class AdsCatalogsViewHolder
    {

        protected LinearLayout a;
        protected HorizontalScrollView adsCatalogsItemHorizontalView;
        protected TextView adsCatalogsItemTitleText;

        public AdsCatalogsViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
