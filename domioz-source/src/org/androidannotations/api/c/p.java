// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class p extends b
{

    p(SharedPreferences sharedpreferences, String s, String s1)
    {
        super(sharedpreferences, s, s1);
    }

    public final volatile Object a(Object obj)
    {
        return a((String)obj);
    }

    public final String a(String s)
    {
        return b.getString(c, s);
    }

    protected final void c(Object obj)
    {
        obj = (String)obj;
        m.a(e().putString(c, ((String) (obj))));
    }
}
