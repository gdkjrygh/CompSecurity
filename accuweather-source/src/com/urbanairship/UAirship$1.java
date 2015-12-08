// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.os.Looper;

// Referenced classes of package com.urbanairship:
//            CancelableOperation, UAirship

static final class peration extends CancelableOperation
{

    final ReadyCallback val$callback;

    public void onRun()
    {
        UAirship uairship = UAirship.shared();
        if (val$callback != null && uairship != null)
        {
            val$callback.onAirshipReady(uairship);
        }
    }

    ReadyCallback(Looper looper, ReadyCallback readycallback)
    {
        val$callback = readycallback;
        super(looper);
    }
}
