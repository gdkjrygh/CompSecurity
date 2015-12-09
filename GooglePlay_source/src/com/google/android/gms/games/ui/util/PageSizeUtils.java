// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.Context;
import android.content.res.Resources;

public final class PageSizeUtils
{

    public static int getContinuePlayingTilePageSize(Context context)
    {
        context = context.getResources();
        return (int)((float)(context.getInteger(0x7f0e0052) * context.getInteger(0x7f0e0054)) * 1.2F);
    }

    public static int getGameSearchTilePageSize(Context context)
    {
        context = context.getResources();
        return (int)((float)(context.getInteger(0x7f0e0045) * context.getInteger(0x7f0e0047)) * 1.2F);
    }

    public static int getMixedTilePageSize(Context context)
    {
        context = context.getResources();
        int i = context.getInteger(0x7f0e0013);
        float f = (float)((context.getInteger(0x7f0e0015) + 1) * i) * 1.2F;
        if (i <= 4)
        {
            i = (int)Math.ceil(f / 12F) * 12;
        } else
        {
            i = (int)Math.ceil(f / 30F) * 30;
        }
        return Math.min(i, 25);
    }

    public static int getRecentPlayerTilePageSize(Context context)
    {
        context = context.getResources();
        return (int)((float)(context.getInteger(0x7f0e005a) * context.getInteger(0x7f0e005c)) * 1.2F);
    }

    public static int getSmallCardPageSize(Context context)
    {
        context = context.getResources();
        int i = context.getInteger(0x7f0e0037);
        return (int)((float)context.getInteger(0x7f0e004a) * 1.2F) * i;
    }

    public static int getXpEventTilePageSize(Context context)
    {
        context = context.getResources();
        return (int)((float)(context.getInteger(0x7f0e0060) * context.getInteger(0x7f0e0062)) * 1.2F);
    }
}
