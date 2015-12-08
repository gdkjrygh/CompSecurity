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
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Calendar;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.MultiClickListener;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class HelpView extends LinearLayout
{

    AppFlow appFlow;
    TextView appVersionText;
    private Binder binder;
    TextView developerModeTitle;
    DeveloperTools developerTools;
    IDevice device;
    Button faqSectionButton;
    Button jobsSectionButton;
    Button legalSectionButton;
    ILyftPreferences lyftPreferences;
    private HelpScreens.HelpScreen param;
    IProgressController progressController;
    Button roadsideAssistanceButton;
    ISignUrlService signUrlService;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    IUserProvider userProvider;

    public HelpView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        param = (HelpScreens.HelpScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        if (param.disableMenu())
        {
            toolbar.setHomeIcon(0x7f0200fd);
            binder.bind(toolbar.observeHomeClick(), new Action1() {

                final HelpView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    appFlow.goUp();
                }

            
            {
                this$0 = HelpView.this;
                super();
            }
            });
        } else
        {
            toolbar.setHomeIcon(0x7f020108);
            slideMenuController.enableMenu();
            binder.bind(toolbar.observeHomeClick(), new Action1() {

                final HelpView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    slideMenuController.open();
                }

            
            {
                this$0 = HelpView.this;
                super();
            }
            });
        }
        binder.bind(developerTools.observeDeveloperMode(), new Action1() {

            final HelpView this$0;

            public void call(Boolean boolean1)
            {
                TextView textview = developerModeTitle;
                if (boolean1.booleanValue())
                {
                    boolean1 = getResources().getString(0x7f070194);
                } else
                {
                    boolean1 = "";
                }
                textview.setText(boolean1);
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        }
        ButterKnife.a(this);
        toolbar.setTitle(getResources().getString(0x7f07019c));
        Button button = roadsideAssistanceButton;
        int i;
        if (userProvider.getUser().isApprovedDriver())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        button.setVisibility(i);
        i = Calendar.getInstance().get(1);
        appVersionText.setText(getResources().getString(0x7f070193, new Object[] {
            device.getApplicationVersion(), Integer.valueOf(i)
        }));
        developerModeTitle.setOnClickListener(new MultiClickListener() {

            final HelpView this$0;

            public void onMultiClick()
            {
                developerTools.toggleDeveloperMode();
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
        faqSectionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final HelpView this$0;

            public void onClick(View view)
            {
                openFaq();
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
        jobsSectionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final HelpView this$0;

            public void onClick(View view)
            {
                openJobs();
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
        legalSectionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final HelpView this$0;

            public void onClick(View view)
            {
                openLegalSection();
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
        roadsideAssistanceButton.setOnClickListener(new android.view.View.OnClickListener() {

            final HelpView this$0;

            public void onClick(View view)
            {
                openRoadsideAssistanceFaq();
            }

            
            {
                this$0 = HelpView.this;
                super();
            }
        });
    }

    public void openFaq()
    {
        final String helpUrl = lyftPreferences.getLyftWebRoot();
        if (!userProvider.getUser().hasFirstAndLastName())
        {
            WebBrowser.open(getContext(), (new StringBuilder()).append(helpUrl).append("/help").toString());
            return;
        }
        progressController.showProgress();
        StringBuilder stringbuilder = (new StringBuilder()).append(helpUrl);
        if (userProvider.getUser().isApprovedDriver())
        {
            helpUrl = "/drive/help";
        } else
        {
            helpUrl = "/help";
        }
        helpUrl = stringbuilder.append(helpUrl).toString();
        binder.bind(signUrlService.getSignedUrl(helpUrl), new AsyncCall() {

            final HelpView this$0;
            final String val$helpUrl;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                WebBrowser.open(getContext(), helpUrl);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                super.onSuccess(s);
                WebBrowser.open(getContext(), s);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = HelpView.this;
                helpUrl = s;
                super();
            }
        });
    }

    void openJobs()
    {
        WebBrowser.open(getContext(), (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/jobs").toString());
    }

    void openLegalSection()
    {
        appFlow.goTo(new HelpScreens.HelpLegalScreen());
    }

    void openRoadsideAssistanceFaq()
    {
        WebBrowser.open(getContext(), (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/drive/help/article/2045560").toString());
    }
}
