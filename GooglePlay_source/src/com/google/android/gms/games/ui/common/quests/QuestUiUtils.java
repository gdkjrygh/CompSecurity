// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.content.Context;
import android.text.format.DateUtils;

public final class QuestUiUtils
{

    public static String getTimeLeftString(Context context, long l, long l1, boolean flag)
    {
        if (l - l1 > 0L)
        {
            CharSequence charsequence = DateUtils.getRelativeTimeSpanString(l, l1, 1000L);
            int i;
            if (flag)
            {
                i = 0x7f1002ba;
            } else
            {
                i = 0x7f1002b6;
            }
            return context.getString(i, new Object[] {
                charsequence
            });
        }
        int j;
        if (flag)
        {
            j = 0x7f1002bb;
        } else
        {
            j = 0x7f1002b7;
        }
        return context.getString(j);
    }
}
