// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactGroup;
import com.skype.Conversation;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactPickerActivity;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.media.OnMediaGroupAvatarLoaded;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.recycler.RecyclerListDecorator;
import com.skype.android.widget.recycler.TwoWayRecyclerView;
import java.util.List;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoriteGridListAdapter, FavoritesPickContactsFragment, Favorite, a

public class FavoritesFragment extends SkypeListFragment
    implements android.view.View.OnClickListener, android.view.View.OnCreateContextMenuListener, com.skype.android.app.ListItemMenuDialog.MenuCallback, OnUserEventListener, AsyncCallback
{

    private static final int ALWAYS_SHOW = -1;
    AccessibilityUtil accessibility;
    Account account;
    FavoriteGridListAdapter adapter;
    AsyncService async;
    ConversationUtil conversationUtil;
    View emptyView;
    private View footerView;
    private int hideIfFewerThan;
    private View hubHeaderContainer;
    private View hubHeaderView;
    LayoutExperience layoutExperience;
    SkyLib lib;
    private RecyclerView listView;
    ObjectIdMap map;
    Navigation nav;
    a task;

    public FavoritesFragment()
    {
        hideIfFewerThan = -1;
    }

    private void checkNumberOfContacts()
    {
        byte byte0 = 0;
        if (hideIfFewerThan != -1)
        {
            if (adapter.getCount() > 0)
            {
                if (getView().getVisibility() != 0)
                {
                    setFragmentVisibility(0);
                }
            } else
            {
                int i = lib.getHardwiredContactGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
                i = ((ContactGroup)map.a(i, com/skype/ContactGroup)).getNrofcontactsProp();
                if (i >= 0)
                {
                    if (i < hideIfFewerThan)
                    {
                        byte0 = 8;
                    }
                    setFragmentVisibility(byte0);
                    return;
                }
            }
        }
    }

    private void requestFavorites()
    {
        async.a(task, new UiCallback(this, this));
    }

    private void setFragmentVisibility(int i)
    {
        View view = getView();
        if (view != null)
        {
            view.setVisibility(i);
        }
        if (hubHeaderView != null)
        {
            hubHeaderView.setVisibility(i);
        }
    }

    public void done(AsyncResult asyncresult)
    {
        byte byte0 = 8;
        if (asyncresult.a() != null)
        {
            asyncresult = (List)asyncresult.a();
            adapter.setData(asyncresult);
            boolean flag;
            int i;
            if (asyncresult.size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (footerView != null)
            {
                asyncresult = footerView.findViewById(0x7f100310);
                if (asyncresult != null)
                {
                    if (flag)
                    {
                        i = 8;
                    } else
                    {
                        i = 0;
                    }
                    asyncresult.setVisibility(i);
                }
            }
            asyncresult = emptyView;
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            asyncresult.setVisibility(i);
            asyncresult = getView();
            if (asyncresult != null)
            {
                i = asyncresult.getVisibility();
                if (i == 0 && !flag || i != 0 && flag)
                {
                    checkNumberOfContacts();
                }
            }
        }
    }

    protected int getLayoutId()
    {
        return 0x7f03008e;
    }

    boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_CBLSYNCSTATUS || onpropertychange.getPropKey() == PROPKEY.CONTACT_NROF_AUTHED_BUDDIES || onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactGroupListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CGROUP_NROFCONTACTS;
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONTACT_AVAILABILITY || onpropertychange.getPropKey() == PROPKEY.CONTACT_FULLNAME || onpropertychange.getPropKey() == PROPKEY.CONTACT_DISPLAYNAME || onpropertychange.getPropKey() == PROPKEY.CONTACT_AVATAR_IMAGE;
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONVERSATION_PINNED_ORDER;
    }

    public void onClick(View view)
    {
        if (view == emptyView || view == footerView || view == hubHeaderView || view == hubHeaderContainer)
        {
            view = new Intent(getActivity(), com/skype/android/app/contacts/ContactPickerActivity);
            view.putExtra("fragmentClass", com/skype/android/app/favorites/FavoritesPickContactsFragment);
            view.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.bR);
            view.putExtra("CHECKBOX_MODE", true);
            startActivity(view);
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem, int i)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131756511 2131756511: default 24
    //                   2131756511 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        menuitem = (Conversation)map.a(i, com/skype/Conversation);
        conversationUtil.b(menuitem);
        requestFavorites();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
    }

    public void onCreateContextMenu(Menu menu, int i)
    {
        getActionBarActivity().getMenuInflater().inflate(0x7f110013, menu);
    }

    void onEvent(OnMediaGroupAvatarLoaded onmediagroupavatarloaded)
    {
        adapter.notifyDataSetChanged();
    }

    void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        Account account1 = (Account)onpropertychange.getSender();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_CBLSYNCSTATUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_NROF_AUTHED_BUDDIES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_FULLNAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_DISPLAYNAME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 45
    //                   3 62;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (account1.getCblSyncStatusProp() == com.skype.Account.CBLSYNCSTATUS.CBL_IN_SYNC)
        {
            checkNumberOfContacts();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (account1.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            requestFavorites();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void onEvent(com.skype.android.gen.ContactGroupListener.OnPropertyChange onpropertychange)
    {
        if (((ContactGroup)onpropertychange.getSender()).getTypeProp() == com.skype.ContactGroup.TYPE.ALL_BUDDIES)
        {
            checkNumberOfContacts();
        }
    }

    void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        Contact contact;
        int i;
        contact = (Contact)onpropertychange.getSender();
        i = 0;
_L7:
        if (i >= adapter.getCount()) goto _L2; else goto _L1
_L1:
        if (!((Favorite)adapter.getItem(i)).getIdentity().equals(contact.getIdentity())) goto _L4; else goto _L3
_L3:
        _cls1..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 4 7: default 88
    //                   4 89
    //                   5 89
    //                   6 89
    //                   7 89;
           goto _L2 _L5 _L5 _L5 _L5
_L2:
        return;
_L5:
        adapter.notifyDataSetChanged();
        return;
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        adapter.notifyDataSetChanged();
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS)
        {
            requestFavorites();
            checkNumberOfContacts();
        }
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        activity = activity.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.FavoritesFragment);
        hideIfFewerThan = activity.getInt(0, -1);
        activity.recycle();
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, (Favorite)obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Favorite favorite, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (Favorite)obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Favorite favorite)
    {
        if (favorite != null)
        {
            itemviewholder = (Conversation)map.a(favorite.getConversationObjectId(), com/skype/Conversation);
            nav.chat(itemviewholder);
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (Favorite)obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Favorite favorite)
    {
        if (favorite != null)
        {
            itemviewholder = (Conversation)map.a(favorite.getConversationObjectId(), com/skype/Conversation);
            ListItemMenuDialog.create(this, conversationUtil.m(itemviewholder), favorite.getConversationObjectId()).show(getFragmentManager());
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
            requestFavorites();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = getActivity().getLayoutInflater();
        listView = getListView();
        listView.setOverScrollMode(2);
        listView.setFocusable(true);
        int i;
        if (!layoutExperience.isMultipane())
        {
            footerView = bundle.inflate(0x7f03008c, listView, false);
            footerView.setOnClickListener(this);
            bundle = new RecyclerListDecorator(getActivity(), adapter);
            bundle.b(footerView);
            listView.setAdapter(bundle);
        } else
        {
            listView.setAdapter(adapter);
        }
        if (listView instanceof TwoWayRecyclerView)
        {
            ((TwoWayRecyclerView)listView).setOnSpanCountListener(adapter);
        }
        adapter.setOnUserEventListener(0, this);
        emptyView.setOnClickListener(this);
        hubHeaderView = view.findViewById(0x7f100377);
        if (hubHeaderView != null)
        {
            hubHeaderView.setOnClickListener(this);
        }
        hubHeaderContainer = view.findViewById(0x7f100376);
        if (hubHeaderContainer != null)
        {
            hubHeaderContainer.setOnClickListener(this);
            if (accessibility.a())
            {
                hubHeaderContainer.setContentDescription(getString(0x7f08008b));
                AccessibilityUtil.a(new View[] {
                    hubHeaderView
                });
            }
        }
        view = emptyView;
        if (adapter.getCount() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }
}
