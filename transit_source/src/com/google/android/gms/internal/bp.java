// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            bq, h, cq, aw, 
//            cg, ce

public final class bp
{
    public static interface a
    {

        public abstract void a(ce ce);
    }


    public static cg a(Context context, bu.a a1, h h, cq cq, aw aw, a a2)
    {
        context = new bq(context, a1, h, cq, aw, a2);
        context.start();
        return context;
    }
}
