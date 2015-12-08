// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.f;

// Referenced classes of package com.google.android.gms.location.internal:
//            c, i

final class <init> extends <init>
{

    final f b;
    final com.google.android.gms.location.internal.c c;

    protected final volatile void a(com.google.android.gms.common.api.._cls2 _pcls2)
        throws RemoteException
    {
        ((i)_pcls2).a(b);
        a(((com.google.android.gms.common.api.g) (Status.a)));
    }

    (com.google.android.gms.location.internal.c c1, c c2, f f)
    {
        c = c1;
        b = f;
        super(c2);
    }
}
