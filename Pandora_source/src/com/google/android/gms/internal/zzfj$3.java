// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzfj

static final class <init> extends <init>
{

    final Context a;
    final int b;

    public void zzcX()
    {
        android.content.references.Editor editor = zzfj.zzu(a).edit();
        editor.putInt("webview_cache_version", b);
        editor.commit();
    }

    r(Context context, int i)
    {
        a = context;
        b = i;
        super(null);
    }
}
