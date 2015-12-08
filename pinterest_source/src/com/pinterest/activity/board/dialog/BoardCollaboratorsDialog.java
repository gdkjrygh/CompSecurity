// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.app.Activity;
import android.os.Bundle;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardBaseDialog

public class BoardCollaboratorsDialog extends BoardBaseDialog
{

    private PeopleListAdapter _adapter;
    private com.pinterest.api.remote.UserApi.UserFeedApiResponse onCollaboratorsLoaded;
    private android.widget.AdapterView.OnItemClickListener onPersonClicked;

    public BoardCollaboratorsDialog()
    {
        onPersonClicked = new _cls2();
        onCollaboratorsLoaded = new _cls3();
    }

    private void loadMore()
    {
        if (_adapter != null)
        {
            Object obj = _adapter.getDataSource();
            if (obj != null)
            {
                obj = ((Feed) (obj)).getNextUrl();
                if (obj != null)
                {
                    BaseApi.e(((String) (obj)), onCollaboratorsLoaded, null);
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f070087);
        BoardApi.a(String.valueOf(_boardUid), false, onCollaboratorsLoaded, null);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        _adapter = new PeopleListAdapter(activity);
        _adapter.setListener(new _cls1());
        setListViewOptions(_adapter, onPersonClicked);
    }

    public void onDetach()
    {
        if (_adapter != null)
        {
            _adapter.setListener(null);
        }
        _adapter = null;
        super.onDetach();
    }






    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BoardCollaboratorsDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_adapter != null)
            {
                adapterview = _adapter.getItem(i);
                if (adapterview != null)
                {
                    Events.post(new Navigation(Location.USER, adapterview));
                    dismiss();
                }
            }
        }

        _cls2()
        {
            this$0 = BoardCollaboratorsDialog.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final BoardCollaboratorsDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
label0:
            {
                super.onFailure(throwable, apiresponse);
                if (_adapter != null)
                {
                    if (_adapter.getCount() != 0)
                    {
                        break label0;
                    }
                    dismiss();
                }
                return;
            }
            AdapterFooterView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onStart()
        {
            AdapterFooterView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(Feed feed)
        {
            onSuccess(feed);
            if (_adapter != null)
            {
                if (_adapter.getCount() == 0)
                {
                    Board board = ModelHelper.getBoard(_boardUid);
                    if (board != null)
                    {
                        feed.appendItem(board.getUser());
                    }
                    _adapter.setDataSource((UserFeed)feed);
                } else
                {
                    _adapter.appendItems((UserFeed)feed);
                    _adapter.finishedLoading();
                }
                _adapter.notifyDataSetChanged();
                AdapterFooterView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        _cls3()
        {
            this$0 = BoardCollaboratorsDialog.this;
            super();
        }
    }


    private class _cls1
        implements com.pinterest.adapter.PeopleListAdapter.PeopleListListener
    {

        final BoardCollaboratorsDialog this$0;

        public void loadMore()
        {
            BoardCollaboratorsDialog.this.loadMore();
        }

        _cls1()
        {
            this$0 = BoardCollaboratorsDialog.this;
            super();
        }
    }

}
