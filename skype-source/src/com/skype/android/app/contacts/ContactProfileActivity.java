// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.OnUpdateCallDurationEvent;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            OnContactBlocked, OnContactRemoved, ContactBlockConfirmDialog, ContactRemoveConfirmDialog, 
//            ContactEditActivity

public class ContactProfileActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    ActionBarCustomizer actionBarCustomizer;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    LayoutExperience layoutExperience;
    SkyLib lib;
    Navigation navigation;
    TimeUtil timeUtil;

    public ContactProfileActivity()
    {
    }

    private void setupActionbar()
    {
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE)
        {
            actionBarCustomizer.setTitleFromOngoingConversation(conversation, 0x7f020056);
            getSupportActionBar().d().setOnClickListener(this);
            return;
        }
        if (ConversationUtil.s(conversation))
        {
            actionBarCustomizer.setTitleFromOngoingConversation(conversation, 0x7f0201ec);
            getSupportActionBar().d().setOnClickListener(this);
            return;
        } else
        {
            actionBarCustomizer.setTitleFromContact(contact, false);
            return;
        }
    }

    private void updateActionBarLayout()
    {
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = false;
            if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || ConversationUtil.s(conversation))
            {
                if (getResources().getConfiguration().orientation == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!layoutExperience.isMultipane())
                {
                    break label0;
                }
                actionBarCustomizer.setTitleCompoundDrawable(0x7f020056);
            }
            return;
        }
        ActionBarCustomizer actionbarcustomizer = actionBarCustomizer;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        actionbarcustomizer.setSubtitleVisiblity(i);
        actionbarcustomizer = actionBarCustomizer;
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 0x7f020056;
        }
        actionbarcustomizer.setTitleCompoundDrawable(i);
        actionBarCustomizer.setSubtitleCompoundDrawable(0x7f020056);
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS;
    }

    public void onClick(View view)
    {
        if (view == getSupportActionBar().d())
        {
            navigation.toOngoingCall(conversation);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        contact = (Contact)getObjectInterface(com/skype/Contact);
        lifecycleSupport.addListener(actionBarCustomizer);
        conversation = new ConversationImpl();
        contact.openConversation(conversation);
        if (layoutExperience.isMultipane())
        {
            getSupportActionBar();
        }
        bundle = getSupportActionBar();
        boolean flag;
        if (!layoutExperience.isMultipane())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.b(flag);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11000d, menu);
        actionBarCustomizer.setChildrenGravity(16);
        return true;
    }

    public void onEvent(OnUpdateCallDurationEvent onupdatecalldurationevent)
    {
        actionBarCustomizer.updateCallDuration(conversation);
    }

    public void onEvent(OnContactBlocked oncontactblocked)
    {
        if (contact != null && contact.equals(oncontactblocked.getContact()))
        {
            finish();
        }
    }

    public void onEvent(OnContactRemoved oncontactremoved)
    {
        if (contact != null && contact.equals(oncontactremoved.getContact()))
        {
            finish();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnCapabilitiesChanged oncapabilitieschanged)
    {
        supportInvalidateOptionsMenu();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        onpropertychange = conversation.getLocalLiveStatusProp();
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

            static 
            {
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls2..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[onpropertychange.ordinal()];
        JVM INSTR tableswitch 1 1: default 56
    //                   1 57;
           goto _L2 _L3
_L2:
        return;
_L3:
        setupActionbar();
        return;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            if (isTaskRoot())
            {
                navigation.upToHome();
            } else
            if (getSupportFragmentManager().e() != 0)
            {
                getSupportFragmentManager().c();
            } else
            {
                finish();
            }
            return true;

        case 2131756487: 
        case 2131756488: 
            menuitem = (ContactBlockConfirmDialog)SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactBlockConfirmDialog);
            menuitem.show(getSupportFragmentManager());
            menuitem.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final ContactProfileActivity this$0;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    if (contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME))
                    {
                        navigation.home();
                    }
                }

            
            {
                this$0 = ContactProfileActivity.this;
                super();
            }
            });
            return true;

        case 2131756489: 
            ((ContactRemoveConfirmDialog)SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactRemoveConfirmDialog)).show(getSupportFragmentManager());
            return true;

        case 2131756484: 
            conversationUtil.a(conversation);
            return true;

        case 2131756485: 
            conversationUtil.b(conversation);
            return true;

        case 2131756486: 
            startActivity(navigation.intentFor(contact, com/skype/android/app/contacts/ContactEditActivity));
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag2 = false;
        MenuItem menuitem;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (conversation.getPinnedOrderProp() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag4 = ContactUtil.g(contact);
        flag3 = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_AUTHORIZED_BY_ME);
        flag5 = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME);
        menuitem = menu.findItem(0x7f1005c4);
        if (flag3 && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem.setVisible(flag1);
        menuitem = menu.findItem(0x7f1005c5);
        if (flag3 && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem.setVisible(flag1);
        menuitem = menu.findItem(0x7f1005c8);
        if (flag5 && !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem.setVisible(flag1);
        menuitem = menu.findItem(0x7f1005c7);
        if (!flag5 && !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem.setVisible(flag1);
        menuitem = menu.findItem(0x7f1005c6);
        flag1 = flag2;
        if (flag3)
        {
            flag1 = flag2;
            if (!ContactUtil.a(contact))
            {
                flag1 = flag2;
                if (!ContactUtil.p(contact))
                {
                    flag1 = true;
                }
            }
        }
        menuitem.setVisible(flag1);
        menu.findItem(0x7f1005c9).setVisible(flag3);
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        setupActionbar();
        updateActionBarLayout();
    }

}
