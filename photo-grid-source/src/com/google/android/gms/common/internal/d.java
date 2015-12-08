// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

// Referenced classes of package com.google.android.gms.common.internal:
//            aa, w

public final class d extends aa
{

    private final e a;

    public d(Context context, Looper looper, int i, k k, l l, w w, e e1)
    {
        super(context, looper, i, w, k, l);
        a = e1;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return a.c();
    }

    protected final String a()
    {
        return a.a();
    }

    protected final String b()
    {
        return a.b();
    }
}
