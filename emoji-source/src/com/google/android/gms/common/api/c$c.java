// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;

// Referenced classes of package com.google.android.gms.common.api:
//            c, Status

static interface us
{

    public abstract void a(us us);

    public abstract void b(a a1)
        throws DeadObjectException;

    public abstract void cancel();

    public abstract c eB();

    public abstract int eG();

    public abstract void m(Status status);
}
