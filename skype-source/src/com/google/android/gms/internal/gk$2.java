// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            gk

static final class <init> extends <init>
{

    final Context a;
    final a b;

    public final void a()
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
        if (b != null)
        {
            b.a(bundle);
        }
    }

    (Context context,  )
    {
        a = context;
        b = ;
        super((byte)0);
    }
}
