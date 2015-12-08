// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class d extends b
{

    d(SharedPreferences sharedpreferences, String s, Boolean boolean1)
    {
        super(sharedpreferences, s, boolean1);
    }

    public final Boolean a(Boolean boolean1)
    {
        return Boolean.valueOf(b.getBoolean(c, boolean1.booleanValue()));
    }

    public final volatile Object a(Object obj)
    {
        return a((Boolean)obj);
    }

    protected final void c(Object obj)
    {
        obj = (Boolean)obj;
        m.a(e().putBoolean(c, ((Boolean) (obj)).booleanValue()));
    }
}
