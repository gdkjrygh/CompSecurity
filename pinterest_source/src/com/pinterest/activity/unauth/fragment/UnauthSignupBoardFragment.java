// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.BoardInfo;
import com.pinterest.ui.imageview.WebImageView;

public class UnauthSignupBoardFragment extends PinterestGridFragment
{

    BoardInfo _boardInfo;
    LinearLayout _boardPage;
    TextView _boardTitle;
    View _emailBt;
    View _emailboardBt;
    WebImageView _fallbackImage;
    View _gplusBt;
    View _gradient;
    RelativeLayout _overlay;
    TextView _title;
    private com.pinterest.api.remote.BoardApi.BoardApiResponse onBoardLoaded;
    private com.pinterest.api.remote.PinApi.PinFeedApiResponse onPinsLoaded;

    public UnauthSignupBoardFragment()
    {
        onBoardLoaded = new _cls1();
        onPinsLoaded = new _cls2(gridResponseHandler);
    }

    private void showBoardPage()
    {
        String s = getArguments().getString("com.pinterest.EXTRA_BOARD_ID");
        BoardApi.a(s, false, onBoardLoaded, getApiTag());
        BoardApi.b(s, onPinsLoaded, getApiTag());
    }

    private void showFallback()
    {
        _overlay.setVisibility(4);
        _boardPage.setVisibility(4);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(0x7f020048);
        _fallbackImage.setImageDrawable(drawable, true);
        _fallbackImage.setVisibility(0);
        _gradient.setVisibility(0);
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
        _layoutId = 0x7f030113;
        bundle = new PinGridAdapter();
        bundle.setRenderCompactUserOnly(true);
        _adapter = bundle;
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
        _title.setText(Html.fromHtml(getString(0x7f0705e5)));
        showBoardPage();
    }


    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final UnauthSignupBoardFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, (new StringBuilder("Could not load board for warm app signup: ")).append(apiresponse.toString()).toString(), new Object[0]);
            showFallback();
        }

        public void onSuccess(Board board)
        {
            super.onSuccess(board);
            if (_boardTitle == null || _boardInfo == null)
            {
                return;
            } else
            {
                _boardTitle.setText(board.getName());
                _boardInfo.setBoard(board, false);
                return;
            }
        }

        _cls1()
        {
            this$0 = UnauthSignupBoardFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        final UnauthSignupBoardFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, (new StringBuilder("Pins missing from board data: ")).append(apiresponse.toString()).toString(), new Object[0]);
            showFallback();
        }

        _cls2(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = UnauthSignupBoardFragment.this;
            super(feedapiresponsehandler);
        }
    }

}
