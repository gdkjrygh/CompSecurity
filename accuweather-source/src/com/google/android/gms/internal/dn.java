// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            do, l, ey, bu, 
//            en, eg

public final class dn
{
    public static interface a
    {

        public abstract void a(eg eg);
    }


    public static en a(Context context, dt.a a1, l l, ey ey, bu bu, a a2)
    {
        context = new do(context, a1, l, ey, bu, a2);
        context.start();
        return context;
    }
}
