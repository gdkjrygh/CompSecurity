// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            PromptModel, HintModel

public class ProductPrompter
{

    public static final String ADDITIONAL = "additional";
    public static final String AMBIGUOUS = "ambiguous";
    public static final String AMBIGUOUS_ONLY = "ambiguous_only";
    public static final String INVALID = "invalid";
    public static final String MODIFYING = "modifying";
    public static final String PENDING = "pending";
    public static final String RESET = "reset";
    HashMap hints;
    HashMap prompts;

    public ProductPrompter()
    {
    }

    public PromptModel getDefaultForState(String s)
    {
        return (PromptModel)getPromptsForState(s).get(0);
    }

    public HintModel getHints()
    {
        return (HintModel)hints.get("generic");
    }

    public HintModel getHints(String s)
    {
        return (HintModel)hints.get(s);
    }

    public ArrayList getPromptsForState(String s)
    {
        return (ArrayList)prompts.get(s);
    }

    public PromptModel getRandomForState(String s)
    {
        Random random = new Random();
        s = getPromptsForState(s);
        return (PromptModel)s.get(random.nextInt(s.size()));
    }
}
