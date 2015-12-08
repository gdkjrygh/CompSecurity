// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.IAccessibilitySettingsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

public class AccessibilitySettingsView extends LinearLayout
{

    public static final int SERVICE_ACCESS = 1;
    public static final int SERVICE_NONE = 0;
    IAccessibilitySettingsService accessibilitySettingsService;
    AppFlow appFlow;
    private Binder binder;
    IProgressController progressController;
    CheckedTextView servicesOptionAccess;
    CheckedTextView servicesOptionNone;
    Toolbar toolbar;
    IUserProvider userProvider;
    IViewErrorHandler viewErrorHandler;

    public AccessibilitySettingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void goBack()
    {
        appFlow.goUp();
    }

    private boolean isServiceChanged(int i)
    {
        boolean flag;
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag != userProvider.getUser().isWheelchairNeeded();
    }

    private void setSelectedService(int i)
    {
        boolean flag = true;
        if (isServiceChanged(i))
        {
            progressController.showProgress();
            Binder binder1 = binder;
            IAccessibilitySettingsService iaccessibilitysettingsservice = accessibilitySettingsService;
            if (i != 1)
            {
                flag = false;
            }
            binder1.bind(iaccessibilitysettingsservice.setAccessibilityEnabled(flag), new AsyncCall() {

                final AccessibilitySettingsView this$0;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Unit)obj);
                }

                public void onSuccess(Unit unit)
                {
                    super.onSuccess(unit);
                    goBack();
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.hideProgress();
                }

            
            {
                this$0 = AccessibilitySettingsView.this;
                super();
            }
            });
            return;
        } else
        {
            goBack();
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        toolbar.setTitle(getContext().getString(0x7f0702cf));
        servicesOptionNone.setOnClickListener(new android.view.View.OnClickListener() {

            final AccessibilitySettingsView this$0;

            public void onClick(View view)
            {
                setSelectedService(0);
            }

            
            {
                this$0 = AccessibilitySettingsView.this;
                super();
            }
        });
        servicesOptionAccess.setOnClickListener(new android.view.View.OnClickListener() {

            final AccessibilitySettingsView this$0;

            public void onClick(View view)
            {
                setSelectedService(1);
            }

            
            {
                this$0 = AccessibilitySettingsView.this;
                super();
            }
        });
        if (userProvider.getUser().isWheelchairNeeded())
        {
            servicesOptionAccess.setChecked(true);
            return;
        } else
        {
            servicesOptionNone.setChecked(true);
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


}
