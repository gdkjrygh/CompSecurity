// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientImpl

static interface onsumedCallback
{

    public abstract void cancel();

    public abstract void forceFailureUnlessReady(Status status);

    public abstract com.google.android.gms.common.api.l.Runner getClientKey();

    public abstract Integer getResultId();

    public abstract void run(com.google.android.gms.common.api.l.Runner runner)
        throws DeadObjectException;

    public abstract void setFailedResult(Status status);

    public abstract void setResultConsumedCallback(onsumedCallback onsumedcallback);
}
