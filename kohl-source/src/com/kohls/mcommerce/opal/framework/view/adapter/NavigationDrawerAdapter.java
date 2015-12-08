// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.MenuCategory;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.util.ArrayList;

public class NavigationDrawerAdapter extends ArrayAdapter
{

    ArrayList categoryList;
    private Context mContext;
    LayoutInflater mLayoutInflator;
    private int mRootLevelMenuItem;

    public NavigationDrawerAdapter(Context context, int i, ArrayList arraylist)
    {
        super(context, i, arraylist);
        mRootLevelMenuItem = 0;
        mContext = context;
        categoryList = arraylist;
        mLayoutInflator = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    private void setRootLevelItem(int i)
    {
        mRootLevelMenuItem = i;
    }

    public int getCount()
    {
        return categoryList.size();
    }

    public ArrayList getListofCategories()
    {
        return categoryList;
    }

    public int getRootLevelItem()
    {
        return mRootLevelMenuItem;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class ViewHolder {}

        if (view == null)
        {
            viewgroup = new ViewHolder();
            view = mLayoutInflator.inflate(0x7f030062, null);
            ViewHolder.access._mth002(viewgroup, (FrameLayout)view.findViewById(0x7f0d022b));
            ViewHolder.access._mth102(viewgroup, (TextView)view.findViewById(0x7f0d022d));
            ViewHolder.access._mth202(viewgroup, (ImageView)view.findViewById(0x7f0d022c));
            ViewHolder.access._mth302(viewgroup, (ProgressBar)view.findViewById(0x7f0d022e));
            ViewHolder.access._mth402(viewgroup, (ImageView)view.findViewById(0x7f0d022f));
            ViewHolder.access._mth502(viewgroup, FontUtils.loadTypeFace(getContext(), "Gotham-Bold.otf"));
            ViewHolder.access._mth602(viewgroup, FontUtils.loadTypeFace(getContext(), "Gotham-Book.otf"));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        ViewHolder.access._mth300(viewgroup).setVisibility(8);
        if (((MenuCategory)categoryList.get(i)).getName().equalsIgnoreCase(getContext().getString(0x7f0804d2)))
        {
            setRootLevelItem(1);
        } else
        if (((MenuCategory)categoryList.get(i)).getName().equalsIgnoreCase(getContext().getString(0x7f0804d1)))
        {
            setRootLevelItem(0);
        }
        if (((MenuCategory)categoryList.get(i)).getImage() != null && ((MenuCategory)categoryList.get(i)).getImage().length() > 0)
        {
            android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(getContext().getResources().getIdentifier(((MenuCategory)categoryList.get(i)).getImage(), "drawable", getContext().getPackageName()));
            ViewHolder.access._mth200(viewgroup).setVisibility(0);
            ViewHolder.access._mth100(viewgroup).setVisibility(8);
            ViewHolder.access._mth200(viewgroup).setImageDrawable(drawable);
            ViewHolder.access._mth000(viewgroup).setBackgroundResource(0x7f020161);
            ViewHolder.access._mth200(viewgroup).setBackgroundResource(0x7f020161);
            int j = (int)(getContext().getResources().getDimension(0x7f09000d) / getContext().getResources().getDisplayMetrics().density);
            ViewHolder.access._mth200(viewgroup).setPadding(j, ViewHolder.access._mth200(viewgroup).getPaddingTop(), ViewHolder.access._mth200(viewgroup).getPaddingRight(), ViewHolder.access._mth200(viewgroup).getPaddingBottom());
            if (((MenuCategory)categoryList.get(i)).getType() == 2002)
            {
                android.graphics.drawable.Drawable drawable1 = getContext().getResources().getDrawable(getContext().getResources().getIdentifier("yes2you_white", "drawable", getContext().getPackageName()));
                ViewHolder.access._mth200(viewgroup).setImageDrawable(drawable1);
                ViewHolder.access._mth200(viewgroup).setBackgroundResource(0x7f0201b3);
                ViewHolder.access._mth000(viewgroup).setBackgroundResource(0x7f0201b3);
                ViewHolder.access._mth400(viewgroup).setVisibility(8);
            }
        } else
        {
            ViewHolder.access._mth200(viewgroup).setVisibility(8);
            ViewHolder.access._mth100(viewgroup).setVisibility(0);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(((MenuCategory)categoryList.get(i)).getName());
            Object obj = spannablestringbuilder;
            if (spannablestringbuilder.toString().equalsIgnoreCase(mContext.getResources().getString(0x7f08011f)))
            {
                com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store = KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore();
                obj = spannablestringbuilder;
                if (store != null)
                {
                    obj = spannablestringbuilder;
                    if (!TextUtils.isEmpty(store.getStoreName()))
                    {
                        SpannableStringBuilder spannablestringbuilder1 = new SpannableStringBuilder(mContext.getResources().getString(0x7f0804fe));
                        obj = "";
                        String as[] = store.getStoreName().toLowerCase().split(" ");
                        for (int k = 0; k < as.length; k++)
                        {
                            obj = (new StringBuilder()).append(((String) (obj))).append(as[k].substring(0, 1).toUpperCase()).append(as[k].substring(1)).append(" ").toString();
                        }

                        spannablestringbuilder1.append((new StringBuilder()).append("\n").append(((String) (obj))).toString());
                        spannablestringbuilder1.setSpan(new StyleSpan(1), 8, spannablestringbuilder1.length(), 0);
                        obj = spannablestringbuilder1;
                    }
                }
            }
            int l;
            if (((MenuCategory)categoryList.get(i)).getName().equalsIgnoreCase(getContext().getString(0x7f0804d1)) || ((MenuCategory)categoryList.get(i)).getType() == 2001)
            {
                ViewHolder.access._mth100(viewgroup).setTypeface(ViewHolder.access._mth500(viewgroup));
            } else
            {
                ViewHolder.access._mth100(viewgroup).setTypeface(ViewHolder.access._mth600(viewgroup));
            }
            if (((MenuCategory)categoryList.get(i)).getName().equalsIgnoreCase(getContext().getString(0x7f0804d1)))
            {
                int i1 = UtilityMethods.getActionBarHeight(getContext());
                l = i1;
                if (i1 <= 0)
                {
                    l = (int)getContext().getResources().getDimension(0x7f09001a);
                }
                ViewHolder.access._mth200(viewgroup).getLayoutParams().height = l;
                ViewHolder.access._mth100(viewgroup).getLayoutParams().height = l;
                ViewHolder.access._mth100(viewgroup).setCompoundDrawablesWithIntrinsicBounds(0x7f0200c0, 0, 0, 0);
                l = (int)(getContext().getResources().getDimension(0x7f090011) / getContext().getResources().getDisplayMetrics().density);
                ViewHolder.access._mth100(viewgroup).setTextSize(getContext().getResources().getDimension(0x7f090004) / getContext().getResources().getDisplayMetrics().density);
            } else
            if (((MenuCategory)categoryList.get(i)).getName().equalsIgnoreCase(getContext().getString(0x7f0804d2)))
            {
                ViewHolder.access._mth100(viewgroup).setCompoundDrawablesWithIntrinsicBounds(0x7f02002d, 0, 0, 0);
                l = (int)(getContext().getResources().getDimension(0x7f090010) / getContext().getResources().getDisplayMetrics().density);
            } else
            {
                ViewHolder.access._mth100(viewgroup).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                ViewHolder.access._mth100(viewgroup).setTextSize(getContext().getResources().getDimension(0x7f09000f) / getContext().getResources().getDisplayMetrics().density);
                l = (int)(getContext().getResources().getDimension(0x7f09000d) / getContext().getResources().getDisplayMetrics().density);
            }
            ViewHolder.access._mth100(viewgroup).setPadding(l, ViewHolder.access._mth100(viewgroup).getPaddingTop(), ViewHolder.access._mth100(viewgroup).getPaddingRight(), ViewHolder.access._mth100(viewgroup).getPaddingBottom());
            if (((MenuCategory)categoryList.get(i)).getType() == 2002)
            {
                ViewHolder.access._mth100(viewgroup).setTypeface(ViewHolder.access._mth500(viewgroup));
                ViewHolder.access._mth100(viewgroup).setBackgroundResource(0x7f0201b3);
                ViewHolder.access._mth400(viewgroup).setVisibility(8);
                ViewHolder.access._mth100(viewgroup).setTextColor(-1);
            } else
            if (((MenuCategory)categoryList.get(i)).getType() == 2003)
            {
                ViewHolder.access._mth100(viewgroup).setBackgroundResource(0x7f0200b4);
                ViewHolder.access._mth400(viewgroup).setVisibility(8);
                ViewHolder.access._mth100(viewgroup).setTextColor(0xff000000);
            } else
            {
                ViewHolder.access._mth400(viewgroup).setVisibility(0);
                ViewHolder.access._mth100(viewgroup).setBackgroundResource(0x7f020161);
                ViewHolder.access._mth100(viewgroup).setTextColor(0xff000000);
            }
            if (i < categoryList.size() - 1 && ((MenuCategory)categoryList.get(i + 1)).getType() == 2002)
            {
                ViewHolder.access._mth400(viewgroup).setVisibility(8);
            }
            ViewHolder.access._mth100(viewgroup).setText(((CharSequence) (obj)));
        }
        viewgroup = AnimationUtils.loadAnimation(getContext(), 0x10a0002);
        viewgroup.setDuration(500L);
        view.startAnimation(viewgroup);
        return view;
    }

    public void setListofCategories(ArrayList arraylist)
    {
        categoryList = arraylist;
    }
}
