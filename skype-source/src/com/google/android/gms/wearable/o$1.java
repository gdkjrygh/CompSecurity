// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.wearable.internal.ao;

// Referenced classes of package com.google.android.gms.wearable:
//            o

static final class b extends com.google.android.gms.common.api..i
{

    public final com.google.android.gms.common.api..i a(Context context, Looper looper, i i, Object obj, com.google.android.gms.common.api..i j, com.google.android.gms.common.api..i k)
    {
        if ((al.i)obj == null)
        {
            new a();
            new <init>((byte)0);
        }
        return new ao(context, looper, j, k, i);
    }

    b()
    {
    }
}
