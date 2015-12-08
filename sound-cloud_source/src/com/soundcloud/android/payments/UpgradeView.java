// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import a.a;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.soundcloud.android.util.AnimUtils;

class UpgradeView
{
    static interface Listener
    {

        public abstract void startPurchase();
    }


    Button buyButton;
    View loading;
    private final Resources resources;
    View successHeader;
    View upgradeHeader;

    public UpgradeView(Resources resources1)
    {
        resources = resources1;
    }

    private void setListener(final Listener listener)
    {
        buyButton.setOnClickListener(new _cls1());
    }

    public void disableBuyButton()
    {
        buyButton.setEnabled(false);
    }

    public void enableBuyButton()
    {
        buyButton.setEnabled(true);
    }

    public void hideBuyButton()
    {
        AnimUtils.hideView(buyButton, true);
        loading.setVisibility(0);
    }

    void setupContentView(AppCompatActivity appcompatactivity, Listener listener)
    {
        a.a(this, appcompatactivity.findViewById(0x1020002));
        setListener(listener);
    }

    public void showBuyButton(String s)
    {
        buyButton.setText(resources.getString(0x7f070320, new Object[] {
            s
        }));
        loading.setVisibility(8);
        AnimUtils.showView(buyButton, true);
    }

    public void showSuccess()
    {
        upgradeHeader.setVisibility(8);
        successHeader.setVisibility(0);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UpgradeView this$0;
        final Listener val$listener;

        public void onClick(View view)
        {
            listener.startPurchase();
        }

        _cls1()
        {
            this$0 = UpgradeView.this;
            listener = listener1;
            super();
        }
    }

}
