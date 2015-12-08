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

    public Integer b(SharedPreferences sharedpreferences)
    {
        return Integer.valueOf(sharedpreferences.getInt(a(), ((Integer)b()).intValue()));
    }

    (String s, Integer integer)
    {
        super(s, integer, null);
    }
}
