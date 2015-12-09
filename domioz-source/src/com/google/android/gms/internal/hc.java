// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.k;

// Referenced classes of package com.google.android.gms.internal:
//            gw

public final class hc extends k
{

    public hc(Context context, Looper looper, n n, o o)
    {
        super(context, looper, 19, n, o);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return gw.a(ibinder);
    }

    protected final String e()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected final String f()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }
}
