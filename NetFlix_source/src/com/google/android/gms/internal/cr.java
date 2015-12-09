// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            cs, l, dz, bq, 
//            do, dh

public final class cr
{
    public static interface a
    {

        public abstract void a(dh dh);
    }


    public static do a(Context context, cx.a a1, l l, dz dz, bq bq, a a2)
    {
        context = new cs(context, a1, l, dz, bq, a2);
        context.start();
        return context;
    }
}
