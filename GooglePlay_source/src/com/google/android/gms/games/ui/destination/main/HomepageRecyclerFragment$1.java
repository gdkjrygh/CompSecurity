// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.support.v4.view.ViewPager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.ui.destination.quests.QuestCarouselAdapter;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment

final class this._cls0
    implements ResultCallback
{

    final HomepageRecyclerFragment this$0;

    public final volatile void onResult(Result result)
    {
        QuestBuffer questbuffer;
        Object obj;
        boolean flag;
        flag = true;
        obj = (com.google.android.gms.games.quest.elAdapter)result;
        result = HomepageRecyclerFragment.this;
        int i = ((com.google.android.gms.games.quest.lerFragment) (obj)).Status().mStatusCode;
        questbuffer = ((com.google.android.gms.games.quest.Status) (obj)).Quests();
        GamesLog.d(HomepageRecyclerFragment.TAG, (new StringBuilder("onQuestsLoaded... statusCode = ")).append(i).append(", data = ").append(questbuffer).toString());
        if (result.canUseResult(((Result) (obj))))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        ((HomepageRecyclerFragment) (result)).mLatencyLogger.logEvents(new int[] {
            7
        });
        questbuffer.release();
        return;
        obj = ((HomepageRecyclerFragment) (result)).mQuestCarouselAdapter;
        String s = ((HomepageRecyclerFragment) (result)).mCarouselCurrentQuestId;
        String s1 = ((HomepageRecyclerFragment) (result)).mCarouselPreviousQuestId;
        ((QuestCarouselAdapter) (obj)).mPagerAdapter.setDataBuffer(questbuffer);
        if (((QuestCarouselAdapter) (obj)).mViewPager != null)
        {
            ((QuestCarouselAdapter) (obj)).mViewPager.setAdapter(((QuestCarouselAdapter) (obj)).mPagerAdapter);
        }
        ((QuestCarouselAdapter) (obj)).scrollToQuestById(s, s1);
        obj = ((HomepageRecyclerFragment) (result)).mQuestCarouselAdapter;
        boolean flag1;
        if (questbuffer.getCount() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((QuestCarouselAdapter) (obj)).setVisible(flag1);
        result.onSectionLoaded();
        return;
        result;
        flag = false;
_L2:
        if (flag)
        {
            questbuffer.release();
        }
        throw result;
        result;
        if (true) goto _L2; else goto _L1
_L1:
    }

    tCarouselPagerAdapter()
    {
        this$0 = HomepageRecyclerFragment.this;
        super();
    }
}
