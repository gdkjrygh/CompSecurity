// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bc

static final class ferences
{

    final SharedPreferences a;

    (Context context)
    {
        a = context.getSharedPreferences("com.google.maps.api.android.lib6.impl.PREFERENCES_FILE", 0);
    }
}
