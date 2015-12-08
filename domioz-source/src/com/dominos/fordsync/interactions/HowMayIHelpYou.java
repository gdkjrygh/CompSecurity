// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.SharedPreferences;
import com.dominos.App;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.utils.AnalyticsUtil;
import java.util.Vector;

// Referenced classes of package com.dominos.fordsync.interactions:
//            SyncInteraction, EasyOrder_, RecentOrder_, TrackOrder_, 
//            CallStore_

public class HowMayIHelpYou extends SyncInteraction
{

    private static final String USERGUIDE_COUNT = "fordsync.UserGuideDisplayCount";
    AnalyticsUtil mAnalyticsUtil;

    public HowMayIHelpYou()
    {
    }

    public Vector getChoiceSets()
    {
        Vector vector = new Vector();
        vector.add(Integer.valueOf(1));
        return vector;
    }

    public PromptModel getInitialPrompt()
    {
        int i = App.settings().getInt("fordsync.UserGuideDisplayCount", 1);
        if (i < 4)
        {
            App.editor().putInt("fordsync.UserGuideDisplayCount", i + 1).commit();
            return prompts.getPrompter("user_guide").getRandomPrompt();
        } else
        {
            return super.getInitialPrompt();
        }
    }

    public void handleChoice(int i)
    {
        if (i == 2)
        {
            mAnalyticsUtil.postFordSyncPlaceEasyOrder();
            EasyOrder_.getInstance_(app).start();
        } else
        {
            if (i == 3)
            {
                mAnalyticsUtil.postFordSyncPlaceRecentOrder();
                RecentOrder_.getInstance_(app).start();
                return;
            }
            if (i == 4)
            {
                mAnalyticsUtil.postFordSyncTrackMyOrder();
                TrackOrder_.getInstance_(app).start();
                return;
            }
            if (i == 5)
            {
                mAnalyticsUtil.postFordSyncHowMayIhelpYouCallStore();
                CallStore_.getInstance_(app).start();
                return;
            }
        }
    }

    public void start()
    {
        mAnalyticsUtil.postFordSyncHowMayIhelpYou();
        super.start();
    }
}
