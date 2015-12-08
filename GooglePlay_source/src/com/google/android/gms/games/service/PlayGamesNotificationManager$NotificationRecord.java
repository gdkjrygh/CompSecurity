// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesNotificationManager

private static final class isSilent
{

    public final String externalGameId;
    public final long internalId;
    public final boolean isSilent;
    public final String notificationId;
    public final String text;
    public final int type;

    public final boolean equals(Object obj)
    {
        if (obj instanceof isSilent)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (isSilent)obj;
            if (Objects.equal(Long.valueOf(internalId), Long.valueOf(((internalId) (obj)).internalId)) && Objects.equal(notificationId, ((notificationId) (obj)).notificationId) && Objects.equal(externalGameId, ((externalGameId) (obj)).externalGameId) && Objects.equal(text, ((text) (obj)).text) && Objects.equal(Integer.valueOf(type), Integer.valueOf(((type) (obj)).type)) && Objects.equal(Boolean.valueOf(isSilent), Boolean.valueOf(((isSilent) (obj)).isSilent)))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(internalId), notificationId, externalGameId, text, Integer.valueOf(type), Boolean.valueOf(isSilent)
        });
    }

    public (long l, String s, String s1, String s2, int i, boolean flag)
    {
        internalId = l;
        notificationId = s;
        externalGameId = s1;
        text = s2;
        type = i;
        isSilent = flag;
    }
}
