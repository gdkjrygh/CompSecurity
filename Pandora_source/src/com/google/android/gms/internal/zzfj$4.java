// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzfj

static final class <init> extends <init>
{

    final Context a;
    final b b;

    public void zzcX()
    {
        SharedPreferences sharedpreferences = zzfj.zzu(a);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
        if (b != null)
        {
            b.zzc(bundle);
        }
    }

    b(Context context, b b1)
    {
        a = context;
        b = b1;
        super(null);
    }
}
