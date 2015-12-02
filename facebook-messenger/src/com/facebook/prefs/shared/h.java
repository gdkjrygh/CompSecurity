// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.net.Uri;

// Referenced classes of package com.facebook.prefs.shared:
//            i

class h
{

    private final String a;
    private final String b;
    private final String c;
    private final Uri d;
    private final i e;

    h(String s, String s1)
    {
        a = s;
        b = (new StringBuilder()).append(s).append(".CHANGED_ACTION").toString();
        c = s1;
        d = Uri.parse((new StringBuilder()).append("content://").append(s).toString());
        e = new i(d);
    }

    public String a()
    {
        return a;
    }

    public Uri b()
    {
        return e.a();
    }

    public String c()
    {
        return b;
    }

    public i d()
    {
        return e;
    }

    public String e()
    {
        return c;
    }
}
