// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.work.InviteTextDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationBenefitDetailsDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationBenefitStatusDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationPromotionDetailsDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationPromotionStatusDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class WorkPerksInviteCoworkersView extends LinearLayout
{

    private static final String INVITE_COWORKERS_BUTTON = "Invite coworkers";
    private static final String LEARN_MORE_BUTTON = "Learn more";
    private static final String SHARE_VIA = "Share via";
    private static final String TEXT_PLAIN = "text/plain";
    AppFlow appFlow;
    Binder binder;
    String company;
    TextView coworkersNeededTextView;
    TextView coworkersRegisteredTextView;
    String email;
    TextView emailOrOrganizationTextView;
    Button inviteCoworkersButton;
    TextView inviteCoworkersDescriptionTextView;
    TextView inviteCoworkersHeaderTextView;
    InviteTextDTO inviteText;
    Boolean noBenefit;
    private Action1 onToolbarItemClicked;
    OrganizationDTO organization;
    private final EnterpriseScreens.WorkPerksScreen params;
    FrameLayout progressBarFrameLayout;
    View progressBarView;
    TextView remainBalanceTextView;
    UserOrganizationDTO userOrganization;

    public WorkPerksInviteCoworkersView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        noBenefit = Boolean.valueOf(false);
        onToolbarItemClicked = new Action1() {

            final WorkPerksInviteCoworkersView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0017)
                {
                    appFlow.goTo(new EnterpriseScreens.WorkPerksEditEmailScreen(email, userOrganization));
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = WorkPerksInviteCoworkersView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksScreen)context.a();
    }

    private String getMailBody()
    {
        return (String)Objects.firstNonNull(inviteText.getEmailBody(), "");
    }

    private String getMailSubject()
    {
        return (String)Objects.firstNonNull(inviteText.getEmailSubject(), "");
    }

    private int getPercent(Integer integer, Integer integer1)
    {
        byte byte0 = 100;
        int i = (int)((double)integer.intValue() * 100D) / integer1.intValue();
        if (i < 0)
        {
            byte0 = 0;
        } else
        if (i < 100)
        {
            return i;
        }
        return byte0;
    }

    private int getProgressBarFrameLayoutWidth()
    {
        return (int)((float)progressBarFrameLayout.getLayoutParams().width / getResources().getDisplayMetrics().density);
    }

    private void onInviteCoworkersButtonClicked()
    {
        if (noBenefit.booleanValue())
        {
            WebBrowser.open(getContext(), (String)Objects.firstNonNull(inviteText.getBenefitsUrl(), ""));
            return;
        } else
        {
            startSendTextIntent();
            return;
        }
    }

    private void setContentViewProperties()
    {
        userOrganization = params.getUserOrganization();
        organization = (OrganizationDTO)Objects.firstNonNull(userOrganization.getOrganization(), new OrganizationDTO(null, null, null, null, null, null, null, null, null));
        inviteText = (InviteTextDTO)Objects.firstNonNull(userOrganization.getInviteText(), new InviteTextDTO(null, null, null, null));
        Object obj;
        String s1;
        String s2;
        Object obj1;
        Integer integer;
        Integer integer1;
        int i;
        boolean flag;
        if (organization.getPromotionStatus() != null)
        {
            i = organization.getPromotionStatus().getRegistered().intValue();
        } else
        {
            i = 0;
        }
        integer = Integer.valueOf(i);
        company = (String)Objects.firstNonNull(organization.getName(), "");
        if (organization.getPromotionStatus() != null)
        {
            i = organization.getPromotionStatus().getNeeded().intValue();
        } else
        {
            i = 50;
        }
        integer1 = Integer.valueOf(i);
        if (organization.getPromotionStatus() != null)
        {
            obj = organization.getPromotionStatus().getPromotionHeader();
        } else
        {
            obj = "";
        }
        if (!Strings.isNullOrEmpty(organization.getStatus()) && "unapproved".equalsIgnoreCase(organization.getStatus()) && Strings.isNullOrEmpty(((String) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        noBenefit = Boolean.valueOf(flag);
        if (noBenefit.booleanValue())
        {
            s1 = "Learn more";
        } else
        {
            s1 = "Invite coworkers";
        }
        obj1 = params.getEmail();
        s2 = ((String) (obj1));
        if (Strings.isNullOrEmpty(((String) (obj1))))
        {
            s2 = (String)Objects.firstNonNull(organization.getEmail(), "");
        }
        email = s2;
        obj1 = emailOrOrganizationTextView;
        if (Strings.isNullOrEmpty(company))
        {
            s2 = email;
        } else
        {
            s2 = company;
        }
        ((TextView) (obj1)).setText(s2);
        inviteCoworkersButton.setText(s1);
        remainBalanceTextView.setVisibility(8);
        coworkersRegisteredTextView.setVisibility(8);
        progressBarFrameLayout.setVisibility(8);
        coworkersNeededTextView.setVisibility(8);
        if (!Strings.isNullOrEmpty(organization.getStatus()) && "approved".equalsIgnoreCase(organization.getStatus()))
        {
            obj = new OrganizationBenefitDetailsDTO(null, null, null);
            s1 = (String)Objects.firstNonNull(((OrganizationBenefitDetailsDTO)Objects.firstNonNull(organization.getBenefitDetails(), obj)).getBenefitCredit(), "");
            if (Strings.isNullOrEmpty(s1))
            {
                setPromotionLayout();
                return;
            } else
            {
                inviteCoworkersHeaderTextView.setText((CharSequence)Objects.firstNonNull(((OrganizationBenefitDetailsDTO)Objects.firstNonNull(organization.getBenefitDetails(), obj)).getBenefitDescription(), ""));
                inviteCoworkersDescriptionTextView.setText((CharSequence)Objects.firstNonNull(((OrganizationBenefitDetailsDTO)Objects.firstNonNull(organization.getBenefitDetails(), obj)).getBenefitRestriction(), ""));
                inviteCoworkersDescriptionTextView.setTextAppearance(getContext().getApplicationContext(), 0x7f0900cd);
                inviteCoworkersDescriptionTextView.setTypeface(null, 2);
                remainBalanceTextView.setText(s1);
                remainBalanceTextView.setVisibility(0);
                return;
            }
        }
        if (!Strings.isNullOrEmpty(organization.getStatus()) && "unapproved".equalsIgnoreCase(organization.getStatus()))
        {
            if (Boolean.valueOf(Strings.isNullOrEmpty(((String) (obj)))).booleanValue())
            {
                setNoBenefitLayouts();
                return;
            }
            inviteCoworkersHeaderTextView.setText(((CharSequence) (obj)));
            if (organization.getPromotionStatus() != null)
            {
                obj = organization.getPromotionStatus().getPromotionDescription();
            } else
            {
                obj = "";
            }
            inviteCoworkersDescriptionTextView.setText(((CharSequence) (obj)));
            if (integer.intValue() < integer1.intValue())
            {
                updateProgress(getPercent(integer, integer1));
                int j = integer1.intValue();
                int k = integer.intValue();
                coworkersNeededTextView.setText(getContext().getString(0x7f0701b3, new Object[] {
                    Integer.valueOf(j - k).toString()
                }));
                coworkersNeededTextView.setTextColor(0xff000000);
                coworkersRegisteredTextView.setText(getContext().getString(0x7f0701b4, new Object[] {
                    integer.toString(), ""
                }));
            } else
            {
                updateProgress(getPercent(integer, integer1));
                coworkersRegisteredTextView.setGravity(17);
                String s;
                if (organization.getPromotionStatus() != null)
                {
                    s = organization.getPromotionStatus().getPendingApprovalText();
                } else
                {
                    s = "";
                }
                coworkersNeededTextView.setText(s);
                coworkersNeededTextView.setGravity(17);
                coworkersNeededTextView.setTextColor(0xff000000);
                coworkersRegisteredTextView.setText(getContext().getString(0x7f0701b4, new Object[] {
                    integer.toString(), "!"
                }));
            }
            coworkersRegisteredTextView.setVisibility(0);
            progressBarFrameLayout.setVisibility(0);
            coworkersNeededTextView.setVisibility(0);
            return;
        } else
        {
            setNoBenefitLayouts();
            return;
        }
    }

    private void setNoBenefitLayouts()
    {
        boolean flag;
        if (organization.getBenefitStatus() == null || Strings.isNullOrEmpty(organization.getBenefitStatus().getBenefitHeader()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Boolean.valueOf(flag).booleanValue())
        {
            inviteCoworkersHeaderTextView.setText(getContext().getString(0x7f070394));
            inviteCoworkersDescriptionTextView.setText(getContext().getString(0x7f070393, new Object[] {
                company
            }));
            return;
        } else
        {
            inviteCoworkersHeaderTextView.setText((CharSequence)Objects.firstNonNull(organization.getBenefitStatus().getBenefitHeader(), ""));
            inviteCoworkersDescriptionTextView.setText((CharSequence)Objects.firstNonNull(organization.getBenefitStatus().getBenefitDescription(), ""));
            return;
        }
    }

    private void setPromotionLayout()
    {
        TextView textview = inviteCoworkersHeaderTextView;
        String s;
        if (organization.getPromotionDetails() != null)
        {
            s = organization.getPromotionDetails().getPromotionHeader();
        } else
        {
            s = "";
        }
        textview.setText(s);
        textview = inviteCoworkersDescriptionTextView;
        if (organization.getPromotionDetails() != null)
        {
            s = organization.getPromotionDetails().getPromotionDescription();
        } else
        {
            s = "";
        }
        textview.setText(s);
    }

    private void startSendTextIntent()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", getMailBody());
        intent.putExtra("android.intent.extra.SUBJECT", getMailSubject());
        intent = Intent.createChooser(intent, "Share via");
        getContext().startActivity(intent);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Toolbar toolbar = (Toolbar)((ViewGroup)getParent()).findViewById(0x7f0d002c);
        toolbar.clearItems().addItem(0x7f0d0017, 0x7f020104);
        binder = Binder.attach(this);
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        binder.detach();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        setContentViewProperties();
        inviteCoworkersButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WorkPerksInviteCoworkersView this$0;

            public void onClick(View view)
            {
                onInviteCoworkersButtonClicked();
            }

            
            {
                this$0 = WorkPerksInviteCoworkersView.this;
                super();
            }
        });
    }

    public void updateProgress(int i)
    {
        int j;
        j = getProgressBarFrameLayoutWidth();
        i = (int)((float)((double)j / 100D) * (float)i);
        if (i <= j) goto _L2; else goto _L1
_L1:
        i = j;
_L4:
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams((int)TypedValue.applyDimension(1, i, getResources().getDisplayMetrics()), -1);
        progressBarView.setLayoutParams(layoutparams);
        return;
_L2:
        if (i < 0)
        {
            i = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
