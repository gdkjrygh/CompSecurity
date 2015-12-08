// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.events.OverrideNavigationEvent;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.BoardInfo;

public class UnauthSignupBoardScrollFragment extends PinterestGridFragment
{

    BoardInfo _boardInfo;
    LinearLayout _boardPageBottom;
    TextView _boardTitle;
    View _emailBt;
    View _emailboardBt;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    View _gplusBt;
    View _gradient;
    PinGridAdapter _pinGridAdapter;
    LinearLayout _signup;
    TextView _subtitle;
    TextView _title;
    private com.pinterest.api.remote.BoardApi.BoardApiResponse onBoardLoaded;
    private com.pinterest.api.remote.PinApi.PinFeedApiResponse onPinsLoaded;

    public UnauthSignupBoardScrollFragment()
    {
        onBoardLoaded = new _cls1();
        onPinsLoaded = new _cls2(gridResponseHandler);
        _eventsSubscriber = new _cls3();
    }

    private void changeGradientColor()
    {
        if (getArguments().getBoolean("com.pinterest.EXTRA_GRADIENT_BLACK"))
        {
            _gradient.setBackgroundResource(0x7f020045);
            _signup.setBackgroundColor(getResources().getColor(0x7f0e000f));
            _title.setTextColor(getResources().getColor(0x7f0e00bf));
            _subtitle.setTextColor(getResources().getColor(0x7f0e00bf));
        }
    }

    private void showBoardPage()
    {
        String s = getArguments().getString("com.pinterest.EXTRA_BOARD_ID");
        BoardApi.a(s, false, onBoardLoaded, getApiTag());
        BoardApi.b(s, onPinsLoaded, getApiTag());
    }

    private void showBottom()
    {
        changeGradientColor();
        _boardPageBottom.setVisibility(0);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        _pinGridAdapter.setOverrideClicks(true);
    }

    void onButtonClick(View view)
    {
        if (_emailBt == view || _emailboardBt == view)
        {
            if (_emailboardBt == view)
            {
                AnalyticsApi.a("email_signup_board_click");
            }
            AnalyticsApi.a("email_signup_click");
            DialogHelper.goEmailSignup();
            return;
        } else
        {
            UnauthHelper.onClick(view, getActivity());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Events.register(_eventsSubscriber, com/pinterest/events/OverrideNavigationEvent, new Class[0]);
        _layoutId = 0x7f030114;
        bundle = new PinGridAdapter();
        bundle.setRenderCompactUserOnly(true);
        _adapter = bundle;
        _pinGridAdapter = bundle;
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsApi.a("unauth_signup_board");
        AnalyticsApi.a("unauth_home");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        ButterKnife.a(this, view);
        ViewHelper.setVisibility(_gplusBt, GooglePlayServices.isAvailable());
        showBoardPage();
    }


    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final UnauthSignupBoardScrollFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, (new StringBuilder("Could not load board for warm app signup: ")).append(apiresponse.toString()).toString(), new Object[0]);
            FragmentHelper.replaceFragment(getActivity(), new InspiredWallFragment(), false);
        }

        public void onSuccess(Board board)
        {
            super.onSuccess(board);
            _boardTitle.setText(board.getName());
            _boardInfo.setBoard(board, false);
        }

        _cls1()
        {
            this$0 = UnauthSignupBoardScrollFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        final UnauthSignupBoardScrollFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error((new StringBuilder("Pins missing from board data: ")).append(apiresponse).toString(), new Object[0]);
            FragmentHelper.replaceFragment(getActivity(), new InspiredWallFragment(), false);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            class _cls1 extends BackgroundTask
            {

                final _cls2 this$1;

                public void run()
                {
                    showBottom();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            (new _cls1()).schedule(100L);
        }

        _cls2(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = UnauthSignupBoardScrollFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UnauthSignupBoardScrollFragment this$0;

        public void onEventMainThread(OverrideNavigationEvent overridenavigationevent)
        {
            if (overridenavigationevent.a() != 2)
            {
                return;
            } else
            {
                Object obj = overridenavigationevent.b();
                overridenavigationevent = new Bundle();
                overridenavigationevent.putString("com.pinterest.EXTRA_PIN_ID", ((String) (obj)));
                obj = new UnauthSignupPinFragment();
                ((BaseFragment) (obj)).setArguments(overridenavigationevent);
                FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true);
                return;
            }
        }

        _cls3()
        {
            this$0 = UnauthSignupBoardScrollFragment.this;
            super();
        }
    }

}
