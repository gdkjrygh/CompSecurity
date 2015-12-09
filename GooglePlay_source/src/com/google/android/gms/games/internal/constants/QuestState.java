// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.games.quest.Quests;

public final class QuestState
{

    public static boolean areValidSelectors(int ai[])
    {
        int i = 0;
        for (int j = ai.length; i < j; i++)
        {
            int k = ai[i];
            if (!ArrayUtils.contains(Quests.SELECT_ALL_QUESTS, k))
            {
                return false;
            }
        }

        return true;
    }
}
