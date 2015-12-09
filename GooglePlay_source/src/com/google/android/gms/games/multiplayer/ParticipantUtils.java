// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.internal.Preconditions;

public final class ParticipantUtils
{

    public static boolean isValidParticipantId(String s)
    {
        Preconditions.checkNotNull(s, "Participant ID must not be null");
        return s.startsWith("p_");
    }
}
