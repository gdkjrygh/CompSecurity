// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj

static final class a extends a
{

    final boolean zzGb;
    final Context zzqV;

    public void zzdP()
    {
        android.content.references.Editor editor = zzhj.zzF(zzqV).edit();
        editor.putBoolean("use_https", zzGb);
        editor.commit();
    }

    r(Context context, boolean flag)
    {
        zzqV = context;
        zzGb = flag;
        super(null);
    }
}
