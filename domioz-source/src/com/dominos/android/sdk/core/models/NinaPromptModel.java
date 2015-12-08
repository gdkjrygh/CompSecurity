// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.core.prompt.exception.UnknownPromptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            PromptCategoryModel, RootLevelPromptModel, ProductCategoryPromptModel, PrompterModel

public class NinaPromptModel
{

    public final String AGENCIES = "agencies";
    public final String FORD = "ford";
    public final String GENERIC = "generic";
    public final String PROMPTS = "prompts";
    HashMap products;
    ArrayList root;

    public NinaPromptModel()
    {
    }

    private PromptCategoryModel lookupCategory(Map map, String s)
    {
        map = (PromptCategoryModel)map.get(s);
        if (map == null)
        {
            throw new UnknownPromptException((new StringBuilder()).append(s).append(" is not a valid Category.").toString());
        } else
        {
            return map;
        }
    }

    private RootLevelPromptModel lookupRootLevelObject(String s)
    {
        for (Iterator iterator = root.iterator(); iterator.hasNext();)
        {
            RootLevelPromptModel rootlevelpromptmodel = (RootLevelPromptModel)iterator.next();
            if (rootlevelpromptmodel.key.equals(s))
            {
                return rootlevelpromptmodel;
            }
        }

        throw new UnknownPromptException((new StringBuilder()).append(s).append(" is not a valid top level object").toString());
    }

    public PrompterModel findAgent(String s)
    {
        for (Iterator iterator = getRootLevelNode("agencies").categories.entrySet().iterator(); iterator.hasNext();)
        {
            PrompterModel promptermodel = ((PromptCategoryModel)((java.util.Map.Entry)iterator.next()).getValue()).getPrompter(s);
            if (promptermodel != null)
            {
                return promptermodel;
            }
        }

        return null;
    }

    public PrompterModel findQuestions(String s)
    {
        for (Iterator iterator = getRootLevelNode("generic").categories.entrySet().iterator(); iterator.hasNext();)
        {
            PrompterModel promptermodel = ((PromptCategoryModel)((java.util.Map.Entry)iterator.next()).getValue()).getPrompter(s);
            if (promptermodel != null)
            {
                return promptermodel;
            }
        }

        return null;
    }

    public PromptCategoryModel getAgency(String s)
    {
        try
        {
            s = lookupCategory(lookupRootLevelObject("agencies").categories, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public PromptCategoryModel getFordSync(String s)
    {
        try
        {
            s = lookupCategory(lookupRootLevelObject("ford").categories, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public PromptCategoryModel getGeneric(String s)
    {
        try
        {
            s = lookupCategory(lookupRootLevelObject("generic").categories, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public ProductCategoryPromptModel getProductPrompter(String s)
    {
        return (ProductCategoryPromptModel)products.get(s);
    }

    public PromptCategoryModel getPrompts(String s)
    {
        try
        {
            s = lookupCategory(lookupRootLevelObject("prompts").categories, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public RootLevelPromptModel getRootLevelNode(String s)
    {
        try
        {
            s = lookupRootLevelObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
