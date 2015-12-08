// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.google.a.b.ar;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CarryoutCommandAgent, CarryoutGuard

public class CarryoutSelectionAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CarryoutSelectionAgent.getSimpleName();
    public static volatile boolean retryPrompt = false;
    private StoreManager mStoreManager;

    public CarryoutSelectionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        mStoreManager = (StoreManager)getSession().getManager("store_manager");
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private boolean isStoresEmpty()
    {
        return mStoreManager.getStores() == null || mStoreManager.getStores().isEmpty();
    }

    private void resetAgents()
    {
        SpeechContext.updateAgents(new String[] {
            "CarryoutAgency", "RESET"
        });
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        Object obj;
        obj = (UserProfileManager)getSession().getManager("user_manager");
        if (!CarryoutCommandAgent.isSavedAddress)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        CarryoutCommandAgent.isSavedAddress = false;
        if (!((UserProfileManager) (obj)).isSavedAddressExists() || CarryoutGuard.isSavedLocationShowing) goto _L2; else goto _L1
_L1:
        obj = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
        ((com.dominos.bus.events.SpeechEvents.SpeechActionEvent) (obj)).setActionType(com.dominos.bus.events.SpeechEvents.ActionType.SHOW_SAVED_ADDRESS);
        speechcontext.delayConversation();
        App.getInstance().bus.post(obj);
_L4:
        return;
_L2:
        obj = "carryout_pick_number";
_L5:
        speechcontext.addPrompter(getPromptManager().getChapters("store").getPrompter(((String) (obj))));
        if (!StringHelper.equals(((String) (obj)), "type_address")) goto _L4; else goto _L3
_L3:
        speechcontext.delayConversation();
        return;
        if (retryPrompt)
        {
            obj = "carryout_pick_number";
            retryPrompt = false;
        } else
        if (CarryoutGuard.isSavedLocationShowing)
        {
            obj = "choose_saved_enum";
        } else
        if (isStoresEmpty())
        {
            if (((UserProfileManager) (obj)).isSavedAddressExists())
            {
                obj = "type_or_saved_address";
            } else
            {
                obj = "type_address";
            }
        } else
        if (((UserProfileManager) (obj)).isSavedAddressExists())
        {
            obj = "choose_saved_address";
        } else
        {
            obj = "choose_enum";
        }
          goto _L5
    }

    public void onSavedAddressListCanceled(com.dominos.bus.events.OriginatedFromUX.SavedAddressCanceled savedaddresscanceled)
    {
        resetAgents();
    }

    public void onSavedLocationSelected(com.dominos.bus.events.OriginatedFromUX.SavedAddressSelected savedaddressselected)
    {
        CarryoutGuard.isSavedLocationShowing = false;
    }

    public void savedLocationSelectRequest(com.dominos.bus.events.OriginatedFromUX.SavedLocationShownRequest savedlocationshownrequest)
    {
        CarryoutGuard.isSavedLocationShowing = true;
        resetAgents();
    }

    public void storeSelectedRequest(com.dominos.bus.events.OriginatedFromUX.StoreSelectedRequest storeselectedrequest)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                NAME, Integer.toString(storeselectedrequest.getStoreNumber())
            });
        }
    }

}
