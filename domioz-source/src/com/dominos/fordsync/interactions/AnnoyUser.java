// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.utils.AnalyticsUtil;
import java.util.Vector;

// Referenced classes of package com.dominos.fordsync.interactions:
//            SyncInteraction, CallStore_, HowMayIHelpYou_

public class AnnoyUser extends SyncInteraction
{

    AnalyticsUtil mAnalyticsUtil;

    public AnnoyUser()
    {
    }

    public Vector getChoiceSets()
    {
        Vector vector = new Vector();
        vector.add(Integer.valueOf(2));
        return vector;
    }

    public void handleChoice(int i)
    {
        switch (i)
        {
        default:
            throw new UnsupportedOperationException("Programmer error!");

        case 6: // '\006'
            mAnalyticsUtil.postFordSyncCallStoreClick();
            CallStore_.getInstance_(app).start();
            return;

        case 7: // '\007'
            mAnalyticsUtil.postFordSyncStartOverClick();
            HowMayIHelpYou_.getInstance_(app).start();
            return;

        case 8: // '\b'
            mAnalyticsUtil.postFordSyncNeitherClick();
            break;
        }
        mAppLinkManager.prompt(prompts.getPrompter("handle_choice").getPrompt("neither"), new Object[0]);
    }

    public void start()
    {
        mAnalyticsUtil.postFordSyncAnnoyUserPrompt();
        super.start();
        mAppLinkManager.updateLayout("TEXTBUTTONS_WITH_GRAPHIC");
    }
}
