// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameAgent

static final class mAppUpdates
{

    final HashSet mAppUpdates;
    final String mExternalGameId;
    final String mNewSyncToken;
    final long mNewVersion;

    public (String s, Long long1, String s1, ArrayList arraylist)
    {
        mExternalGameId = s;
        long l;
        if (long1 == null)
        {
            l = -1L;
        } else
        {
            l = long1.longValue();
        }
        mNewVersion = l;
        mNewSyncToken = s1;
        mAppUpdates = new HashSet(arraylist);
    }
}
