// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.app.Dialog;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

public class FeedbackDialog extends BaseDialog
{

    TextView _btnBrokenLink;
    TextView _btnNotUseful;
    TextView _btnPinNotFound;
    TextView _btnSpam;
    private View _container;
    private String _pinId;
    private String _url;
    private android.view.View.OnClickListener onClickFeedback;

    public FeedbackDialog(String s, String s1)
    {
        onClickFeedback = new _cls1();
        _url = s;
        _pinId = s1;
    }

    private String getChoiceForClickedView(View view)
    {
        switch (view.getId())
        {
        default:
            return "NA";

        case 2131690728: 
            return "broken";

        case 2131690730: 
            return "spam";

        case 2131690729: 
            return "missing";

        case 2131690727: 
            return "other";
        }
    }

    private void handleChoice(View view)
    {
        view = getChoiceForClickedView(view);
        HashMap hashmap = new HashMap();
        hashmap.put("reason", view);
        hashmap.put("domain_url", _url);
        Pinalytics.a(EventType.REPORT_BAD_PIN_LINK, _pinId, hashmap);
        Application.showToastShort(0x7f0705ec);
        dismiss();
        getActivity().onBackPressed();
    }

    private void setViewOnClicks()
    {
        _btnBrokenLink.setOnClickListener(onClickFeedback);
        _btnSpam.setOnClickListener(onClickFeedback);
        _btnPinNotFound.setOnClickListener(onClickFeedback);
        _btnNotUseful.setOnClickListener(onClickFeedback);
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f03020d, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            setViewOnClicks();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        android.view.WindowManager.LayoutParams layoutparams = getDialog().getWindow().getAttributes();
        layoutparams.gravity = 80;
        layoutparams.y = (int)getResources().getDimension(0x7f0a0120);
        getDialog().getWindow().setBackgroundDrawableResource(0x7f0e00b0);
        getDialog().getWindow().setAttributes(layoutparams);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FeedbackDialog this$0;

        public void onClick(View view)
        {
            handleChoice(view);
        }

        _cls1()
        {
            this$0 = FeedbackDialog.this;
            super();
        }
    }

}
