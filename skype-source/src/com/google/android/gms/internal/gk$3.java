// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            gk

static final class <init> extends <init>
{

    final Context a;
    final int b;

    public final void a()
    {
        android.content.dPreferences.Editor editor = a.getSharedPreferences("admob", 0).edit();
        editor.putInt("webview_cache_version", b);
        editor.apply();
    }

    tor(Context context, int i)
    {
        a = context;
        b = i;
        super((byte)0);
    }
}
