// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            au

static final class nit> extends au
{

    public Object a(SharedPreferences sharedpreferences)
    {
        return b(sharedpreferences);
    }

    public Long b(SharedPreferences sharedpreferences)
    {
        return Long.valueOf(sharedpreferences.getLong(a(), ((Long)b()).longValue()));
    }

    (String s, Long long1)
    {
        super(s, long1, null);
    }
}
