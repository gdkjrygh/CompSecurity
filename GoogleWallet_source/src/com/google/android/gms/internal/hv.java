// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            pj

public final class hv
{

    private final pj FU;
    private final Context mContext;

    private hv(Context context, pj pj)
    {
        mContext = context;
        FU = pj;
    }

    public static hv a(Context context, pj pj)
    {
        return new hv(context, pj);
    }
}
