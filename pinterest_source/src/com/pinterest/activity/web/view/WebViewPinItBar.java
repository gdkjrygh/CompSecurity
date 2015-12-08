// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PButton;

public class WebViewPinItBar extends RelativeLayout
{

    ImageButton _feedbackButton;
    PButton _openButton;
    private String _pinId;
    View _pinItButton;
    private String _url;

    public WebViewPinItBar(Context context)
    {
        this(context, null);
    }

    public WebViewPinItBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WebViewPinItBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void init(View view)
    {
        ButterKnife.a(this, view);
    }

    protected void onDetachedFromWindow()
    {
        if (_openButton != null)
        {
            _openButton.setOnClickListener(null);
        }
        if (_pinItButton != null)
        {
            _pinItButton.setOnClickListener(null);
        }
        super.onDetachedFromWindow();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        _openButton = (PButton)findViewById(0x7f0f0306);
        _openButton.setIconTint(0x7f0e006d);
        _openButton.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(0x7f020205), null, null, null);
        _pinItButton = findViewById(0x7f0f0305);
        _pinItButton.setOnClickListener(new _cls1());
        _openButton.setOnClickListener(new _cls2());
        _feedbackButton = (ImageButton)findViewById(0x7f0f0307);
        _feedbackButton.setOnClickListener(new _cls3());
    }

    public void setPinId(String s)
    {
        _pinId = s;
    }

    public void setUrl(String s)
    {
        _url = s;
    }

    public void showFeedbackButton(View view)
    {
        ((ImageButton)view.findViewById(0x7f0f0307)).setVisibility(0);
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final WebViewPinItBar this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.MODAL_PIN);
            view = new Intent(getContext(), com/pinterest/activity/create/PinItActivity);
            view.putExtra("android.intent.extra.TEXT", _url);
            view.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070731));
            getContext().startActivity(view);
        }

        _cls1()
        {
            this$0 = WebViewPinItBar.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final WebViewPinItBar this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.LINK_OUT_BUTTON, ComponentType.NAVIGATION);
            if (StringUtils.isNotEmpty(_url))
            {
                ActivityHelper.goIntentView(getContext(), _url);
            }
        }

        _cls2()
        {
            this$0 = WebViewPinItBar.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final WebViewPinItBar this$0;

        public void onClick(View view)
        {
            view = new FeedbackDialog(_url, _pinId);
            HashMap hashmap = new HashMap();
            hashmap.put("domain_url", _url);
            Pinalytics.a(ElementType.BAD_LINK_BUTTON, ComponentType.BROWSER, _pinId, hashmap);
            Events.post(new DialogEvent(view));
        }

        _cls3()
        {
            this$0 = WebViewPinItBar.this;
            super();
        }
    }

}
