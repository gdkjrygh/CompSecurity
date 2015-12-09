// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.util.Log;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.HintModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.nina.dialog.BaseConcept;
import com.dominos.nina.dialog.DialogModelBuilder;
import com.dominos.nina.dialog.agent.BaseAgent;
import com.dominos.nina.dialog.agent.GlobalAgent;
import com.google.b.k;
import com.google.b.r;
import com.nuance.b.a.ab;
import com.nuance.b.a.ae;
import com.nuance.b.a.l;
import com.nuance.b.a.t;
import com.nuance.b.a.z;
import com.nuance.b.b.aq;
import com.nuance.b.b.ar;
import com.nuance.b.d.a;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager_, SpeechManager

public class SpeechContext
{

    public static final String COMMAND_DONE = "DONE";
    public static final String COMMAND_RESET = "RESET";
    public static final String TAG = "NinaX";
    public static final String TTS_PREFERRED_VOICE = "Evan";
    private static String agentInFocus;
    private static CountDownLatch ninaBusyWaitLatch = new CountDownLatch(1);
    private boolean avoidFocusIn;
    private String bestLiteral;
    private z cm;
    private List collectedAgents;
    private List collectedAgentsThisTurn;
    private boolean flavorSizeUpdated;
    private aq interp;
    private SpeechManager mSpeechManager;
    private ab nextState;
    private long requestId;

    public SpeechContext(z z1)
    {
        cm = z1;
        mSpeechManager = SpeechManager_.getInstance_(App.getInstance().getBaseContext());
        z1 = z1.a();
        if (z1 != null && z1.a() != null)
        {
            interp = z1.a();
            collectedAgents = obtainAgentsFromCollectedValues(z1.e());
            collectedAgentsThisTurn = obtainAgentsFromCollectedValues(z1.f());
            bestLiteral = interp.g;
            requestId = interp.b;
            agentInFocus = z1.c();
        }
    }

    private void addVoicePrompt(String s)
    {
        s = DialogModelBuilder.globalTextFilter(s);
        Object obj = a.a("en-us", false);
        ((a) (obj)).a(s);
        obj = ((a) (obj)).a();
        log((new StringBuilder("Nina said: ")).append(s).toString());
        log((new StringBuilder("Ssml: ")).append(((String) (obj))).toString());
        cm.b(((String) (obj)));
        continueConversation();
    }

    private static BaseAgent extGetAgent(String s)
    {
        s = SpeechManager_.getInstance_(App.getInstance().getBaseContext()).getDialogModel().b(s);
        if (s != null && (s instanceof BaseAgent))
        {
            return (BaseAgent)s;
        } else
        {
            return null;
        }
    }

    public static String getAgentNameInFocus()
    {
        return agentInFocus;
    }

    public static CountDownLatch getNinaBusyWaitLatch()
    {
        return ninaBusyWaitLatch;
    }

    private String hintSerializer(HintModel hintmodel)
    {
        if (hintmodel != null)
        {
            return (new r()).f().a(hintmodel);
        } else
        {
            return "";
        }
    }

    private boolean isInputFail(l l1)
    {
        l1 = l1.d();
        if (l1 == null || l1.size() == 0)
        {
            return false;
        }
        l1 = (String)l1.get(0);
        if (l1 == null)
        {
            return false;
        } else
        {
            return l1.matches("^\\[DM\\.INPUTFAILURE.*\\]");
        }
    }

    private List obtainAgentsFromCollectedValues(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); Collections.sort(arraylist))
        {
            com.nuance.b.a.r r1 = (com.nuance.b.a.r)list.next();
            if (!(r1 instanceof BaseConcept))
            {
                continue;
            }
            BaseConcept baseconcept = (BaseConcept)r1;
            if (r1.getValue() != null)
            {
                arraylist.add(baseconcept.agent());
            }
        }

        return arraylist;
    }

    public static void resetNinaBusyWaitLatch()
    {
        ninaBusyWaitLatch = new CountDownLatch(1);
    }

    private void setHint(String s)
    {
        if (c.i())
        {
            mSpeechManager.setHint(s);
        }
    }

    public static transient boolean updateAgents(String as[])
    {
        org.androidannotations.api.a.a(new _cls1(0, "", as));
        return true;
    }

    public static transient void updateGlobalAgentAsAlert(boolean flag, String as[])
    {
        if (!c.i())
        {
            return;
        }
        if (flag)
        {
            updateAgents(new String[] {
                GlobalAgent.NAME, "alert"
            });
            return;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(GlobalAgent.NAME);
        arraylist.add("repeat");
        arraylist.addAll(Arrays.asList(as));
        as = new String[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++)
        {
            as[i] = (String)arraylist.get(i);
        }

        updateAgents(as);
    }

    public void addHints(HintModel hintmodel)
    {
        setHint(hintSerializer(hintmodel));
    }

    public void addPrompter(PrompterModel promptermodel)
    {
        addHints(promptermodel.getHints());
        promptermodel = promptermodel.getRandomPrompt();
        addTextPrompt(promptermodel.getText(new Object[0]));
        addVoicePrompt(promptermodel.getSpeech(new Object[0]));
        continueConversation();
    }

    public void addTextPrompt(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            cm.c(s);
        }
    }

    public void addTextVoicePrompt(String s, String s1)
    {
        addTextPrompt(s);
        addVoicePrompt(s1);
        continueConversation();
    }

    public void clearTextVoicePrompts()
    {
        cm.f().clear();
        cm.e().clear();
    }

    public void continueConversation()
    {
        nextState = ab.e;
    }

    public void delayConversation()
    {
        nextState = ab.d;
    }

    public BaseAgent getAgent(String s)
    {
        if (s != null && cm.a != null)
        {
            s = cm.a.b(s);
        } else
        {
            s = null;
        }
        if (s != null && (s instanceof BaseAgent))
        {
            return (BaseAgent)s;
        } else
        {
            return null;
        }
    }

    public BaseAgent getAgentInFocus()
    {
        return getAgent(agentInFocus);
    }

    public String getBestLiteral()
    {
        return bestLiteral;
    }

    public List getCollectedAgentsThisTurn()
    {
        return collectedAgentsThisTurn;
    }

    public BaseConcept getConceptForAgent(String s)
    {
        s = getAgent(s);
        if (s != null)
        {
            s = s.getConcept();
            if (s != null)
            {
                if (s.isGroundable())
                {
                    s.getGroundedMeaning(cm);
                }
                if (s.getValue() != null)
                {
                    return s;
                }
            }
        }
        return null;
    }

    public long getCurrentTurn()
    {
        return requestId;
    }

    public boolean getFlavorSizeUpdated()
    {
        return flavorSizeUpdated;
    }

    public boolean getGroundedBooleanMeaning(String s)
    {
        return Boolean.valueOf(getGroundedMeaning(s)).booleanValue();
    }

    public String getGroundedMeaning(String s)
    {
        String s1 = "";
        BaseConcept baseconcept = getConceptForAgent(s);
        if (baseconcept != null)
        {
            s1 = baseconcept.getValue().b;
        }
        log((new StringBuilder("grounded meaning of ")).append(s).append(" is ").append(s1).toString());
        return s1;
    }

    public ab getNextState()
    {
        return nextState;
    }

    public String getSurfaceMeaning(String s)
    {
        Object obj = null;
        BaseConcept baseconcept = getConceptForAgent(s);
        s = obj;
        if (baseconcept != null)
        {
            s = baseconcept.getValue().a;
        }
        return s;
    }

    public boolean hasActiveInterpretation()
    {
        return interp != null;
    }

    public boolean isAvoidFocusIn()
    {
        return avoidFocusIn;
    }

    public boolean isNoMatch()
    {
        l l1 = cm.a();
        double d = l1.a().f;
        if (App.isDebugMode())
        {
            Log.d("NinaX", (new StringBuilder("NO_MATCH: Confidence Level is: ")).append(Double.valueOf(d)).toString());
            Log.d("NinaX", (new StringBuilder("Interpretation.resultType : ")).append(l1.g()).toString());
            Log.d("NinaX", (new StringBuilder("dm.InputFailure : ")).append(isInputFail(l1)).toString());
        }
        boolean flag;
        if (ar.c == l1.g() || isInputFail(l1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag).booleanValue();
    }

    public void log(String s)
    {
        LogUtil.d("NinaX", (new StringBuilder()).append(s).append(" Current Turn: ").append(getCurrentTurn()).toString(), new Object[0]);
    }

    public void pauseConversation()
    {
        nextState = ab.f;
    }

    public transient void resetAgency(String as[])
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < as.length; i++)
        {
            stringbuilder.append((new StringBuilder()).append(as[i]).append(", ").toString());
        }

        log((new StringBuilder("reset agents/agencies: ")).append(stringbuilder.toString()).toString());
        int i1 = as.length;
        for (int j = ((flag) ? 1 : 0); j < i1; j++)
        {
            String s = as[j];
            cm.a(s);
        }

    }

    public void sendRunnableState(Runnable runnable)
    {
        nextState = ab.a(runnable);
    }

    public void setAvoidFocusIn(boolean flag)
    {
        avoidFocusIn = flag;
    }

    public boolean setErrorState(boolean flag)
    {
        c.l().p();
        if (flag)
        {
            return mSpeechManager.addErrorCount();
        } else
        {
            return false;
        }
    }

    public void setFlavorSizeUpdated()
    {
        flavorSizeUpdated = true;
    }

    public void stopConversation()
    {
        nextState = ab.c;
    }

    public void updateAgentConceptValue(String s, String s1)
    {
        log((new StringBuilder("set agent concept ")).append(s).append("=").append(s1).toString());
        cm.a(s, s1);
        delayConversation();
    }

    public boolean updateNinaNextState()
    {
        if (nextState != null)
        {
            cm.a(nextState);
        }
        return nextState == ab.e;
    }




    private class _cls1 extends org.androidannotations.api.c
    {

        final String val$agentsAndMeanings[];

        public final void execute()
        {
            SpeechManager_ speechmanager_ = SpeechManager_.getInstance_(App.getInstance().getBaseContext());
            if (!speechmanager_.isNinaConnected() || agentsAndMeanings == null || agentsAndMeanings.length % 2 != 0)
            {
                LogUtil.d("NinaX", "Unable to externally update agents", new Object[0]);
            } else
            {
                ArrayList arraylist = new ArrayList();
                ae ae1 = speechmanager_.getDialogModel();
                LogUtil.d("NinaX", "----------------", new Object[0]);
                int i1 = 0;
                int j1 = 0;
                while (i1 < agentsAndMeanings.length) 
                {
                    String s = agentsAndMeanings[i1];
                    String s1 = agentsAndMeanings[i1 + 1];
                    int j;
                    if (StringHelper.equals(s1, "RESET"))
                    {
                        LogUtil.d("NinaX", (new StringBuilder("Agent/Agency: ")).append(s).append("  Value: RESET").toString(), new Object[0]);
                        arraylist.add(new dw(s, ae1));
                        j = j1 + 1;
                    } else
                    {
                        BaseAgent baseagent = SpeechContext.extGetAgent(s);
                        j = j1;
                        if (baseagent != null)
                        {
                            LogUtil.d("NinaX", (new StringBuilder("Agent/Agency: ")).append(s).append("  Value: ").append(s1).toString(), new Object[0]);
                            arraylist.add(new dx(((i) (baseagent)).concept.name, s1));
                            j = j1 + 1;
                        }
                    }
                    i1 += 2;
                    j1 = j;
                }
                LogUtil.d("NinaX", "----------------", new Object[0]);
                if (j1 > 0)
                {
                    if (((SpeechManager) (speechmanager_)).isNinaBusy)
                    {
                        LogUtil.d("NinaX", "Unable to externally update agents, nina is busy", new Object[0]);
                        com.nuance.b.b.a aa[];
                        try
                        {
                            LogUtil.d("NinaX", "Waiting nina to get ready", new Object[0]);
                            if (SpeechContext.ninaBusyWaitLatch != null)
                            {
                                SpeechContext.ninaBusyWaitLatch.await();
                            }
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            LogUtil.d("NinaX", "Waiting interrupted.", new Object[0]);
                        }
                        LogUtil.d("NinaX", "Nina is ready, continuing.", new Object[0]);
                    }
                    c.l().n();
                    aa = (com.nuance.b.b.a[])arraylist.toArray(new com.nuance.b.b.a[0]);
                    v.r().a(aa);
                    speechmanager_.setShouldRepeat(false);
                    LogUtil.d("NinaX", (new StringBuilder("Sent ")).append(aa.length).append(" commands").toString(), new Object[0]);
                    return;
                }
            }
        }

        _cls1(int j, String s1, String as[])
        {
            agentsAndMeanings = as;
            super(final_s, j, s1);
        }
    }

}
