// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            r

static final class nit> extends r
{

    public final Object a(SharedPreferences sharedpreferences)
    {
        return Integer.valueOf(sharedpreferences.getInt(super.a, ((Integer)super.b).intValue()));
    }

    (String s, Integer integer)
    {
        super(s, integer, (byte)0);
    }
}
