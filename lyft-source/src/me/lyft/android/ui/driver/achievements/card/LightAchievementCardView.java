// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            AchievementCardView

public class LightAchievementCardView extends AchievementCardView
{

    public LightAchievementCardView(Context context)
    {
        super(context);
    }

    int getBackgroundColor()
    {
        return getResources().getColor(0x7f0c00a4);
    }

    int getBackgroundDialColor()
    {
        return getResources().getColor(0x7f0c0022);
    }

    int getDialColor()
    {
        return getResources().getColor(0x7f0c000b);
    }

    Drawable getGoalMetIcon()
    {
        return getResources().getDrawable(0x7f020019);
    }

    Drawable getInfoIcon()
    {
        return getResources().getDrawable(0x7f020167);
    }

    int getSubtitleColor()
    {
        return getResources().getColor(0x7f0c006f);
    }

    int getTitleColor()
    {
        return getResources().getColor(0x7f0c0021);
    }
}
