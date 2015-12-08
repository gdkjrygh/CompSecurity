// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.picker.InputMethodOverlay;
import com.skype.android.app.contacts.ContactPickerActivity;
import com.skype.android.app.contacts.ContactSearchAdapter;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentAdapter;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.NonScrollingListLayout;
import com.skype.android.widget.ParticipantUpdater;
import com.skype.android.widget.ParticipantsEditText;
import com.skype.android.widget.QueryStringUpdater;
import com.skype.android.widget.SymbolView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAreaCallback, ChatActivity, ExistingChatSearchLoader, MessageArea, 
//            ParticipantsPickContactsFragment

public class AddParticipantsActivity extends SkypeActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, MessageAreaCallback, com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment.Callback, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback, AsyncCallback, ParticipantUpdater, QueryStringUpdater
{

    public static final String EXTRA_ADD_TO_CALL = "addToCall";
    public static final String EXTRA_PUBLISH_DRAFT_MSG = "publishDraftMsg";
    public static final String EXTRA_SHOW_MESSAGE_AREA = "showMsgArea";
    private static final int GET_PARTICIPANT_FROM_ADDRESS_BOOK = 101;
    SymbolView addressBookButton;
    AsyncService async;
    ChatText chatText;
    SymbolView confirmButton;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    private List existingParticipants;
    RelativeLayout groupsContainer;
    NonScrollingListLayout groupsList;
    ImageView homeButton;
    InputMethodManager imm;
    private Conversation incomingConversation;
    private InputMethodOverlay inputMethodOverlay;
    private boolean keyboardWasShown;
    LayoutExperience layoutExperience;
    ObjectIdMap map;
    MessageArea messageArea;
    Navigation navigation;
    ParticipantsEditText participantsText;
    private String pendingText;
    RecentAdapter recentAdapter;
    ContactSearchAdapter searchAdapter;
    private String smsRecipientPhone;
    TextView startNewChat;
    ViewStateManager viewState;

    public AddParticipantsActivity()
    {
    }

    private void addContact(Contact contact)
    {
        participantsText.addContact(contact);
        participantsText.requestFocus();
    }

    private void returnResult(Boolean boolean1)
    {
        setActivityResult(boolean1);
        imm.hideSoftInputFromWindow(participantsText.getApplicationWindowToken(), 0);
        finish();
    }

    private void showCreatedConversation(Conversation conversation, boolean flag)
    {
        ConversationViewState conversationviewstate = (ConversationViewState)viewState.a(conversation, com/skype/android/util/ConversationViewState);
        conversationviewstate.a(smsRecipientPhone);
        boolean flag1;
        if (!TextUtils.isEmpty(smsRecipientPhone))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        conversationviewstate.b(flag1);
        conversation = navigation.intentFor(conversation, com/skype/android/app/chat/ChatActivity);
        conversation.putExtra("sendText", pendingText);
        if (getIntent().hasExtra("com.skype.sendIntent"))
        {
            conversation.putExtra("com.skype.sendIntent", (Intent)getIntent().getParcelableExtra("com.skype.sendIntent"));
        }
        if (flag)
        {
            conversation.addFlags(0x4000000);
        }
        startActivity(conversation);
    }

    private void updateConfirmButtonState(int i)
    {
        SymbolView symbolview = confirmButton;
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        symbolview.setEnabled(flag);
    }

    private void updateGroupList()
    {
        groupsContainer.setVisibility(4);
        Object obj = participantsText.getContacts();
        int j = ((List) (obj)).size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = ((Contact)((List) (obj)).get(i)).getObjectID();
        }

        (new Bundle()).putIntArray("com.skype.objIds", ai);
        if (incomingConversation != null)
        {
            obj = new ExistingChatSearchLoader(ai, incomingConversation.getObjectID());
        } else
        {
            obj = new ExistingChatSearchLoader(ai);
        }
        async.a(((java.util.concurrent.Callable) (obj)), this);
    }

    public void done(AsyncResult asyncresult)
    {
        boolean flag = false;
        asyncresult = (List)asyncresult.a();
        if (asyncresult != null)
        {
            recentAdapter.update(asyncresult);
            recentAdapter.notifyDataSetChanged();
            int i;
            if (asyncresult.size() > 0 && participantsText.getContacts().size() > existingParticipants.size())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            asyncresult = groupsContainer;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            asyncresult.setVisibility(i);
        }
    }

    public List getAvailableSmsTargets()
    {
        return new ArrayList();
    }

    public int getPickerHeight()
    {
        return inputMethodOverlay.getInputMethodHeight();
    }

    public int getSelectedSmsTarget()
    {
        return -1;
    }

    public boolean getShowEmoticonsOnly()
    {
        return true;
    }

    public String getSmsPrice()
    {
        return "";
    }

    public void hidePicker()
    {
        inputMethodOverlay.hide();
    }

    public boolean isMessageAreaEnabled()
    {
        return participantsText.getAddedContacts().size() > 0;
    }

    public boolean isPickerShowing()
    {
        return inputMethodOverlay.isShowing();
    }

    public boolean needsBottomSpacing()
    {
        return false;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 101 && j == -1)
        {
            intent = intent.getIntArrayExtra("com.skype.objIds");
            if (intent != null && intent.length > 0)
            {
                j = intent.length;
                for (i = 0; i < j; i++)
                {
                    int k = intent[i];
                    Contact contact = (Contact)map.a(k, com/skype/Contact);
                    if (contact != null)
                    {
                        addContact(contact);
                    }
                }

                updateConfirmButtonState(participantsText.getParticipantCount());
                messageArea.setEnabled(true);
            }
        }
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        if (view == homeButton)
        {
            setResult(0);
            finish();
        } else
        {
            if (view == confirmButton)
            {
                returnResult(Boolean.valueOf(false));
                return;
            }
            if (view == startNewChat)
            {
                groupsContainer.setVisibility(8);
                incomingConversation = null;
                returnResult(Boolean.valueOf(false));
                return;
            }
            if (view == addressBookButton)
            {
                view = new Intent(this, com/skype/android/app/contacts/ContactPickerActivity);
                view.putExtra("fragmentClass", com/skype/android/app/chat/ParticipantsPickContactsFragment);
                List list = participantsText.getContacts();
                if (list != null && list.size() > 0)
                {
                    int ai[] = new int[list.size()];
                    for (int i = 0; i < ai.length; i++)
                    {
                        ai[i] = ((Contact)list.get(i)).getObjectID();
                    }

                    view.putExtra("com.skype.objIds", ai);
                }
                startActivityForResult(view, 101);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        incomingConversation = (Conversation)getObjectInterface(com/skype/Conversation);
        if (!layoutExperience.isMultipane())
        {
            setRequestedOrientation(7);
        }
        inputMethodOverlay = new InputMethodOverlay(this, this, null, this);
        recentAdapter.setShowImages(false);
        recentAdapter.useClickableTitleColors(true);
        groupsList.setAdapter(recentAdapter);
        groupsList.setItemClickListener(this);
        int i;
        if (incomingConversation != null)
        {
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f0f0021)));
            existingParticipants = conversationUtil.c(incomingConversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS);
        } else
        {
            existingParticipants = new ArrayList();
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x106000b)));
        }
        participantsText.init(contactUtil, searchAdapter, map);
        participantsText.setExistingContacts(existingParticipants);
        participantsText.setQueryUpdater(this);
        participantsText.setParticipantUpdater(this);
        participantsText.requestFocus();
        ViewUtil.a(this, new View[] {
            homeButton, addressBookButton, confirmButton
        });
        if (getIntent().hasExtra("shareContent"))
        {
            bundle = getIntent().getStringExtra("shareContent");
            messageArea.getEditText().setText(bundle);
            getIntent().removeExtra("shareContent");
        }
        if (getIntent().getBooleanExtra("showMsgArea", true))
        {
            messageArea.clearFocus();
            messageArea.setCallback(this);
            messageArea.setEnabled(isMessageAreaEnabled());
        } else
        {
            messageArea.setVisibility(8);
        }
        if (incomingConversation == null)
        {
            startNewChat.setOnClickListener(this);
            setTitle(0x7f08008a);
        } else
        {
            startNewChat.setVisibility(8);
            setTitle(0x7f080088);
        }
        if (incomingConversation != null)
        {
            bundle = (ConversationViewState)viewState.a(incomingConversation, com/skype/android/util/ConversationViewState);
            Object obj = bundle.c();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                messageArea.getEditText().setText(((CharSequence) (obj)));
                messageArea.getEditText().setSelection(((CharSequence) (obj)).length());
                obj = messageArea;
                boolean flag;
                if (!bundle.d())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((MessageArea) (obj)).toggleImageSpan(flag, chatText);
            }
        }
        bundle = homeButton;
        if (incomingConversation == null)
        {
            i = 0x7f0800e5;
        } else
        {
            i = 0x7f0800e4;
        }
        bundle.setContentDescription(getString(i));
    }

    public void onDone()
    {
        returnResult(Boolean.valueOf(false));
    }

    public void onEmoticonSelected(EmoticonContent emoticoncontent)
    {
        messageArea.onEmoticonSelected(emoticoncontent, chatText);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i < recentAdapter.getCount())
        {
            adapterview = (Recent)recentAdapter.getItem(i);
            adapterview = (Conversation)map.a(adapterview.getConversationObjectId(), com/skype/Conversation);
            navigation.chat(adapterview, true);
            finish();
        }
    }

    public void onKeyboardDismissed()
    {
        participantsText.requestFocus();
        messageArea.clearFocus();
    }

    public void onMessageAreaFocused(boolean flag)
    {
        if (flag)
        {
            keyboardWasShown = true;
        } else
        if (keyboardWasShown)
        {
            keyboardWasShown = false;
            imm.hideSoftInputFromWindow(messageArea.getWindowToken(), 0);
            return;
        }
    }

    public void onMessageAreaTextChanged(CharSequence charsequence)
    {
    }

    public void onParticipantListChanged(int i)
    {
        updateConfirmButtonState(i);
        updateGroupList();
        if (i > 0)
        {
            messageArea.setEnabled(true);
            return;
        } else
        {
            messageArea.setEnabled(false);
            return;
        }
    }

    public void onPickerDeleteKey()
    {
        messageArea.onDeleteKey();
    }

    public void onPickerDismiss()
    {
        messageArea.resumeEditing();
    }

    public void onQueryStringUpdate(CharSequence charsequence)
    {
    }

    public void onResume()
    {
        super.onResume();
        updateGroupList();
    }

    public void onSendMoji(MojiContent mojicontent)
    {
    }

    public void sendText(CharSequence charsequence)
    {
        pendingText = charsequence.toString();
        returnResult(Boolean.valueOf(true));
    }

    public void setActivityResult(Boolean boolean1)
    {
        Object obj;
        Intent intent;
        intent = new Intent();
        obj = participantsText.getAddedContacts();
        if (((List) (obj)).size() != 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        setResult(i, intent);
        return;
_L2:
        i = -1;
        if (incomingConversation != null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean1 = participantsText.getContacts();
        obj = conversationUtil.a(boolean1);
        showCreatedConversation(((Conversation) (obj)), false);
_L5:
        intent.putExtra("com.skype.objId", ((Conversation) (obj)).getObjectID());
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag = getIntent().getBooleanExtra("addToCall", false);
        Conversation conversation = conversationUtil.a(incomingConversation, ((List) (obj)), flag);
        if (conversation.getObjectID() != incomingConversation.getObjectID())
        {
            showCreatedConversation(conversation, true);
            obj = conversation;
        } else
        {
            ConversationViewState conversationviewstate = (ConversationViewState)viewState.a(conversation, com/skype/android/util/ConversationViewState);
            pendingText = String.valueOf(messageArea.getEditText().getText());
            obj = conversation;
            if (!TextUtils.isEmpty(pendingText))
            {
                conversationviewstate.a(pendingText);
                intent.putExtra("publishDraftMsg", boolean1);
                obj = conversation;
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setSmsRecipientPhone(String s)
    {
        smsRecipientPhone = s;
    }

    public void showEmoticonPicker()
    {
        inputMethodOverlay.showWithInputMethod(messageArea.getEditText());
    }
}
