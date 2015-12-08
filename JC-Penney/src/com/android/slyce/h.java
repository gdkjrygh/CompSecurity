// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.slyce.report.mpmetrics.af;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Scanner;

// Referenced classes of package com.android.slyce:
//            a, b

class h
    implements com.moodstocks.android.Scanner.SyncListener
{

    final a a;

    private h(a a1)
    {
        a = a1;
        super();
    }

    h(a a1, b b)
    {
        this(a1);
    }

    public void onSyncComplete()
    {
        try
        {
            com.android.slyce.k.h.c(com.android.slyce.a.j(), (new StringBuilder()).append("2D Sync succeeded (").append(com.android.slyce.a.e(a).count()).append(" images)").toString());
            com.android.slyce.a.a(a).a("MSCache.Sync.Succeeded", null);
            return;
        }
        catch (MoodstocksError moodstockserror)
        {
            moodstockserror.printStackTrace();
        }
    }

    public void onSyncFailed(MoodstocksError moodstockserror)
    {
        com.android.slyce.k.h.c(com.android.slyce.a.j(), (new StringBuilder()).append("2D Sync error #").append(moodstockserror.getErrorCode()).append(": ").append(moodstockserror.getMessage()).toString());
        com.android.slyce.a.a(a).a("MSCache.Sync.Failed", null);
    }

    public void onSyncProgress(int i, int j)
    {
        i = (int)(((float)j / (float)i) * 100F);
        com.android.slyce.k.h.c(com.android.slyce.a.j(), (new StringBuilder()).append("2D Sync progressing: ").append(i).append("%").toString());
    }

    public void onSyncStart()
    {
        com.android.slyce.k.h.c(com.android.slyce.a.j(), "2D Sync will start.");
        com.android.slyce.a.a(a).a("MSCache.Sync.Started", null);
    }
}
