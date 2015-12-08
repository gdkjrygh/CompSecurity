// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class GlobalAgent extends BaseAgent
{

    public static final String COMMAND_ALERT = "alert";
    public static final String COMMAND_CANCEL = "cancel";
    public static final String COMMAND_CART = "cart";
    public static final String COMMAND_GOODBYE = "goodbye";
    public static final String COMMAND_GO_BACK = "go_back";
    public static final String COMMAND_HINTS = "hints";
    public static final String COMMAND_HOME = "home";
    public static final String COMMAND_LOGIN = "alert_login";
    public static final String COMMAND_REPEAT = "repeat";
    public static final String COMMAND_SIGN_IN = "sign_in";
    public static final String COMMAND_SIGN_OUT = "sign_out";
    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/GlobalAgent.getSimpleName();
    private PromptModel mAlertPrompt;

    public GlobalAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private void goHome(final SpeechContext sc)
    {
        ((ProductWizardManager)getSession().getManager("product_wizard_manager")).reset();
        ((DomProductManager)getSession().getManager("dom_product_manager")).getNinaPartialProducts().clear();
        sc.setAvoidFocusIn(true);
        sc.sendRunnableState(new _cls3());
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(final SpeechContext sc)
    {
        Object obj = sc.getSurfaceMeaning(NAME);
        final Object currentActivity = mSpeechManager.getCurrentNinaActivity();
        if ("hints".equals(obj))
        {
            obj = getPromptManager().getChapters("global").getPrompter("hints").getRandomPrompt();
            sc.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
            sc.stopConversation();
            sc.setAvoidFocusIn(true);
            sc.sendRunnableState(new _cls1());
        } else
        {
            if ("goodbye".equals(obj))
            {
                sc.clearTextVoicePrompts();
                sc.stopConversation();
                sc.setAvoidFocusIn(true);
                return;
            }
            if ("home".equals(obj))
            {
                goHome(sc);
                return;
            }
            if ("repeat".equals(obj))
            {
                sc.log("GlobalAgent.repeat()");
                return;
            }
            if ("sign_in".equals(obj))
            {
                currentActivity = getPromptManager().getChapters("global").getPrompter("tap_that").getRandomPrompt();
                sc.addTextVoicePrompt(((PromptModel) (currentActivity)).getText(new Object[0]), ((PromptModel) (currentActivity)).getSpeech(new Object[0]));
                sc.stopConversation();
                sc.setAvoidFocusIn(true);
                return;
            }
            if (!"sign_out".equals(obj))
            {
                if ("go_back".equals(obj))
                {
                    sc.setAvoidFocusIn(true);
                    sc.pauseConversation();
                    ((Activity) (currentActivity)).runOnUiThread(new _cls2());
                    return;
                }
                if ("cancel".equals(obj))
                {
                    goHome(sc);
                    return;
                }
                if ("cart".equals(obj))
                {
                    goHome(sc);
                    return;
                }
                if (StringHelper.equals("alert", ((String) (obj))))
                {
                    if (mAlertPrompt == null)
                    {
                        mAlertPrompt = getPromptManager().getChapters("alert").getPrompter("generic").getRandomPrompt();
                    }
                    sc.addTextVoicePrompt(mAlertPrompt.getText(new Object[0]), mAlertPrompt.getSpeech(new Object[0]));
                    sc.delayConversation();
                    sc.setAvoidFocusIn(true);
                    mAlertPrompt = null;
                    return;
                }
                if (StringHelper.equals("alert_login", ((String) (obj))))
                {
                    PromptModel promptmodel = getPromptManager().getChapters("alert").getPrompter("authentication").getRandomPrompt();
                    sc.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
                    sc.delayConversation();
                    sc.setAvoidFocusIn(true);
                    return;
                }
            }
        }
    }

    public void onGeneralAlertClose(com.dominos.bus.events.DialogEvents.GeneralAlertClose generalalertclose)
    {
        SpeechContext.updateGlobalAgentAsAlert(false, generalalertclose.getExtraCommands());
    }

    public void onGeneralAlertShow(com.dominos.bus.events.DialogEvents.GeneralAlertShow generalalertshow)
    {
        SpeechContext.updateGlobalAgentAsAlert(true, new String[0]);
        if (generalalertshow.getPrompt() != null)
        {
            mAlertPrompt = getPromptManager().getChapters("alert").getPrompter("half_toppings_voice_support").getRandomPrompt();
        }
    }

    public void onLoginAlertClose(com.dominos.bus.events.DialogEvents.LoginAlertClose loginalertclose)
    {
        SpeechContext.updateGlobalAgentAsAlert(false, loginalertclose.getExtraCommands());
    }

    public void onLoginAlertShow(com.dominos.bus.events.DialogEvents.LoginAlertShow loginalertshow)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendValue(NAME, "alert_login").build());
            return;
        }
    }


    private class _cls3
        implements Runnable
    {

        final GlobalAgent this$0;
        final SpeechContext val$sc;

        public void run()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.HomeClickRequested());
            sc.delayConversation();
            sc.updateNinaNextState();
        }

        _cls3()
        {
            this$0 = GlobalAgent.this;
            sc = speechcontext;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final GlobalAgent this$0;
        final Activity val$currentActivity;
        final SpeechContext val$sc;

        public void run()
        {
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    mSpeechManager.showHints();
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            currentActivity.runOnUiThread(new _cls1());
            sc.pauseConversation();
            sc.updateNinaNextState();
        }

        _cls1()
        {
            this$0 = GlobalAgent.this;
            currentActivity = activity;
            sc = speechcontext;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final GlobalAgent this$0;
        final Activity val$currentActivity;

        public void run()
        {
            currentActivity.onBackPressed();
        }

        _cls2()
        {
            this$0 = GlobalAgent.this;
            currentActivity = activity;
            super();
        }
    }

}
