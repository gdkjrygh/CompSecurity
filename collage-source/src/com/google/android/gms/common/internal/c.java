// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, i

public class c extends m
{

    private final com.google.android.gms.common.api.a.e a;

    public c(Context context, Looper looper, int i, com.google.android.gms.common.api.b b, com.google.android.gms.common.api.c c1, i j, com.google.android.gms.common.api.a.e e)
    {
        super(context, looper, i, j, b, c1);
        a = e;
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return a.a(ibinder);
    }

    protected void zzc(int i, IInterface iinterface)
    {
        a.a(i, iinterface);
    }

    protected String zzfA()
    {
        return a.a();
    }

    protected String zzfB()
    {
        return a.b();
    }
}
