// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;

// Referenced classes of package com.google.android.gms.common.api:
//            b, Status

static interface us
{

    public abstract void a(us us);

    public abstract void b(a a1)
        throws DeadObjectException;

    public abstract void cancel();

    public abstract c ea();

    public abstract int ef();

    public abstract void k(Status status);
}
