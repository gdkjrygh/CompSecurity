// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationUnverifiedDetailsDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;

public class WorkPerksVerifyEmailView extends FrameLayout
{

    AppFlow appFlow;
    private OrganizationDTO organization;
    private OrganizationUnverifiedDetailsDTO unverifiedDetails;
    private UserOrganizationDTO userOrganization;
    private String verifyEmail;
    TextView workPerksEmailTextView;
    TextView workPerksVerifyEmailDescription;
    TextView workPerksVerifyEmailHeader;

    public WorkPerksVerifyEmailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    void onResendButtonClicked()
    {
        appFlow.replaceWith(new EnterpriseScreens.WorkPerksEnterEmailScreen(verifyEmail, userOrganization));
    }

    public void setContentViewProperties(String s, UserOrganizationDTO userorganizationdto)
    {
        userOrganization = userorganizationdto;
        organization = (OrganizationDTO)Objects.firstNonNull(userorganizationdto.getOrganization(), new OrganizationDTO(null, null, null, null, null, null, null, null, null));
        unverifiedDetails = (OrganizationUnverifiedDetailsDTO)Objects.firstNonNull(organization.getUnverifiedDetails(), new OrganizationUnverifiedDetailsDTO(null, null));
        workPerksVerifyEmailHeader.setText((CharSequence)Objects.firstNonNull(unverifiedDetails.getUnverifiedHeader(), ""));
        workPerksVerifyEmailDescription.setText((CharSequence)Objects.firstNonNull(unverifiedDetails.getUnverifiedDescription(), ""));
        verifyEmail = s;
        if (Strings.isNullOrEmpty(verifyEmail))
        {
            verifyEmail = (String)Objects.firstNonNull(organization.getEmail(), "");
        }
        if (!Strings.isNullOrEmpty(verifyEmail))
        {
            workPerksEmailTextView.setText(verifyEmail.toString());
        }
    }
}
