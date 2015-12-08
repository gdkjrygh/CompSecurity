// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UserIntentionAgent, ServiceMethodAgent, CarryoutLoadGuard

public class ProductsGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductsGuard.getSimpleName();

    public ProductsGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
    }

    private void handleRedirection(SpeechContext speechcontext)
    {
        com.dominos.nina.speech.SpeechManager.ProductRedirection productredirection = mSpeechManager.getProductRedirection();
        switch (_cls1..SwitchMap.com.dominos.nina.speech.SpeechManager.ProductRedirection[productredirection.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            speechcontext.resetAgency(new String[] {
                "Application"
            });
            return;

        case 2: // '\002'
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "new");
            return;

        case 3: // '\003'
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "new");
            speechcontext.updateAgentConceptValue(ServiceMethodAgent.CONCEPT, "delivery");
            return;

        case 4: // '\004'
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "new");
            speechcontext.updateAgentConceptValue(ServiceMethodAgent.CONCEPT, "carryout");
            speechcontext.updateAgentConceptValue(CarryoutLoadGuard.CONCEPT, "DONE");
            return;

        case 5: // '\005'
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "easy");
            return;

        case 6: // '\006'
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            break;
        }
        speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "recent");
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (mSpeechManager.getProductRedirection() != null)
        {
            handleRedirection(speechcontext);
        } else
        {
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "cart");
        }
        speechcontext.delayConversation();
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[];

        static 
        {
            $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection = new int[com.dominos.nina.speech.SpeechManager.ProductRedirection.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.LANDING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.NEW.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.DELIVERY.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.CARRYOUT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.EASY.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$nina$speech$SpeechManager$ProductRedirection[com.dominos.nina.speech.SpeechManager.ProductRedirection.RECENT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
