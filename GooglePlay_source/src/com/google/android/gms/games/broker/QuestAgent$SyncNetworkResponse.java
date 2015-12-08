// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            QuestAgent

private static final class mStatusCode
{

    final ArrayList mData;
    final String mNewSyncToken;
    final int mStatusCode;

    public ()
    {
        mData = new ArrayList();
        mNewSyncToken = null;
        mStatusCode = 500;
    }

    public mStatusCode(ArrayList arraylist, String s, int i)
    {
        mData = (ArrayList)Preconditions.checkNotNull(arraylist);
        mNewSyncToken = s;
        mStatusCode = i;
    }
}
