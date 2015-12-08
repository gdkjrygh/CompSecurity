// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.fordsync.service.AppLinkManager;
import java.util.Vector;

// Referenced classes of package com.dominos.fordsync.interactions:
//            SyncInteraction

public abstract class YesNoInteraction extends SyncInteraction
{

    protected static final String CHOICE_NO = "choice_no";
    protected static final String CHOICE_YES = "choice_yes";

    public YesNoInteraction()
    {
    }

    public Vector getChoiceSets()
    {
        Vector vector = new Vector();
        vector.add(Integer.valueOf(0));
        return vector;
    }

    public void handleChoice(int i)
    {
        if (i == 0)
        {
            LogUtil.v("SyncInteraction", "%s:no", new Object[] {
                getClass().getSimpleName()
            });
            no();
            return;
        }
        if (i == 1)
        {
            LogUtil.v("SyncInteraction", "%s:yes", new Object[] {
                getClass().getSimpleName()
            });
            yes();
            return;
        } else
        {
            throw new UnsupportedOperationException("Programmer error!");
        }
    }

    protected void no()
    {
        mAppLinkManager.prompt(prompts.getPrompter("choice_no"), new Object[0]);
    }

    public void start()
    {
        super.start();
    }

    protected void yes()
    {
        mAppLinkManager.prompt(prompts.getPrompter("choice_yes"), new Object[0]);
    }
}
