// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService

public abstract class a extends b
{

    static final String a = "forced";

    public a()
    {
    }

    protected abstract void a(SyncService syncservice, Intent intent)
        throws Exception;

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        a(syncservice, intent);
    }
}
