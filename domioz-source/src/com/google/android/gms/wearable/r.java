// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.wearable.internal.an;

// Referenced classes of package com.google.android.gms.wearable:
//            s, t

final class r
    implements i
{

    r()
    {
    }

    public final com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, n n, o o)
    {
        if ((s)obj == null)
        {
            new t();
            new s((byte)0);
        }
        return new an(context, looper, n, o, h);
    }
}
