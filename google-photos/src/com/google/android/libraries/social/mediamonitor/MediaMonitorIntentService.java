// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.mediamonitor;

import android.app.IntentService;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import nkq;
import nks;
import olm;

// Referenced classes of package com.google.android.libraries.social.mediamonitor:
//            MediaMonitor

public final class MediaMonitorIntentService extends IntentService
{

    public MediaMonitorIntentService()
    {
        super("MediaMonitorIntentService");
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        for (Iterator iterator = olm.c(getApplicationContext(), nkq).iterator(); iterator.hasNext(); ((nkq)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        MediaMonitor.a(intent);
        ((nks)olm.a(getApplicationContext(), nks)).a = false;
        throw exception;
        MediaMonitor.a(intent);
        ((nks)olm.a(getApplicationContext(), nks)).a = false;
        return;
    }
}
