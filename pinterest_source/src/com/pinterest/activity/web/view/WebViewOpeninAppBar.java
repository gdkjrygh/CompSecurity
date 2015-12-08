// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;

public class WebViewOpeninAppBar extends RelativeLayout
{

    private Context _context;
    private Intent _intent;
    View _openButton;
    View _removeButton;

    public WebViewOpeninAppBar(Context context)
    {
        this(context, null);
    }

    public WebViewOpeninAppBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WebViewOpeninAppBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _context = context;
    }

    private void hideBar()
    {
        findViewById(0x7f0f02ec).setVisibility(8);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        _openButton.setOnClickListener(new _cls1());
        _removeButton.setOnClickListener(new _cls2());
    }

    public void setIntent(Intent intent)
    {
        _intent = intent;
    }




    private class _cls1
        implements android.view.View.OnClickListener
    {

        final WebViewOpeninAppBar this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.LINK_OUT_BUTTON, ComponentType.NAVIGATION);
            _context.startActivity(_intent);
        }

        _cls1()
        {
            this$0 = WebViewOpeninAppBar.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final WebViewOpeninAppBar this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.NAVIGATION);
            hideBar();
        }

        _cls2()
        {
            this$0 = WebViewOpeninAppBar.this;
            super();
        }
    }

}
