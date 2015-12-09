// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.nina.dialog.BaseConcept;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.nina.speech.SpeechManager_;
import com.nuance.b.a.ad;
import com.nuance.b.a.al;
import com.nuance.b.a.i;
import com.nuance.b.a.j;
import com.nuance.b.a.q;
import com.nuance.b.a.r;
import com.nuance.b.a.s;
import com.nuance.b.a.t;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgency

public abstract class BaseAgent extends i
    implements Comparable
{

    private int global_order;
    MenuManager mMenuManager;
    SpeechManager mSpeechManager;
    private BaseAgency parent;

    public BaseAgent(String s, BaseConcept baseconcept)
    {
        this(s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode.Mandatory, baseconcept);
    }

    public BaseAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode, BaseConcept baseconcept)
    {
        super(s, j.a, baseconcept);
        parent = null;
        global_order = 0;
        baseconcept.attachToAgent(this);
        _cls1..SwitchMap.com.dominos.nina.dialog.DialogModelBuilder.SlotMode[slotmode.ordinal()];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 101
    //                   2 118
    //                   3 135
    //                   4 152;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        setPredictionMode(al.a);
        mSpeechManager = SpeechManager_.getInstance_(App.getInstance().getBaseContext());
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
        return;
_L2:
        setCollectionMode(q.a);
        setCorrectionMode(ad.b);
        continue; /* Loop/switch isn't completed */
_L3:
        setCollectionMode(q.a);
        setCorrectionMode(ad.a);
        continue; /* Loop/switch isn't completed */
_L4:
        setCollectionMode(q.b);
        setCorrectionMode(ad.b);
        continue; /* Loop/switch isn't completed */
_L5:
        setCollectionMode(q.b);
        setCorrectionMode(ad.a);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public BaseAgent(String s, String s1)
    {
        this(s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode.Mandatory, new BaseConcept(s1));
    }

    public BaseAgent(String s, String s1, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        this(s, slotmode, new BaseConcept(s1));
    }

    public BaseAgent(String s, String s1, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode, s s2)
    {
        this(s, slotmode, new BaseConcept(s1, s2));
    }

    public abstract void agentFocusIn(SpeechContext speechcontext);

    public boolean belongsToAgency(BaseAgency baseagency)
    {
        for (BaseAgency baseagency1 = parent; baseagency1 != null; baseagency1 = baseagency1.getParent())
        {
            if (baseagency1 == baseagency)
            {
                return true;
            }
        }

        return false;
    }

    public int compareTo(BaseAgent baseagent)
    {
        int l = global_order - baseagent.global_order;
        int k = l;
        if (l == 0)
        {
            k = name.compareTo(baseagent.name);
        }
        return k;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((BaseAgent)obj);
    }

    public void configureAsCorrectable()
    {
        setCorrectionMode(ad.a);
    }

    public void configureAsOptional()
    {
        setCollectionMode(q.b);
        setCorrectionMode(ad.a);
    }

    public boolean expectingShortVoiceResponse()
    {
        return false;
    }

    public BaseConcept getConcept()
    {
        return (BaseConcept)concept;
    }

    public int getGlobalOrder()
    {
        return global_order;
    }

    public BaseAgency getParent()
    {
        return parent;
    }

    public PromptManager getPromptManager()
    {
        return mSpeechManager.getPromptManager();
    }

    protected Session getSession()
    {
        return MobileSession_.getInstance_(App.getInstance().getBaseContext());
    }

    public String getSurfaceValue()
    {
        t t1 = concept.getValue();
        if (t1 != null)
        {
            return t1.a;
        } else
        {
            return null;
        }
    }

    public int getTurn()
    {
        t t1 = concept.getValue();
        if (t1 != null)
        {
            return t1.e;
        } else
        {
            return -1;
        }
    }

    public void onBind(SpeechContext speechcontext)
    {
    }

    public void onFocusIn(SpeechContext speechcontext)
    {
        agentFocusIn(speechcontext);
    }

    public void onFocusOut(SpeechContext speechcontext)
    {
    }

    public void onRefocus(SpeechContext speechcontext)
    {
    }

    public void setGlobalOrder(int k)
    {
        global_order = k;
    }

    public void setParent(BaseAgency baseagency)
    {
        parent = baseagency;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[];

        static 
        {
            $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode = new int[com.dominos.nina.dialog.DialogModelBuilder.SlotMode.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.DialogModelBuilder.SlotMode.Mandatory.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.DialogModelBuilder.SlotMode.MandatoryCorrectable.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.DialogModelBuilder.SlotMode.Optional.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.DialogModelBuilder.SlotMode.OptionalCorrectable.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
