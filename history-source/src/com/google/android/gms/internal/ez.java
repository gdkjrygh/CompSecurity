// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fa, k, gf

public final class ez
{
    public static interface a
    {

        public abstract void a(fy.a a1);
    }


    public static gf a(Context context, fh.a a1, k k, a a2)
    {
        context = new fa(context, a1, k, a2);
        context.start();
        return context;
    }
}
