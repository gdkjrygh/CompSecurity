// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.QuestContribution;
import com.google.android.gms.games.server.api.QuestCriterion;
import com.google.android.gms.games.server.api.QuestMilestone;
import java.util.ArrayList;

public final class QuestMilestonePostProcessor
    implements PostProcessor
{

    public QuestMilestonePostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        long l1 = 0L;
        fastjsonresponse = (QuestMilestone)fastjsonresponse;
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        if (fastjsonresponse.getCriteria() == null || fastjsonresponse.getCriteria().isEmpty())
        {
            GamesLog.e("MilestoneProcessor", (new StringBuilder("Criteria not present for milestoneId: ")).append(fastjsonresponse.getId()).toString());
            return fastjsonresponse;
        }
        QuestCriterion questcriterion = (QuestCriterion)fastjsonresponse.getCriteria().get(0);
        long l;
        if (questcriterion.getCurrentContribution() == null)
        {
            l = 0L;
        } else
        {
            l = questcriterion.getCurrentContribution().getValue().longValue();
        }
        if (questcriterion.getInitialPlayerProgress() != null)
        {
            l1 = questcriterion.getInitialPlayerProgress().getValue().longValue();
        }
        contentvalues.put("current_value", Long.valueOf(l));
        contentvalues.put("initial_value", Long.valueOf(l1));
        contentvalues.put("target_value", questcriterion.getCompletionContribution().getValue());
        return fastjsonresponse;
    }
}
