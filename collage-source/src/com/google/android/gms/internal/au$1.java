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

    public Boolean b(SharedPreferences sharedpreferences)
    {
        return Boolean.valueOf(sharedpreferences.getBoolean(a(), ((Boolean)b()).booleanValue()));
    }

    (String s, Boolean boolean1)
    {
        super(s, boolean1, null);
    }
}
