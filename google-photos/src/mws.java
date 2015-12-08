// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

final class mws
    implements oaa
{

    private String a;
    private nzp b;
    private mwr c;

    mws(mwr mwr1, String s, nzp nzp1)
    {
        c = mwr1;
        a = s;
        b = nzp1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        oam.b(mwr.a(c)).edit().putString(a, obj.toString()).apply();
        nzw = (String)b.e[b.c(obj.toString())];
        b.a_(nzw);
        return true;
    }
}
