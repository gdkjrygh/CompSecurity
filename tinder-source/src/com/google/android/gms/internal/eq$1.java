// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.signin.internal.i;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            eq, et

static final class  extends com.google.android.gms.common.api.g
{

    public final com.google.android.gms.common.api.g a(Context context, Looper looper, g g, Object obj, com.google.android.gms.common.api.g g1, com.google.android.gms.common.api.g g2)
    {
        obj = (et)obj;
        if (obj == null)
        {
            obj = et.a;
        }
        return new i(context, looper, true, g, ((et) (obj)), g1, g2, Executors.newSingleThreadExecutor());
    }

    ()
    {
    }
}
