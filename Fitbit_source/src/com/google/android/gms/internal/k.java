// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ck

public class k
{

    private final Context a;
    private final ck b;

    private k(Context context, ck ck)
    {
        a = context;
        b = ck;
    }

    public static k a(Context context, ck ck)
    {
        return new k(context, ck);
    }
}
