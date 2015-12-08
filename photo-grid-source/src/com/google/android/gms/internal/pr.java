// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ps, pt

final class pr extends ps
{

    final Context a;
    final pt b;

    pr(Context context, pt pt1)
    {
        a = context;
        b = pt1;
        super((byte)0);
    }

    public final void zzbn()
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
        if (b != null)
        {
            b.a(bundle);
        }
    }
}
