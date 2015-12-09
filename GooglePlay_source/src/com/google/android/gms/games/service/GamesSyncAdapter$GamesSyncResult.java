// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.SyncResult;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSyncAdapter

public static final class mOperations
{

    private final ArrayList mOperations;
    public final SyncResult syncResult;

    public final void addOp(int i)
    {
        mOperations.add(Integer.valueOf(i));
    }

    public final int[] getOps()
    {
        int ai[] = new int[mOperations.size()];
        int i = 0;
        for (int j = mOperations.size(); i < j; i++)
        {
            ai[i] = ((Integer)mOperations.get(i)).intValue();
        }

        return ai;
    }

    public ()
    {
        this(new SyncResult());
    }

    public <init>(SyncResult syncresult)
    {
        syncResult = syncresult;
        mOperations = new ArrayList();
    }
}
