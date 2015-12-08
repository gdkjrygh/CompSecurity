// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.content.Context;
import com.google.android.gms.location.internal.zzn;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            CopresenceApiOptions, zzc

public class zzb
{

    private final Context a;
    private final String b;
    private final zzn c;
    private final String d;
    private final CopresenceApiOptions e;
    private zzc f;

    private zzb(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        a = context;
        b = s;
        c = zzn;
        f = null;
        d = s1;
        e = copresenceapioptions;
    }

    public static zzb a(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        return new zzb(context, s, s1, zzn, copresenceapioptions);
    }
}
