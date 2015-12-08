// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fk, fn, ai, gg, 
//            fe, u, gv, ct, 
//            fz

public final class fd
{
    public static interface a
    {

        public abstract void a(fz fz);
    }


    public static gg a(Context context, u u, fz.a a1, gv gv, ct ct, a a2)
    {
        if (a1.vw.tS)
        {
            context = new fn(context, u, new ai(), a1, a2);
        } else
        {
            context = new fe(context, a1, gv, ct, a2);
        }
        context.start();
        return context;
    }
}
