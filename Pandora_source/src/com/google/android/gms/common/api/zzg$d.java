// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, Status

static interface c
{

    public abstract void cancel();

    public abstract void forceFailureUnlessReady(Status status);

    public abstract void zza( );

    public abstract void zzb(a a)
        throws DeadObjectException;

    public abstract void zzk(Status status);

    public abstract c zzkF();

    public abstract int zzkI();
}
