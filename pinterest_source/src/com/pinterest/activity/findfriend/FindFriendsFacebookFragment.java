// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.activity.findfriend.util.InviteButtonDecorator;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.base.SocialUtils;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsSocialFragment

public class FindFriendsFacebookFragment extends FindFriendsSocialFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public FindFriendsFacebookFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    private View getListHeader()
    {
        View view = LayoutInflater.from(getActivity()).inflate(0x7f0301e0, null, true);
        PButton pbutton = (PButton)view.findViewById(0x7f0f0494);
        (new InviteButtonDecorator(getActivity(), getApiTag())).forPackage("com.facebook.orca").setInviteCodeType("register_invite_fb_messenger").setIconId(0x7f0201b1).useDefaultOnClickListener().decorate(pbutton);
        return view;
    }

    public void buildUnconnectedView()
    {
        _connectTitleTv.setText(getResources().getText(0x7f070297));
        _connectSubtitleTv.setText(getResources().getText(0x7f070296));
        _connectBtn.setText(getResources().getText(0x7f070171));
        _connectBtn.setBackgroundResource(0x7f02007c);
        _connectBtn.setIconTint(0x7f0e00bf);
        _connectBtn.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f0201b0), null, null, null);
        _connectBtn.setOnClickListener(new _cls2());
    }

    protected int getEmptySubtitleStringId()
    {
        return 0x7f070295;
    }

    public boolean isSocialServiceConnected()
    {
        return MyUser.isConnectedToFacebook();
    }

    public void loadSocialData()
    {
        MyUserApi.a("on_pinterest", false, onLoadMore, getApiTag());
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

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (SocialUtils.isAppInstalled("com.facebook.orca"))
        {
            _listView.addHeaderView(getListHeader());
        }
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FindFriendsFacebookFragment this$0;

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            if (updateevent.getNetwork() != com.pinterest.base.Social.Network.FACEBOOK || !refreshState())
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
            this$0 = FindFriendsFacebookFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FindFriendsFacebookFragment this$0;

        public void onClick(View view)
        {
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
        }

        _cls2()
        {
            this$0 = FindFriendsFacebookFragment.this;
            super();
        }
    }

}
