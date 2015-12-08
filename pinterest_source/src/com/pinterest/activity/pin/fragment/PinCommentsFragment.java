// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.pin.view.comments.PinCommentsStandaloneCell;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.CommentFeed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.ui.grid.AdapterFooterView;

public class PinCommentsFragment extends BaseFragment
{

    PinCommentsStandaloneCell _commentsCell;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    AdapterFooterView _footerView;
    private Pin _pin;

    public PinCommentsFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    private void loadPinComments()
    {
        PinApi.g(_navigation.getId(), new _cls2(), getApiTag());
    }

    private void updateDisplay(CommentFeed commentfeed)
    {
        while (commentfeed == null || _commentsCell == null) 
        {
            return;
        }
        _commentsCell.setComments(commentfeed);
    }

    public void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/api/model/Comment$CreateEvent, new Class[] {
            com/pinterest/api/model/Comment$UpdateEvent
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f1;
        loadPinComments();
    }

    public void onDeactivate()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Comment$CreateEvent, com/pinterest/api/model/Comment$UpdateEvent
        });
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f0700f2);
        _commentsCell.setPin(_pin);
        _commentsCell.setPrefillText(_navigation.getStringParcelable("com.pinterest.EXTRA_PREFILL_TEXT"));
        _footerView.setShadowVisibility(8);
        _footerView.setState(0);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _pin = navigation.getModelAsPin();
            return;
        }
    }





    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCommentsFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.Comment.CreateEvent createevent)
        {
            if (_pin != null && createevent != null && _commentsCell != null && createevent.getComment().getPinUid().equals(_pin.getUid()))
            {
                CommentFeed commentfeed = _commentsCell.getComments();
                if (commentfeed != null)
                {
                    commentfeed.appendItem(createevent.getComment());
                    updateDisplay(commentfeed);
                    return;
                }
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Comment.UpdateEvent updateevent)
        {
            if (_pin != null && updateevent != null && updateevent.wasDeleted() && _commentsCell != null && updateevent.getComment().getPinUid().equals(_pin.getUid()))
            {
                CommentFeed commentfeed = _commentsCell.getComments();
                if (commentfeed != null)
                {
                    commentfeed.removeItem(updateevent.getComment());
                    if (commentfeed.getCount() == 0)
                    {
                        pressBackButton();
                        return;
                    } else
                    {
                        updateDisplay(commentfeed);
                        return;
                    }
                }
            }
        }

        _cls1()
        {
            this$0 = PinCommentsFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.PinApi.PinCommentFeedApiResponse
    {

        final PinCommentsFragment this$0;

        public String getPinUid()
        {
            return PinCommentsFragment.this.onFailure.getId();
        }

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (_footerView != null)
            {
                _footerView.setState(1);
            }
        }

        public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
        {
            super.onFailure(throwable, pinterestjsonobject);
            if (_footerView != null)
            {
                _footerView.setState(1);
            }
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            updateDisplay((CommentFeed)feed);
            if (_footerView != null)
            {
                _footerView.setState(1);
            }
        }

        _cls2()
        {
            this$0 = PinCommentsFragment.this;
            super();
        }
    }

}
