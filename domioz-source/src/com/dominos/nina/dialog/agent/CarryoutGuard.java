// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.utils.CommandBuilder;
import com.google.a.b.ar;
import com.nuance.b.e.c;
import com.nuance.b.e.z;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, CarryoutSelectionAgent, CarryoutLoadGuard, UserIntentionAgent, 
//            NewOrderGuard, CartConfirmAgent

public class CarryoutGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CarryoutGuard.getSimpleName();
    public static volatile boolean isSavedLocationShowing = false;
    private StoreManager mStoreManager;

    public CarryoutGuard(String s)
    {
        super(NAME, s);
        mStoreManager = (StoreManager)getSession().getManager("store_manager");
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private int convertMeaningToNumber(String s)
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    private void handleSavedLocationCommand(SpeechContext speechcontext, String s)
    {
        int i = convertMeaningToNumber(s);
        if (i > 0 && isValidSavedLocation(i))
        {
            com.dominos.bus.events.SpeechEvents.SpeechActionEvent speechactionevent = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
            speechactionevent.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.SELECT_SAVED_LOCATION);
            speechactionevent.setData(s);
            speechcontext.delayConversation();
            App.getInstance().bus.post(speechactionevent);
            return;
        } else
        {
            CarryoutSelectionAgent.retryPrompt = true;
            speechcontext.delayConversation();
            speechcontext.resetAgency(new String[] {
                CarryoutSelectionAgent.NAME
            });
            speechcontext.resetAgency(new String[] {
                NAME
            });
            return;
        }
    }

    private void handleStoreListCommand(SpeechContext speechcontext, String s)
    {
        int i = convertMeaningToNumber(s);
        if (i > 0)
        {
            if (!isStoresEmpty() && isValidStoreNumber(i) && !isStoreAvailable(i - 1))
            {
                PromptModel promptmodel = getPromptManager().getChapters("alert").getPrompter("generic").getRandomPrompt();
                speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
            }
            com.dominos.bus.events.SpeechEvents.SpeechActionEvent speechactionevent = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
            speechactionevent.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.SELECT_STORE);
            speechactionevent.setData(s);
            speechcontext.delayConversation();
            App.getInstance().bus.post(speechactionevent);
            return;
        } else
        {
            CarryoutSelectionAgent.retryPrompt = true;
            speechcontext.delayConversation();
            speechcontext.resetAgency(new String[] {
                CarryoutSelectionAgent.NAME
            });
            speechcontext.resetAgency(new String[] {
                NAME
            });
            return;
        }
    }

    private boolean isStoreAvailable(int i)
    {
        LocatorStore locatorstore = (LocatorStore)mStoreManager.getStores().get(i);
        return locatorstore.isCarryoutAvailable() && locatorstore.isOpen() && locatorstore.isOnline();
    }

    private boolean isStoresEmpty()
    {
        return mStoreManager.getStores() == null || mStoreManager.getStores().isEmpty();
    }

    private boolean isValidSavedLocation(int i)
    {
        return i <= ((UserProfileManager)getSession().getManager("user_manager")).getCurrentUser().getAddressList().size();
    }

    private boolean isValidStoreNumber(int i)
    {
        while (mStoreManager.getStores() == null || i > mStoreManager.getStores().size()) 
        {
            return false;
        }
        return true;
    }

    private void resetCarryOutAgents()
    {
        SpeechContext.updateAgents(new String[] {
            "CarryoutAgency", "RESET"
        });
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        String s = speechcontext.getSurfaceMeaning(CarryoutSelectionAgent.NAME);
        if (isSavedLocationShowing)
        {
            handleSavedLocationCommand(speechcontext, s);
            return;
        } else
        {
            handleStoreListCommand(speechcontext, s);
            return;
        }
    }

    public void getStoreListResponse(com.dominos.bus.events.OriginatedFromUX.StoreSelectionResponded storeselectionresponded)
    {
        if (storeselectionresponded.isValid())
        {
            if (c.i())
            {
                c.l().n();
                CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendValue(CarryoutLoadGuard.NAME, "DONE").appendValue(CarryoutSelectionAgent.NAME, "1").appendValue(NAME, "DONE").appendReset(UserIntentionAgent.NAME).appendValue(UserIntentionAgent.NAME, "cart").appendValue(NewOrderGuard.NAME, "DONE").build());
            }
            return;
        } else
        {
            CarryoutSelectionAgent.retryPrompt = true;
            resetCarryOutAgents();
            return;
        }
    }

}
