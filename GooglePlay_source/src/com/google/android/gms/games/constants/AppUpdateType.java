// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.constants;

import com.google.android.gms.common.util.ArrayUtils;

public interface AppUpdateType
{

    public static final String ALL_TYPES[] = (String[])ArrayUtils.concat(new String[][] {
        DEFINITION_TYPES, INSTANCE_TYPES
    });
    public static final String DEFINITION_TYPES[] = {
        "ACHIEVEMENT_DEFINITION", "LEADERBOARD_DEFINITION", "EVENT_DEFINITION"
    };
    public static final String INSTANCE_TYPES[] = {
        "ACHIEVEMENT_INSTANCE", "EVENT_INSTANCE"
    };

}
