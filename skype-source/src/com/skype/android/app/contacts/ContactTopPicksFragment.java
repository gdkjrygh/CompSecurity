// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactGroup;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.Navigation;
import com.skype.android.app.ObjectInterfaceMenuDialog;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.recycler.TwoWayRecyclerView;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactTopPicksGridListAdapter, ContactTopPicksLoader, ContactDirectorySearchActivity, ContactListActivity, 
//            ContactMenuBuilder, ContactItem

public class ContactTopPicksFragment extends SkypeListFragment
    implements android.os.Handler.Callback, android.view.View.OnClickListener, com.skype.android.app.ObjectInterfaceMenuDialog.MenuCallback, OnUserEventListener, AsyncCallback
{

    private static final int MINIMUM_FOR_EVEN_ROWS = 8;
    private static final int WHAT_INVALIDATE = 1;
    private static final int WHAT_RELOAD = 2;
    AccessibilityUtil accessibility;
    Account account;
    ContactTopPicksGridListAdapter adapter;
    Button addContactsButton;
    TextView addContactsText;
    AsyncService async;
    private ContactMenuBuilder contactMenuBuilder;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    View emptyView;
    View hubHeaderView;
    SkyLib lib;
    private RecyclerView listView;
    ObjectIdMap map;
    Navigation nav;
    private UpdateScheduler updateScheduler;

    public ContactTopPicksFragment()
    {
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            Object obj = (List)asyncresult.a();
            int j = ((List) (obj)).size();
            int i;
            if (listView instanceof TwoWayRecyclerView)
            {
                i = ((TwoWayRecyclerView)listView).a();
            } else
            {
                i = 1;
            }
            i = j % i;
            asyncresult = ((AsyncResult) (obj));
            if (i != 0)
            {
                asyncresult = ((AsyncResult) (obj));
                if (j > 8)
                {
                    asyncresult = ((List) (obj)).subList(0, j - i);
                }
            }
            adapter.setData(asyncresult);
            obj = emptyView;
            if (asyncresult.isEmpty())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
        }
    }

    protected int getLayoutId()
    {
        return 0x7f030068;
    }

    public boolean handleMessage(Message message)
    {
        if (!isResumed()) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 34
    //                   2 43;
           goto _L2 _L3 _L4
_L2:
        return false;
_L3:
        adapter.notifyDataSetChanged();
        return true;
_L4:
        async.a(new ContactTopPicksLoader(lib, map), this);
        return true;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755790: 
            startActivity(new Intent(getActivity(), com/skype/android/app/contacts/ContactDirectorySearchActivity));
            return;

        case 2131755818: 
        case 2131755819: 
            startActivity(new Intent(getActivity(), com/skype/android/app/contacts/ContactListActivity));
            break;
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface, Bundle bundle)
    {
        return contactMenuBuilder.onContextItemSelected(menuitem, objectinterface, bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
        contactMenuBuilder = new ContactMenuBuilder(this, contactUtil, conversationUtil);
    }

    public void onCreateContextMenu(Menu menu, ObjectInterface objectinterface, Bundle bundle)
    {
        contactMenuBuilder.onCreateContextMenu(menu, objectinterface, bundle);
    }

    public void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (onchange.getSender().getTypeProp() == com.skype.ContactGroup.TYPE.ALL_BUDDIES)
        {
            updateScheduler.a(2);
        }
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        updateScheduler.a(2);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnContactGoneOffline oncontactgoneoffline)
    {
        updateScheduler.a(1);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnContactOnlineAppearance oncontactonlineappearance)
    {
        updateScheduler.a(1);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS)
        {
            updateScheduler.a(2);
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TEXT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_DISPLAYNAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_GIVEN_DISPLAYNAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_FULLNAME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_POPULARITY_ORD.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.USER_BUDDYSTATUS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_CBLSYNCSTATUS.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.PROPKEY[onobjectpropertychangewithvalue.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 10: default 64
    //                   1 65
    //                   2 65
    //                   3 65
    //                   4 65
    //                   5 65
    //                   6 65
    //                   7 74
    //                   8 74
    //                   9 74
    //                   10 74;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L3
_L1:
        return;
_L2:
        updateScheduler.a(1);
        return;
_L3:
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            updateScheduler.a(2);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, (ContactItem)obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, ContactItem contactitem, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (ContactItem)obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, ContactItem contactitem)
    {
        if (contactitem != null)
        {
            nav.chat((Contact)map.a(contactitem.getContactObjectId(), com/skype/Contact));
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (ContactItem)obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, ContactItem contactitem)
    {
        if (contactitem != null)
        {
            itemviewholder = (Contact)map.a(contactitem.getContactObjectId(), com/skype/Contact);
            ObjectInterfaceMenuDialog.create(this, contactitem.getDisplayName(), itemviewholder).show(getFragmentManager());
            return true;
        } else
        {
            return false;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            updateScheduler.a(2);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = emptyView;
        int i;
        if (adapter.getCount() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        listView = getListView();
        listView.setAdapter(adapter);
        if (listView instanceof TwoWayRecyclerView)
        {
            ((TwoWayRecyclerView)listView).setOnSpanCountListener(adapter);
        }
        adapter.setOnUserEventListener(0, this);
        if (hubHeaderView != null)
        {
            hubHeaderView.setOnClickListener(this);
        }
        view = view.findViewById(0x7f10032a);
        if (view != null)
        {
            view.setOnClickListener(this);
            if (accessibility.a())
            {
                AccessibilityUtil.a(new View[] {
                    hubHeaderView
                });
                view.setContentDescription(getString(0x7f08008c));
            }
        }
        updateScheduler = new UpdateScheduler(new Handler(this), 1000L);
        addContactsButton.setOnClickListener(this);
        if (accessibility.a())
        {
            accessibility.a((ViewGroup)addContactsButton.getParent(), addContactsButton, 14);
            accessibility.a((ViewGroup)addContactsText.getParent(), addContactsText, 13);
        }
    }
}
