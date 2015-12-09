// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentValues;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            RequestAgent

private static final class externalPlayerIds
    implements Comparable
{

    final ContentValues contentValues;
    final Set externalPlayerIds = new HashSet();
    final String requestingPlayerId;

    private String getGameId()
    {
        return contentValues.getAsString("external_game_id");
    }

    public final volatile int compareTo(Object obj)
    {
        obj = (contentValues)obj;
        int i = (int)(getExpirationTimestamp() - ((getExpirationTimestamp) (obj)).getExpirationTimestamp());
        if (i != 0)
        {
            return i;
        } else
        {
            return getGameId().compareTo(((getGameId) (obj)).getGameId());
        }
    }

    public final long getExpirationTimestamp()
    {
        return contentValues.getAsLong("expiration_timestamp").longValue();
    }

    public (ContentValues contentvalues, String s)
    {
        requestingPlayerId = s;
        contentValues = contentvalues;
        externalPlayerIds.add(s);
    }
}
