// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.h;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            lk, ly

final class lh
    implements i
{

    lh()
    {
    }

    public final com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, n n, o o)
    {
        obj = (lk)obj;
        if (obj == null)
        {
            obj = lk.a;
        }
        return new ly(context, looper, h, ((lk) (obj)), n, o, Executors.newSingleThreadExecutor());
    }
}
