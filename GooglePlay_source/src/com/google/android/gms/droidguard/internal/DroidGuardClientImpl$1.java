// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import com.google.android.gms.droidguard.DroidGuardResultsCallback;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            DroidGuardClientImpl

final class mDelivered
    implements DroidGuardResultsCallback
{

    boolean mDelivered;
    final DroidGuardClientImpl this$0;
    final DroidGuardResultsCallback val$callback;

    public final void onDroidGuardResults(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mDelivered)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        mDelivered = true;
        this;
        JVM INSTR monitorexit ;
        val$callback.onDroidGuardResults(s);
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    ()
    {
        this$0 = final_droidguardclientimpl;
        val$callback = DroidGuardResultsCallback.this;
        super();
        mDelivered = false;
    }
}
