// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.content.res.Resources;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsSocialFragment

public class FindFriendsTwitterFragment extends FindFriendsSocialFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public FindFriendsTwitterFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    public void buildUnconnectedView()
    {
        _connectTitleTv.setText(getResources().getText(0x7f07029c));
        _connectSubtitleTv.setText(getResources().getText(0x7f07029b));
        _connectBtn.setText(getResources().getText(0x7f070173));
        _connectBtn.setBackgroundResource(0x7f0200b3);
        _connectBtn.setIconTint(0x7f0e00bf);
        _connectBtn.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f0201b6), null, null, null);
        _connectBtn.setOnClickListener(new _cls2());
    }

    protected int getEmptySubtitleStringId()
    {
        return 0x7f07029a;
    }

    public boolean isSocialServiceConnected()
    {
        return MyUser.isConnectedToTwitter();
    }

    public void loadSocialData()
    {
        MyUserApi.b("on_pinterest", false, onLoadMore, getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/base/Social$UpdateEvent, new Class[0]);
    }

    protected void onDeactivate()
    {
        Events.unregister(_eventsSubscriber);
        super.onDeactivate();
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FindFriendsTwitterFragment this$0;

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            if (updateevent.getNetwork() != com.pinterest.base.Social.Network.TWITTER || !refreshState())
            {
                return;
            } else
            {
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        loadData();
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                _handler.postDelayed(new _cls1(), 2000L);
                return;
            }
        }

        _cls1()
        {
            this$0 = FindFriendsTwitterFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FindFriendsTwitterFragment this$0;

        public void onClick(View view)
        {
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
        }

        _cls2()
        {
            this$0 = FindFriendsTwitterFragment.this;
            super();
        }
    }

}
