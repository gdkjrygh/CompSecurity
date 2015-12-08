// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.internal:
//            ck, ca, cf

class a
    implements ck
{

    final ca a;

    public void a()
    {
        ca.a(a);
    }

    public cf b()
        throws DeadObjectException
    {
        return (cf)a.k();
    }

    public IInterface c()
        throws DeadObjectException
    {
        return b();
    }

    (ca ca1)
    {
        a = ca1;
        super();
    }
}
