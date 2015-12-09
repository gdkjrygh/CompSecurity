// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import com.google.android.gms.droidguard.DroidGuardResultsCallback;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            DroidGuardClientImpl

final class val.resultQueue
    implements DroidGuardResultsCallback
{

    final DroidGuardClientImpl this$0;
    final LinkedBlockingQueue val$resultQueue;

    public final void onDroidGuardResults(String s)
    {
        try
        {
            val$resultQueue.put(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_droidguardclientimpl;
        val$resultQueue = LinkedBlockingQueue.this;
        super();
    }
}
