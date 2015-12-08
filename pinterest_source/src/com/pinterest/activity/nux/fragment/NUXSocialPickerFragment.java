// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.activity.nux.adapter.NUXSocialAdapter;
import com.pinterest.activity.nux.view.NUXContinueBar;
import com.pinterest.activity.nux.view.NUXHeaderView;
import com.pinterest.activity.nux.view.NUXSocialSkipDialog;
import com.pinterest.activity.nux.view.NUXSocialTabBar;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.experience.ExperienceEnabled;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXEndScreenFragment, NUXInterestsPickerFragment

public class NUXSocialPickerFragment extends BaseFragment
    implements ExperienceEnabled
{

    NUXContinueBar _continueBar;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    NUXHeaderView _header;
    NUXSocialTabBar _socialActionBar;
    private NUXSocialAdapter _viewAdapter;
    private boolean firstPageLoad;
    NUXNextFragmentListener nextFragmentListener;
    private com.pinterest.ui.tab.TabBar.Listener onTabChanged;

    public NUXSocialPickerFragment()
    {
        onTabChanged = new _cls2();
        _eventsSubscriber = new _cls3();
        nextFragmentListener = new _cls4();
        firstPageLoad = true;
    }

    private void loadMyUser()
    {
        MyUserApi.a(new _cls1(true), getApiTag());
    }

    private void skipToNextFragment()
    {
        goToNextFragment();
    }

    public void applyExperience()
    {
        Object obj;
        obj = Experiences.a(Experiences.b);
        break MISSING_BLOCK_LABEL_7;
        if (obj != null && (((ExperienceValue) (obj)).f instanceof NuxDisplayData))
        {
            obj = ((NuxDisplayData)((ExperienceValue) (obj)).f).b();
            if (obj != null)
            {
                _header.applyExperience(((NuxStep) (obj)));
                _continueBar.applyExperience(((NuxStep) (obj)));
                return;
            }
        }
        return;
    }

    public void goToNextFragment()
    {
        if (getActivity() != null)
        {
            _viewAdapter.submitSocialUsers();
            if (getActivity() != null)
            {
                Object obj = NuxDisplayData.c();
                if (obj == null)
                {
                    obj = new NUXEndScreenFragment();
                } else
                {
                    obj = ((NuxDisplayData) (obj)).a(((NuxDisplayData) (obj)).b());
                    if (obj != null && ((NuxStep) (obj)).c())
                    {
                        obj = new NUXInterestsPickerFragment();
                    } else
                    {
                        obj = new NUXEndScreenFragment();
                    }
                }
                FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), false, com.pinterest.activity.FragmentHelper.Animation.SLIDE);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ea;
    }

    public void onDestroy()
    {
        Events.post(new DialogEvent(null));
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.a(this);
    }

    public void onNextButtonClicked()
    {
        if (getActivity() == null)
        {
            return;
        }
        if (MyUser.isConnectedToFacebook() && MyUser.isConnectedToTwitter())
        {
            goToNextFragment();
            return;
        } else
        {
            NUXSocialSkipDialog nuxsocialskipdialog = new NUXSocialSkipDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("socialType", _viewAdapter.getCurrentFragmentCount());
            nuxsocialskipdialog.setArguments(bundle);
            nuxsocialskipdialog.setNegativeButton(0x7f07055f, new _cls5());
            Events.post(new DialogEvent(nuxsocialskipdialog));
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/base/Social$UpdateEvent, com/pinterest/activity/nux/NUXActivity$NUXProgressChangeEvent, com/pinterest/activity/nux/fragment/NUXSocialPickerFragment$GridViewScrolledEvent, com/pinterest/activity/nux/fragment/NUXSocialPickerFragment$SocialConnectedEvent
        });
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/base/Social$UpdateEvent, new Class[] {
            com/pinterest/activity/nux/NUXActivity$NUXProgressChangeEvent, com/pinterest/activity/nux/fragment/NUXSocialPickerFragment$GridViewScrolledEvent, com/pinterest/activity/nux/fragment/NUXSocialPickerFragment$SocialConnectedEvent
        });
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        int i = 0;
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        AnalyticsApi.b("friends_connect_start");
        _header.setSkipListener(nextFragmentListener);
        _header.setTitle(getResources().getString(0x7f0703c6));
        _header.setSkipTitle(com.pinterest.kit.application.Resources.string(0x7f0703b6));
        _header.setTitleDesc(getResources().getString(0x7f0703c5));
        _header.setSkipDesc(com.pinterest.kit.application.Resources.string(0x7f0703ba));
        _header.setSkipPosTx(com.pinterest.kit.application.Resources.string(0x7f0703b9));
        _header.setSkipNegTx(com.pinterest.kit.application.Resources.string(0x7f07055f));
        _socialActionBar.setListener(onTabChanged);
        _socialActionBar.setCurrentIndex(2);
        _continueBar.popInAnimate();
        _continueBar.setContinueListener(nextFragmentListener);
        _continueBar.updateText(0x7f0703b2);
        _continueBar.setContinueText(com.pinterest.kit.application.Resources.string(0x7f0703bb));
        _viewAdapter = new NUXSocialAdapter();
        view = getChildFragmentManager().beginTransaction();
        if (view != null)
        {
            view.add(0x7f0f0296, _viewAdapter.getItem(0), null);
            view.add(0x7f0f0296, _viewAdapter.getItem(1), null);
            view.add(0x7f0f0296, _viewAdapter.getItem(2), null);
            for (; i < _viewAdapter.getCount(); i++)
            {
                view.hide(_viewAdapter.getItem(i));
            }

            view.show(_viewAdapter.getCurrentFragment());
            view.commit();
        }
        loadMyUser();
        applyExperience();
    }

    public void selectNewTabView(int i)
    {
        FragmentActivity fragmentactivity = getActivity();
        FragmentTransaction fragmenttransaction = null;
        _socialActionBar.setCurrentIndex(i);
        if (fragmentactivity != null)
        {
            fragmenttransaction = fragmentactivity.getSupportFragmentManager().beginTransaction();
        }
        if (fragmenttransaction != null)
        {
            fragmenttransaction.hide(_viewAdapter.getCurrentFragment());
            _viewAdapter.setCurrentFragment(i);
            fragmenttransaction.show(_viewAdapter.getCurrentFragment());
            fragmenttransaction.commit();
        }
        _continueBar.enableButton(_viewAdapter.isEitherSocialComplete());
    }



/*
    static boolean access$002(NUXSocialPickerFragment nuxsocialpickerfragment, boolean flag)
    {
        nuxsocialpickerfragment.firstPageLoad = flag;
        return flag;
    }

*/



    private class _cls2
        implements com.pinterest.ui.tab.TabBar.Listener
    {

        final NUXSocialPickerFragment this$0;

        public void onTabReselected(int i)
        {
            if (i == 0 && !MyUser.isConnectedToFacebook())
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
            } else
            if (i == 1 && !MyUser.isConnectedToTwitter())
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
                return;
            }
        }

        public void onTabSelected(int i)
        {
            firstPageLoad = false;
            if (i == 0 && !MyUser.isConnectedToFacebook())
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
                return;
            }
            if (i == 1 && !MyUser.isConnectedToTwitter())
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
                return;
            } else
            {
                selectNewTabView(i);
                return;
            }
        }

        _cls2()
        {
            this$0 = NUXSocialPickerFragment.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final NUXSocialPickerFragment this$0;

        public void onEventMainThread(com.pinterest.activity.nux.NUXActivity.NUXProgressChangeEvent nuxprogresschangeevent)
        {
            nuxprogresschangeevent = getActivity();
            if (nuxprogresschangeevent == null || firstPageLoad)
            {
                return;
            }
            if (nuxprogresschangeevent instanceof NUXActivity)
            {
                ((NUXActivity)getActivity()).setProgressVisibility(0);
            }
            _continueBar.enableButton(_viewAdapter.isEitherSocialComplete());
        }

        public void onEventMainThread(GridViewScrolledEvent gridviewscrolledevent)
        {
            if (gridviewscrolledevent.getY() > 20 && _header.getVisibility() == 0)
            {
                _header.setVisibility(8);
                return;
            } else
            {
                _header.setVisibility(0);
                return;
            }
        }

        public void onEventMainThread(SocialConnectedEvent socialconnectedevent)
        {
            Events.post(new DialogEvent(null));
            if (firstPageLoad)
            {
                return;
            }
            switch (socialconnectedevent.getType())
            {
            default:
                return;

            case 0: // '\0'
                selectNewTabView(0);
                return;

            case 1: // '\001'
                selectNewTabView(1);
                break;
            }
        }

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            if (updateevent.isConnected()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            _cls6..SwitchMap.com.pinterest.base.Social.Network[updateevent.getNetwork().ordinal()];
            JVM INSTR tableswitch 1 2: default 40
        //                       1 41
        //                       2 72;
               goto _L3 _L4 _L5
_L5:
            continue; /* Loop/switch isn't completed */
_L3:
            return;
_L4:
            if (_viewAdapter.getCurrentFragmentCount() == 0) goto _L1; else goto _L6
_L6:
            ((NUXSocialGridFragment)_viewAdapter.getItem(0)).loadData();
            return;
            if (_viewAdapter.getCurrentFragmentCount() == 1) goto _L1; else goto _L7
_L7:
            ((NUXSocialGridFragment)_viewAdapter.getItem(1)).loadData();
            return;
        }

        _cls3()
        {
            this$0 = NUXSocialPickerFragment.this;
            super();
        }

        private class GridViewScrolledEvent
        {

            private int _yPos;

            public final int getY()
            {
                return _yPos;
            }

            public GridViewScrolledEvent(int i)
            {
                _yPos = i;
            }
        }


        private class SocialConnectedEvent
        {

            private int _type;

            public final int getType()
            {
                return _type;
            }

            public SocialConnectedEvent(int i)
            {
                _type = i;
            }
        }


        private class _cls6
        {

            static final int $SwitchMap$com$pinterest$base$Social$Network[];

            static 
            {
                $SwitchMap$com$pinterest$base$Social$Network = new int[com.pinterest.base.Social.Network.values().length];
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.FACEBOOK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.TWITTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls4
        implements NUXNextFragmentListener
    {

        final NUXSocialPickerFragment this$0;

        public void nextFragment()
        {
            onNextButtonClicked();
        }

        public void skipFragment()
        {
            skipToNextFragment();
        }

        _cls4()
        {
            this$0 = NUXSocialPickerFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
    {

        final NUXSocialPickerFragment this$0;

        public void onSuccess(User user)
        {
            super.onSuccess(user);
        }

        _cls1(boolean flag)
        {
            this$0 = NUXSocialPickerFragment.this;
            super(flag);
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final NUXSocialPickerFragment this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(null));
            goToNextFragment();
        }

        _cls5()
        {
            this$0 = NUXSocialPickerFragment.this;
            super();
        }
    }

}
