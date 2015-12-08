// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;


// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class snapshotId
{

    public final String applicationId;
    public final String playerId;
    public final String snapshotId;

    public final boolean equals(Object obj)
    {
        if (obj instanceof snapshotId)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (snapshotId)obj;
            if (applicationId.equals(((applicationId) (obj)).applicationId) && playerId.equals(((playerId) (obj)).playerId) && snapshotId.equals(((snapshotId) (obj)).snapshotId))
            {
                return true;
            }
        }
        return false;
    }

    public final String toString()
    {
        return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(snapshotId).toString();
    }

    public (String s, String s1, String s2)
    {
        applicationId = s;
        playerId = s1;
        snapshotId = s2;
    }
}
