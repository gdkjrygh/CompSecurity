// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ObjectInterface;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.shortcircuit.OnPromotedSCDContactsSearchCompleted;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.MessagePopup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactPickerFragment, ContactAdapter, ContactItem

public class ContactSuggestedInvitesPickerFragment extends ContactPickerFragment
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, com.skype.android.widget.MessagePopup.Callback
{

    public static final String EXTRA_MODE = "EXTRA_MODE";
    public static final int MODE_NEW_CONTACTS_FOUND = 2;
    AccessibilityUtil accessibility;
    private Button addButton;
    private TextView addPeoplePrompt;
    private List allContactItems;
    Analytics analytics;
    private int contactListItemLayout;
    private int contactListLayout;
    ContactUtil contactUtil;
    private MessagePopup messagePopup;
    private int messageStyle;
    PromotedSCDContactsManager promotedSCDContactsManager;
    private List selectedContactItems;
    private ViewGroup skipButtonWrapper;

    public ContactSuggestedInvitesPickerFragment()
    {
        allContactItems = new ArrayList();
    }

    private void finishActivity()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.onBackPressed();
        }
    }

    private void preselectItems()
    {
        SparseBooleanArray sparsebooleanarray = adapter.getCheckedState(0);
        if (sparsebooleanarray.size() > 0)
        {
            refreshSelected(sparsebooleanarray);
        } else
        if (selectedContactItems != null)
        {
            ContactItem contactitem;
            for (Iterator iterator = selectedContactItems.iterator(); iterator.hasNext(); adapter.setItemChecked(0, contactitem.getContactObjectId(), true))
            {
                contactitem = (ContactItem)iterator.next();
            }

            selectedContactItems.clear();
            selectedContactItems = null;
            adapter.notifyDataSetChanged();
            return;
        }
    }

    private void sendContactRequests(List list)
    {
        Contact contact;
        for (list = list.iterator(); list.hasNext(); contactUtil.a(contact, analytics))
        {
            contact = (Contact)list.next();
        }

    }

    private void setAddButtonLabel(boolean flag, int i)
    {
        Object obj = getActivity().getResources();
        if (flag)
        {
            obj = String.format(((Resources) (obj)).getString(0x7f080330), new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            obj = ((Resources) (obj)).getString(0x7f08032f);
        }
        i = ((String) (obj)).indexOf('(');
        if (i > 0)
        {
            obj = new SpannableStringBuilder(((CharSequence) (obj)));
            ((SpannableStringBuilder) (obj)).setSpan(new StyleSpan(1), 0, i - 1, 18);
            addButton.setText(((CharSequence) (obj)));
            return;
        } else
        {
            addButton.setText(((CharSequence) (obj)));
            return;
        }
    }

    private void updateButtons()
    {
        boolean flag = false;
        int i = getSelectedCount(adapter.getCheckedState(0));
        if (i > 0)
        {
            flag = true;
        }
        addButton.setEnabled(flag);
        setAddButtonLabel(flag, i);
    }

    public Callable getLoader()
    {
        return new Callable() {

            final ContactSuggestedInvitesPickerFragment this$0;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final List call()
                throws Exception
            {
                return allContactItems;
            }

            
            {
                this$0 = ContactSuggestedInvitesPickerFragment.this;
                super();
            }
        };
    }

    protected int getTitleId()
    {
        return 0x7f0802e2;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756171: 
            finishActivity();
            return;

        case 2131756176: 
            onConfirm(getSelectedItems(adapter.getCheckedState(0)));
            break;
        }
    }

    public void onConfirm(List list)
    {
        super.onConfirm(list);
        sendContactRequests(list);
        String s = getActivity().getString(0x7f0803b1);
        messagePopup.showMessage(s, messageStyle, this);
        messagePopup.setVisibility(0);
        messagePopup.bringToFront();
        analytics.a(AnalyticsEvent.bh, list.size());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDataAdapter(getContactAdapter());
        contactListItemLayout = 0x7f0300cf;
        contactListLayout = 0x7f0300ce;
        messageStyle = 0x7f09015c;
        setUiDelegate(new PickerFragment.UiDelegate() {

            final ContactSuggestedInvitesPickerFragment this$0;

            public final void onItemClicked(boolean flag, ObjectInterface objectinterface)
            {
                updateButtons();
            }

            public final void onViewCreated(View view, Bundle bundle1)
            {
                view = getActionBarActivity();
                addButton = (Button)view.findViewById(0x7f100490);
                addPeoplePrompt = (TextView)view.findViewById(0x7f10048f);
                skipButtonWrapper = (ViewGroup)view.findViewById(0x7f10048b);
                ViewUtil.a(ContactSuggestedInvitesPickerFragment.this, new View[] {
                    addButton, skipButtonWrapper
                });
                messagePopup = (MessagePopup)view.findViewById(0x7f1004b3);
                messagePopup.setOnTouchListener(ContactSuggestedInvitesPickerFragment.this);
                addPeoplePrompt.setTextColor(view.getResources().getColor(0x7f0f0114));
                skipButtonWrapper.setVisibility(8);
            }

            public final void saveInstanceState(Bundle bundle1)
            {
            }

            
            {
                this$0 = ContactSuggestedInvitesPickerFragment.this;
                super();
            }
        });
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(contactListLayout, viewgroup, false);
    }

    public void onEvent(OnPromotedSCDContactsSearchCompleted onpromotedscdcontactssearchcompleted)
    {
        allContactItems.clear();
        List list = onpromotedscdcontactssearchcompleted.getPromotedSCDContacts();
        if (onpromotedscdcontactssearchcompleted.isUpdatesOnly() || !promotedSCDContactsManager.areContactsSeen())
        {
            selectedContactItems = list;
            allContactItems.addAll(selectedContactItems);
            preselectItems();
        } else
        {
            onpromotedscdcontactssearchcompleted = list.iterator();
            while (onpromotedscdcontactssearchcompleted.hasNext()) 
            {
                ContactItem contactitem = (ContactItem)onpromotedscdcontactssearchcompleted.next();
                if (!allContactItems.contains(contactitem))
                {
                    allContactItems.add(contactitem);
                }
            }
        }
        onDataLoaded(allContactItems);
        promotedSCDContactsManager.markContactsAsSeen();
        updateButtons();
    }

    public void onPopupComplete()
    {
        finishActivity();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
    }

    public void onResume()
    {
        super.onResume();
        promotedSCDContactsManager.findPromotedSCDContacts(true);
        preselectItems();
        getContactAdapter().disableGroupHeaders();
        getContactAdapter().setPeopleListItemLayout(contactListItemLayout);
        if (accessibility.a())
        {
            getActivity().setTitle(0x7f0802e2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return view == messagePopup;
    }



/*
    static Button access$002(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, Button button)
    {
        contactsuggestedinvitespickerfragment.addButton = button;
        return button;
    }

*/



/*
    static TextView access$102(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, TextView textview)
    {
        contactsuggestedinvitespickerfragment.addPeoplePrompt = textview;
        return textview;
    }

*/



/*
    static ViewGroup access$202(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, ViewGroup viewgroup)
    {
        contactsuggestedinvitespickerfragment.skipButtonWrapper = viewgroup;
        return viewgroup;
    }

*/



/*
    static MessagePopup access$302(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, MessagePopup messagepopup)
    {
        contactsuggestedinvitespickerfragment.messagePopup = messagepopup;
        return messagepopup;
    }

*/


}
