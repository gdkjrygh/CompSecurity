// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.Navigation;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentItem;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import java.util.List;

// Referenced classes of package com.skype.android.app.dialer:
//            a, CallHistoryAdapter

public class CallHistoryFragment extends SkypeListFragment
    implements OnUserEventListener, AsyncCallback
{

    CallHistoryAdapter adapter;
    AsyncService async;
    TextView emptyView;
    SkyLib lib;
    ObjectIdMap map;
    Navigation navigation;

    public CallHistoryFragment()
    {
    }

    private void loadHistory()
    {
        int i = getResources().getInteger(0x7f0e0008);
        async.a(new a(lib, i), this);
    }

    public void done(AsyncResult asyncresult)
    {
        TextView textview = emptyView;
        int i;
        if (((List)asyncresult.a()).size() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        adapter.update((List)asyncresult.a());
    }

    protected int getLayoutId()
    {
        return 0x7f0300ef;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        if (!onmessage.getChangesInboxTimestamp()) goto _L2; else goto _L1
_L1:
        onmessage = (Message)map.a(onmessage.getMessageObjectID(), com/skype/Message);
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ENDED_LIVESESSION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.skype.Message.TYPE[onmessage.getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 1: default 56
    //                   1 57;
           goto _L2 _L3
_L2:
        return;
_L3:
        loadHistory();
        return;
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (obj instanceof RecentItem)
        {
            i = ((Recent)obj).getConversationObjectId();
            itemviewholder = (Conversation)map.a(i, com/skype/Conversation);
            navigation.chat(itemviewholder);
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        return false;
    }

    public void onStart()
    {
        super.onStart();
        loadHistory();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getListView().setAdapter(adapter);
        adapter.setOnUserEventListener(0, this);
    }
}
