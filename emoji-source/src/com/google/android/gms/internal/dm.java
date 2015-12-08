// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            dn, k, ex, bt, 
//            em, ef

public final class dm
{
    public static interface a
    {

        public abstract void a(ef ef);
    }


    public static em a(Context context, ds.a a1, k k, ex ex, bt bt, a a2)
    {
        context = new dn(context, a1, k, ex, bt, a2);
        context.start();
        return context;
    }
}
