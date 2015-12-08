// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.ads.AdPlacement;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.OnUpdateCallDurationEvent;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.main.HubActivity;
import com.skype.android.app.media.OnMediaGroupAvatarLoaded;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.IntegerQueueSet;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SeparatedColumnsAdapter;
import com.skype.android.widget.recycler.RecyclerListDecorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.recents:
//            RecentRemoveHistoryDialog, RecentAdapter, Recent, RecentQuery, 
//            RecentListActivity, EditModeBar, RecentItem, EditModeListener, 
//            EditModeBarProvider

public class RecentListFragment extends SkypeListFragment
    implements android.os.Handler.Callback, android.view.View.OnClickListener, OnUserEventListener, EditModeBar.EditModeBarCallback, RecentItemMenuDialog.MenuCallback, AsyncCallback
{
    public static interface RecentFragmentListener
    {

        public abstract void recentCountUpdated(int i);
    }


    private static final int UPDATE_ALL_CONVERSATIONS = -1;
    private static final int WHAT_NOTIFY_DATASET_CHANGED = 3;
    private static final int WHAT_UPDATE_ALL = 1;
    private static final int WHAT_UPDATE_QUEUED = 2;
    AccessibilityUtil accessibilityUtil;
    AdPlacer adPlacer;
    RecentAdapter adapter;
    Analytics analytics;
    AsyncService async;
    EcsConfiguration configuration;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    private EditModeBar editModeBar;
    private View emptyView;
    Button filterAllButton;
    Button filterUnreadButton;
    private Handler handler;
    private View hubHeaderContainer;
    private TextView hubHeaderView;
    ImageCache imageCache;
    private boolean inEditMode;
    LayoutExperience layoutExperience;
    SkyLib lib;
    List listeners;
    ObjectIdMap map;
    Navigation navigation;
    private TextView recentCountBadge;
    private IntegerQueueSet updateQueue;
    private UpdateScheduler updateScheduler;

    public RecentListFragment()
    {
        inEditMode = false;
        listeners = new ArrayList();
    }

    private void createFilters(View view)
    {
        if (filterAllButton != null)
        {
            filterAllButton.setOnClickListener(this);
            filterAllButton.performClick();
        }
        if (filterUnreadButton != null)
        {
            filterUnreadButton.setOnClickListener(this);
        }
    }

    private int getUnreadCount()
    {
        return lib.getUnconsumedConversationsCount(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS);
    }

    private void markAllRead()
    {
        analytics.a(AnalyticsEvent.Q, lib.getUnconsumedConversationsCount());
        lib.consumeAllConversations();
        updateConversationList(-1);
    }

    private void markSelectedConversationsRead(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            ((Conversation)list.get(i)).setConsumedHorizon((int)TimeUtil.a(), true);
        }

        updateConversationList(-1);
    }

    private void muteSelectedConversations(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (!ConversationUtil.w((Conversation)list.get(i)) && !conversationUtil.D((Conversation)list.get(i)))
            {
                ((Conversation)list.get(i)).setAlertString("=");
            }
        }

        updateConversationList(-1);
    }

    private void removeSelectedConversationsFromHistory(final List removeHistoryDialog)
    {
        if (removeHistoryDialog.size() > 0)
        {
            Bundle bundle = new Bundle();
            int ai[] = new int[removeHistoryDialog.size()];
            for (int i = 0; i < removeHistoryDialog.size(); i++)
            {
                if (removeHistoryDialog.get(i) != null)
                {
                    ai[i] = ((Conversation)removeHistoryDialog.get(i)).getObjectID();
                }
            }

            bundle.putIntArray("com.skype.objIds", ai);
            removeHistoryDialog = (RecentRemoveHistoryDialog)SkypeDialogFragment.create(bundle, com/skype/android/app/recents/RecentRemoveHistoryDialog);
            removeHistoryDialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final RecentListFragment this$0;
                final RecentRemoveHistoryDialog val$removeHistoryDialog;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    if (!removeHistoryDialog.isCanceled())
                    {
                        unselectRecentItems(getSelectedItems());
                        editModeBar.onSelectedConversationListChanged(getSelectedItems());
                    }
                }

            
            {
                this$0 = RecentListFragment.this;
                removeHistoryDialog = recentremovehistorydialog;
                super();
            }
            });
            removeHistoryDialog.show(getFragmentManager());
        }
        updateConversationList(-1);
    }

    private void setEmptyViewVisibility()
    {
        View view = emptyView;
        int i;
        if (adapter.getCount() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void unmuteSelectedConversations(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (ConversationUtil.w((Conversation)list.get(i)) && !conversationUtil.D((Conversation)list.get(i)))
            {
                ((Conversation)list.get(i)).setAlertString("");
            }
        }

        updateConversationList(-1);
    }

    private void updateCheckedItem(int i, boolean flag)
    {
        adapter.setItemChecked(0, i, flag);
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

    private void updateNavigationContentDescription()
    {
        if (filterAllButton != null && filterUnreadButton != null && accessibilityUtil.a())
        {
            String s;
            String s1;
            int i;
            if (filterAllButton.isSelected())
            {
                s = getString(0x7f0800b5);
            } else
            {
                s = "";
            }
            s = getString(0x7f0800b3, new Object[] {
                getText(0x7f0800b4), "", s
            });
            filterAllButton.setContentDescription(s);
            i = getUnreadCount();
            s = "";
            if (i > 0)
            {
                s = getResources().getQuantityString(0x7f0b0003, i, new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (filterUnreadButton.isSelected())
            {
                s1 = getString(0x7f0800b5);
            } else
            {
                s1 = "";
            }
            s = getString(0x7f0800b3, new Object[] {
                getText(0x7f0800b6), s, s1
            });
            filterUnreadButton.setContentDescription(s);
        }
    }

    private void updateRecentCount(int i)
    {
        boolean flag = false;
        if (getActivity() instanceof RecentFragmentListener)
        {
            ((RecentFragmentListener)getActivity()).recentCountUpdated(i);
        }
        int j;
        if (recentCountBadge != null)
        {
            Object obj = recentCountBadge;
            if (i == 0)
            {
                j = 8;
            } else
            {
                j = 0;
            }
            ((TextView) (obj)).setVisibility(j);
            recentCountBadge.setText(ViewUtil.a(i));
        }
        if (hubHeaderView != null)
        {
            obj = hubHeaderView;
            if (i == 0)
            {
                j = 0x7f02017f;
            } else
            {
                j = 0;
            }
            ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0, j, 0);
        }
        if (hubHeaderContainer != null)
        {
            hubHeaderContainer.setContentDescription(getResources().getQuantityString(0x7f0b0001, i, new Object[] {
                Integer.valueOf(i)
            }));
        }
        if (filterUnreadButton != null)
        {
            obj = filterUnreadButton;
            if (i != 0)
            {
                flag = true;
            }
            ((Button) (obj)).setEnabled(flag);
        }
        if (filterAllButton != null && i == 0)
        {
            filterAllButton.performClick();
        }
        updateNavigationContentDescription();
    }

    public void addEditModeListener(EditModeListener editmodelistener)
    {
        listeners.add(editmodelistener);
    }

    public void done(AsyncResult asyncresult)
    {
        if (isAdded() && asyncresult != null && asyncresult.e())
        {
            List list = (List)asyncresult.a();
            int i;
            if (accessibilityUtil.a() && list != null && !list.isEmpty())
            {
                Object obj = (Recent)list.get(0);
                Conversation conversation = (Conversation)map.a(((Recent) (obj)).getConversationObjectId(), com/skype/Conversation);
                i = ((Recent) (obj)).getLastMessageObjectId();
                if (i > 0)
                {
                    String s = ((Message)map.a(i, com/skype/Message)).getBodyXmlProp();
                    boolean flag;
                    if (((Recent) (obj)).isDialog())
                    {
                        obj = getResources().getString(0x7f0800b2, new Object[] {
                            conversation.getDisplaynameProp(), s
                        });
                    } else
                    {
                        obj = getResources().getString(0x7f0800b7, new Object[] {
                            conversation.getDisplaynameProp(), s
                        });
                    }
                    AccessibilityUtil.b(getListView(), ((CharSequence) (obj)));
                }
            }
            setListShown(true);
            if (((Integer)asyncresult.b()).intValue() == 2)
            {
                adapter.updateExisting(list);
            } else
            {
                adapter.update(list);
            }
            updateRecentCount(getUnreadCount());
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
            adPlacer.a(AdPlacement.a, flag);
            ViewUtil.a(getView(), true);
            if (layoutExperience.isMultipane())
            {
                getListView().setFocusable(false);
            }
            if (filterAllButton != null)
            {
                filterAllButton.requestFocus();
                return;
            }
        }
    }

    protected int getLayoutId()
    {
        return 0x7f0300f3;
    }

    public List getSelectedItems()
    {
        SparseBooleanArray sparsebooleanarray = adapter.getCheckedState(0);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < sparsebooleanarray.size(); i++)
        {
            if (sparsebooleanarray.valueAt(i))
            {
                arraylist.add(map.a(sparsebooleanarray.keyAt(i), com/skype/Conversation));
            }
        }

        return arraylist;
    }

    public boolean handleMessage(android.os.Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 3: // '\003'
            adapter.notifyDataSetChanged();
            return true;

        case 2: // '\002'
            RecentQuery recentquery = new RecentQuery(lib, updateQueue.a());
            async.a(recentquery, Integer.valueOf(message.what), this);
            return true;

        case 1: // '\001'
            RecentQuery recentquery1 = new RecentQuery(lib);
            async.a(recentquery1, Integer.valueOf(message.what), this);
            return true;
        }
    }

    public boolean isInEditMode()
    {
        return inEditMode;
    }

    boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONTACT_AVAILABILITY;
    }

    public void onClick(View view)
    {
        boolean flag1 = true;
        if (view != hubHeaderView && view != hubHeaderContainer) goto _L2; else goto _L1
_L1:
        startActivity(new Intent(getActivity(), com/skype/android/app/recents/RecentListActivity));
_L4:
        return;
_L2:
        if (view != recentCountBadge)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (getActivity() instanceof HubActivity)
        {
            startActivity(new Intent(getActivity(), com/skype/android/app/recents/RecentListActivity));
            return;
        }
        if (filterUnreadButton == null) goto _L4; else goto _L3
_L3:
        filterUnreadButton.performClick();
        return;
        if (view != filterAllButton && view != filterUnreadButton) goto _L4; else goto _L5
_L5:
        boolean flag;
        if (view == filterUnreadButton)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapter.setFilterUnreadConversationOnly(flag);
        if (filterAllButton != null)
        {
            view = filterAllButton;
            if (flag)
            {
                flag1 = false;
            }
            view.setSelected(flag1);
        }
        if (filterUnreadButton != null)
        {
            filterUnreadButton.setSelected(flag);
        }
        updateNavigationContentDescription();
        return;
    }

    public boolean onContextItemSelected(MenuItem menuitem, Conversation conversation)
    {
        return false;
    }

    public volatile boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface)
    {
        return onContextItemSelected(menuitem, (Conversation)objectinterface);
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
        boolean flag = flag1;
        if (layoutExperience.isMultipane())
        {
            if (getActivity() instanceof RecentListActivity)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        setHasOptionsMenu(flag);
        updateQueue = new IntegerQueueSet();
        handler = new Handler(this);
        updateScheduler = new UpdateScheduler(handler);
        addEditModeListener(adapter);
    }

    public void onCreateContextMenu(Menu menu, Conversation conversation)
    {
    }

    public volatile void onCreateContextMenu(Menu menu, ObjectInterface objectinterface)
    {
        onCreateContextMenu(menu, (Conversation)objectinterface);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110020, menu);
    }

    public void onEditModeBarDismissed()
    {
        setInEditMode(false);
    }

    public void onEditModeBarItemClicked(View view)
    {
        List list = getSelectedItems();
        switch (view.getId())
        {
        case 2131755882: 
        case 2131755883: 
        default:
            return;

        case 2131755881: 
            setInEditMode(false);
            return;

        case 2131755884: 
            view = (Conversation)list.get(0);
            view = conversationUtil.r(view);
            startActivity(navigation.intentFor(view, com/skype/android/app/contacts/ContactAddNumberActivity));
            unselectRecentItems(list);
            editModeBar.onSelectedConversationListChanged(getSelectedItems());
            return;

        case 2131755886: 
            removeSelectedConversationsFromHistory(list);
            return;

        case 2131755885: 
            markSelectedConversationsRead(list);
            unselectRecentItems(list);
            editModeBar.onSelectedConversationListChanged(getSelectedItems());
            return;

        case 2131755887: 
            muteSelectedConversations(list);
            unselectRecentItems(list);
            editModeBar.onSelectedConversationListChanged(getSelectedItems());
            return;

        case 2131755888: 
            unmuteSelectedConversations(list);
            break;
        }
        unselectRecentItems(list);
        editModeBar.onSelectedConversationListChanged(getSelectedItems());
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
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.MESSAGE_BODY_XML.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.MESSAGE_ANNOTATION_VERSION.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_CONSUMPTION_HORIZON.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LAST_MESSAGE_ID.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.PLAYING_VOICE_MESSAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECORDING_VOICE_MESSAGE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            updateScheduler.a(3);
            break;
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS)
        {
            updateConversationList(onconversationlistchange.getConversationObjectID());
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        Object obj = onobjectpropertychangewithvalue.getPropKey();
        _cls3..SwitchMap.com.skype.PROPKEY[((PROPKEY) (obj)).ordinal()];
        JVM INSTR tableswitch 3 8: default 52
    //                   3 53
    //                   4 136
    //                   5 136
    //                   6 136
    //                   7 145
    //                   8 145;
           goto _L1 _L2 _L3 _L3 _L3 _L4 _L4
_L1:
        return;
_L2:
        if (lib.getContact(onobjectpropertychangewithvalue.getObjectID(), ((Contact) (obj = new ContactImpl()))) && (lib.getConversationByIdentity(((Contact) (obj)).getIdentity(), onobjectpropertychangewithvalue = new ConversationImpl(), false) && adapter.recentPositionForConversation(onobjectpropertychangewithvalue.getObjectID()) != -1))
        {
            updateScheduler.a(3, 1000L, null);
            return;
        }
          goto _L1
_L3:
        updateConversationList(onobjectpropertychangewithvalue.getObjectID());
        return;
_L4:
        Conversation conversation = (Conversation)map.a(onobjectpropertychangewithvalue.getObjectID(), com/skype/Conversation);
        imageCache.b(conversation.getIdentityProp());
        updateConversationList(onobjectpropertychangewithvalue.getObjectID());
        return;
    }

    void onEvent(com.skype.android.gen.TransferListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.TRANSFER_STATUS)
        {
            updateScheduler.a(3);
        }
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
        adapter.notifyDataSetChanged();
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (isInEditMode() && (obj instanceof RecentItem))
        {
            obj = (RecentItem)obj;
            boolean flag;
            if (!itemviewholder.isItemChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            updateCheckedItem(((RecentItem) (obj)).getConversationObjectId(), flag);
            if (editModeBar != null)
            {
                editModeBar.onSelectedConversationListChanged(getSelectedItems());
            }
            adapter.notifyDataSetChanged();
        } else
        if (obj instanceof RecentItem)
        {
            itemviewholder = (Recent)obj;
            itemviewholder = (Conversation)map.a(itemviewholder.getConversationObjectId(), com/skype/Conversation);
            switch (_cls3..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[itemviewholder.getLocalLiveStatusProp().ordinal()])
            {
            case 4: // '\004'
            case 5: // '\005'
            default:
                navigation.chat(itemviewholder);
                return;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                navigation.toOngoingCall(itemviewholder);
                return;

            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                navigation.placeCall(itemviewholder);
                break;
            }
            return;
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (obj instanceof RecentItem)
        {
            if (!layoutExperience.isMultipane())
            {
                setInEditMode(true);
            }
            obj = (RecentItem)obj;
            boolean flag;
            if (!itemviewholder.isItemChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            updateCheckedItem(((RecentItem) (obj)).getConversationObjectId(), flag);
            if (editModeBar != null)
            {
                editModeBar.onSelectedConversationListChanged(getSelectedItems());
            }
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756536: 
            markAllRead();
            break;
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
        updateConversationList(-1);
    }

    public void onStart()
    {
        super.onStart();
        adapter.startInboxSortingUpdater();
    }

    public void onStop()
    {
        super.onStop();
        adapter.cancelInboxSortingUpdater();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof EditModeListener)
        {
            addEditModeListener((EditModeListener)getActivity());
        }
        if (getActivity() instanceof EditModeBarProvider)
        {
            editModeBar = ((EditModeBarProvider)getActivity()).getEditModeBar();
            editModeBar.setCallback(this);
            editModeBar.init(conversationUtil);
        }
        bundle = new SeparatedColumnsAdapter(getActivity(), adapter);
        adapter.setMaxCount(getMaxItems());
        boolean flag;
        if (layoutExperience.isMultipane() && getMaxItems() == 0x7fffffff)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.a(flag);
        bundle.b(flag);
        adapter.setTimeSeparatorsEnabled(flag);
        if (!layoutExperience.isMultipane())
        {
            bundle = new RecyclerListDecorator(getActivity(), adapter);
            if (configuration.isAdEnabled())
            {
                final View banner = adPlacer.a(AdPlacement.a, getActivity());
                if (banner != null)
                {
                    adPlacer.b(AdPlacement.a, true);
                    bundle.a(banner);
                    getListView().addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

                        final RecentListFragment this$0;
                        final View val$banner;

                        public final void onScrollStateChanged(RecyclerView recyclerview, int i)
                        {
                            boolean flag2 = true;
                            i = ((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstVisibleItemPosition();
                            boolean flag1 = flag2;
                            if (i != 0)
                            {
                                if (i == 1 && banner.getHeight() == 0)
                                {
                                    flag1 = flag2;
                                } else
                                {
                                    flag1 = false;
                                }
                            }
                            adPlacer.b(AdPlacement.a, flag1);
                        }

            
            {
                this$0 = RecentListFragment.this;
                banner = view;
                super();
            }
                    });
                }
            }
            getListView().setAdapter(bundle);
        } else
        {
            getListView().setAdapter(bundle);
        }
        adapter.setOnUserEventListener(0, this);
        recentCountBadge = (TextView)view.findViewById(0x7f1004f6);
        hubHeaderView = (TextView)view.findViewById(0x7f1004f8);
        if (hubHeaderView != null)
        {
            hubHeaderView.setOnClickListener(this);
        }
        if (!accessibilityUtil.a()) goto _L2; else goto _L1
_L1:
        bundle = view.findViewById(0x7f1004f4);
        if (filterUnreadButton != null)
        {
            bundle.post(accessibilityUtil.a(bundle, filterUnreadButton, 12));
            accessibilityUtil.a(bundle);
        }
_L4:
        hubHeaderContainer = view.findViewById(0x7f1004f7);
        if (hubHeaderContainer != null)
        {
            hubHeaderContainer.setOnClickListener(this);
            if (accessibilityUtil.a())
            {
                AccessibilityUtil.a(new View[] {
                    hubHeaderView, recentCountBadge
                });
            }
        }
        emptyView = view.findViewById(0x7f100395);
        setEmptyViewVisibility();
        ViewUtil.a(view, false);
        createFilters(view);
        return;
_L2:
        if (recentCountBadge != null)
        {
            recentCountBadge.setOnClickListener(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void refreshSelected(SparseBooleanArray sparsebooleanarray)
    {
        adapter.setCheckedState(0, sparsebooleanarray);
    }

    public void setInEditMode(boolean flag)
    {
        inEditMode = flag;
        if (!flag)
        {
            adapter.clearCheckedState(0);
        }
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((EditModeListener)iterator.next()).onEditModeChanged(flag)) { }
    }

    public void unselectRecentItems(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            updateCheckedItem(((Conversation)list.get(i)).getObjectID(), false);
        }

    }

}
