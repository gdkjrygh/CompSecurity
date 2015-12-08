// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.content.Context;
import android.util.Log;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.nina.dialog.BaseConcept;
import com.dominos.nina.dialog.agent.BaseAgent;
import com.nuance.b.a.ab;
import com.nuance.b.a.ak;
import com.nuance.b.a.z;
import com.nuance.b.e.aa;
import com.nuance.b.e.c;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager_, SpeechContext, SpeechManager

public class GeneralInterpretationHandler
    implements ak
{

    private final String TAG = "NinaX";
    private SpeechManager mSpeechManager;

    public GeneralInterpretationHandler(Context context)
    {
        mSpeechManager = SpeechManager_.getInstance_(context);
    }

    private void bindCollectedAgents(SpeechContext speechcontext)
    {
        Object obj = speechcontext.getCollectedAgentsThisTurn();
        if (obj != null)
        {
            BaseAgent baseagent;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); baseagent.onBind(speechcontext))
            {
                baseagent = (BaseAgent)((Iterator) (obj)).next();
                LogUtil.i("NinaX", (new StringBuilder("On bind: ")).append(baseagent.name).append(" concept=").append(baseagent.getConcept().name).append(" value=").append(baseagent.getSurfaceValue()).append(" turn=").append(baseagent.getTurn()).toString(), new Object[0]);
            }

        }
    }

    private boolean isNoMatchInterpretation(SpeechContext speechcontext, SpeechManager speechmanager)
    {
        return speechcontext.isNoMatch() || speechmanager.isNoiseHeard();
    }

    private boolean isValidTurn(SpeechContext speechcontext, SpeechManager speechmanager)
    {
        long l = speechmanager.getCurrentConversationTurn();
        long l1 = speechcontext.getCurrentTurn();
        if (l == -1L && l1 == -1L)
        {
            return true;
        }
        if (l1 > l)
        {
            speechmanager.setCurrentConversationTurn(l1);
            return true;
        } else
        {
            return false;
        }
    }

    private void promptLimitReached(SpeechContext speechcontext, SpeechManager speechmanager)
    {
        if (App.isDebugMode())
        {
            Log.d("NinaX", "isErrorCountLimitReached()");
        }
        c.m().w();
        PromptModel promptmodel = mSpeechManager.getPromptManager().getChapters("no_match").getPrompter("out").getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        speechcontext.pauseConversation();
        speechmanager.resetErrorCount();
    }

    private void promptNoMatch(SpeechContext speechcontext, int i)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 68
    //                   2 74;
           goto _L1 _L2 _L3
_L1:
        Object obj = "first_time";
_L5:
        obj = mSpeechManager.getPromptManager().getChapters("no_match").getPrompter(((String) (obj))).getRandomPrompt();
        speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
        return;
_L2:
        obj = "first_time";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "second_time";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean shouldFocusIn(SpeechContext speechcontext, SpeechManager speechmanager)
    {
        return !speechcontext.isAvoidFocusIn() && !speechmanager.isErrorCountLimitReached();
    }

    public void handleInterpretation(String s, z z)
    {
        BaseAgent baseagent;
        s = new SpeechContext(z);
        z = SpeechManager_.getInstance_(App.getInstance().getBaseContext());
        baseagent = s.getAgentInFocus();
        if (baseagent == null || !isValidTurn(s, z))
        {
            return;
        }
        LogUtil.v("NinaX", (new StringBuilder("INTERPRETATION BEGINS, TURN: ")).append(s.getCurrentTurn()).toString(), new Object[0]);
        if (StringHelper.isNotEmpty(s.getBestLiteral()))
        {
            LogUtil.d("NinaX", (new StringBuilder("User literal: ")).append(s.getBestLiteral()).toString(), new Object[0]);
        }
        if (!isNoMatchInterpretation(s, z)) goto _L2; else goto _L1
_L1:
        LogUtil.w("NinaX", "No_match interpretation", new Object[0]);
        z.setNoiseHeard(false);
        if (z.addErrorCount())
        {
            promptLimitReached(s, z);
        } else
        {
            promptNoMatch(s, z.getErrorCount());
        }
_L4:
        s.updateNinaNextState();
        LogUtil.v("NinaX", "INTERPRETATION ENDS", new Object[0]);
        return;
_L2:
        int i = z.getErrorCount();
        bindCollectedAgents(s);
        if (shouldFocusIn(s, z))
        {
            LogUtil.i("NinaX", (new StringBuilder("On focus: ")).append(baseagent.name).toString(), new Object[0]);
            baseagent.onFocusIn(s);
        }
        if (i == z.getErrorCount() && s.getNextState() == ab.e)
        {
            z.resetErrorCount();
        }
        if (z.isErrorCountLimitReached())
        {
            promptLimitReached(s, z);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
