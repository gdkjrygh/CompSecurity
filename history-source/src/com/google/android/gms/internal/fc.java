// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fj, fm, ai, gf, 
//            fd, u, gu, cy, 
//            fy

public final class fc
{
    public static interface a
    {

        public abstract void a(fy fy);
    }


    public static gf a(Context context, u u, fy.a a1, gu gu, cy cy, a a2)
    {
        if (a1.vK.ug)
        {
            context = new fm(context, u, new ai(), a1, a2);
        } else
        {
            context = new fd(context, a1, gu, cy, a2);
        }
        context.start();
        return context;
    }
}
