// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FAQFragment extends Fragment
{

    public FAQFragment()
    {
    }

    public static FAQFragment getInstance()
    {
        return new FAQFragment();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f040035, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0f00d1);
        bundle = android.text.Spannable.Factory.getInstance().newSpannable("Contact us via email at liveextra@nbcolympics.com");
        ClickableSpan clickablespan = new ClickableSpan() {

            final FAQFragment this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "liveextra@nbcolympics.com", null));
                startActivity(Intent.createChooser(view, "Send email..."));
            }

            
            {
                this$0 = FAQFragment.this;
                super();
            }
        };
        bundle.setSpan(clickablespan, 0, 23, 33);
        bundle.setSpan(clickablespan, 24, bundle.length(), 34);
        viewgroup.setText(bundle);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        return layoutinflater;
    }
}
