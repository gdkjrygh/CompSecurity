// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.logic.CheckoutController;
import com.pinterest.activity.commerce.view.ProductView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.di.HasComponent;
import com.pinterest.di.components.ActivityComponent;
import com.pinterest.di.components.CheckoutComponent;
import com.pinterest.di.components.DaggerCheckoutComponent;
import com.pinterest.di.modules.CheckoutModule;

public class CheckoutFragment extends BaseFragment
{

    CheckoutController _checkoutController;
    private String _color;
    FrameLayout _contentContainer;
    private Pin _pin;
    ProductView _productView;

    public CheckoutFragment()
    {
        _layoutId = 0x7f0300ae;
        _menuId = 0x7f100002;
    }

    private void initializeComponentAndInject()
    {
        DaggerCheckoutComponent.a().a((ActivityComponent)((HasComponent)getActivity()).getComponent()).a(new CheckoutModule(this)).a().inject(this);
    }

    protected boolean onActionIconClick(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0f0502)
        {
            Events.post(new com.pinterest.activity.task.model.Navigation.Remove(getNavigation()));
            return true;
        } else
        {
            return super.onActionIconClick(menuitem);
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        _checkoutController.onActivate();
    }

    public boolean onBackPressed()
    {
        if (_checkoutController != null && _checkoutController.onBackPressed())
        {
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        StopWatch.get().complete("buy_it_clicked");
        getActivity().setRequestedOrientation(1);
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        _checkoutController.onDeactivate();
    }

    public void onDestroy()
    {
        super.onDestroy();
        _checkoutController.onDestroy();
        getActivity().setRequestedOrientation(-1);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        _checkoutController.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_pin == null || _pin.getBuyableProduct() == null)
        {
            throw new IllegalStateException("The CheckoutFragment requires a buyable pin");
        } else
        {
            initializeComponentAndInject();
            ButterKnife.a(this, view);
            _actionBar.setTitle(0x7f070118);
            _checkoutController.onViewCreated(_pin, _productView, _contentContainer, _color, getNavigation(), _actionBar);
            return;
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _pin = navigation.getModelAsPin();
        _color = (String)navigation.getExtra("colors");
    }
}
