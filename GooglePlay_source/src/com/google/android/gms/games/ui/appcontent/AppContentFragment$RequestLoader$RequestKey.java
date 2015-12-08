// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;


// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class requestId
{

    public final String applicationId;
    public final String playerId;
    public final String requestId;

    public final boolean equals(Object obj)
    {
        if (obj instanceof requestId)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (requestId)obj;
            if (applicationId.equals(((applicationId) (obj)).applicationId) && playerId.equals(((playerId) (obj)).playerId) && requestId.equals(((requestId) (obj)).requestId))
            {
                return true;
            }
        }
        return false;
    }

    public final String toString()
    {
        return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(requestId).toString();
    }

    public (String s, String s1, String s2)
    {
        applicationId = s;
        playerId = s1;
        requestId = s2;
    }
}
