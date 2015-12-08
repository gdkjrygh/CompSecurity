// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.internal.n;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            xj

final class xg extends b
{

    xg()
    {
    }

    public final c a(Context context, Looper looper, w w, Object obj, k k, l l)
    {
        return new n(context, looper, false, w, xj.a, k, l, Executors.newSingleThreadExecutor());
    }
}
