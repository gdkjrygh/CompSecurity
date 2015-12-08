// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.k;

// Referenced classes of package com.google.android.gms.internal:
//            jc, jp, kf

public class jb extends k
{

    protected final kf d = new jc(this);
    private final String e;

    public jb(Context context, Looper looper, n n, o o, String s)
    {
        super(context, looper, 23, n, o);
        e = s;
    }

    static void a(jb jb1)
    {
        jb1.k();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return jp.a(ibinder);
    }

    protected final String e()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String f()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle j()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        return bundle;
    }
}
