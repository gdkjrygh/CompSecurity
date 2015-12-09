// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.b.b;
import com.jcp.g.a;
import com.jcp.productlistentity.ProductListValueEntity;
import com.jcp.util.ae;
import com.jcp.util.bv;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.adapters:
//            bz

public class ProductFilterSortListAdapter extends BaseAdapter
{

    private static final String g = com/jcp/adapters/ProductFilterSortListAdapter.getName();
    private LayoutInflater a;
    private List b;
    private ProductFilterSortActivity c;
    private Map d;
    private Activity e;
    private boolean f;

    public ProductFilterSortListAdapter(Activity activity, List list, boolean flag, Map map)
    {
        d = new HashMap();
        a = LayoutInflater.from(activity);
        b = list;
        c = (ProductFilterSortActivity)activity;
        e = activity;
        f = flag;
        a(map);
    }

    static List a(ProductFilterSortListAdapter productfiltersortlistadapter)
    {
        return productfiltersortlistadapter.b;
    }

    private void a(String s)
    {
        ae.a(g, s);
    }

    private void a(Map map)
    {
        d.clear();
        d.putAll(map);
    }

    static Map b(ProductFilterSortListAdapter productfiltersortlistadapter)
    {
        return productfiltersortlistadapter.d;
    }

    static ProductFilterSortActivity c(ProductFilterSortListAdapter productfiltersortlistadapter)
    {
        return productfiltersortlistadapter.c;
    }

    static Activity d(ProductFilterSortListAdapter productfiltersortlistadapter)
    {
        return productfiltersortlistadapter.e;
    }

    public void a(boolean flag, Map map)
    {
        f = flag;
        a(map);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        if (view == null || view.getTag() == null)
        {
            view = a.inflate(0x7f0300c1, viewgroup, false);
            viewgroup = new ProductFilterSortListViewHolder(view);
            ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setOnClickListener(new bz(this, i, viewgroup));
            if (f)
            {
                ((ProductFilterSortListViewHolder) (viewgroup)).mColorIcon.setVisibility(0);
            }
        } else
        {
            viewgroup = (ProductFilterSortListViewHolder)view.getTag();
        }
        ((ProductFilterSortListViewHolder) (viewgroup)).mTitle.setText(bv.a(((ProductListValueEntity)b.get(i)).getName()));
        if (d.size() != 0) goto _L2; else goto _L1
_L1:
        ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setChecked(false);
        ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setEnabled(false);
        ((ProductFilterSortListViewHolder) (viewgroup)).mRowLayout.setBackgroundColor(e.getResources().getColor(0x7f0d0071));
        c.c();
_L4:
        if (!f || b == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        if (b.get(i) == null || ((ProductListValueEntity)b.get(i)).getName() == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        s = ((ProductListValueEntity)b.get(i)).getImageURL();
        if (s != null)
        {
            try
            {
                s = (new StringBuilder()).append("http://").append(b.b).append("/mobile").append(s).toString();
                com.jcp.g.a.a().a(s).a(((ProductFilterSortListViewHolder) (viewgroup)).mColorIcon);
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                a(viewgroup.getMessage());
                return view;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                a(viewgroup.getMessage());
                return view;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                a(viewgroup.getMessage());
                return view;
            }
        }
        return view;
_L2:
        Object obj = ((ProductListValueEntity)b.get(i)).getId();
        obj = (ProductListValueEntity)d.get(obj);
        if (obj != null)
        {
            if (((ProductListValueEntity) (obj)).getSelected().booleanValue())
            {
                ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setChecked(true);
                ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setEnabled(true);
            }
        } else
        {
            ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setChecked(false);
            ((ProductFilterSortListViewHolder) (viewgroup)).mCheckBox.setEnabled(false);
            ((ProductFilterSortListViewHolder) (viewgroup)).mRowLayout.setBackgroundColor(e.getResources().getColor(0x7f0d0071));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isEnabled(int i)
    {
        Object obj = ((ProductListValueEntity)b.get(i)).getId();
        obj = (ProductListValueEntity)d.get(obj);
        return d.size() != 0 && obj != null;
    }


    private class ProductFilterSortListViewHolder
    {

        final ProductFilterSortListAdapter a;
        protected CheckBox mCheckBox;
        protected ImageView mColorIcon;
        protected RelativeLayout mRowLayout;
        protected TextView mTitle;

        protected ProductFilterSortListViewHolder(View view)
        {
            a = ProductFilterSortListAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
