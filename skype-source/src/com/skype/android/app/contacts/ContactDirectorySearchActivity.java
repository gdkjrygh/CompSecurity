// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactSearch;
import com.skype.ContactSearchImpl;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.OnPromotedSCDContactsSearchCompleted;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.FacepileTileView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockedDialog, ContactAdapter, ContactItem

public class ContactDirectorySearchActivity extends SkypeActivity
    implements TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, OnUserEventListener, com.skype.android.widget.FacepileTileView.VisibilityChangeListener
{

    private final int MINIMUM_SEARCH_LENGTH = 3;
    AccessibilityUtil accessibility;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    ContactAdapter adapter;
    Button addAutoBuddyContactButton;
    Analytics analytics;
    ImageButton backButton;
    private ContactSearch contactSearch;
    ContactUtil contactUtil;
    PromotedSCDContactsManager contactsManager;
    EcsConfiguration ecsConfiguration;
    ViewGroup emptySearchLayout;
    ImageButton eraseButton;
    TextView facepilePrompt;
    FacepileTileView facepileView;
    ViewGroup facepileWrapper;
    ImageCache imageCache;
    InputMethodManager ime;
    TextView inviteFriends;
    LayoutExperience layoutExperience;
    SkyLib lib;
    private RecyclerView listView;
    ObjectIdMap map;
    MnvAnalytics mnvAnalytics;
    MnvCases mnvCases;
    Navigation navigation;
    ProgressBar progress;
    private List results;
    TextView resultsHeader;
    private int resultsId;
    private int resultsNoneId;
    TextView resultsPlaceholder;
    private int resultsPlaceholderId;
    ImageButton searchButton;
    EditText searchView;
    private int suggestedContactIds[];
    UserPreferences userPrefs;

    public ContactDirectorySearchActivity()
    {
    }

    private void enableEraseButton(boolean flag, int i)
    {
        if (eraseButton == null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        eraseButton.setOnClickListener(this);
        eraseButton.setVisibility(0);
_L6:
        eraseButton.setImageDrawable(getResources().getDrawable(i));
_L2:
        return;
_L4:
        eraseButton.setOnClickListener(null);
        if (!accessibility.a())
        {
            eraseButton.setVisibility(4);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void enableSearchButton(boolean flag, int i)
    {
        if (flag)
        {
            searchButton.setOnClickListener(this);
        } else
        {
            searchButton.setOnClickListener(null);
        }
        searchButton.setImageResource(i);
    }

    private boolean handleBlockedContact(Contact contact)
    {
        if (contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME))
        {
            ((ContactBlockedDialog)SkypeDialogFragment.create(contact.getObjectID(), com/skype/android/app/contacts/ContactBlockedDialog)).show(getSupportFragmentManager());
            return true;
        } else
        {
            return false;
        }
    }

    private void hideSoftKeyboard()
    {
        ime.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    private void inviteFriends()
    {
        analytics.c(AnalyticsEvent.B);
        String s = getString(0x7f080491, new Object[] {
            getString(0x7f080585)
        });
        String s1 = getString(0x7f080490);
        String s2 = getString(0x7f08014a);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", s1);
        intent.putExtra("android.intent.extra.TEXT", s);
        intent.putExtra("android.intent.extra.TITLE", s1);
        startActivity(Intent.createChooser(intent, s2));
    }

    private void launchMobileVerification()
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
        navigation.launchMobileVerification(com.skype.android.app.mnv.MnvCases.REFERRER.ADD_PEOPLE);
        mnvAnalytics.report(AnalyticsEvent.cv);
    }

    private void search(CharSequence charsequence, boolean flag)
    {
        if (flag)
        {
            hideSoftKeyboard();
        }
        if (contactSearch != null)
        {
            contactSearch.release();
        }
        if (layoutExperience.isMultipane())
        {
            emptySearchLayout.setVisibility(8);
            String s = String.format(getString(resultsId), new Object[] {
                searchView.getText().toString()
            });
            resultsHeader.setText(s);
            resultsHeader.setVisibility(0);
        } else
        {
            resultsPlaceholder.setText(resultsPlaceholderId);
        }
        contactSearch = new ContactSearchImpl();
        if (lib.createBasicContactSearch(charsequence.toString(), contactSearch))
        {
            map.b(contactSearch);
            map.a(contactSearch);
        }
        results.clear();
        adapter.clear();
        adapter.setSearchText(charsequence.toString());
        contactSearch.submit();
        progress.setVisibility(0);
    }

    private boolean shouldShowAutoBuddy()
    {
        return mnvCases.isDeviceReady(com.skype.android.app.mnv.MnvCases.REFERRER.ADD_PEOPLE, layoutExperience.isMultipane()) && !mnvCases.isAutoBuddyEnabled();
    }

    private void updateEmptyDisplay(boolean flag)
    {
        if (layoutExperience.isMultipane())
        {
            if (resultsHeader != null)
            {
                updateEmptyText(resultsHeader, flag);
            }
            return;
        } else
        {
            updateEmptyText(resultsPlaceholder, flag);
            return;
        }
    }

    private void updateEmptyText(TextView textview, boolean flag)
    {
        int i = 0;
        if (flag)
        {
            textview.setText(String.format(getString(resultsNoneId), new Object[] {
                searchView.getText().toString()
            }));
            textview.setVisibility(0);
            textview = inviteFriends;
            if (!ecsConfiguration.isInviteFriendsEnabled())
            {
                i = 8;
            }
            textview.setVisibility(i);
            return;
        } else
        {
            textview.setVisibility(8);
            inviteFriends.setVisibility(8);
            return;
        }
    }

    private void updateFacepileVisibility()
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2 = contactsManager.shouldDisplayPromotedSCDContacts();
        ViewGroup viewgroup;
        int i;
        if (suggestedContactIds != null && suggestedContactIds.length > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag2 && i != 0 && searchView.getText().length() == 0 && adapter.isEmpty() && userPrefs.isAutoBuddyEnabledInLocalCache())
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        viewgroup = facepileWrapper;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
    }

    private void updateSearchViewContentDescription()
    {
        Object obj = searchView.getText();
        if (((Editable) (obj)).length() == 0)
        {
            obj = getString(0x7f0800bd);
        } else
        {
            obj = getString(0x7f0800be, new Object[] {
                obj.toString()
            });
        }
        searchView.setContentDescription(((CharSequence) (obj)));
    }

    public void afterTextChanged(Editable editable)
    {
        String s;
        if (editable.length() >= 3)
        {
            enableSearchButton(true, 0x7f020188);
            enableEraseButton(true, 0x7f0200c7);
            search(editable, false);
        } else
        {
            enableSearchButton(false, 0x7f020189);
            enableEraseButton(false, 0x7f0200c8);
        }
        updateFacepileVisibility();
        s = getString(0x7f0800bd);
        if (editable.length() > 0)
        {
            s = getString(0x7f0800be, new Object[] {
                editable
            });
        }
        searchView.setContentDescription(s);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onClick(View view)
    {
        if (view != searchButton) goto _L2; else goto _L1
_L1:
        view = searchView.getText().toString();
        if (view.length() >= 3)
        {
            search(view, true);
        }
_L4:
        return;
_L2:
        if (view == backButton)
        {
            finish();
            return;
        }
        if (view != eraseButton)
        {
            break; /* Loop/switch isn't completed */
        }
        searchView.setText("");
        results.clear();
        adapter.clear();
        if (layoutExperience.isMultipane())
        {
            resultsHeader.setVisibility(8);
            emptySearchLayout.setVisibility(0);
            progress.setVisibility(8);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == facepileWrapper)
        {
            startActivity(navigation.intentForSuggestedContactsPicker());
            return;
        }
        if (view == addAutoBuddyContactButton)
        {
            launchMobileVerification();
            return;
        }
        if (view == inviteFriends)
        {
            inviteFriends();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = false;
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        listView = (RecyclerView)findViewById(0x7f10025c);
        adapter.setShowSeparators(false);
        adapter.setCountryAsMood(true);
        searchView.setOnEditorActionListener(this);
        searchView.addTextChangedListener(this);
        listView.setAdapter(adapter);
        adapter.setOnUserEventListener(0, this);
        int i;
        if (getLastCustomNonConfigurationInstance() != null)
        {
            results = (List)getLastCustomNonConfigurationInstance();
            adapter.setSearchText(searchView.getText().toString());
            adapter.update(results);
        } else
        {
            results = new ArrayList();
        }
        if (layoutExperience.isMultipane())
        {
            getSupportActionBar().h();
            enableEraseButton(false, 0x7f0200c8);
            ViewUtil.a(this, new View[] {
                backButton
            });
            resultsId = 0x7f080422;
            resultsPlaceholderId = 0x7f080421;
            resultsNoneId = 0x7f08041f;
            bundle = emptySearchLayout;
            if (results != null && results.size() > 0)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            bundle.setVisibility(i);
        } else
        {
            actionBarCustomizer.setTitle(0x7f08026f);
            resultsId = 0;
            resultsPlaceholderId = 0x7f080420;
            resultsNoneId = 0x7f08041e;
        }
        if (accessibility.a())
        {
            updateSearchViewContentDescription();
        }
        facepileView.setVisibilityChangeListener(this);
        facepileWrapper.setOnClickListener(this);
        if (shouldShowAutoBuddy())
        {
            addAutoBuddyContactButton.setVisibility(0);
            addAutoBuddyContactButton.setOnClickListener(this);
        }
        if (ecsConfiguration.isInviteFriendsEnabled())
        {
            analytics.c(AnalyticsEvent.C);
        }
        bundle = inviteFriends;
        if (ecsConfiguration.isInviteFriendsEnabled())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        inviteFriends.setOnClickListener(this);
        bundle = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (!TextUtils.isEmpty(bundle))
        {
            searchView.setText(bundle);
            search(bundle, true);
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getKeyCode() == 66 || i == 3 || i == 6 || i == 4)
        {
            textview = searchView.getText().toString();
            if (textview.length() >= 3)
            {
                search(textview, true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void onEvent(OnPromotedSCDContactsSearchCompleted onpromotedscdcontactssearchcompleted)
    {
        suggestedContactIds = onpromotedscdcontactssearchcompleted.getPromotedSCDContactIds();
        if (suggestedContactIds != null && suggestedContactIds.length > 0 && contactsManager.shouldDisplayPromotedSCDContacts())
        {
            facepileView.setContacts(contactUtil.a(suggestedContactIds), imageCache);
        }
        updateFacepileVisibility();
    }

    public void onEvent(com.skype.android.gen.ContactSearchListener.OnNewResult onnewresult)
    {
        if (contactSearch != null && onnewresult.getSender().getObjectID() == contactSearch.getObjectID() && searchView.length() > 0)
        {
            ProptableImpl proptableimpl = new ProptableImpl();
            SkyLib skylib = lib;
            int i = onnewresult.getContactObjectID();
            onnewresult = ContactItem.CONTACT_PROPKEYS;
            skylib.getPropertyTable(new int[] {
                i
            }, onnewresult, proptableimpl);
            onnewresult = new ContactItem(proptableimpl, 0);
            if (!account.getSkypenameProp().equalsIgnoreCase(onnewresult.getIdentity()))
            {
                progress.setVisibility(8);
                addAutoBuddyContactButton.setVisibility(8);
                inviteFriends.setVisibility(8);
                updateEmptyDisplay(false);
                adapter.add(onnewresult);
                results.add(onnewresult);
                adapter.notifyDataSetChanged();
            }
        }
    }

    public void onEvent(com.skype.android.gen.ContactSearchListener.OnPropertyChange onpropertychange)
    {
        if (contactSearch != null && onpropertychange.getSender().getObjectID() == contactSearch.getObjectID() && onpropertychange.getPropKey() == PROPKEY.CONTACTSEARCH_STATUS)
        {
            onpropertychange = contactSearch.getContactSearchStatusProp();
            if (onpropertychange == com.skype.ContactSearch.STATUS.FINISHED || onpropertychange == com.skype.ContactSearch.STATUS.FAILED)
            {
                progress.setVisibility(8);
                boolean flag;
                if (listView.getAdapter().getItemCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                updateEmptyDisplay(flag);
            }
        }
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
        if (obj instanceof ContactItem)
        {
            itemviewholder = (ContactItem)obj;
            itemviewholder = (Contact)map.a(itemviewholder.getContactObjectId(), com/skype/Contact);
            if (!handleBlockedContact(itemviewholder))
            {
                obj = new ConversationImpl();
                itemviewholder.openConversation(((com.skype.Conversation) (obj)));
                itemviewholder = navigation.intentFor(((ObjectInterface) (obj)), com/skype/android/app/chat/ChatActivity);
                itemviewholder.putExtra("com.skype.upIsBack", true);
                startActivity(itemviewholder);
            }
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

    public void onResume()
    {
        super.onResume();
        contactsManager.findAllPromotedSCDContacts();
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return results;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onVisibilityChanged(FacepileTileView facepiletileview, boolean flag)
    {
        facepiletileview = getString(0x7f080461);
        if (!flag)
        {
            facepiletileview = contactUtil.a(getResources(), contactUtil.a(suggestedContactIds));
        }
        facepilePrompt.setText(facepiletileview);
    }
}
