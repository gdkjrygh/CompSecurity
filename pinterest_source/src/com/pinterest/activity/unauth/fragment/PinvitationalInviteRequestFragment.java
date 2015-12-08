// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.signin.dialog.InviteCodeInvalidDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.spring.SpringInterpolator;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            PinvitationalUnauthWallBaseFragment

public class PinvitationalInviteRequestFragment extends PinvitationalUnauthWallBaseFragment
{

    ViewGroup _confirmationTextContainer;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _hasInvalidInviteCode;
    View _requestInviteButton;
    ViewGroup _requestTextContainer;
    TextView _sendToTextView;

    public PinvitationalInviteRequestFragment()
    {
        _hasInvalidInviteCode = false;
        _eventsSubscriber = new _cls1();
    }

    private void transitToConfirmation(String s)
    {
        Pinalytics.a(ElementType.PINVITATIONAL_REQUEST_INVITE_SUBMITTED);
        _sendToTextView.setText(Html.fromHtml(String.format(getString(0x7f070433), new Object[] {
            s
        })));
        _confirmationTextContainer.setTranslationY(-60F);
        s = ObjectAnimator.ofFloat(_requestTextContainer, "alpha", new float[] {
            1.0F, 0.0F
        });
        s.setDuration(350L);
        Object obj = ObjectAnimator.ofFloat(_confirmationTextContainer, "alpha", new float[] {
            0.0F, 1.0F
        });
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_confirmationTextContainer, "translationY", new float[] {
            -60F, 0.0F
        });
        objectanimator.setInterpolator(new SpringInterpolator(0.65F, 0.3F));
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setStartDelay(100L);
        animatorset.setDuration(550L);
        animatorset.playTogether(new Animator[] {
            obj, objectanimator
        });
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playSequentially(new Animator[] {
            s, animatorset
        });
        ((AnimatorSet) (obj)).addListener(new _cls2());
        ((AnimatorSet) (obj)).start();
    }

    protected void dismissConfirmation()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_confirmationTextContainer, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(450L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_requestTextContainer, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator1.setStartDelay(100L);
        objectanimator1.setDuration(450L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playSequentially(new Animator[] {
            objectanimator, objectanimator1
        });
        animatorset.setStartDelay(4000L);
        animatorset.start();
    }

    void onButtonClick(View view)
    {
        if (view == _requestInviteButton)
        {
            AnalyticsApi.c("wl_dg_opened");
            DialogHelper.goPinvitationalRequestInvite(null);
            return;
        } else
        {
            AnalyticsApi.c("signin_opened");
            UnauthHelper.onClick(view, getActivity());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f9;
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/remote/PinvitationalApi$PinvitationalRequestInviteResult
        });
        super.onDestroyView();
    }

    public void onResume()
    {
        super.onResume();
        if (_hasInvalidInviteCode)
        {
            Events.postDelayed(new DialogEvent(new InviteCodeInvalidDialog()), 500L);
        }
        AnalyticsApi.c("wl_landed");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Events.register(_eventsSubscriber, com/pinterest/api/remote/PinvitationalApi$PinvitationalRequestInviteResult, new Class[0]);
        view = getArguments();
        if (view != null)
        {
            _hasInvalidInviteCode = view.getBoolean("com.pinterest.EXTRA_SIGNUP_HAS_INVALID_INVITE_CODE", false);
        }
    }


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinvitationalInviteRequestFragment this$0;

        public void onEventMainThread(com.pinterest.api.remote.PinvitationalApi.PinvitationalRequestInviteResult pinvitationalrequestinviteresult)
        {
            transitToConfirmation(pinvitationalrequestinviteresult.a());
        }

        _cls1()
        {
            this$0 = PinvitationalInviteRequestFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final PinvitationalInviteRequestFragment this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            dismissConfirmation();
        }

        _cls2()
        {
            this$0 = PinvitationalInviteRequestFragment.this;
            super();
        }
    }

}
