// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksVerifyEmailView

public class WorkPerksVerifyEmailScreenView extends LinearLayout
{

    AppFlow appFlow;
    private final EnterpriseScreens.WorkPerksVerifyEmailScreen params;
    Toolbar toolbar;
    WorkPerksVerifyEmailView workPerksVerifyEmailView;

    public WorkPerksVerifyEmailScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksVerifyEmailScreen)context.a();
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
