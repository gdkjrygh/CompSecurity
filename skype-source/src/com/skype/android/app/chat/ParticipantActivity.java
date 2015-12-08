// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.skype.Conversation;
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
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.chat:
//            AddParticipantsActivity, ChangeGroupPictureDialog

public class ParticipantActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    ActionBarCustomizer actionBarCustomizer;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    LayoutExperience layoutExperience;
    SkyLib lib;
    Navigation navigation;
    TimeUtil timeUtil;

    public ParticipantActivity()
    {
    }

    private void setupActionbar()
    {
        boolean flag = true;
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
        }
        actionBarCustomizer.setTitleFromConversation(conversation, true, false, 0, true);
        actionBarCustomizer.setTitleCompoundDrawable(0);
        ActionBar actionbar = getSupportActionBar();
        if (layoutExperience.isMultipane())
        {
            flag = false;
        }
        actionbar.b(flag);
    }

    private void updateActionBarLayout()
    {
        boolean flag1 = false;
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || ConversationUtil.s(conversation))
        {
            ActionBarCustomizer actionbarcustomizer;
            boolean flag;
            int i;
            if (getResources().getConfiguration().orientation == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            actionbarcustomizer = actionBarCustomizer;
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
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_DISPLAYNAME);
    }

    public void onClick(View view)
    {
        if (view == getSupportActionBar().d())
        {
            navigation.toOngoingCall(conversation);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        lifecycleSupport.addListener(actionBarCustomizer);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001c, menu);
        return true;
    }

    void onEvent(OnUpdateCallDurationEvent onupdatecalldurationevent)
    {
        actionBarCustomizer.updateCallDuration(conversation);
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        onpropertychange = onpropertychange.getPropKey();
        if (onpropertychange != PROPKEY.CONVERSATION_LOCAL_LIVESTATUS) goto _L4; else goto _L3
_L3:
        onpropertychange = conversation.getLocalLiveStatusProp();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

            static 
            {
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[onpropertychange.ordinal()];
        JVM INSTR tableswitch 1 2: default 72
    //                   1 73
    //                   2 73;
           goto _L2 _L5 _L5
_L2:
        return;
_L5:
        setupActionbar();
        return;
_L4:
        if (onpropertychange == PROPKEY.CONVERSATION_DISPLAYNAME)
        {
            setupActionbar();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
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
            {
                finish();
            }
            return true;

        case 2131756529: 
            startActivity(navigation.intentFor(conversation, com/skype/android/app/chat/AddParticipantsActivity));
            return true;

        case 2131756532: 
            menuitem = navigation.intentFor(conversation, com/skype/android/app/main/EditPropertyActivity);
            menuitem.putExtra("com.skype.propkey", PROPKEY.CONVERSATION_META_TOPIC);
            startActivity(menuitem);
            return true;

        case 2131756533: 
            ((ChangeGroupPictureDialog)SkypeDialogFragment.create(conversation, com/skype/android/app/chat/ChangeGroupPictureDialog)).show(getSupportFragmentManager());
            return true;

        case 2131756530: 
            conversationUtil.a(conversation);
            return true;

        case 2131756531: 
            conversationUtil.b(conversation);
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag2 = false;
        boolean flag3 = ConversationUtil.t(conversation);
        boolean flag;
        boolean flag4;
        boolean flag5;
        if (conversation.getPinnedOrderProp() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag5 = ConversationUtil.z(conversation);
        flag4 = ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_ADD);
        if (layoutExperience.isMultipane())
        {
            MenuItem menuitem = menu.findItem(0x7f1005f2);
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem.setVisible(flag1);
            menu.findItem(0x7f1005f3).setVisible(flag);
        } else
        {
            menu.findItem(0x7f1005f2).setVisible(false);
            menu.findItem(0x7f1005f3).setVisible(false);
        }
        menu.findItem(0x7f1005f5).setVisible(flag5);
        menu = menu.findItem(0x7f1005f1);
        flag = flag2;
        if (!flag3)
        {
            flag = flag2;
            if (flag4)
            {
                flag = flag2;
                if (!layoutExperience.isMultipane())
                {
                    flag = true;
                }
            }
        }
        menu.setVisible(flag);
        return true;
    }

    public void onResume()
    {
        super.onResume();
        setupActionbar();
        updateActionBarLayout();
    }
}
