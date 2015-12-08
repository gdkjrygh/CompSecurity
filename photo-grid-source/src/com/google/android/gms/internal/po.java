// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            ps

final class po extends ps
{

    final Context a;
    final boolean b;

    po(Context context, boolean flag)
    {
        a = context;
        b = flag;
        super((byte)0);
    }

    public final void zzbn()
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("admob", 0).edit();
        editor.putBoolean("use_https", b);
        editor.apply();
    }
}
