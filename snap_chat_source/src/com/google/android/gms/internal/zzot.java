// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            zzou, zzpm

public class zzot
{

    private final Context mContext;
    private final String zzHg;
    private final String zzMh;
    private zzou zzamA;
    private final zzpm zzamz;

    private zzot(Context context, String s, String s1, zzpm zzpm)
    {
        mContext = context;
        zzHg = s;
        zzamz = zzpm;
        zzamA = null;
        zzMh = s1;
    }

    public static zzot zza(Context context, String s, String s1, zzpm zzpm)
    {
        return new zzot(context, s, s1, zzpm);
    }
}
