// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.pinterest.api.model.User;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.ui.actionbar.MetadataBar;

public class UserMetadataView extends LinearLayout
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private MetadataBar _metadataBar;
    private com.pinterest.ui.actionbar.MetadataBar.Mode _metadataBarMode;
    private User _user;

    public UserMetadataView(Context context)
    {
        this(context, null);
    }

    public UserMetadataView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserMetadataView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _eventsSubscriber = new _cls1();
        LayoutInflater.from(getContext()).inflate(0x7f03020b, this, true);
        _metadataBar = new MetadataBar(getContext());
        addView(_metadataBar);
        setOrientation(1);
        setBackgroundColor(Colors.BG_GRID);
    }

    private void updateMetadataBar()
    {
        if (_user != null && _metadataBarMode != null)
        {
            _metadataBar.setModel(_user, _metadataBarMode);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public void setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode mode)
    {
        _metadataBarMode = mode;
        updateMetadataBar();
    }

    public void setUser(User user)
    {
        _user = user;
        updateMetadataBar();
    }


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserMetadataView this$0;

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            updateevent = updateevent.getUser();
            if (updateevent == null || !updateevent.equals(_user))
            {
                return;
            } else
            {
                setUser(updateevent);
                return;
            }
        }

        _cls1()
        {
            this$0 = UserMetadataView.this;
            super();
        }
    }

}
