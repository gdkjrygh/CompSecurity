// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.prompt;

import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.models.RootLevelPromptModel;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.prompt:
//            PromptAPI

public class PromptManager extends Manager
{

    public static final String FILENAME_FORDSYNC = "fordsync.json";
    public static final String FILENAME_NUANCE = "nuance.json";
    public static final String FILE_COMPOSE_DIVISOR = "-";
    public static final String TAG = com/dominos/android/sdk/core/prompt/PromptManager.getSimpleName();
    PromptAPI mPromptAPI;
    private NinaPromptModel mPromptModel;

    public PromptManager()
    {
    }

    public String createVersionedFileName(String s, String s1)
    {
        return (new StringBuilder()).append(s).append("-").append(s1).toString();
    }

    public PrompterModel findAgent(String s)
    {
        return mPromptModel.findAgent(s);
    }

    public PrompterModel findQuestions(String s)
    {
        return mPromptModel.findQuestions(s);
    }

    public PromptCategoryModel getAgency(String s)
    {
        return mPromptModel.getAgency(s);
    }

    public PromptCategoryModel getAlertCategory(String s)
    {
        return (PromptCategoryModel)mPromptModel.getRootLevelNode("alerts").categories.get(s);
    }

    public PromptCategoryModel getChapters(String s)
    {
        return mPromptModel.getPrompts(s);
    }

    public PromptCategoryModel getGeneric(String s)
    {
        return mPromptModel.getGeneric(s);
    }

    public String getName()
    {
        return "prompt_manager";
    }

    public NinaPromptModel getPromptModel()
    {
        return mPromptModel;
    }

    public RootLevelPromptModel getRootNode(String s)
    {
        return mPromptModel.getRootLevelNode(s);
    }

    public void loadPromptModel(String s, String s1)
    {
        mPromptModel = mPromptAPI.loadPrompts(s, s1);
    }

    protected void onSessionSet()
    {
    }

}
