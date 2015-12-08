// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class epm
    implements epo
{

    private final String a;
    private final boolean b;
    private final String c;
    private final String d;

    epm(boolean flag, String s, String s1, String s2)
    {
        b = flag;
        a = s;
        c = s1;
        d = s2;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final boolean d()
    {
        return b && !TextUtils.isEmpty(a) && !TextUtils.isEmpty(d) && !TextUtils.isEmpty(c);
    }

    public final String toString()
    {
        return (new StringBuilder("user=\"")).append(a).append("\"; productType=\"").append(c).append("\";countryCode=\"").append(d).append("\"; loggedIn=").append(b).toString();
    }
}
