// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.constants.AchievementState;

public class AchievementStateConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public AchievementStateConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        return Integer.valueOf(AchievementState.fromString((String)obj));
    }

    public final volatile Object convertBack(Object obj)
    {
        return AchievementState.fromInt(((Integer)obj).intValue());
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
