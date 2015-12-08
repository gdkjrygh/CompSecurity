// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthWallActivity;
import com.pinterest.analytics.PinterestDeepLinkMetaData;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.DialogHostActivity;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.PhoneNumberSignupUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupPinFragment, UnauthSignupBoardFragment, PinvitationalInviteRequestFragment, PinvitationalSignupFragment, 
//            MultiStepSignupFragment, ContinueEmailSignupFragment, BrioSignupFragment

public class UnauthLoadingFragment extends BaseFragment
{

    private static final int API_TIMEOUT = 5000;
    private static final String INVITE_CODE_PARAM_KEY = "invite_code";
    Runnable _apiTimeout;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private volatile boolean _expCheckCompleted;
    private Handler _handler;
    private volatile boolean _hasInvalidInviteCode;
    private String _inviteCode;
    private volatile boolean _inviteCodeCheckCompleted;
    private String _inviteUrl;
    private volatile boolean _isPinvitational;
    private AtomicBoolean _nextStepCompleted;

    public UnauthLoadingFragment()
    {
        _isPinvitational = false;
        _hasInvalidInviteCode = false;
        _nextStepCompleted = new AtomicBoolean(false);
        _expCheckCompleted = false;
        _inviteCodeCheckCompleted = true;
        _apiTimeout = new _cls1();
        _eventsSubscriber = new _cls2();
    }

    private BaseFragment getWarmSignupFragment(com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject metadataobject)
    {
        Bundle bundle1 = null;
        Object obj = bundle1;
        if (metadataobject.a())
        {
            if (metadataobject.b())
            {
                bundle1 = new Bundle();
                bundle1.putString("com.pinterest.EXTRA_PIN_ID", metadataobject.e());
                obj = new UnauthSignupPinFragment();
                ((BaseFragment) (obj)).setArguments(bundle1);
            } else
            {
                obj = bundle1;
                if (metadataobject.c())
                {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.EXTRA_BOARD_ID", metadataobject.d());
                    metadataobject = new UnauthSignupBoardFragment();
                    metadataobject.setArguments(bundle);
                    return metadataobject;
                }
            }
        }
        return ((BaseFragment) (obj));
    }

    private void goToNextStep()
    {
        Object obj;
        if (getActivity() == null || !((DialogHostActivity)getActivity()).isRestored() || !_expCheckCompleted || !_inviteCodeCheckCompleted || !_nextStepCompleted.compareAndSet(false, true))
        {
            return;
        }
        _handler.removeCallbacks(_apiTimeout);
        obj = PinterestDeepLinkMetaData.a();
        PinterestDeepLinkMetaData pinterestdeeplinkmetadata = new PinterestDeepLinkMetaData();
        pinterestdeeplinkmetadata.getClass();
        obj = new com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject(pinterestdeeplinkmetadata, ((com.pinterest.network.json.PinterestJsonObject) (obj)));
        if (!_isPinvitational) goto _L2; else goto _L1
_L1:
        if (_inviteCode == null || _hasInvalidInviteCode)
        {
            obj = new PinvitationalInviteRequestFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.pinterest.EXTRA_SIGNUP_HAS_INVALID_INVITE_CODE", _hasInvalidInviteCode);
            ((BaseFragment) (obj)).setArguments(bundle);
        } else
        {
            obj = new PinvitationalSignupFragment();
            Bundle bundle1 = new Bundle();
            bundle1.putString("com.pinterest.EXTRA_SIGNUP_INVITE_CODE", _inviteCode);
            ((BaseFragment) (obj)).setArguments(bundle1);
        }
_L4:
        if (getActivity() instanceof UnauthWallActivity)
        {
            ((UnauthWallActivity)getActivity()).setActiveFragment(((BaseFragment) (obj)));
        }
        FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), false, com.pinterest.activity.FragmentHelper.Animation.FADE);
        return;
_L2:
        if (_inviteCode != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = getWarmSignupFragment(((com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject) (obj)));
        if (obj == null)
        {
            Experiments.a("android_multistep_signup");
            if (Experiments.c() || Experiments.i())
            {
                obj = new MultiStepSignupFragment();
            } else
            if (Experiments.h())
            {
                obj = new ContinueEmailSignupFragment();
            } else
            if (PhoneNumberSignupUtils.isCountrySupported(Locale.getDefault().getCountry()) && !Experiments.d())
            {
                Experiments.a("android_phone_number_signup");
                if (Experiments.e() || Experiments.g())
                {
                    obj = new MultiStepSignupFragment();
                } else
                {
                    obj = new BrioSignupFragment();
                }
            } else
            {
                obj = new BrioSignupFragment();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        ActivityHelper.gotoBrowser(getActivity(), _inviteUrl);
        return;
    }

    private void init()
    {
        _handler = new Handler();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030112;
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/experiment/Experiments$ExperimentsLoaded, com/pinterest/api/remote/AccountApi$InviteCodeValidationResult
        });
        super.onDestroyView();
    }

    public void onStart()
    {
        super.onStart();
        setActive(true);
        _handler.postDelayed(_apiTimeout, 5000L);
    }

    public void onStop()
    {
        super.onStop();
        _handler.removeCallbacks(_apiTimeout);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        init();
        Events.register(_eventsSubscriber, com/pinterest/experiment/Experiments$ExperimentsLoaded, new Class[] {
            com/pinterest/api/remote/AccountApi$InviteCodeValidationResult
        });
    }

    public void setInviteUrl(String s)
    {
        _inviteUrl = s;
        _inviteCodeCheckCompleted = false;
        try
        {
            _inviteCode = Uri.parse(_inviteUrl).getQueryParameter("invite_code");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.error(s, "exception occurred", new Object[0]);
        }
    }



/*
    static boolean access$002(UnauthLoadingFragment unauthloadingfragment, boolean flag)
    {
        unauthloadingfragment._expCheckCompleted = flag;
        return flag;
    }

*/



/*
    static boolean access$102(UnauthLoadingFragment unauthloadingfragment, boolean flag)
    {
        unauthloadingfragment._inviteCodeCheckCompleted = flag;
        return flag;
    }

*/




/*
    static boolean access$402(UnauthLoadingFragment unauthloadingfragment, boolean flag)
    {
        unauthloadingfragment._isPinvitational = flag;
        return flag;
    }

*/


/*
    static boolean access$502(UnauthLoadingFragment unauthloadingfragment, boolean flag)
    {
        unauthloadingfragment._hasInvalidInviteCode = flag;
        return flag;
    }

*/

    private class _cls1
        implements Runnable
    {

        final UnauthLoadingFragment this$0;

        public void run()
        {
            _expCheckCompleted = _inviteCodeCheckCompleted = true;
            goToNextStep();
        }

        _cls1()
        {
            this$0 = UnauthLoadingFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UnauthLoadingFragment this$0;

        public void onEventMainThread(com.pinterest.api.remote.AccountApi.InviteCodeValidationResult invitecodevalidationresult)
        {
            boolean flag = true;
            if (_nextStepCompleted.get() || _inviteCodeCheckCompleted)
            {
                return;
            }
            _inviteCodeCheckCompleted = true;
            UnauthLoadingFragment unauthloadingfragment = UnauthLoadingFragment.this;
            if (invitecodevalidationresult.a())
            {
                flag = false;
            }
            unauthloadingfragment._hasInvalidInviteCode = flag;
            goToNextStep();
        }

        public void onEventMainThread(com.pinterest.experiment.Experiments.ExperimentsLoaded experimentsloaded)
        {
            if (_nextStepCompleted.get() || _expCheckCompleted)
            {
                return;
            }
            _expCheckCompleted = true;
            if (experimentsloaded.a)
            {
                Experiments.a("pinvitational_philippines");
                _isPinvitational = Experiments.l();
            }
            goToNextStep();
        }

        _cls2()
        {
            this$0 = UnauthLoadingFragment.this;
            super();
        }
    }

}
