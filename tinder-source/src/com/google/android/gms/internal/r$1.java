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
        return Boolean.valueOf(sharedpreferences.getBoolean(super.a, ((Boolean)super.b).booleanValue()));
    }

    (String s, Boolean boolean1)
    {
        super(s, boolean1, (byte)0);
    }
}
