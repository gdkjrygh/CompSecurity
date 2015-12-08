// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.ViewStateManager;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity

public class AddParticipantsAccessibilityFragment extends ContactPickerFragment
{

    Account account;
    ConversationUtil conversationUtil;
    private ArrayList existingParticipants;
    private Conversation incomingConversation;
    SkyLib lib;
    ObjectIdMap map;
    Navigation navigation;
    private String search;
    ViewStateManager viewState;

    public AddParticipantsAccessibilityFragment()
    {
    }

    private void getParticipantsFromIntent(Bundle bundle)
    {
        if (existingParticipants == null)
        {
            existingParticipants = new ArrayList();
        }
        if (bundle != null && bundle.containsKey("com.skype.objIds"))
        {
            bundle = bundle.getIntArray("com.skype.objIds");
            int j = bundle.length;
            for (int i = 0; i < j; i++)
            {
                int k = bundle[i];
                existingParticipants.add(map.a(k, com/skype/Contact));
            }

        }
    }

    private void showCreatedConversation(Conversation conversation, boolean flag)
    {
        ConversationViewState conversationviewstate = (ConversationViewState)viewState.a(conversation, com/skype/android/util/ConversationViewState);
        conversationviewstate.a(null);
        conversationviewstate.b(false);
        conversation = navigation.intentFor(conversation, com/skype/android/app/chat/ChatActivity);
        if (getArguments().containsKey("com.skype.sendIntent"))
        {
            conversation.putExtra("com.skype.sendIntent", (Intent)getArguments().getParcelable("com.skype.sendIntent"));
        }
        if (flag)
        {
            conversation.addFlags(0x4000000);
        }
        startActivity(conversation);
    }

    protected int getTitleId()
    {
        return incomingConversation == null ? 0x7f08025f : 0x7f08022c;
    }

    public void onConfirm(List list)
    {
        setActivityResult(list);
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDataAdapter(getContactAdapter());
        incomingConversation = (Conversation)getObjectInterface(com/skype/Conversation);
        Intent intent = getActivity().getIntent();
        if (intent != null)
        {
            getParticipantsFromIntent(intent.getExtras());
        }
        search = null;
        if (bundle != null)
        {
            search = bundle.getString("android.intent.action.SEARCH");
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (incomingConversation != null)
        {
            getActivity().setTitle(getString(0x7f080088));
            return;
        } else
        {
            getActivity().setTitle(getString(0x7f08008a));
            return;
        }
    }

    public void setActivityResult(List list)
    {
        Intent intent = new Intent();
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        getActivity().setResult(i, intent);
        return;
_L2:
        i = -1;
        if (incomingConversation != null)
        {
            break; /* Loop/switch isn't completed */
        }
        list = conversationUtil.a(list);
        showCreatedConversation(list, false);
_L5:
        intent.putExtra("com.skype.objIds", new int[] {
            list.getObjectID()
        });
        if (true) goto _L4; else goto _L3
_L3:
        Conversation conversation = conversationUtil.a(incomingConversation, list, false);
        list = conversation;
        if (conversation.getObjectID() != incomingConversation.getObjectID())
        {
            showCreatedConversation(conversation, true);
            list = conversation;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void setTitleId(int i)
    {
        super.setTitleId(i);
        getActivity().setTitle(i);
    }
}
