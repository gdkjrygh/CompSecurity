// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;
import com.pinterest.ui.grid.board.BoardCropCoverView;

public class BoardCropCoverFragment extends BaseFragment
{

    private String _boardId;
    BoardCropCoverView _contentView;
    private BaseDialog _dialog;
    private String _imageUrl;
    private String _pinId;
    public ApiResponseHandler onBoardCoverSubmitted;

    public BoardCropCoverFragment()
    {
        onBoardCoverSubmitted = new _cls3();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300a9;
        _menuId = -1;
        _dialog = (BaseDialog)getParentFragment();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ButterKnife.a(this, layoutinflater);
        _contentView.setImageUrl(_imageUrl);
        _contentView.setApiTag(getApiTag());
        return layoutinflater;
    }

    public void onPause()
    {
        _dialog.setPositiveButton(null, null);
        _dialog.setNegativeButton(null, null);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        _dialog.setPositiveButton(0x7f070208, new _cls1());
        _dialog.setNegativeButton(0x7f07006f, new _cls2());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        navigation = navigation.getModelAsPin();
        if (navigation != null)
        {
            _boardId = navigation.getBoardUid();
            _pinId = navigation.getUid();
            _imageUrl = navigation.getImagePreferredUrl();
        }
    }




    private class _cls3 extends ApiResponseHandler
    {

        final BoardCropCoverFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Events.postSticky(new com.pinterest.events.FeedEvents.MyBoardsInvalidated());
            Application.showToastShort(Resources.string(0x7f070092));
            Pinalytics.a(EventType.BOARD_EDIT, _boardId);
            _dialog.dismiss();
        }

        _cls3()
        {
            this$0 = BoardCropCoverFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardCropCoverFragment this$0;

        public void onClick(View view)
        {
            _contentView.submit(_boardId, _pinId, onBoardCoverSubmitted);
        }

        _cls1()
        {
            this$0 = BoardCropCoverFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BoardCropCoverFragment this$0;

        public void onClick(View view)
        {
            _dialog.pressBackButton();
        }

        _cls2()
        {
            this$0 = BoardCropCoverFragment.this;
            super();
        }
    }

}
