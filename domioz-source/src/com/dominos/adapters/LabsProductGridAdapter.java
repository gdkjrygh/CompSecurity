// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.ImageManagerCDN;
import java.util.List;

public class LabsProductGridAdapter extends BaseAdapter
{

    public static final int CAROUSEL_TYPE = 1;
    public static final int GRID_TYPE = 0;
    public static final int LIST_TYPE = 2;
    int adapterType;
    List categoryList;
    Context context;
    LayoutInflater inflater;
    boolean isEditMode;
    AnalyticsUtil mAnalyticsUtil;
    MobileSession mMobileSession;
    SpeechManager mSpeechManager;
    int productLineId;

    public LabsProductGridAdapter()
    {
        adapterType = 0;
        isEditMode = false;
        productLineId = -1;
    }

    private void setImage(ImageView imageview, String s)
    {
        ImageManagerCDN.INSTANCE.addCategoryImage(imageview, s);
        imageview.setTag(s);
    }

    public int getCount()
    {
        if (categoryList != null)
        {
            return categoryList.size();
        } else
        {
            return 0;
        }
    }

    public LabsCategory getItem(int i)
    {
        if (categoryList != null)
        {
            return (LabsCategory)categoryList.get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        LabsCategory labscategory = getItem(i);
        viewgroup = view;
        if (view == null)
        {
            if (adapterType == 0)
            {
                viewgroup = inflater.inflate(0x7f03009f, null);
            } else
            if (adapterType == 2)
            {
                viewgroup = inflater.inflate(0x7f0300a1, null);
                if (i == 0 && getCount() == 1)
                {
                    viewgroup.setBackgroundResource(0x7f020139);
                } else
                if (i == 0)
                {
                    viewgroup.setBackgroundResource(0x7f02013a);
                } else
                if (i == getCount() - 1)
                {
                    viewgroup.setBackgroundResource(0x7f020137);
                } else
                {
                    viewgroup.setBackgroundResource(0x7f020138);
                }
            } else
            {
                viewgroup = view;
                if (adapterType == 1)
                {
                    viewgroup = inflater.inflate(0x7f03009c, null);
                }
            }
        }
        viewgroup.setTag(labscategory);
        setImage((ImageView)viewgroup.findViewById(0x7f0f035b), labscategory.getCode());
        view = (TextView)viewgroup.findViewById(0x7f0f035c);
        FontManager.applyDominosFont(view);
        if (StringHelper.equals(labscategory.getCode(), "Sides"))
        {
            view.setText(context.getResources().getString(0x7f08008c));
        } else
        {
            view.setText(labscategory.getName());
        }
        viewgroup.setOnClickListener(new _cls1());
        return viewgroup;
    }

    public void setAdapterType(int i)
    {
        adapterType = i;
    }

    public void setCategoryList(List list)
    {
        categoryList = list;
    }

    public void setEditMode(boolean flag)
    {
        isEditMode = flag;
    }

    public void setProductLineId(int i)
    {
        productLineId = i;
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LabsProductGridAdapter this$0;

        public void onClick(View view)
        {
            LabsCategory labscategory = (LabsCategory)view.getTag();
            ArrayList arraylist = new ArrayList();
            arraylist.add(labscategory);
            if (App.isDebugMode())
            {
                Log.d("GridAdapter", labscategory.toString());
            }
            mSpeechManager.preventNinaPause();
            ProductWizardManager productwizardmanager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.MenuListSelected(productwizardmanager.isFromCouponWizard()));
            mAnalyticsUtil.postMenuCategoryClick(labscategory.getCode());
            LabsMenuListActivity_.intent(view.getContext()).invokedFromRootMenu(true).categories(arraylist).start();
        }

        _cls1()
        {
            this$0 = LabsProductGridAdapter.this;
            super();
        }
    }

}
