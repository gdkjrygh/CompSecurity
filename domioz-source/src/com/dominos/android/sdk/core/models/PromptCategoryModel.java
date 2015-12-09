// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            PrompterModel

public class PromptCategoryModel
{

    public Map prompters;

    public PromptCategoryModel()
    {
    }

    public PrompterModel getPrompter(String s)
    {
        return (PrompterModel)prompters.get(s);
    }
}
