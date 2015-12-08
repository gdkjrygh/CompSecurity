// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class HelpLegalView extends LinearLayout
{

    AppFlow appFlow;
    Button licensesButton;
    ILyftPreferences lyftPreferences;
    private final Action1 onHomeClick = new Action1() {

        final HelpLegalView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            appFlow.goBack();
        }

            
            {
                this$0 = HelpLegalView.this;
                super();
            }
    };
    Button privacyPolicynButton;
    Button termsOfServiceButton;
    Toolbar toolbar;

    public HelpLegalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            termsOfServiceButton.setOnClickListener(new android.view.View.OnClickListener() {

                final HelpLegalView this$0;

                public void onClick(View view)
                {
                    openTermsOfService();
                }

            
            {
                this$0 = HelpLegalView.this;
                super();
            }
            });
            privacyPolicynButton.setOnClickListener(new android.view.View.OnClickListener() {

                final HelpLegalView this$0;

                public void onClick(View view)
                {
                    openPrivacyPolicy();
                }

            
            {
                this$0 = HelpLegalView.this;
                super();
            }
            });
            licensesButton.setOnClickListener(new android.view.View.OnClickListener() {

                final HelpLegalView this$0;

                public void onClick(View view)
                {
                    openLegalSection();
                }

            
            {
                this$0 = HelpLegalView.this;
                super();
            }
            });
            Binder binder = Binder.attach(this);
            toolbar.setTitle(getContext().getResources().getString(0x7f070197));
            binder.bind(toolbar.observeHomeClick(), onHomeClick);
            return;
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

    void openLegalSection()
    {
        WebBrowser.open(getContext(), (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/legal/licenses").toString());
    }

    void openPrivacyPolicy()
    {
        appFlow.goTo(new HelpScreens.HelpTermsScreen(true));
    }

    public void openTermsOfService()
    {
        appFlow.goTo(new HelpScreens.HelpTermsScreen(false));
    }
}
