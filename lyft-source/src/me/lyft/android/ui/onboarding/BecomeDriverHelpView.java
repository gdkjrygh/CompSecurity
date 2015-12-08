// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.WebBrowserView;

public class BecomeDriverHelpView extends LinearLayout
{

    ILyftPreferences lyftPreferences;
    Toolbar toolbar;
    WebBrowserView webBrowserView;

    public BecomeDriverHelpView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private String getHelpUrl()
    {
        return (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/applicants/help?v2=true").toString();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        webBrowserView.loadUrl(getHelpUrl());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this, this);
        toolbar.setTitle(getContext().getString(0x7f070077));
    }
}
