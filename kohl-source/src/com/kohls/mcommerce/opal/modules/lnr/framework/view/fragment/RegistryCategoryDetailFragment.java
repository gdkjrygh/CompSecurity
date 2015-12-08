// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.analytics.utils.enums.SearchType;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.RegistryCategoryDetailActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.DashboardCategoryVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.adapter.RegistryCategoryDetailAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class RegistryCategoryDetailFragment extends BaseFragment
{

    private String actionBarTitle;
    private ArrayList listItems;
    private Button mAddItemBtn;
    private DashboardCategoryVO mDashboardCategoryVO;
    private boolean mIsPurchasedStatusON;
    private TextView mItemsCountTxtView;
    private GridView mItemsListGridView;
    private RegistryCategoryDetailAdapter mRegistryCategoryDetailAdapter;

    public RegistryCategoryDetailFragment()
    {
    }

    protected void initializeAttributes()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            actionBarTitle = bundle.getString("category_detail_title");
            mDashboardCategoryVO = (DashboardCategoryVO)bundle.getSerializable("category obj");
            mIsPurchasedStatusON = bundle.getBoolean("is_purchased_status_on");
        }
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        mItemsCountTxtView = (TextView)getFragmentView().findViewById(0x7f0d02c5);
        mAddItemBtn = (Button)getFragmentView().findViewById(0x7f0d02c4);
        mItemsListGridView = (GridView)getFragmentView().findViewById(0x7f0d02c6);
        mAddItemBtn.setOnClickListener(this);
    }

    protected int intializaLayoutId()
    {
        return 0x7f030079;
    }

    protected void loadContent()
    {
        ((RegistryCategoryDetailActivity)getActivity()).getActionBarHelper().showActionBarForCreateList(actionBarTitle);
        ((RegistryCategoryDetailActivity)getActivity()).getActionBarHelper().getBackButtonView().setOnClickListener(this);
        if (actionBarTitle != null && mDashboardCategoryVO != null)
        {
            if (mIsPurchasedStatusON)
            {
                mItemsCountTxtView.setText((new StringBuilder()).append(mDashboardCategoryVO.getTotalItems()).append(" Items - ").append(mDashboardCategoryVO.getPurchasedItems()).append(" Purchased").toString());
            } else
            {
                mItemsCountTxtView.setText((new StringBuilder()).append(mDashboardCategoryVO.getTotalItems()).append(" Items").toString());
            }
            listItems = mDashboardCategoryVO.getListItems();
            if (listItems != null)
            {
                mRegistryCategoryDetailAdapter = new RegistryCategoryDetailAdapter(new WeakReference(getActivity()), listItems, mIsPurchasedStatusON);
                mItemsListGridView.setAdapter(mRegistryCategoryDetailAdapter);
            }
        }
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131559580: 
            getActivity().finish();
            return;

        case 2131559108: 
            view = new Bundle();
            view.putBoolean("key_is_typehead", true);
            view.putString("key_search_type", SearchType.SEARCH_STANDARD.name());
            view.putBoolean("key_is_from_search", true);
            view.putString("key_search_keyword", actionBarTitle);
            view.putString("key_page_title", actionBarTitle);
            view.putString("key_parrent_category", "search");
            Intent intent = new Intent();
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            intent.putExtra("open_screen_key", "open_product_matrix");
            intent.putExtras(view);
            intent.setFlags(0x4008000);
            startActivity(intent);
            getActivity().finish();
            return;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
