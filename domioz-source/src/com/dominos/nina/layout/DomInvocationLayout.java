// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class DomInvocationLayout extends RelativeLayout
{

    private ImageButton mDomInvokeButton;

    public DomInvocationLayout(Context context)
    {
        super(context);
    }

    public DomInvocationLayout(Context context, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
    {
        super(context);
        context = (LayoutInflater)context.getSystemService("layout_inflater");
        if (context != null)
        {
            context.inflate(0x7f03002f, this);
            viewgroup.addView(this);
            viewgroup.refreshDrawableState();
            getDomButton().setOnClickListener(onclicklistener);
        }
    }

    private ImageButton getDomButton()
    {
        if (mDomInvokeButton == null)
        {
            mDomInvokeButton = (ImageButton)findViewById(0x7f0f0126);
        }
        return mDomInvokeButton;
    }

    public void hideDomButton()
    {
        getDomButton().setVisibility(8);
    }

    public void showDomButton()
    {
        getDomButton().setVisibility(0);
    }
}
