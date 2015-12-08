// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.core.prompt.exception.UnknownPromptException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            PromptModel, HintModel

public class PrompterModel
{

    public Map hints;
    private ArrayList keys;
    public Map prompts;

    public PrompterModel()
    {
    }

    private PromptModel lookupPrompt(String s)
    {
        PromptModel promptmodel = (PromptModel)prompts.get(s);
        if (promptmodel == null)
        {
            throw new UnknownPromptException((new StringBuilder()).append(s).append(" is not a known prompt.").toString());
        } else
        {
            return promptmodel;
        }
    }

    public PromptModel getDefaultPrompt()
    {
        for (Iterator iterator = prompts.entrySet().iterator(); iterator.hasNext();)
        {
            PromptModel promptmodel = (PromptModel)((java.util.Map.Entry)iterator.next()).getValue();
            if (promptmodel.is_default.booleanValue())
            {
                return promptmodel;
            }
        }

        return null;
    }

    public HintModel getHints()
    {
        return (HintModel)hints.get("generic");
    }

    public HintModel getHints(String s)
    {
        return (HintModel)hints.get(s);
    }

    public Vector getHintsVector()
    {
        Vector vector = new Vector();
        if (!hints.isEmpty())
        {
            vector.addAll(getHints().getTaskContent());
        }
        return vector;
    }

    public PromptModel getPrompt(String s)
    {
        try
        {
            s = lookupPrompt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public PromptModel getRandomPrompt()
    {
        if (keys == null)
        {
            keys = new ArrayList(prompts.keySet());
        }
        if (keys.size() == 0)
        {
            return null;
        } else
        {
            Object obj = new Random();
            obj = (String)keys.get(((Random) (obj)).nextInt(keys.size()));
            return (PromptModel)prompts.get(obj);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PrompterModel is:\n");
        java.util.Map.Entry entry;
        for (Iterator iterator = prompts.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("  PROMPT KEY: ")).append(entry.getKey()).append(" ---> VALUE: ").append(entry.getValue()).append("\n").toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = hints.entrySet().iterator(); iterator1.hasNext(); stringbuilder.append((new StringBuilder("  HINT KEY: ")).append(entry1.getKey()).append(" ---> VALUE: ").append(entry1.getValue()).append("\n").toString()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        return stringbuilder.toString();
    }
}
