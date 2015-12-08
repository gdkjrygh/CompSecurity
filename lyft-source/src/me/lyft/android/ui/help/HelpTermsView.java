// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.RegistrationAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.WebBrowserView;
import rx.functions.Action1;

public class HelpTermsView extends LinearLayout
    implements IHandleBack
{

    final HelpScreens.HelpTermsScreen params;
    Toolbar toolbar;
    WebBrowserView webBrowserView;

    public HelpTermsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (HelpScreens.HelpTermsScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder.attach(this).bind(toolbar.observeHomeClick(), new Action1() {

            final HelpTermsView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                RegistrationAnalytics.trackCloseTermsOfService();
            }

            
            {
                this$0 = HelpTermsView.this;
                super();
            }
        });
    }

    public boolean onBack()
    {
        RegistrationAnalytics.trackCloseTermsOfService();
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (params.showPrivacyTerms())
        {
            toolbar.setTitle(getContext().getResources().getString(0x7f0702bc));
            webBrowserView.setTargetUrl("http://api.lyft.com.s3.amazonaws.com/static/terms.html#privacy");
        } else
        {
            toolbar.setTitle(getContext().getResources().getString(0x7f070365));
            webBrowserView.setTargetUrl("http://api.lyft.com.s3.amazonaws.com/static/terms.html");
        }
        toolbar.setHomeButtonEnabled(true);
        toolbar.setHomeIconVisible(true);
    }
}
