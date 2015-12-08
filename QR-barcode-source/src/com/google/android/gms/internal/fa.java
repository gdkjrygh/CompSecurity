// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fb, k, gg

public final class fa
{
    public static interface a
    {

        public abstract void a(fz.a a1);
    }


    public static gg a(Context context, fi.a a1, k k, a a2)
    {
        context = new fb(context, a1, k, a2);
        context.start();
        return context;
    }
}
