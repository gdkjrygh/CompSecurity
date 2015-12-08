// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.w;

// Referenced classes of package com.google.android.gms.internal:
//            tb

public final class th extends aa
{

    public th(Context context, Looper looper, w w, k k, l l)
    {
        super(context, looper, 19, w, k, l);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return tb.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected final String b()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }
}
