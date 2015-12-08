// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj

static final class a extends a
{

    final b zzGc;
    final Context zzqV;

    public void zzdP()
    {
        SharedPreferences sharedpreferences = zzhj.zzF(zzqV);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
        if (zzGc != null)
        {
            zzGc.zzc(bundle);
        }
    }

    b(Context context, b b)
    {
        zzqV = context;
        zzGc = b;
        super(null);
    }
}
