// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.OnUpdateCallDurationEvent;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.media.OnMediaGroupAvatarLoaded;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentItemMenuDialog;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.IntegerQueueSet;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import java.util.List;

// Referenced classes of package com.skype.android.app.dialer:
//            CallHistoryMaterialAdapter, CallHistoryQuery, b

public class CallHistoryMaterialFragment extends SkypeListFragment
    implements android.os.Handler.Callback, OnUserEventListener, com.skype.android.app.recents.RecentItemMenuDialog.MenuCallback, AsyncCallback
{

    public static final int REQUEST_CODE = -1;
    private static final int UPDATE_ALL_CONVERSATIONS = -1;
    private static final int WHAT_NOTIFY_DATASET_CHANGED = 3;
    private static final int WHAT_UPDATE_ALL = 1;
    private static final int WHAT_UPDATE_QUEUED = 2;
    CallHistoryMaterialAdapter adapter;
    AsyncService async;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    View emptyView;
    ImageCache imageCache;
    SkyLib lib;
    ObjectIdMap map;
    private int maxItemCount;
    Navigation navigation;
    private IntegerQueueSet updateQueue;
    private UpdateScheduler updateScheduler;

    public CallHistoryMaterialFragment()
    {
    }

    private void updateConversationList(int i)
    {
        if (i == -1)
        {
            updateScheduler.a(1);
        } else
        if (!updateScheduler.a())
        {
            updateQueue.a(Integer.valueOf(i));
            updateScheduler.a(2);
            return;
        }
    }

    public void done(AsyncResult asyncresult)
    {
        while (!isAdded() || asyncresult == null || !asyncresult.e()) 
        {
            return;
        }
        List list = (List)asyncresult.a();
        setListShown(true);
        int i;
        boolean flag;
        if (((Integer)asyncresult.b()).intValue() == 2)
        {
            adapter.updateExisting(list);
        } else
        {
            adapter.update(list);
        }
        flag = adapter.isEmpty();
        asyncresult = emptyView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        asyncresult.setVisibility(i);
        ViewUtil.a(getView(), true);
    }

    protected int getLayoutId()
    {
        return 0x7f0300f3;
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 3: // '\003'
            adapter.notifyDataSetChanged();
            return true;

        case 2: // '\002'
            CallHistoryQuery callhistoryquery = (new CallHistoryQuery(lib, conversationUtil, map)).setMaxCount(maxItemCount).setFilterIds(updateQueue.a());
            async.a(callhistoryquery, Integer.valueOf(message.what), this);
            return true;

        case 1: // '\001'
            CallHistoryQuery callhistoryquery1 = (new CallHistoryQuery(lib, conversationUtil, map)).setMaxCount(maxItemCount);
            async.a(callhistoryquery1, Integer.valueOf(message.what), this);
            return true;
        }
    }

    protected void loadHistory()
    {
        updateConversationList(-1);
    }

    boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONTACT_AVAILABILITY;
    }

    public boolean onContextItemSelected(MenuItem menuitem, com.skype.Message message)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756534: 
            message.deleteLocally();
            break;
        }
        loadHistory();
        return true;
    }

    public volatile boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface)
    {
        return onContextItemSelected(menuitem, (com.skype.Message)objectinterface);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        updateQueue = new IntegerQueueSet();
        updateScheduler = new UpdateScheduler(new Handler(this));
        maxItemCount = getResources().getInteger(0x7f0e0008);
    }

    public void onCreateContextMenu(Menu menu, com.skype.Message message)
    {
        getActionBarActivity().getMenuInflater().inflate(0x7f11001d, menu);
    }

    public volatile void onCreateContextMenu(Menu menu, ObjectInterface objectinterface)
    {
        onCreateContextMenu(menu, (com.skype.Message)objectinterface);
    }

    void onEvent(OnUpdateCallDurationEvent onupdatecalldurationevent)
    {
        adapter.notifyDataSetChanged();
    }

    void onEvent(OnMediaGroupAvatarLoaded onmediagroupavatarloaded)
    {
        adapter.notifyDataSetChanged();
    }

    void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (((Account)onpropertychange.getSender()).getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            updateConversationList(-1);
        }
    }

    void onEvent(com.skype.android.gen.MessageListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.MESSAGE_BODY_XML)
        {
            updateScheduler.a(3);
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS)
        {
            updateConversationList(((Conversation)map.a(onconversationlistchange.getConversationObjectID(), com/skype/Conversation)).getLastMessageIdProp());
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        PROPKEY propkey = onobjectpropertychangewithvalue.getPropKey();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.PROPKEY[propkey.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            updateScheduler.a(3, 1000L, null);
            return;

        case 2: // '\002'
        case 3: // '\003'
            onobjectpropertychangewithvalue = (Conversation)map.a(onobjectpropertychangewithvalue.getObjectID(), com/skype/Conversation);
            break;
        }
        imageCache.b(onobjectpropertychangewithvalue.getIdentityProp());
        updateConversationList(onobjectpropertychangewithvalue.getLastMessageIdProp());
    }

    void onEvent(com.skype.android.util.cache.SpannedStringCache.OnCleared oncleared)
    {
        adapter.notifyDataSetChanged();
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
        if (obj instanceof Recent)
        {
            i = ((Recent)obj).getConversationObjectId();
            itemviewholder = (Conversation)map.a(i, com/skype/Conversation);
            navigation.placeCall(itemviewholder);
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (obj instanceof Recent)
        {
            itemviewholder = (Recent)obj;
            if (obj instanceof b)
            {
                obj = (Conversation)map.a(itemviewholder.getConversationObjectId(), com/skype/Conversation);
                RecentItemMenuDialog.create(this, conversationUtil.m(((Conversation) (obj))), com/skype/Message, itemviewholder.getLastMessageObjectId()).show(getFragmentManager());
            }
        }
        return true;
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
        ((SymbolView)emptyView.findViewById(0x7f1004e7)).setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.P);
        ((TextView)emptyView.findViewById(0x7f1004e8)).setText(getString(0x7f080310));
        adapter.setOnUserEventListener(0, this);
    }
}
