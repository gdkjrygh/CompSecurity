// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.iface.IViewControllerListener;

public abstract class BaseFragment extends Fragment
    implements android.view.View.OnClickListener, IViewControllerListener
{

    private int layoutId;
    private View mFragmentView;

    public BaseFragment()
    {
    }

    protected View getFragmentView()
    {
        return mFragmentView;
    }

    protected abstract void initializeAttributes();

    protected abstract void initializeController();

    protected abstract void initializeViews(Bundle bundle);

    protected abstract int intializaLayoutId();

    protected abstract void loadContent();

    public final void notifyViewOnFailure(final Object object)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            getActivity().runOnUiThread(new Runnable() {

                final BaseFragment this$0;
                final Object val$object;

                public void run()
                {
                    updateViewsOnFailure(object);
                }

            
            {
                this$0 = BaseFragment.this;
                object = obj;
                super();
            }
            });
        }
    }

    public final void notifyViewOnSuccess(final Object object)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            getActivity().runOnUiThread(new Runnable() {

                final BaseFragment this$0;
                final Object val$object;

                public void run()
                {
                    updateViewsOnSuccess(object);
                }

            
            {
                this$0 = BaseFragment.this;
                object = obj;
                super();
            }
            });
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        initializeAttributes();
        initializeViews(bundle);
        initializeController();
        loadContent();
    }

    public abstract boolean onBackPress();

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentView = layoutinflater.inflate(intializaLayoutId(), null);
        return mFragmentView;
    }

    public void onDestroy()
    {
        UtilityMethods.dismissDialog(4002);
        super.onDestroy();
    }

    public void showProgresssDialog(String s)
    {
        UtilityMethods.showKohlsProgressDialog(4002, null, s, null, false, false, false, 0, getActivity());
    }

    protected abstract void updateViewsOnFailure(Object obj);

    protected abstract void updateViewsOnSuccess(Object obj);
}
