// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeListFragment;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockConfirmDialog, ContactRemoveConfirmDialog

public class ContactMenuBuilder
    implements com.skype.android.app.ObjectInterfaceMenuDialog.MenuCallback
{

    private ContactUtil contactUtil;
    private ConversationUtil conversationUtil;
    private SkypeListFragment parentFragment;

    public ContactMenuBuilder(SkypeListFragment skypelistfragment, ContactUtil contactutil, ConversationUtil conversationutil)
    {
        parentFragment = skypelistfragment;
        contactUtil = contactutil;
        conversationUtil = conversationutil;
    }

    public boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface, Bundle bundle)
    {
        objectinterface = (Contact)objectinterface;
        bundle = new ConversationImpl();
        objectinterface.openConversation(bundle);
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756476: 
            conversationUtil.a(bundle);
            return true;

        case 2131756477: 
            conversationUtil.b(bundle);
            return true;

        case 2131756478: 
            ((ContactBlockConfirmDialog)SkypeDialogFragment.create(objectinterface, com/skype/android/app/contacts/ContactBlockConfirmDialog)).show(parentFragment.getFragmentManager());
            return true;

        case 2131756479: 
            objectinterface.setBlocked(false, false);
            return true;

        case 2131756480: 
            ((ContactRemoveConfirmDialog)SkypeDialogFragment.create(objectinterface, com/skype/android/app/contacts/ContactRemoveConfirmDialog)).show(parentFragment.getFragmentManager());
            break;
        }
        return true;
    }

    public void onCreateContextMenu(Menu menu, ObjectInterface objectinterface, Bundle bundle)
    {
        boolean flag2 = true;
        parentFragment.getActionBarActivity().getMenuInflater().inflate(0x7f11000a, menu);
        objectinterface = (Contact)objectinterface;
        bundle = new ConversationImpl();
        objectinterface.openConversation(bundle);
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if (bundle.getPinnedOrderProp() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = ContactUtil.g(objectinterface);
        flag4 = objectinterface.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME);
        objectinterface = menu.findItem(0x7f1005bd);
        if (!flag4 && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        objectinterface.setVisible(flag1);
        objectinterface = menu.findItem(0x7f1005bc);
        if (!flag4 && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        objectinterface.setVisible(flag1);
        objectinterface = menu.findItem(0x7f1005be);
        if (!flag4 && !flag3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        objectinterface.setVisible(flag1);
        menu = menu.findItem(0x7f1005bf);
        if (flag4 && !flag3)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        menu.setVisible(flag1);
    }
}
