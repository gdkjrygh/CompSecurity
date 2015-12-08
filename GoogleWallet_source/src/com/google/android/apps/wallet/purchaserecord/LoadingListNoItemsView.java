// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveLinearLayout;

public class LoadingListNoItemsView extends ScreenWidthSensitiveLinearLayout
{

    private final TextView mNoItemsBottomMessage;

    public LoadingListNoItemsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.loading_list_no_items_view, this);
        mNoItemsBottomMessage = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NoItemsBottomMessage);
    }

    public void setNoItemsBottomMessage(int i)
    {
        mNoItemsBottomMessage.setText(i);
    }

    public void setNoItemsBottomMessageAndListener(CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
    {
        mNoItemsBottomMessage.setText(charsequence);
        Views.setLinkOnClickListener(mNoItemsBottomMessage, onclicklistener);
    }

    public final void showNoItemsBottomMessage(boolean flag)
    {
        TextView textview = mNoItemsBottomMessage;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        textview.setVisibility(i);
    }
}
