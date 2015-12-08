// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.infrastructure.lyft.constants.Constants;

public class SignupPromoBannerView extends LinearLayout
{

    IConstantsProvider constantsProvider;
    TextView defaultTextview;
    View signupPromoLayout;
    TextView signupPromoTextview;

    public SignupPromoBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s;
        if (!isInEditMode())
        {
            if ((s = constantsProvider.getConstants().getSignupPromoBanner()) != null)
            {
                UiAnalytics.trackShown(UiElement.NUO_BANNER, Category.REGISTRATION, s);
                signupPromoTextview.setText(Html.fromHtml(s));
                defaultTextview.setVisibility(8);
                signupPromoLayout.setVisibility(0);
                return;
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }
}
