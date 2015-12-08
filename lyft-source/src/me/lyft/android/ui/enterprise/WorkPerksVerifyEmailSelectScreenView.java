// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksVerifyEmailView

public class WorkPerksVerifyEmailSelectScreenView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private final EnterpriseScreens.WorkPerksVerifyEmailSelectScreen params;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    WorkPerksVerifyEmailView workPerksVerifyEmailView;

    public WorkPerksVerifyEmailSelectScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksVerifyEmailSelectScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        slideMenuController.enableMenu();
    }

    public boolean onBack()
    {
        appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f0702d4));
        String s;
        if (params.getUserOrganization().getOrganization() != null)
        {
            s = params.getUserOrganization().getOrganization().getEmail();
        } else
        {
            s = "";
        }
        if (!Strings.isNullOrEmpty(s))
        {
            workPerksVerifyEmailView.setContentViewProperties(s, params.getUserOrganization());
        }
    }
}
