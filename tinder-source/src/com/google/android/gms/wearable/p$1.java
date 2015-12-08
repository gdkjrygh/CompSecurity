// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.wearable.internal.ap;

// Referenced classes of package com.google.android.gms.wearable:
//            p

static final class b extends com.google.android.gms.common.api..g
{

    public final com.google.android.gms.common.api..g a(Context context, Looper looper, g g, Object obj, com.google.android.gms.common.api..g g1, com.google.android.gms.common.api..g g2)
    {
        if ((al.g)obj == null)
        {
            new a();
            new <init>((byte)0);
        }
        return new ap(context, looper, g1, g2, g);
    }

    b()
    {
    }
}
