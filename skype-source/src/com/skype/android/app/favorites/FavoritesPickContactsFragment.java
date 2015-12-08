// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.SparseBooleanArray;
import android.view.View;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.contacts.ContactAdapter;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.ParticipantsDisplayText;
import java.util.Iterator;
import java.util.List;

public class FavoritesPickContactsFragment extends ContactPickerFragment
{

    AccessibilityUtil accessibility;
    private int greatestPinOrderId;
    private boolean hadFavorites;
    LayoutExperience layoutExperience;
    ObjectIdMap map;
    private ParticipantsDisplayText participantsDisplayText;
    private int previousConversationObjectId;

    public FavoritesPickContactsFragment()
    {
        previousConversationObjectId = 0;
        greatestPinOrderId = 0;
    }

    protected int getTitleId()
    {
        return 0x7f08022a;
    }

    public void onConfirm(List list)
    {
        list = getContactAdapter().getCheckedState(0);
        int i = 0;
        while (i < list.size()) 
        {
            int j = list.keyAt(i);
            boolean flag = list.valueAt(i);
            Contact contact = (Contact)map.a(j, com/skype/Contact);
            ConversationImpl conversationimpl = new ConversationImpl();
            contact.openConversation(conversationimpl);
            if (flag)
            {
                if (conversationimpl.getPinnedOrderProp() <= 0)
                {
                    if (!hadFavorites)
                    {
                        conversationimpl.pinFirst();
                    } else
                    {
                        conversationimpl.pinAfter(previousConversationObjectId);
                    }
                    previousConversationObjectId = conversationimpl.getObjectID();
                }
            } else
            if (conversationimpl.getPinnedOrderProp() > 0)
            {
                conversationimpl.unPin();
            }
            i++;
        }
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDataAdapter(getContactAdapter());
        getActivity().setTitle(getString(0x7f080081));
        getContactAdapter().setCustomCheckboxResource(0x7f02015e);
        getContactAdapter().setAvatarClippingEnabled(layoutExperience.isMultipane());
    }

    public void onDataLoaded(List list)
    {
        super.onDataLoaded(list);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ContactItem contactitem = (ContactItem)list.next();
            Contact contact = (Contact)map.a(contactitem.getContactObjectId(), com/skype/Contact);
            ConversationImpl conversationimpl = new ConversationImpl();
            contact.openConversation(conversationimpl);
            if (conversationimpl.getPinnedOrderProp() > 0)
            {
                participantsDisplayText.a(contact);
                getContactAdapter().setItemChecked(0, contactitem.getContactObjectId(), true);
                hadFavorites = true;
                getActivity().supportInvalidateOptionsMenu();
                if (greatestPinOrderId < conversationimpl.getPinnedOrderProp())
                {
                    greatestPinOrderId = conversationimpl.getPinnedOrderProp();
                    previousConversationObjectId = conversationimpl.getObjectID();
                }
            }
        } while (true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        participantsDisplayText = (ParticipantsDisplayText)ViewUtil.a(view, 0x7f100216);
    }
}
