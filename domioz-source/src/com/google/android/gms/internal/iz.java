// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            kf, ja

public final class iz
{

    private final Context a;
    private final String b;
    private final kf c;
    private final String d = null;
    private ja e;

    private iz(Context context, String s, kf kf)
    {
        a = context;
        b = s;
        c = kf;
        e = null;
    }

    public static iz a(Context context, String s, kf kf)
    {
        return new iz(context, s, kf);
    }
}
