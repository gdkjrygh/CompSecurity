// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.phunware.nbc.sochi.EULAActivity;

public class DisclosureFragment extends Fragment
{

    public static final boolean isTelemundo = "nbclive".equals("telemundo");
    private static DisclosureFragment mInstance;

    public DisclosureFragment()
    {
    }

    public static DisclosureFragment getInstance()
    {
        if (mInstance == null)
        {
            mInstance = new DisclosureFragment();
        }
        return mInstance;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f040033, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x7f0f00a5)).setText(Html.fromHtml(getString(0x7f0700cc)));
        ((TextView)layoutinflater.findViewById(0x7f0f00a6)).setText(Html.fromHtml(getString(0x7f0700cd)));
        ((TextView)layoutinflater.findViewById(0x7f0f00a7)).setText(Html.fromHtml(getString(0x7f0700c6)));
        ((TextView)layoutinflater.findViewById(0x7f0f00a9)).setText(Html.fromHtml(getString(0x7f0700cb)));
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0f00aa);
        bundle = new SpannableString(getString(0x7f0700c5));
        ClickableSpan clickablespan = new ClickableSpan() {

            final DisclosureFragment this$0;

            public void onClick(View view)
            {
                view = new Intent(getActivity(), com/phunware/nbc/sochi/EULAActivity);
                startActivity(view);
            }

            
            {
                this$0 = DisclosureFragment.this;
                super();
            }
        };
        if (isTelemundo)
        {
            bundle.setSpan(clickablespan, 69, 116, 33);
            bundle.setSpan(new UnderlineSpan(), 69, 116, 0);
        } else
        {
            bundle.setSpan(clickablespan, 63, 93, 33);
            bundle.setSpan(new UnderlineSpan(), 63, 93, 0);
        }
        clickablespan = new ClickableSpan() {

            final DisclosureFragment this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getString(0x7f070168)));
                startActivity(view);
            }

            
            {
                this$0 = DisclosureFragment.this;
                super();
            }
        };
        if (isTelemundo)
        {
            bundle.setSpan(clickablespan, 123, 156, 33);
            bundle.setSpan(new UnderlineSpan(), 123, 156, 0);
        } else
        {
            bundle.setSpan(clickablespan, 105, 119, 33);
            bundle.setSpan(new UnderlineSpan(), 105, 119, 0);
        }
        clickablespan = new ClickableSpan() {

            final DisclosureFragment this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse("http://m.nbcsports.com/content/terms-and-conditions"));
                startActivity(view);
            }

            
            {
                this$0 = DisclosureFragment.this;
                super();
            }
        };
        if (isTelemundo)
        {
            bundle.setSpan(clickablespan, 165, 180, 33);
            bundle.setSpan(new UnderlineSpan(), 165, 180, 0);
        } else
        {
            bundle.setSpan(clickablespan, 124, 136, 33);
            bundle.setSpan(new UnderlineSpan(), 124, 136, 0);
        }
        viewgroup.setText(bundle);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        return layoutinflater;
    }

}
