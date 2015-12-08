// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, z, ao, x

final class init> extends aw
{

    final String b;
    final String c;
    final byte d[] = null;
    final z e;

    protected final g a(Status status)
    {
        return new <init>(status, -1);
    }

    protected final void a(com.google.android.gms.common.api.._cls1 _pcls1)
        throws RemoteException
    {
        _pcls1 = (ao)_pcls1;
        String s = b;
        String s1 = c;
        byte abyte0[] = d;
        ((x)_pcls1.n()).a(new (this), s, s1, abyte0);
    }

    (z z1, c c1, String s, String s1)
    {
        e = z1;
        b = s;
        c = s1;
        super(c1);
    }
}
